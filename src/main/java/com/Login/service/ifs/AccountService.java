package com.Login.service.ifs;

import com.Login.entity.Account;
import com.Login.vo.AccountInputReq;
import com.Login.vo.BasicRes;

public interface AccountService {
	public BasicRes loginAccount(AccountInputReq req);
	public BasicRes registerAccount(Account req);
	
	
}
