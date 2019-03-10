package basicСlasses;

import java.util.Date;

public class Logs {
    private Employee employee;
    private Project project;
    private int timeSec;
    private String comment;
    private Date date;

    public Logs(Employee employee, Project project, int timeSec, String comment) {
        this.employee = employee;
        this.project = project;
        this.timeSec = timeSec;
        this.comment = comment;
        this.date = new Date();
    }


    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }


    public int getTimeSec() {
        return timeSec;
    }

    public void setTimeSec(int timeSec) {
        this.timeSec = timeSec;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public static Employee getEmployeeFromLog(Logs log){
        return log.employee;
    }

    public static Project getProjectFromLog(Logs log){
        return log.project;
    }
}
