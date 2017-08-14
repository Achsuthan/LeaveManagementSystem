/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaveManagementSystem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Anojithan
 */
public class Validate {
    
    public static boolean ValidateEmail(String email)
    {
        boolean status=false;
        String EmailPattern="^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        Pattern pattern=Pattern.compile(EmailPattern);
        Matcher matcher=pattern.matcher(email);
        
        if(matcher.matches())
            status=true;
        
        else
            status=false;
        
        return status;
    }
    
    public static boolean ValidateName(String name)
    {
        boolean status=false;
        String NamePattern="^[a-zA-Z]{3,}$";
        Pattern pattern=Pattern.compile(NamePattern);
        Matcher matcher=pattern.matcher(name);
        
        if(matcher.matches())
            status=true;
        else
            status=false;
        
        return status;
    }
    
    public static boolean ValidateContactNumber(String number)
    {
        boolean status=false;
        String ContactNumberPattern="^[0-9]{9,10}$";
        Pattern pattern=Pattern.compile(ContactNumberPattern);
        Matcher matcher=pattern.matcher(number);
        
        if(matcher.matches())
            status=true;
        
        else
            status=false;
        
        return status;
    }
    
    public static boolean ValidateAddress(String address)
    {
        boolean status=false;
        String AddressPattern="^[a-zA-Z0-9 - / .  ]{0,}$";
        Pattern pattern=Pattern.compile(AddressPattern);
        Matcher matcher=pattern.matcher(address);
        
        if(matcher.matches())
            status=true;
        else
            status=false;
        
        return status;
    }
    
    public static boolean ValidateDistrictandCity(String districtandCity)
    {
        boolean status=false;
        String DistrictandCityPattern="^[a-zA-Z]{3,}$";
        Pattern pattern=Pattern.compile(DistrictandCityPattern);
        Matcher matcher=pattern.matcher(districtandCity);
        
        if(matcher.matches())
            status=true;
        else
            status=false;
        
        return status;
    }
    
    
    
     
    
}
