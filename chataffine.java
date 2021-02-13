import java .util.*;
public class chataffine
{  static int k,ka;
    static void ask()
    {
   bobthetyper x = new bobthetyper(k, ka);
    Thread a=new Thread(x);
    a.run();
    
    }
  static void reply()
    { 
   alicethetyper y= new alicethetyper(k,ka);
   Thread b=new Thread(y);
   b.run();
    }  
public static void main (String args [])
{
 Scanner sc=new Scanner (System.in);
 System.out.println("Enter value of key");
 k=sc.nextInt();
 ka=sc.nextInt();
 if(k%2==0||k==13||k>25)
 {
    System.out.println("key value not possible");
    }
    else{
 System.out.println("Start chat");
 char q='Y';
 while(q!='n'||q!='N'){
 ask();
 reply();
 
 
}}
}
}
