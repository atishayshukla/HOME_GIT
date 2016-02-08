package com.about.java.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 * Created by DTBR6182 on 2016-02-08.
 */
@Path("/hello")
public class HelloWorldService {
    @GET
    @Path("/{param}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response helloWorld(@PathParam("param") int name) {
        String response = "Hello World! My name is " + name;
        return Response.status(200).entity(response).build();
    }
    @GET
    @Path("/{param}")
    @Produces(MediaType.TEXT_XML)
    public Response helloWorldInXml(@PathParam("param") String name){
        String response = "<?xml version=\\\"1.0\\\"?>\" + \"<hello> Hello Jersey\" + \"</hello>";
        return Response.status(200).entity(response).build();
    }
    @GET
    @Path("/{param}")
    @Produces(MediaType.TEXT_HTML)
    public Response helloWorldInHtml(@PathParam("param") String name){
        String response = "<html> \" + \"<title>\" + \"Hello Jersey\" + \"</title>\"  \n" +
                "        + \"<body><h1>\" + \"Hello Jersey HTML\" + \"</h1></body>\" + \"</html> ";
        return Response.status(200).entity(response).build();
    }
}
