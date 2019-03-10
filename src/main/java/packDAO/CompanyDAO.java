package packDAO;

import basicСlasses.Company;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.gson.Gson;

import java.util.Iterator;
import java.util.LinkedList;

public class CompanyDAO {
    private static LinkedList<Company> companies = new LinkedList<>();

    public static String getAllCompany(){
        return objectToJson(companies);
    }

    static {
        Company company = new Company("microsoft","logoUrl");
        companies.add(company);
    }

    public static void createAndSave(String json){
        Company company = new Gson().fromJson(json, Company.class);
        companies.add(company);
    }

    public static String findById(int id){
        Iterator<Company> iterator = companies.iterator();
        Company company;
        while (iterator.hasNext()) {
            company = iterator.next();
            if (company.getId() == id){
                return objectToJson(company);
            }
        }
        return "no company with that id";
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

    public static void delete(int id){
        Iterator<Company> iterator = companies.iterator();
        while (iterator.hasNext()){
            Company company = iterator.next();
            if (company.getId() == id){
                companies.remove(company);
                System.out.println("company was deleted");
                return;
            }
        }
    }
}
