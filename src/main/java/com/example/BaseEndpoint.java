package com.example;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("{pathParam1}")
public class BaseEndpoint
{
	@Autowired
	private MyResource myResource;

	@Path("{pathParam2}/data")
	public MyResource data()
	{
		return myResource;
	}
}
