/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package response;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 *
 * @author Sennovate
 */
public class NewMain1 {

   

    /**
     * @param args the command line arguments
     */
    private static int daysBetween(Date d1, Date d2){
 return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
 }
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date dt = formatter.parse("2014-08-31 00:00:41");
        //System.out.println(new SimpleDateFormat("dd-MMM").format(dt));
         //int days = Days.daysBetween(date1, date2).getDays();
        System.out.println(daysBetween(dt, new Date())+" days");
        
    }
 
}
