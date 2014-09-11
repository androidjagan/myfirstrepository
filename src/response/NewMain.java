/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package response;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Sennovate
 */
public class NewMain {
    public static void main(String[] args) {
        System.out.println(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").format(new Date()));
    }
    
}
