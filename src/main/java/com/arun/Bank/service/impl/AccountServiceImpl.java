package com.arun.Bank.service.impl;

import com.arun.Bank.dto.AccountDto;
import com.arun.Bank.entity.Account;
import com.arun.Bank.mapper.AccountMapper;
import com.arun.Bank.repository.AccountRepository;
import com.arun.Bank.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {


    private AccountRepository accountRepository;
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account= AccountMapper.mapToAccount(accountDto);
        Account savedAccount=accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }
}
