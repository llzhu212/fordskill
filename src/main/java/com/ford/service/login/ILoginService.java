package com.ford.service.login;

import java.util.List;

import com.ford.entity.login.LoginVO;

public interface ILoginService {
	/**
	 * 查询登录的经销商
	 * @param loginUserVO
	 * @return
	 * @throws Exception
	 */
	public List authority(LoginVO loginUserVO)throws Exception;
}
