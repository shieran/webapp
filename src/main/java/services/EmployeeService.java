package services;

import basicСlasses.Employee;
import basicСlasses.Project;
import packDAO.EmployeeDAO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/employees")
public class EmployeeService {
    public void assignToProject(Employee employee, Project project) {
        employee.addProjectToEmployee(project);
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public static String find(@PathParam("id") int id) {
        return EmployeeDAO.findById(id);
    }


    @POST
    public static String save(String json) {
        EmployeeDAO.employeeCreationAndSave(json);
        return "employee was saved";
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void delete(@PathParam("id") int id) {
        EmployeeDAO.deleteEmployee(id);
    }
}
