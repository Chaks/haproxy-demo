package org.jveda.resources;

import java.net.InetAddress;
import java.text.MessageFormat;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class PingResource {

    @Path("v1/ping")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String pingV1() throws Exception {
        final String hostName = InetAddress.getLocalHost().getHostName();
        return "Hello! from "+ hostName;
    }

    @Path("v2/ping")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String pingV2() throws Exception {
        final String hostName = InetAddress.getLocalHost().getHostName();
        final String hostAddress = InetAddress.getLocalHost().getHostAddress();
        return MessageFormat.format("Running on host name {0} and address {1}", hostName, hostAddress).toString();
    }
}