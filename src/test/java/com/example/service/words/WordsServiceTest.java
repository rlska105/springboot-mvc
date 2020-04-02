package com.example.service.words;

import com.example.controller.dto.WordsSaveRequestDto;
import com.example.domain.words.WordRepository;
import com.example.domain.words.Words;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class WordsServiceTest {

    @Autowired
    private WordRepository wordRepository;

    @Autowired
    private WordsService wordsService;

    @After
    public void cleanup() {
        wordRepository.deleteAll();
    }

    @Test
    public void dto가_wordstable에_save() {
        WordsSaveRequestDto dto = WordsSaveRequestDto.builder()
                .word("ds")
                .meaning("dsa")
                .build();

        wordsService.save(dto);

        Words words = wordRepository.findAll().get(0);
        assertThat(words.getWord()).isEqualTo(dto.getWord());
        assertThat(words.getMeaning()).isEqualTo(dto.getMeaning());
    }
}