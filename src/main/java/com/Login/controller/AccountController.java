package com.Login.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Login.constant.ResMessage;
import com.Login.entity.Account;
import com.Login.repository.AccountDao;
import com.Login.service.ifs.AccountService;
import com.Login.vo.AccountInputReq;
import com.Login.vo.BasicRes;
import com.Login.vo.UserInfo;
import com.Login.vo.testAccountRes;



@RestController
@RequestMapping("/users")
@CrossOrigin
public class AccountController {
	
	@Autowired
	private AccountDao accountDao;
	
	@Autowired
	private AccountService accountService;
	
	@PostMapping(value="/loginAccount")
	public BasicRes loginAccount(@Valid @RequestBody AccountInputReq req) {
		return accountService.loginAccount(req);
	}
	
	@PostMapping(value="/registerAccount")
	public BasicRes registerAccount(@Valid @RequestBody Account req) {
		return accountService.registerAccount(req);
	}
	
	@PostMapping(value="/test")
	public testAccountRes testAccount(@Valid @RequestBody AccountInputReq req) {
		List<UserInfo> userInfoList = accountDao.testAccount(req.getUsername(), req.getPassword());
		
		return new testAccountRes(ResMessage.SUCCESS.getCode(), ResMessage.SUCCESS.getMessage(), userInfoList);
		
	}
	
}
