package services;

import basicСlasses.Project;
import packDAO.LogsDAO;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/logs")
public class LogsService {

    @POST
    public static void addLog(String json){
        LogsDAO.addLogAndSave(json);
    }

    @GET
    public static String findLog(Project project){
        return LogsDAO.findLog(project);
    }

    @DELETE
    public static void deleteLog(Project project){
        LogsDAO.deleteLog(project);
    }
}
