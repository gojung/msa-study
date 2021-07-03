package com.study.msa.controller;

import com.study.msa.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class IndexController {

    private final AccountService accountService;
    @GetMapping("/")
    public Long returnUserName(){
        return accountService.saveUser();
    }
}
