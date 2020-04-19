/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.schedule;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author kales
 */
public class Schedule {

    private int id;
    Map<Date, HashMap<String, Boolean>> dateSchedule;

    public Schedule() {
        //   this.dateSchedule = ;
        Calendar c1 = Calendar.getInstance();
        c1.add(Calendar.DATE, 1);
        Date startDate = c1.getTime();

        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 30);
        Date endDate = c.getTime();

        Calendar c2 = Calendar.getInstance();
        c2.add(Calendar.DATE, 1);
    
        
        while (startDate.before(endDate)) {
            //  List<String> timeList = new ArrayList<>();
                    Date addDate = c2.getTime();

            System.out.println("in for");
            HashMap<String, Boolean> slotSchedule = new HashMap<>();
            slotSchedule.put("9 am", true);
            slotSchedule.put("10 am", true);
            slotSchedule.put("11 am", true);
            slotSchedule.put("5 pm", true);
            slotSchedule.put("6 pm", true);
            System.out.println(startDate);
            System.out.println(slotSchedule);
            if (dateSchedule == null) {
                dateSchedule = new HashMap<Date, HashMap<String, Boolean>>();
            }

            dateSchedule.put(addDate, slotSchedule); //   this.dateSchedule.put(date,timeList);
             c2.add(Calendar.DAY_OF_MONTH, 1);

            
        }

        System.out.println(dateSchedule);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<Date, HashMap<String, Boolean>> getDateSchedule() {
        if (dateSchedule == null) {
            dateSchedule = new HashMap<Date, HashMap<String, Boolean>>();
        }
        return dateSchedule;
    }

    public void setDateSchedule(Map<Date, HashMap<String, Boolean>> dateSchedule) {
        this.dateSchedule = dateSchedule;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getId());
    }

}
