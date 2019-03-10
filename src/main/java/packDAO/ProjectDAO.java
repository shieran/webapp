package packDAO;

import basicСlasses.Project;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.gson.Gson;

import java.util.Iterator;
import java.util.LinkedList;


public class ProjectDAO {
    private static LinkedList<Project> projects = new LinkedList<>();

    static {
        Project project = new Project("hydra", "logoUrl", "22.12.2005", "noEndForThisMoment", "120");
        projects.add(project);
    }

    public static String getAllProjects(){
        return objectToJson(projects);
    }

    public static void projectCreation(String json) {
        Project project = new Gson().fromJson(json, Project.class);
        projects.add(project);
    }

    public static String findById(int id) {
        Iterator<Project> iterator = projects.iterator();
        Project project;
        while (iterator.hasNext()) {
            project = iterator.next();
            if (project.getId() == id) {
                return objectToJson(project);
            }
        }
        return "no project with that id";
    }

    private static String objectToJson(Object object) {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = null;
        try {
            json = ow.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }

    public static void deleteProject(int id) {
        Iterator<Project> iterator = projects.iterator();
        while (iterator.hasNext()) {
            Project project = iterator.next();
            if (project.getId() == id) {
                projects.remove(project);
                System.out.println("project was deleted");
                return;
            }
        }
    }
}
