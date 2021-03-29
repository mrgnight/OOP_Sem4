/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabSesi5;

import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author HP
 */
public class GregCalendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long elapsedTime;
        
        GregorianCalendar gregCal = new GregorianCalendar();
        
        Integer myYear = gregCal.get(GregorianCalendar.YEAR);
        Integer myMonth = gregCal.get(GregorianCalendar.MONTH);
        Integer fixedMonth = (myMonth + 1); //dikarenakan calendar menggunakan index dari 0, bukan 1
        Integer myDate = gregCal.get(GregorianCalendar.DATE);
        
        System.out.println("My Year, Month, Date: " + myYear + " ," + fixedMonth + " ," + myDate);
        
        System.out.println("Gregorian calendar: " + gregCal.getTime() );
        
// public void setTimeInMillis(long mill_sec)       
        gregCal.setTimeInMillis(1);
        
        System.out.println("New time in millis is: " + gregCal.getTime());
        
        elapsedTime = System.currentTimeMillis();
        
        System.out.println("Elapsed time from 1 Jan 1970 in millis is: " + elapsedTime);
        
        Long elapsedDay = TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis());
        Long elapsedYear = elapsedDay / 365;
        elapsedDay %= 365;
        Long elapsedMonth = elapsedDay / 30;
        elapsedDay %= 30;
        
        System.out.println("Gregorian Calendar based time passed from 1 Jan 1970: " +
                elapsedYear + " Years " +
                elapsedMonth + " Months " +
                elapsedDay + " Days");
        
        
    }
    
}
