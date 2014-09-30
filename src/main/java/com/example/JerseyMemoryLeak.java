package com.example;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

public class JerseyMemoryLeak extends ResourceConfig
{

	public JerseyMemoryLeak()
	{
		register(BaseEndpoint.class);
		register(JacksonFeature.class);
		register(JacksonJaxbJsonProvider.class);
		property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
		property(ServerProperties.MONITORING_STATISTICS_ENABLED, true);
		property(ServerProperties.MONITORING_STATISTICS_REFRESH_INTERVAL, 2048); // ms
	}
}