package com.example.domain.words;


import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WordRepositoryTest {

    @Autowired
    private WordRepository wordRepository;

    @After
    public void cleanup(){
        wordRepository.deleteAll();
    }

    @Test
    public void 불러오기(){
        String word = "단어";
        String meaning = "뜻";

        wordRepository.save(Words.builder()
                .word("단어")
                .meaning("뜻")
                .build());

        List<Words> wordsList = wordRepository.findAll();

        Words words = wordsList.get(0);
        assertThat(words.getWord()).isEqualTo(word);
        assertThat(words.getMeaning()).isEqualTo(meaning);
    }

    @Test
    public void Time_관리(){
        LocalDateTime now = LocalDateTime.now();

        wordRepository.save(Words.builder()
                .word("Test")
                .meaning("Test too")
                .build());

        List<Words> wordsList = wordRepository.findAll();

        Words words = wordsList.get(0);

        assertTrue(words.getCreatedDate().isAfter(now));
        assertTrue(words.getModifiedDate().isAfter(now));

    }
}