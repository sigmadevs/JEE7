package com.sigma.jee7.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hero")
public class HeroController {
    
    @GET
    public String getHero() {
        return "list of heros";
    }
    
    @Path("/thor")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getThor() {
        return "{ \"hero\" : \"thor\", \"weapon\" : \"thunder hammer\"}";
    }
    
}
