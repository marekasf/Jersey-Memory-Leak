package com.example.beanparams;

import static javax.ws.rs.core.HttpHeaders.ACCEPT_LANGUAGE;
import static javax.ws.rs.core.HttpHeaders.CONTENT_LANGUAGE;

import javax.ws.rs.HeaderParam;

public class SomeBeanParam1
{
	@HeaderParam("headerParam2")
	private String metaData;

	private boolean someParam;

	@HeaderParam(ACCEPT_LANGUAGE)
	private String acceptLanguage;

	@HeaderParam(CONTENT_LANGUAGE)
	private String contentLanguage;

	@HeaderParam("headerParam1")
	private String someHeader1;

	public String getMetaData()
	{
		return metaData;
	}

	public String getAcceptLanguage()
	{
		return acceptLanguage;
	}

	public String getContentLanguage()
	{
		return contentLanguage;
	}

	@HeaderParam("headerParam3")
	public void setSomeParam(final String languages)
	{
		this.someParam = true;
	}

	public String getSomeHeader1()
	{
		return someHeader1;
	}

	public boolean isSomeParam()
	{
		return someParam;
	}
}
