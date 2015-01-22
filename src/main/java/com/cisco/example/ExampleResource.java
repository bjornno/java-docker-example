package com.cisco.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class ExampleResource {
    @GET
    @Produces("application/json")
    public Hello getEmployee() {
        return new Hello("Hello");
    }
}
