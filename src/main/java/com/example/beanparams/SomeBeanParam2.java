package com.example.beanparams;

import java.util.Collections;
import java.util.List;

import javax.ws.rs.QueryParam;


public final class SomeBeanParam2
{
	public SomeBeanParam2(@QueryParam("queryParam3") final String projectionFields)
	{
		//
	}

	public List<String> getNames()
	{
		return Collections.EMPTY_LIST;
	}
}
