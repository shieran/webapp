package services;

import packDAO.LogsDAO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/logs")
public class LogsService {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public void addLog(String json){
        LogsDAO.addLogAndSave(json);
    }

    @GET
    @Path("/{projectName}")
    @Produces(MediaType.APPLICATION_JSON)
    public String findLog(@PathParam("projectName") String projectName){
        return LogsDAO.findLog(projectName);
    }

    @GET
    public String getAll(){
        return LogsDAO.getAllLogs();
    }

    @DELETE
    @Path("/{projectName}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteLog(@PathParam("projectName") String projectName){
        LogsDAO.deleteLog(projectName);
    }
}
