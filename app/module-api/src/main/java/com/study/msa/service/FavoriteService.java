package com.study.msa.service;

import com.study.msa.domain.favorite.Favorite;
import com.study.msa.domain.favorite.FavoriteRepository;
import com.study.msa.dto.FavoriteSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class FavoriteService {
    private final FavoriteRepository favoriteRepository;

    public Long saveFavorite(FavoriteSaveRequestDto requestDto){
        Favorite fav = Favorite.builder().userId(requestDto.userId).postId(requestDto.postId).build();
        return favoriteRepository.save(fav).getFavId();
    }

}
