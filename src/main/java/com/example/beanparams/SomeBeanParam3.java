package com.example.beanparams;

import java.io.Serializable;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@SomeValidator2
@SomeValidator1
public class SomeBeanParam3 implements Serializable
{
	public static final String TYPE = "type";
	public static final String QUERY_PARAM = "q";

	private static final long serialVersionUID = 7911029843267331153L;

	@HeaderParam("headerParam1")
	private String param9;

	@HeaderParam("headerParam2")
	private String param10;

	@SomeValidator3(message = "msg")
	@SomeValidator4(message = "msg")
	@PathParam("headerParam3")
	private String param7;

	@SomeValidator3(message = "msg")
	@SomeValidator4(message = "msg ")
	@PathParam("pathParam1")
	private String param5;

	@PathParam(TYPE)
	@SomeValidator3(message = "msg")
	@SomeValidator4(message = "msg")
	private String type;

	@QueryParam("param1")
	private boolean param1;

	@DefaultValue("")
	@QueryParam(QUERY_PARAM)
	private String queryString;

	@QueryParam("param2")
	private boolean param2;

	private Long version;

	@DefaultValue("true")
	@QueryParam("param3")
	private boolean param3;

	@DefaultValue("false")
	@QueryParam("param4")
	private boolean param4;


	public String getParam7()
	{
		return param7;
	}

	public String getParam9()
	{
		return param9;
	}

	public String getParam5()
	{
		return param5;
	}

	public String getParam10()
	{
		return param10;
	}

	public String getType()
	{
		return type;
	}

	public boolean isParam3()
	{
		return param3;
	}

	public String getQueryString()
	{
		return queryString;
	}

	public boolean isParam2()
	{
		return param2;
	}

	public Long getVersion()
	{
		return version;
	}

	@QueryParam("param8")
	public void setVersion(final String version)
	{
		this.version = null;
	}

	public boolean isParam1()
	{
		return param1;
	}

	public boolean isparam9()
	{
		return param1;
	}
}
