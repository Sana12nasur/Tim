package Tim;
import java.util.Scanner;
import java.lang.Exception;  
  
 class UserId extends Exception
 {
	/**
	*
	*/
       private static final long serialversionUID = 1L;			
       String str1="Meena1972@gmail.com";   //User ID
       String str2="System*123";		  //Password
       String m,m2,m3;
       String n,n2,n3;
       int count=0,flag=0,end=0;
       Scanner in = new Scanner(System.in);
        void input()
	{

	       try
		{
		   System.out.println("\nEnter User ID ");
		   m = in.next();
		   System.out.println("\nEnter User Password ");	
		   n = in.next();
                            if(  str1.compareTo(m)!=0||  str2.compareTo(n)!=0)
			{
			  System.out.println(" \n\n ERROR !!!!...........! ");
			    throw new Exception();
			}
	             else
			{
			 System.out.println("\n Login in .......... ");

			}
		}

              	catch(Exception e)
		{
				
					//System.out.println(e);
			do
			     {
				if(str1.equals(m2)||  str2.equals(n2))
				{
				   System.out.println("\n Login in .......... ");
				    break;
				}
	                		else 
				  {
				     //System.out.println(e);
				      System.out.println(" \n\nLogin in Fails..........Wrong Credentials  ");
				      System.out.println("\nEnter User ID ");				
					m2= in.next();
				      System.out.println("\nEnter User Password ");	
					n2 = in.next();
					flag++;
				   }
                                                           count++;
				 end++;
			     } 
                                             while(end!=3);
				if(flag==3&&end==3)
					{
					   System.out.println("\n Try after 24 hours :  !!!!!");
					}
				                  System.out.println("\n\n"+end);
				                  System.out.println(flag);
				                  System.out.println(count);
			}
			
		}
				
	}
	      public class Gary extends UserId 
	           {
		/**
		*
		*/
		private static final long serialVersionUID = 1L;
		String ename;
		int emp;
		int tday,tmonth,tyear;
	              int days,pay;
	              int bs,pf,da;
	              int hra,spt,medy;
		int trav,tele,net;
		int proft,fim;
		int flag,totale,totald;
		        	Scanner in =new Scanner(System.in);
			public void input1() //FUNCTION 1
	{               //NAME
		emp=45;
	System.out.println("\nEnter Employee ID :   ");
		emp=in.nextInt();
	System.out.println("\nEnter Employee Name :   ");
		ename=in.next();
                  //DATE
	//time_t current_time = time(NULL);
	//struct tm *tm= localtime(&current_time);
               //ATTENDANCE
		try
		{
	System.out.println("\nEnter number of day employee is present :   ");
	
	days=in.nextInt();
	if(days>0 && days<31)
	{
		System.out.println("\nYour Day Worked   : "+days);
	}
	else
	{
		System.out.println("\n\t\t  You Have Entered Wrong Number  !!!!!    ");
		throw new Exception();
	}
		}
		catch(Exception e)
		{
			System.out.println("\n You have entered wrong number "
					+ "of day employee is present :  \n "+e);
		
			System.out.println("\nEnter again number of day employee is present :   ");
		days=in.nextInt();
		if(days>0 && days<31)
		{
			System.out.println("\nYour Day Worked   : "+days);
		}
			}
	}
		void cal()
		{
       //PAY
	pay=31000;
	System.out.println("\npay_rate = "+pay);
		if(pay>0&&pay<32000)
	            bs=pay*days;   //earn
		System.out.println("\nbasic = "+bs);
	pf=(bs/12);   //deduct
	System.out.println("\npf = "+pf);
		da=(bs/10);   //earn
		hra=(bs/15);
		System.out.println("\n da = "+da+"hra ="+hra);  //earn
		//OTHER INFO IN SALARY
		spt=500;
		medy=(bs/25);
		tele=400;
		trav=2500;
	System.out.println("\n\nsport "+spt+" medical "+medy+" tele phone = "+tele+" travell  = "+trav);//earn
		proft=200;
     //PROFESSION TAX
	System.out.println("\n proft = "+proft);
       //NET
	totale=bs+spt+medy+hra+trav+tele;
	System.out.println("\n totale = "+totale);
	totald=(pf+proft);
	net=totale-totald;
System.out.println("\n Mothly Salary :"+net);
				
                //class slaa: public gary
	
		}
		void run()
		{
System.out.println("\n\n\n\n\n\n\t \t\t--:   Marvel Corp R.   :--");
flag=0;
                 //IF FOR BASIC
	
if(net>0&&net<10000)
{
flag=1;
}
if(net>10000&&net<50000)
{
flag=2;
}
if(net>50000&&net<100000)
{
flag=3;
}
if(net>100000&&net<300000)
{
flag=4;
}
if(net>300000&&net<1000000)
{
flag=5;
}
if(net>1000000&&net<5000000)
{
flag=6;
}
if(net>5000000&&net<10000000)
{
flag=7;
}
if(net>10000000)
{
flag=8;
}
if (flag==1)
{
System.out.println("\n\t Desgnation  : Helper ");
}
if (flag==2)
{
System.out.println("\n\t Desgnation  : Clerk");
}
if (flag==3)
{
System.out.println("\n\t Desgnation  : Salesmen");
}
if (flag==4)
{
System.out.println("\n\t Desgnation  :  Salesmen");
}
if (flag==5)
{
System.out.println("\n\t Desgnation  :  Developer ");
}
if (flag==6)
{
System.out.println("\n\t Desgnation  : Manager");
}
if (flag==7)
{
System.out.println("\n\t Desgnation  :CEO");
}
	}	
		
	public void display()
	{
System.out.println("\n\t Attendence : "+days);
// cout<<"\n\n|-----------------------------------------------------------------------------|";
/*  cout<<"/*\n|         */
System.out.println("|\n\n\t\t Name : "+ename+"\t\t\t    EmpID : "+emp+"              |");
System.out.println("\n______________________________________________________________________________");
System.out.println("\n|                                                                             |");
System.out.println("\n|     EARNING                        DEDUCTION                             |");
System.out.println("\n|-----------------------------------------------------------------------------|");
System.out.println("\n|      Basic Pay = "+bs+"\t    Providant Fund = "+pf+"                    |");
System.out.println("\n|-----------------------------------------------------------------------------|");
System.out.println("\n|                                                                             |");
System.out.println("\n|      Sports : "+spt+"                   Travel Allo : "+trav+"                      |");
System.out.println("\n|      TelePhone :"+tele+"                 Housing Loan :"+hra+"                     |");
System.out.println("\n|      Dearness Allo :"+da+"           Medical Allo : "+medy+"   |");
System.out.println("\n|--------------------------------------------------------------------------------|");

System.out.println("\n|        Total Earn = "+totale +"\t     Total Deduction = "+totald+"                |");
System.out.println("\n|                           \t  Mothly Salary  : "+net+"                     |");
System.out.println("\n|_____________________________________________________________________________|");
}


public static void main(String args[]) throws Exception
{
	Gary obj = new Gary();
	obj.input();
	
	
	if( obj.str1.compareTo(obj.m)!=0||  obj.str2.compareTo(obj.n)!=0)
	{
		System.out.println(" \n\n ERROR !!!!...........! ");
		throw new Exception();
	}
	else
	{
		System.out.println("\n Login in .......... ");


	obj.input1();
	obj.cal();
	obj.run();
	obj.display();
	}
}
}
