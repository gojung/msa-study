package com.study.msa.service;

import com.study.msa.domain.account.Account;
import com.study.msa.domain.account.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Transactional
    public String saveUser(){
        Account account = Account.builder().userName("gojung").build();
        return accountRepository.save(account).getUserName();
    }
}
