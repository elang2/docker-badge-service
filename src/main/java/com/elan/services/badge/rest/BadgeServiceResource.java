/*
 * This software is the confidential and proprietary information of
 * eharmony.com and may not be used, reproduced, modified, distributed,
 * publicly displayed or otherwise disclosed without the express written
 * consent of eharmony.com.
 *
 * This software is a work of authorship by eharmony.com and protected by
 * the copyright laws of the United States and foreign jurisdictions.
 *
 * Copyright 2000-2017 eharmony.com, Inc. All rights reserved.
 *
 */
package com.elan.services.badge.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.codahale.metrics.annotation.Timed;
import com.elan.services.badge.util.BadgeServiceConstants;

@Path("/v1")
@Component
public class BadgeServiceResource {

	/**
	 * Retrieves count for the various badges associated with the user.
	 * 
	 * @param userId Id of the user
	 * @param badgeTypes Badge types
	 * @param asyncResponse Jersey Injected async response
	 * 
	 * Response:
	 * 
	 * 200 - Able to successfully retrieve data without any issues.
	 * 500 - Server side error.
	 * 503 - Service unavailable error.
	 * 
	 */
	@GET
	@Path("/users/{userId}/badges")
	@Produces(MediaType.APPLICATION_JSON)
	@Timed
	public void getBadgesForUser(
								 @PathParam(BadgeServiceConstants.USER_ID) long userId,
								 @Suspended AsyncResponse asyncResponse) {
		System.out.println("Sample Log");
		asyncResponse.resume(Response.ok().entity("{  \"matches\": 1 }").build());
	}
	
	
	
	
}
