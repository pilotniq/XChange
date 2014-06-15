package com.xeiam.xchange.btccentral;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.xeiam.xchange.btccentral.dto.account.BTCCentralUserInfo;

/**
 * @author Erland Lewin See https://github.com/Paymium/api-documentation for up-to-date docs.
 */
@Path("api/v1")
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
@Produces(MediaType.APPLICATION_JSON)
public interface BTCCentralAuthenticated {
	  @POST
	  @Path("user")
	  public BTCCentralUserInfo getUserInfo( @HeaderParam("Authorization") String authorization ) 
			  throws IOException;

}
