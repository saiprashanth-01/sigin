
package com.project;

import java.util.*; 

public class MainClass {
	 
	
	
	public static ArrayList <String> list = new ArrayList<String>();
    static String gmail;
    static String name;
    static String gender;
    static String password;
    static String mobile;
    static String alternateMobile;
    static String alternateGmail;
    static String dateOfBirth;

	  
	
	public static void main(String[] args)
	  
	   { 
		list.add("1.Name");
		 list.add("2.Gender");
		 list.add("3.password");
		 list.add("4.Mobile Number");
		 list.add("5.Alternate Number" );
		 list.add("6.gmail id" );
		 list.add("7.Alternate gmail id" );
		 list.add("8.Date of birth" );
		 list.add("0 to Submit");
		MainClass a= new MainClass();
		
	}

	
		public  MainClass()
		{	
			
		Iterator<String> i = list.iterator();
		 while(i.hasNext())
		  {
			System.out.println(i.next());
		  }
		
	     System.out.println(" Choose the number");
		
	     Scanner scan= new Scanner(System.in);
	      int a= scan.nextInt();
	       
	      switch(a)
	      {
	      case 1: name= Nam.display();
	              new MainClass();
	              
	      case 2: gender= Gender.display();
	              new MainClass();
	              
	      case 3: password= Password.display(); 
	               new MainClass();
	               
	      case 4: mobile=MobileNumber.display();
	      			new MainClass();
	      			
	      case 5: alternateMobile= AlternateMobileNumber.display();
	                new MainClass();
	                
	      case 6: gmail = GmailId.display();
	               new MainClass();
	               
	      case 7: alternateGmail =AlternateGmailId.display();
	               new MainClass();
	               
	      case 8: dateOfBirth= DateOfBirth.display(); 
	               new MainClass();
	             
	      case 0: Submits.display();
	      }
		
		}

		


class Nam  extends MainClass
{
	public static String display()
	{
		System.out.println("Enter your name");
		Scanner scan= new Scanner(System.in);
		String name= scan.next();
	
		System.out.println("You have entered your name ");
	
		
		list.remove("1.Name");
		return name;
		
		
		                                         
		
		
		
		
	}
}
class Gender extends MainClass
{
	 public static String display()
	 {
		 System.out.println("Enter your Gender");
		  Scanner scan = new Scanner(System.in);
		  String gender = scan.nextLine();
		  String m="male";
		  String f="female";
		  if(gender.equalsIgnoreCase(m)|| gender.equalsIgnoreCase(f))
		  {
			  System.out.println("Your gender is" +gender);
			  list.remove("2.Gender");
		
		  }
		  else 
		  {
			  System.out.println("Enter your gender correctly i.e either male or female with any case letters");
			  display();
		  }
		  return gender;
		
	 }
}
class Password extends MainClass
{
	public static String display()
	{
		System.out.println("Enter your Password");
		Scanner scan = new Scanner(System.in);
		String password= scan.nextLine();
		if(password.length()<8)
		{
			System.out.println("the password length must be of atleast8 characters");
		            display();
		}
		int upperCount=0;
		int lowerCount=0;
		int digitCount=0;
		for(int i=0; i<password.length();i++)
		{
			char ch=password.charAt(i);
			if(Character.isUpperCase(ch))
			{
				
				upperCount++;
			}
			 if(Character.isLowerCase(ch))
			{
				lowerCount++;
			}
			 if(Character.isDigit(ch))
			{
				
				digitCount++;
			}
		}
			
			 if(lowerCount==0||upperCount==0||digitCount==0)
			 {
					System.out.println("Your password should contain atleast one Upper case , one lower case and one  Numeric character");
					display();

			 }
			 else
			 {
				 System.out.println("You have Entered your password");
				 list.remove("3.password");
			
			 }
			 return password;
		
	}
	
}
class MobileNumber extends MainClass
{
	   public static String display()
	   {
		   System.out.println("Enter your Mobile number");
		   Scanner scan = new  Scanner(System.in);
		   String mobileNumber= scan.nextLine();
		   if (mobileNumber.length()!=10) 
		   {
			   System.out.println("Your mobile number must be of 10 digits");
			   display();
		   }
		     
		   try 
		   {
			   
		   long a= Long.parseLong(mobileNumber);
		    a=a/1000000000;
		    if (a==9||a==8||a==7||a==6)
		    {
		    	System.out.println("You have Entered your number");
		    	list.remove("4.Mobile Number");
		    	
		    }
		    else
		    {
		    	System.out.println("Your Phone number should be started with 9 or 8 or 7 or 6");
		    }
		     
			   
		   }
		   catch (Exception e)
		   {
			   System.out.println("Please do not enter other charcters than numbers");
			   display();
			
		   }
		   return mobileNumber;
	   }
}
class AlternateMobileNumber extends MainClass
{
	 public static String display()
	   {
		   System.out.println("Enter your Alternate Mobile number");
		   Scanner scan = new  Scanner(System.in);
		   String mobileNumber= scan.nextLine();
		   if (mobileNumber.length()!=10) 
		   {
			   System.out.println("Your mobile number must be of 10 digits");
			   display();
		   }
		     
		   try 
		   {
			   
		   long a= Long.parseLong(mobileNumber);
		   a=a/1000000000;
		    if (a==9||a==8||a==7||a==6)
		    {
		    	System.out.println("You have  entered your Alternate mobile number");
		    	list.remove("5.Alternate Number");
		    	
		    }
		    else
		    {
		    	System.out.println("Your Phone number should be started with 9 or 8 or 7 or 6");
		    }
		     
			   
		   }
		   catch (Exception e)
		   {
			   System.out.println("Please do not enter other charcters than numbers");
			   display();
			
		   }
		   return mobileNumber;
	   }
}
class GmailId extends MainClass
{
	 public static String display()
	 {
		 System.out.println("Enter your gmail id ");
		 Scanner scan = new Scanner(System.in);
		 String gmailId= scan.nextLine();
		 if(!(gmailId.endsWith("@gmail.com")))
		 {
			System.out.println("Your gmail should end with @gmail.com"); 
			display();
		 }
		 else 
		 {
			 System.out.println("You have entered your gmail Id successfully");
			 list.remove("6.gmail id");
			 
			 
		 }
		 return gmailId;
		
	 }
}
class AlternateGmailId extends MainClass
{
	 public static String display()
	 {
		 System.out.println("Enter your Alternate gmail id ");
		 Scanner scan = new Scanner(System.in);
		 String gmailId= scan.nextLine();
		 if(!(gmailId.endsWith("@gmail.com")))
		 {
			System.out.println("Your gmail should end with @gmail.com"); 
			display();
		 }
		 else 
		 {
			 System.out.println("You have entered your Alternate gmail Id successfully");
			 list.remove("7.Alternate gmail id");
			 
		 }
		 return gmailId;
	 }
}
class DateOfBirth extends MainClass
{
	public static String display() 
	{
		System.out.println("Enter your Date of Birth");
		Scanner scan = new Scanner(System.in);
		String dob =scan.nextLine();
		System.out.println("You entered your date of birth");
		list.remove("8.Date of birth");
		return dob;
	}
}
class Submits extends MainClass
{
	 public static void display()
	 {
		 System.out.println(name);
		 System.out.println(gender);
		 System.out.println(password);
		 System.out.println(mobile);
		 System.out.println(alternateMobile);
		 System.out.println(gmail);
		 System.out.println(alternateGmail);
		 System.out.println(dateOfBirth);
		 list.remove("0 to Submit");
		 new MainClass();
		 
		 
	 }
}
}

