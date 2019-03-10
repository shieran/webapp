package services;

import packDAO.ProjectDAO;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/project")
public class ProjectService {

    @GET
    public String getProject(int id){
       return ProjectDAO.findById(id);
    }

    @POST
    public void addProject(String json){
        ProjectDAO.projectCreation(json);
    }

    @DELETE
    public void deleteProject(int id){
        ProjectDAO.deleteProject(id);
    }

}
