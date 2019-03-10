package services;

import packDAO.EmployeeDAO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/employees")
public class EmployeeService {

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String find(@PathParam("id") int id) {
        return EmployeeDAO.findById(id);
    }

    @GET
    public String getAll(){
        return EmployeeDAO.getAllEmployee();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String save(String json) {
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
