package services;

import basicСlasses.Company;
import basicСlasses.Employee;
import basicСlasses.Project;
import packDAO.CompanyDAO;

import javax.ws.rs.*;

@Path("/company")
public class CompanyService {
    public static void addEmployee(Employee employee, Company company){
        company.addEmpoleesToCompany(employee);
    }

    public static void addProject(Project project, Company company){
        company.addProjectToCompany(project);
    }

    @POST
    public static void add(String json){
        CompanyDAO.createAndSave(json);
    }

    @GET
    public static String find(int id){
        return CompanyDAO.findById(id);
    }

    @DELETE
    public static void delete(int id){
        CompanyDAO.delete(id);
    }


}
