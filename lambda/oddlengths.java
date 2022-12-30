package com.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

interface RemoveDup

{

  public int removeDup(String str);
}

 class oddlengths {

    public static ArrayList<String>removeOddlength(ArrayList<String> employeeList){

        ArrayList<String>list = new ArrayList<>();
        Predicate<String>filterEmp = (p)-> {
            if(Math.floorMod(p.length(),2)==0)
                return  true;
            else
                return false;
        };
        employeeList.stream()

                .filter(filterEmp)

                .forEach(p->list.add(p));
        return  list;
    }
    public static void main(String[] args) {
        ArrayList<String>employeeList = new ArrayList<>();
        employeeList.add("TomJones");
        employeeList.add("Harry");
        employeeList.add("EthanHardy");
        employeeList.add("NancySmith");
        employeeList.add("Deborah");
        oddlengths assinment= new oddlengths();
        System.out.println(oddlengths.removeOddlength(employeeList));
    }

}
