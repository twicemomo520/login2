package com.Login.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Login.entity.Account;
import com.Login.vo.UserInfo;
import com.Login.vo.testAccountRes;

public interface AccountDao extends JpaRepository<Account, String>{
	
	@Query(value =  "select count(a) from Account as a"
			+ " where (a.username = :inputUsername)"
			+ " and (a.password = :inputPassword) ", nativeQuery=false)
	public int searchAccount(
			@Param("inputUsername") String username,
			@Param("inputPassword") String password);
	
	@Modifying
	@Transactional
	@Query(value= "insert into member (username, password, name, phone, email) "
			+ " values (:inputUsername, :inputPassword, :inputName, :inputPhone,  :inputEmail)", nativeQuery=true)
	public int registerAccount(
			@Param("inputUsername") String username,
			@Param("inputPassword") String password,
			@Param("inputName") String name,
			@Param("inputPhone") String phone,
			@Param("inputEmail") String email
			);
	
	@Query(value =  "select new com.Login.vo.UserInfo(a.name, a.phone, a.email) from Account as a"
			+ " where (a.username = :inputUsername)"
			+ " and (a.password = :inputPassword) ", nativeQuery=false)
	public List<UserInfo> testAccount(
			@Param("inputUsername") String username,
			@Param("inputPassword") String password);
	
}

