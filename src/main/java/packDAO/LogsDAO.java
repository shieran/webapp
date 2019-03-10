package packDAO;

import basicСlasses.Logs;
import basicСlasses.Project;
import com.google.gson.Gson;

import java.util.Iterator;
import java.util.LinkedList;

public class LogsDAO {
    public static LinkedList<Logs> logs = new LinkedList<>();

    public static void addLogAndSave(String json) {
        Logs log = new Gson().fromJson(json, Logs.class);
        logs.add(log);
    }

    public static String findLog(Project project) {
        StringBuilder sb = new StringBuilder();
        Iterator<Logs> iterator = logs.iterator();
        while(iterator.hasNext()) {
            Logs log = iterator.next();
            if (Logs.getProjectFromLog(log).getName().equals(project.getName())) ;
            sb.append(log.toString());
        }
        return String.valueOf(sb);
    }

    public static void deleteLog(Project project) {
        Iterator<Logs> iterator = logs.iterator();
        while (iterator.hasNext()) {
            Logs log = iterator.next();
            if (log.getProject().getName().equals(project.getName())) {
                logs.remove(log);
            }
        }
    }
}

