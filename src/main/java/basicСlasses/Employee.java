package basicСlasses;


import java.util.LinkedList;
import java.util.List;

public class Employee {


    private String photoUrl;
    private String name;
    private String email;
    private int id;
    private List<Project> projectsOfEmployee = new LinkedList<>();
    private static int countOfEmployee = 1;

    public Employee() {
        countOfEmployee++;
    }

    public Employee(String photoUrl, String name, String email, List<Project> projectsOfEmployee) {
        this.photoUrl = photoUrl;
        this.name = name;
        this.email = email;
        this.id = countOfEmployee;
        this.projectsOfEmployee = projectsOfEmployee;
        countOfEmployee++;
    }

    public void addProjectToEmployee(Project project) {
        this.projectsOfEmployee.add(project);
    }

    public int getId() {
        return id;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Project> getProjectsOfEmployee() {
        return projectsOfEmployee;
    }


    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProjectsOfEmployee(List<Project> projectsOfEmployee) {
        this.projectsOfEmployee = projectsOfEmployee;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "photoUrl='" + photoUrl + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                ", projectsOfEmployee=" + projectsOfEmployee +
                '}';
    }
}
