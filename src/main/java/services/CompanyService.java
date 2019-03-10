package services;

import packDAO.CompanyDAO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/company")
public class CompanyService {

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String find(@PathParam("id") int id){
        return CompanyDAO.findById(id);
    }

    @GET
    public String getAll(){
        return CompanyDAO.getAllCompany();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public void add(String json){
        CompanyDAO.createAndSave(json);
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void delete(@PathParam("id") int id){
        CompanyDAO.delete(id);
    }


}
