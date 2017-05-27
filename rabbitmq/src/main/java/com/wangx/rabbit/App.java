package com.wangx.rabbit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String a ="0.244";
        String num[] = a.split("\\.");
        Integer s = Integer.parseInt(a.split("\\.")[0]);
        System.out.println(s);
    }
}
