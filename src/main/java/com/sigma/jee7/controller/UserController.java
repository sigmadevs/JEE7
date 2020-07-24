package com.sigma.jee7.controller;

import com.sigma.jee7.config.HiberateConfiguration;
import com.sigma.jee7.model.User;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.hibernate.Session;

@Path("/users")
public class UserController {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllUsers() {
            Session session = HiberateConfiguration.getSessionFactory().openSession();
            List<User> userlist = session.createQuery("from User").list();
            GenericEntity<List<User>> users = new GenericEntity<List<User>>(userlist) {};
            return Response.status(200).entity(users).build();
    }
    
}
