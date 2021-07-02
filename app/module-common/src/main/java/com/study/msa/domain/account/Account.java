package com.study.msa.domain.account;

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
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String userName;

    @Builder
    public Account(String userName){
        this.userName = userName;
    }

}
