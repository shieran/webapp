package basicСlasses;

public class Project {
    private String name;
    private String logoUrl;
    private String startDate;
    private String endDate;
    private String manHours;
    private int id;
    private static int projectCount = 1;

    public Project(String name, String logoUrl, String startDate, String endDate, String manHours) {
        this.name = name;
        this.logoUrl = logoUrl;
        this.startDate = startDate;
        this.endDate = endDate;
        this.manHours = manHours;
        this.id = projectCount;
        projectCount++;
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getManHours() {
        return manHours;
    }

    public void setManHours(String manHours) {
        this.manHours = manHours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
