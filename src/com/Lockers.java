package com;
import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lockers {
    	public static void main(String[] args) throws IOException {
    	int ch,op;
    	Scanner sc=new Scanner(System.in);
    	String path="E:\\Company_Locker\\";
    	System.out.println("********************LokedMe.com*************************");
    	System.out.println("********************Smita Patil*************************");
    	do
    	{
    	System.out.println("Enter your choice");
    	System.out.println("1)Display file names\n2)add,delete,serach the file\n3)Exit");
    	ch=sc.nextInt();
    	switch(ch)
    	{
    	case 1:
    		File f3=new File(path);
    		File fileng[]=f3.listFiles();
    		for(File ff:fileng) {
    			System.out.println(ff);
    		}
    		break;
    	case 2:
    		do 
    		{
    		System.out.println("Enter your choice:");
    		System.out.println("\n1)Add a file \n2)Delete the file \n3)Search the file \n4)Exit");
    		op=sc.nextInt();
    		
    		switch(op)
    		{
    		
    			case 1:
				    		ArrayList<String> al=new ArrayList<>();
				    		System.out.println("Enter the file name");
				    		String filename=sc.next();
				    		String finalfile=path+filename;
				    		File f=new File(finalfile);	
				    		boolean res=f.createNewFile();
				    		if(res==false) {
				    			System.out.println("file not created");
				    		}
				    		else {
				    			al.add(filename);
				    			System.out.println("file is created");
				    		}
				    		System.out.println(al);
		   		break;
		    	case 2:	
				    		System.out.println("Enter the name of a file to be deleted");
				    		String filedel=sc.next();
				    		String delfile=path+filedel;
				    		File f2=new File(delfile);
				    		f2.delete();
		        break;
		    	
		    	case 3:
				    		File f1=new File(path);
				    		System.out.println("enter the file name");
				    		String filesearch=sc.next();
				    		File filen[]=f1.listFiles();
				    		int flag=0;
				    		for(File ff:filen) {
				    			if(ff.getName().equals(filesearch)) {
				    				flag=1;
				    				break;
				    			}
				    			else {
				    				flag=0;
				    			}
				    		}
				    		if(flag==1) {
				    			System.out.println("file is found");
				    		}
				    		else {
				    			System.out.println("file is not found");
				    		}
				             break;
		    	case 4:
			             default:
			            	 System.out.println("Invalid choice");
			            	break;
		    		}
    		}while(op!=4);
    	case 3:
    		default:
       	       System.out.println("Invalid choice");
       	
    		
    	}
  }while(ch!=3);
  }
}

