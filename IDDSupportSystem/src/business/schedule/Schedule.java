/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.schedule;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author kales
 */
public class Schedule {
    
    private int id;
    private Date date;
    private Time time;

    public Schedule(Date date,Time time) {
        this.date = date;
        this.time = time;
        id = (int) (System.currentTimeMillis() & 0xfffffff);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }
    
    
    
    
}
