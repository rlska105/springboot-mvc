package com.example.domain.words;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Words extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String word;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String meaning;

    @Builder
    public Words(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }

    public void update(String title, String content){
        this.word = word;
        this.meaning = meaning;
    }

}
