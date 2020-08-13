/*
	We have n strings and each string contain 2 words (1 word is simple string and 2nd word is roman).
	We need to sort the string on the basis of 1st string (if 1st string is equal then use Roman numbers
	to sort it)

	INPUT
	4
	Prakhar XIV  
	Abhineet X
	Prakhar IX
	Rahul X

	OUTPUT
	Abhineet X
	Prakhar IX
	Prakhar XIV 
	Rahul X
*/

package com.java.examples;
import java.util.*;

class sortByRomanUtil implements Comparator<String> { 
	@Override
    public int compare(String s1, String s2) {
    	String[] str1 = s1.split("\\s+");
    	String[] str2 = s2.split("\\s+"); 
    	
    	if(!str1[0].equals(str2[0])) {
    		//System.out.println(str1[0] + " " + str2[0]);
    		return s1.compareTo(s2);
    	}
    	
    	int x=convertDec(str1[1]); int y=convertDec(str2[1]);
    	//System.out.println(x + " " + y);
    	return x-y;
    } 
    
    int value(char r) { 
        if (r == 'I') 
            return 1; 
       
        if (r == 'V') 
            return 5; 
      
        if (r == 'X') 
            return 10; 
      
        if (r == 'L') 
            return 50; 
      
        if (r == 'C') 
            return 100; 
      
        if (r == 'D') 
            return 500; 
      
        if (r == 'M') 
            return 1000; 
      
        return -1; 
    } 
    
    int convertDec(String str) {
    	int res=0; 
    	int n=str.length();
        for (int i=0;i<n;i++) { 
            int s1=value(str.charAt(i)); 
            if(i+1<str.length()) { 
            	int s2 = value(str.charAt(i+1)); 
                if (s1 >= s2) 
                    res = res + s1; 
                else {
                    res = res + s2 - s1; 
                    i++; 
                } 
            } 
            else 
                res = res + s1;  
        } 
        return res; 
    }
}

class A {
	public static List<String> sortRoman(List<String> list) {
		Collections.sort(list,new sortByRomanUtil());
		return list;		
	}
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
	
		String s;
		List<String> list=new ArrayList<String>();
		for(int i=0;i<n;i++) {
			s=sc.nextLine();
			list.add(s);
		}
		
		List<String> l=sortRoman(list);
		for(int i=0;i<list.size();i++) {
			System.out.print(l.get(i)+" ");
		}
	}
}


