/*
    How to take input of string having empty spaces and How to split a string with space

    INPUT 1
    Prakhar Singh
      
    OUTPUT 1
    Prakhar
    Singh

    INPUT 2
      Himanshu Mishra

    OUTPUT 2
    Himanshu
    Mishra
*/

package com.java.examples;
import java.util.*;

class A {
    public static void main(String args[]) {
    	Scanner sc= new Scanner(System.in);
    	String str=new String();
    	str=sc.nextLine();//for empty spaces

    	//Split
    	String arr[]=str.trim().split("\\s+");//trim here just to remove trailing and leading spaces 
    	System.out.println(arr[0]+" "+arr[1]);
    }
}