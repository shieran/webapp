package packDAO;

import basicСlasses.Logs;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.gson.Gson;

import java.util.Iterator;
import java.util.LinkedList;

public class LogsDAO {
    public static LinkedList<Logs> logs = new LinkedList<>();

    static {
        Logs log = new Logs("kiryl", "hydra", 360, "test log");
        logs.add(log);
    }

    public static String getAllLogs() {
        return objectToJson(logs);
    }

    public static void addLogAndSave(String json) {
        Logs log = new Gson().fromJson(json, Logs.class);
        logs.add(log);
    }

    public static String findLog(String projectName) {
        Iterator<Logs> iterator = logs.iterator();
        while (iterator.hasNext()) {
            Logs log = iterator.next();
            if (projectName.equals(log.getProjectName())) {
                return objectToJson(log);
            }
        }
        return "logs not found";
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

    public static void deleteLog(String projectName) {
        Iterator<Logs> iterator = logs.iterator();
        while (iterator.hasNext()) {
            Logs log = iterator.next();
            if (projectName.equals(log.getProjectName())) {
                logs.remove(log);
            }
        }
    }
}

