
import java.util.Scanner;
import java.util.Random;
/**
 * WThis program wil allow you to 
 *
 * @author (Jacob Kuntz)
 * @version (1.0)
 */
public class Cal1
{
 public static void main(String[] args)
 {
     String answer;
     do
     {
        System.out.println("\u000C");
        
               
        Scanner input = new Scanner(System.in);
        Scanner keyboard1 = new Scanner(System.in); 
     
        Scanner scan =new Scanner(System.in);
        int a,b,c,d, selection;
        System.out.println("Enter any two digits");
        a=scan.nextInt();
        b=scan.nextInt();
        
        System.out.println("Pick an option");
        System.out.println("______________");
        System.out.println();
        
        System.out.println("1.Add");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.All of the Above");
        
        selection=scan.nextInt();
        while(selection>4)
        {
            System.out.println("please enter the correct selection:");
            selection=scan.nextInt();
        }
            
        class Cal2
        {
            public int add(int x,int y)
            {
                int z;
                z=x+y;
                return z;
            }
            public int sub(int x,int y)
            {
                int z;
                z=x-y;
                return z;
            }
            public int multi(int x,int y)
            {
                int z;
                z=x*y;
                return z;
            }
            public int div(int x,int y)
            {
                int z;
                z=x/y;
                return z;
            }
            
        }
        
        
        Cal2 mani =new Cal2();
        if(selection==1)
        {
           c=mani.add(a,b); 
           System.out.println("your answer is "+c);
        }
        else if(selection==2)
        {
           c=mani.sub(a,b); 
           System.out.println("your answer is "+c);
        }
        else if(selection==3)
        {
            c=mani.multi(a,b);
            System.out.println("your answer is "+c);
        }
        else if(selection==4)
        {
            c=mani.div(a,b);
            System.out.println("your answer is "+c);
        }
      
        System.out.println("Do you want to replay? yes or no");
        answer = keyboard1.next();
     }
     while(answer.equals("yes"));
  }
}


     



     


      
   


   

         
        
        
    
        
    