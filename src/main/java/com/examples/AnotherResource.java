package com.examples;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("anotherone")
public class AnotherResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String stampaSaluto(){
        return "Ciao !";
    }

}
