package com.study.msa.domain.favorite;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Favorite {

    @Id
    @GeneratedValue
    private Long favId;

    @Column
    private Long postId;

    @Column
    private Long userId;


    @Builder
    public Favorite(Long postId, Long userId){
        this.postId = postId;
        this.userId = userId;
    }
}
