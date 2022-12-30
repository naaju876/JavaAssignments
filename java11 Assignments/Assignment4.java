package com.Java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Assignment4 {
    public static void main(String[] args)
    {
        var path="C:\\Users\\ynaaju\\Documents\\naaj.txt";
        
        try{
            String data = Files.readString(Path.of(path));
       System.out.println(data);
       long numberlines=data.lines().count();
        Object of;
        System.out.println(numberlines);
    } catch(IOException e)
    {
        e.printStackTrace();
    }
}
}