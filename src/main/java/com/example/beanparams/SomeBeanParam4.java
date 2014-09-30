package com.example.beanparams;

import java.io.Serializable;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;

public class SomeBeanParam4 implements Serializable
{
	public static final String QUERY = "q";
	public static final String PAGE_NUMBER = "pageNumber";
	public static final String PAGE_SIZE = "pageSize";
	public static final String SORT = "sort";

	private static final long serialVersionUID = -829439911764597854L;

	@QueryParam(QUERY)
	@DefaultValue("")
	private String queryString;

	@QueryParam(PAGE_NUMBER)
	@DefaultValue("1")
	@SomeValidator5
	private String pageNumber;

	@QueryParam(PAGE_SIZE)
	@DefaultValue("16")
	@SomeValidator5
	private String pageSize;

	@QueryParam(SORT)
	@DefaultValue("")
	private String sortString;

	@QueryParam("totalCount")
	private Boolean totalCount;

	public String getQueryString()
	{
		return queryString;
	}

	public int getPageNumber()
	{
		return Integer.parseInt(pageNumber);
	}

	public int getPageSize()
	{
		return Integer.parseInt(pageSize);
	}

	public String getSortString()
	{
		return sortString;
	}

	public boolean isTotalCount()
	{
		return totalCount != null ? totalCount : false;
	}
}
