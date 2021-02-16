package com.nttdata;

public class StringImmutable
{
	public static void main(String args[])
	{
		String s1= "Hi";
		String s2= "Hi";
		System.out.println(s1==s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		s1=s1+"hello";
		System.out.println(s1==s2);	
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
