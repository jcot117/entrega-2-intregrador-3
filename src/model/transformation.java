package model;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class transformation extends Proyect  {

    private String code;
    private Calendar endDate;
    
    public transformation(String code, String name, String status, Calendar date, Priority priority, String leader,
            String code2) {
        super(code, name, status, date, priority, leader);
        code = code2;
        //this.endDate = endDate;
    }

    
    
}
