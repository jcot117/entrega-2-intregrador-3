package model;

import java.util.Calendar;
import java.text.SimpleDateFormat;


public class knowlegde extends Proyect  {
    
    private String nameProcess;
    private Comunity comunity;
    private Type type;
    
    public knowlegde(String code, String name, String status, Calendar date, Priority priority, String leader,
            String nameProcess, Comunity comunity, Type type) {
        super(code, name, status, date, priority, leader);
        this.nameProcess = nameProcess;
        this.comunity = comunity;
        this.type = type;
    }
    




}
