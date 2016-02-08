package com.about.java.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Ati on 08-02-2016.
 */
@Path("/jsonServices")
public class JerseyClient {
    @GET
    @Path("/print/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student produceJSON( @PathParam("name") String name) {
        Student st = new Student(name, "Diaz", 22, 1);
        return st;
    }
}
