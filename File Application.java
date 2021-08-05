package Assignments;
import java.util.Scanner;
import java.io.*;

public class Phase_1_Project {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         System.out.println("--------------------------------");
         System.out.println("Welcome To LockedMe.com");
         System.out.println("Developed By G.Rakesh");
         System.out.println("gmail: gondalarakesh2000@gmail.com");
         System.out.println("--------------------------------");
         while(true) {
        	 System.out.println("Enter a choice");
        	 System.out.println("1.Create a File");
        	 System.out.println("2.Delete a File");
        	 System.out.println("3.Display Files");
        	 System.out.println("4.Search Files");
        	 System.out.println("5.Exit");
        	 int ch=sc.nextInt();
        	 switch(ch) {
        	 case 1:
        		    System.out.println("Enter file name");
        	        String name=sc.next();
        	        File Folder=new File("C:\\Users\\Rakesh\\eclipse-workspace\\project\\src\\Assignments/Files");
        	        Folder.mkdir();
        		    File myfile =new File("C:\\\\Users\\\\Rakesh\\\\eclipse-workspace\\\\project\\\\src\\\\Assignments/Files/"+name);
				    try {
					myfile.createNewFile();
				}   catch (IOException e) {
					e.printStackTrace();
				}
				    System.out.println("--------------------------------");
				    System.out.println("File is created");
				    System.out.println("--------------------------------");
				    break;
        	 case 2:
        		    System.out.println("Enter FileName to delete");
        		    String filename=sc.next();
        		    File delete=new File("C:\\\\Users\\\\Rakesh\\\\eclipse-workspace\\\\project\\\\src\\\\Assignments\\\\Files\\\\"+filename);
        		    System.out.println("--------------------------------");
        		    if(delete.exists()) {
        		    	if(delete.delete()) {
        		    	System.out.println("File is deleted");
        		    }
        		    	else {
        		    		System.out.println("Failed to delete the File");
        		    	}
        	 }
        		    else {
        		    	System.out.println("file does not exists");
        		    }
        		    System.out.println("--------------------------------");
        		    break;
        	 case 3:
        		    String folderpath="C:\\\\\\\\Users\\\\\\\\Rakesh\\\\\\\\eclipse-workspace\\\\\\\\project\\\\\\\\src\\\\\\\\Assignments\\\\\\\\Files\\\\\\\\";
        	        File folder=new File(folderpath);
        	        File[] files=folder.listFiles();
        	        System.out.println("--------------------------------");
        	        for(File file:files) {
        	        if(file.isFile()) {
        	            System.out.println("File: "+file.getName());
        	        	}
        	        }
        	        System.out.println("--------------------------------");
        	        break;
        	 case 4:
        		   System.out.println("Enter File Name to search");
      		       String search=sc.next();
      		       String folderpath1="C:\\\\\\\\Users\\\\\\\\Rakesh\\\\\\\\eclipse-workspace\\\\\\\\project\\\\\\\\src\\\\\\\\Assignments\\\\\\\\Files\\\\\\\\";
     	           File folder1=new File(folderpath1);
     	           String[] files1=folder1.list();
     	           int flag=0;
     	           System.out.println("--------------------------------");
     	           if(search==null) {
     	        	System.out.println("Empty Directory");
     	        }
     	           else {
     	        	   for(int i=0;i<files1.length;i++) {
     	        		   String file=files1[i];
     	        		   if(file.equals(search)) {
     	        			   System.out.println("File Found:- "+file);
     	        			   flag=1;
     	        		   }
     	        	   }
     	           }
     	           if(flag==0) {
     	        	   System.out.println("File Not Found try again check the case sensitivity");
     	           }
     	          System.out.println("--------------------------------");
     	           break;
        		  
        		   
        	 case 5: 
        		    System.out.println("--------------------------------");
        		    System.out.println("Sucessfully closed.... ");
        		    System.out.println("Thank You For using the Application.... ");
        		    System.out.println("Developed by G.Rakesh ");
        		    System.out.println("--------------------------------");
        		    sc.close();
        		    System.exit(0);
        		    break;
        	default: 
        		    System.out.println("Please Choose a option from above options");
        	 
        	 }
         }
	}
}
