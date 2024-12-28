package com.Login.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Login.constant.ResMessage;
import com.Login.entity.Account;
import com.Login.repository.AccountDao;
import com.Login.service.ifs.AccountService;
import com.Login.vo.AccountInputReq;
import com.Login.vo.BasicRes;


@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AccountDao accountDao;
	
	@Override
	public BasicRes loginAccount(AccountInputReq req) {
		
		String username = req.getUsername();
		String password = req.getPassword();
		
		
		if (accountDao.searchAccount(username, password) !=1) {
			return new BasicRes(ResMessage.CANNOT_FIND_USERNAME_OR_PASSWORD.getCode(), ResMessage.CANNOT_FIND_USERNAME_OR_PASSWORD.getMessage());
		}
		
		return new BasicRes(ResMessage.SUCCESS.getCode(), ResMessage.SUCCESS.getMessage());
				
	}

	@Override
	public BasicRes registerAccount(Account req) {
		
		String username = req.getUsername();
		String password = req.getPassword();
		String name = req.getName();
		String phone = req.getPhone();
		String email = req.getEmail();
		
		if (accountDao.searchAccount(username, password)!=0) {
			return new BasicRes(ResMessage.REGISTER_USER_NAME_DUPLICATE.getCode(), ResMessage.REGISTER_USER_NAME_DUPLICATE.getMessage());
		}
		
		accountDao.registerAccount(username, password, name, phone, email);
		
		return new BasicRes(ResMessage.SUCCESS.getCode(), ResMessage.SUCCESS.getMessage());
	}

		
	
}
