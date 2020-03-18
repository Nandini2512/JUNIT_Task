package EPAM;
import java.io.*;
import java.util.*;

public class Abcd {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	String s;
	Scanner s1=new Scanner(System.in);
	s=s1.next();
	String s2="";
	s2=To_Remove_A(s);
	System.out.println(s2);
	}
	static String To_Remove_A(String s) {
	if(s.charAt(0)=='A'&&s.charAt(1)=='A') {
		String result=s.substring(2,s.length());
				return result;
	}
	else if(s.charAt(0)=='A' && s.charAt(1)!='A') {
	 	String result=	s.substring(1,s.length());
	            return result;
	}

	else if(s.charAt(1)=='A' && s.charAt(0)!='A')
	{
		String result="";
		for(int i=0;i<s.length();i++)
	        {
			if(i==1) 
			{}
			else {
				result+=s.charAt(i);
				}
		}
		return result;
	}
	else {
		return s;
		}
	}

		}




