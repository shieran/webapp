package services;

import org.apache.log4j.Logger;
import packDAO.CompanyDAO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/company")
public class CompanyService {

    private static final Logger log = Logger.getLogger(CompanyService.class);

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String find(@PathParam("id") int id){
        return CompanyDAO.findById(id);
    }

    @GET
    public String getAll(){
        log.info("get method called");
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
