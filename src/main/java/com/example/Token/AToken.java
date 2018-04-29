package com.example.Token;

import org.springframework.stereotype.Component;

public class AToken
{
	private String token;
	private Integer code;

	public Integer getCode()
	{
		return code;
	}

	public void setCode(Integer code)
	{
		this.code = code;
	}

	public String getToken()
	{
		return token;
	}

	public void setToken(String token)
	{
		this.token = token;
	}
}
