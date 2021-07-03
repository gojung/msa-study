package com.study.msa.dto;

import lombok.Builder;

public class FavoriteSaveRequestDto {
    public Long postId;
    public Long userId;

    @Builder
    public FavoriteSaveRequestDto(Long userId, Long postId){
        this.userId = userId;
        this.postId = postId;
    }
}
