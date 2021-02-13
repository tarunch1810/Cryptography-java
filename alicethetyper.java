import java.util.*;//ALICE TYPING
class alicethetyper implements Runnable {
public static String st; 
public static String str1 = "";
private volatile int key;private volatile int keya;
static int a[] = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
static int ki[] = new int[]{0,1,0,9,0,21,0,15,0,3,0,19,0,0,0,7,0,23,0,11,0,5,0,17,0,25} ; 
 static char c[] = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
public alicethetyper (int key,int keya)
    {
      this.key=key;
      this.keya=keya;
    }
public void run()
    { 
    Scanner sc =new Scanner(System.in);
    
   
     String s = "";
     String p=bobthetyper.str1;//Bob's Encrypted Message
     //Decypting Bobs Message
    for (int i = 0; i <(p).length(); i++) {
            int j;
            if (p.charAt(i) == ' ') {
                i++;
                s = s.concat(" ");
            }
            for (j = 0; j < 26; j++) {
                if (p.charAt(i) == c[j]) {
                    break;
                }
            }
            j = ((a[j]-keya) * ki[key]) % 26;
            if (j < 0) {
                j = 26 + j;
            }
            s = s.concat(c[j] + "");
        }
        System.out.println("BOB: "+s);
        System.out.println("Alice is Typing.... ");
        st=sc.nextLine();
        //Encrypting alice's Message
           for (int i = 0; i < st.length(); i++) {
            int j;
            if (st.charAt(i) == ' ') {
                i++;
                str1 = str1.concat(" ");
            }

            for (j = 0; j < 26; j++) {
                if (st.charAt(i) == c[j]) {
                    break;
                }
            }
            j = ((a[j] * key)+keya) % 26;
            str1 = str1.concat(c[j] + "");
        }
        System.out.println("Alice message if intercepted by eve : "+str1);
       bobthetyper.str1="";
        
        
        
    }void stop(){};
}