package packDAO;

import basicСlasses.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.gson.Gson;

import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeDAO {

    private static LinkedList<Employee> employees = new LinkedList<>();

    public static String getAllEmployee(){
        return objectToJson(employees);
    }

    static {
        Employee employee = new Employee("photoUrl", "Kiryl", "mail");
        employees.add(employee);
    }

    public static void employeeCreationAndSave(String json) {
        Employee employee = new Gson().fromJson(json, Employee.class);
        employees.add(employee);
    }

    public static String findById(int id) {
        Iterator<Employee> iterator = employees.iterator();
        Employee employee;
        while (iterator.hasNext()) {
            employee = iterator.next();
            if (employee.getId() == id) {
                return objectToJson(employee);
            }
        }
        return "no employee with that id";
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

    public static void deleteEmployee(int id) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == id) {
                employees.remove(employee);
                System.out.println("employee was deleted");
                return;
            }
        }
    }

}
