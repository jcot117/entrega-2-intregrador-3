package model;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Proyect {

    private String code;
    private String name;
    private String status;
    private Calendar date;
    private Priority priority;
    private String leader;
    
    public Proyect(String code, String name, String status, Calendar date, Priority priority, String leader) {
        this.code = code;
        this.name = name;
        this.status = status;
        this.date = date;
        this.priority = priority;
        this.leader = leader;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    

}
