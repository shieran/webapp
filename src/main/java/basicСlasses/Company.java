package basicСlasses;

import java.util.LinkedList;

public class Company {
    private String name;
    private String logoUrl;
    private int id;
    private LinkedList<Employee> employees = new LinkedList<>();
    private LinkedList<Project> projectsOfCompany = new LinkedList<>();
    private static int countOfCompany = 1;

    public Company(String name, String logoUrl) {
        this.name = name;
        this.logoUrl = logoUrl;
        this.id = countOfCompany;
        countOfCompany++;
    }

    public void addEmpoleesToCompany(Employee employee){
        this.employees.add(employee);
    }

    public void addProjectToCompany(Project project){
        this.projectsOfCompany.add(project);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public LinkedList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(LinkedList<Employee> employees) {
        this.employees = employees;
    }

    public LinkedList<Project> getProjectsOfCompany() {
        return projectsOfCompany;
    }

    public void setProjectsOfCompany(LinkedList<Project> projectsOfCompany) {
        this.projectsOfCompany = projectsOfCompany;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                ", id=" + id +
                ", employees=" + employees +
                ", projectsOfCompany=" + projectsOfCompany +
                '}';
    }
}
