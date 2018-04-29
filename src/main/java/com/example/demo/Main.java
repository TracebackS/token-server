package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import java.util.*;
import java.io.*;

import com.example.Token.*;

@SpringBootApplication
@EnableAutoConfiguration
@Controller
public class Main
{
	@RequestMapping("/gettoken")
	@ResponseBody
	AToken createToken(@RequestBody Request req)
	{
		AToken atk = new AToken();
		if (req.getBody().equals("correctUser"))
		{
			atk.setToken("token2333");
			atk.setCode(200);
		}
		else
		{
			atk.setCode(400);
		}
		return atk;
	}

	@RequestMapping("/testtoken")
	@ResponseBody
	Respond CheckToken(@RequestBody AToken atk)
	{
		Respond res = new Respond();
		if (atk.getToken().equals("token2333"))
		{
			res.setBody("check_token_successfully");
			res.setCode(200);
		}
		else
		{
			res.setCode(400);
		}
		return res;
	}

	public static void main(String[] args)
	{
		SpringApplication.run(Main.class, args);
	}
}
