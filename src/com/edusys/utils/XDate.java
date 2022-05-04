/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO-PC
 */
public class XDate {
    static SimpleDateFormat formater=new SimpleDateFormat();
    public static  Date toDate(String date,String pattern){
       try{
           formater.applyPattern(pattern);
           return formater.parse(date);
       } catch (ParseException ex) {
           throw new RuntimeException();
        }
    }
   public static String toString(Date date, String...pattern){
        if(pattern.length>0)formater.applyPattern(pattern[0]);
        if(date==null)date=XDate.now();
        return formater.format(date);
    }
    public static  Date addDays(Date date,long days){
        date.setTime(date.getTime()+days*24*60*1000);
        return date;
    }

    public static Date now() {
        return new Date(); 
    }
}
