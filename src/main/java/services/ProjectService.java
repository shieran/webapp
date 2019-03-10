package services;

import packDAO.ProjectDAO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/project")
public class ProjectService {

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getProject(@PathParam("id") int id){
       return ProjectDAO.findById(id);
    }

    @GET
    public String getAll(){
        return ProjectDAO.getAllProjects();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public void addProject(String json){
        ProjectDAO.projectCreation(json);
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteProject(@PathParam("id") int id){
        ProjectDAO.deleteProject(id);
    }

}
