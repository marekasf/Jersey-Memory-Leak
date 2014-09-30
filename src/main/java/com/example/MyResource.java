package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.springframework.stereotype.Component;

import com.example.beanparams.*;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Component
public class MyResource
{

	@GET
	@Path("/{pathParam3}")
	public void find(@BeanParam @Valid final SomeBeanParam3 params, @BeanParam @Valid final SomeBeanParam4 searchParams,
			@BeanParam final SomeBeanParam1 metadataParams, @BeanParam final SomeBeanParam2 projectionFields,
			@Context final UriInfo uriInfo, @Suspended final AsyncResponse asyncResponse)
	{
		asyncResponse.setTimeout(1000, TimeUnit.SECONDS);

		asyncResponse.resume(Response.ok(getSomeOutput()) //
				.header(HttpHeaders.LOCATION, uriInfo.getBaseUri().getPath()).build());
	}

	private Map<String, Object> getSomeOutput()
	{
		Map<String, Object> json = new HashMap<>();
		Map<String, Object> inner = new HashMap<>();

		for (int i = 0; i < 100; ++i)
		{
			json.put("" + i, "" + i);
			inner.put("i" + i, "aaaaa" + i);
		}

		json.put("inner1", inner);
		json.put("inner2", inner);
		return json;
	}
}