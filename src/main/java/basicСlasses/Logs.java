package basicСlasses;

import java.util.Date;

public class Logs {
    private String employeeName;
    private String projectName;
    private int timeSec;
    private String comment;
    private Date date;

    public Logs() {
        this.date = new Date();
    }

    public Logs(String employee, String project, int timeSec, String comment) {
        this.employeeName = employee;
        this.projectName = project;
        this.timeSec = timeSec;
        this.comment = comment;
        this.date = new Date();
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
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

    @Override
    public String toString() {
        return "Logs{" +
                "employeeName='" + employeeName + '\'' +
                ", projectName='" + projectName + '\'' +
                ", timeSec=" + timeSec +
                ", comment='" + comment + '\'' +
                ", date=" + date +
                '}';
    }


}
