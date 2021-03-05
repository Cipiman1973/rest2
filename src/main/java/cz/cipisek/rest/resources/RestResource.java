package cz.cipisek.rest.resources;


import cz.cipisek.rest.managers.RestManager;
import cz.cipisek.rest.entities.ZviratkoEntity;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("rest")
@Produces(MediaType.APPLICATION_JSON)
public class RestResource {


    @Inject
    private RestManager manager;

    @GET
    public Response getZviratka(){
        return Response.ok(manager.getAll()).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response noveZviratko(ZviratkoEntity zviratko) {
        manager.create(zviratko);
        return Response.ok().build();
    }

    @PUT
    @Path("{id}")
    public Response zmenitVek(@PathParam("id") Integer id, ZviratkoEntity zviratko) {
        manager.edit(id, zviratko);
        return Response.ok().build();
    }

    @DELETE
    @Path("{id}")
    public Response delZviratko(@PathParam("id") Integer id) {
        manager.delete(id);
        return Response.ok().build();
    }

    @GET
    @Path("{id}")
    public Response getZviratko(@PathParam("id") Integer id) {
        return Response.ok(manager.getOne(id)).build();
    }
}
