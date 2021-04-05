package datastructure.enumeration;

import java.util.Vector;
import java.util.Enumeration;

public class EnumerationTester {
    public static void main(String[] args){
        Enumeration<String> days;
        Vector<String> dayName = new Vector<String>();
        dayName.add("Sunday");
        dayName.add("Monday");
        dayName.add("Tuesday");
        dayName.add("Wednesday");
        dayName.add("Thursday");
        dayName.add("Friday");
        dayName.add("Saturday");
        days = dayName.elements();
        while(days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
    }
}
