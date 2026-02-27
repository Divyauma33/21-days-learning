import java.util.Scanner;
public class Topic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Email validator

        /*System.out.print("Enter email= ");
        String email=sc.nextLine().trim();
        if(email.contains("@") && email.contains(".")){
            int atIndex=email.indexOf("@");
            int lastAtIndex=email.lastIndexOf("@");
            int dotIndex=email.lastIndexOf(".");
            if(atIndex>0 && atIndex==lastAtIndex && dotIndex > atIndex && !email.endsWith(".") && !email.contains(" ")){
                System.out.println("Valid email");
            }
            else{
                System.out.println("Invalid email");
            }}
        else{
            System.out.println("Invalid email");
        } */

       //Password strength checker

       /*System.out.print("Enter password= ");
       String password=sc.nextLine();
       boolean hasUpper=false;
       boolean hasLower=false;
       boolean hasDigit=false;
       boolean hasSpecial=false;
       if(password.length() >=8){
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(ch>='A' && ch<='Z') {
                hasUpper=true;
            }
            else if(ch>='a' && ch<='z'){
                hasLower=true;
            }
            else if(ch>='0' && ch<='9'){
                hasDigit=true;
            }
            else{
                hasSpecial=true;
            }
        }
        if(hasUpper && hasLower && hasDigit && hasSpecial){
            System.out.println("Strong Password");
        }
        else{
            System.out.println("Weak password");
        }
       } 
       else{
        System.out.println("Password too Short");
       } */

      //Palindrome or not

      /*System.out.print("Enter a word= ");
      String s=sc.nextLine();
      s=s.toLowerCase();
      int start=0;
      int end=s.length()-1;
      boolean isPalindrome=true;
      while(start<end){
        if(s.charAt(start)!=s.charAt(end)){
            isPalindrome=false;
            break;
        }
        start++;
        end--;
      } 
      if(isPalindrome){
        System.out.println("Palindrome");
      }
      else{
        System.out.println("Not Palindrome");
      }*/

     //Count vowels

     /*System.out.print("Enter a word= ");
     String word=sc.nextLine();
     word =word.toLowerCase();
     int count=0;
     for( int i=0; i<word.length(); i++){
        char ch=word.charAt(i);
        if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            count++;
        }
     }
     System.out.println("Vowel count = " + count);*/

     //Reverse String

     System.out.print("Enter word= ");
     String s=sc.nextLine();
     String reversed=" ";
     for(int i=s.length()-1 ;i>=0 ;i--){
        reversed = reversed +s.charAt(i);
     }
     System.out.println("Reversed String = " + reversed);
        
        
    }
}
