import java.util.Scanner;
public class BuilderDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //StringBuilder sb=new StringBuilder("Divya");
        /*sb.append("123");
        System.out.println("After append: "+ sb);
         
        sb.insert(2,"7");
        System.out.println("After insert: " +sb);

        sb.delete(1,3); 
        System.out.println("After delete: " +sb);

        sb.reverse();
        System.out.println("After reverse: " +sb);*/

        //Remove vowels 

        /*System.out.print("Enter the string= ");
        String word=sc.nextLine();
        word=word.toLowerCase();
        StringBuilder result=new StringBuilder( );
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch!='a' &&  ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                result.append(ch);
            }

        }
        System.out.println("Result is: "+ result);*/

        System.out.print("enter the string= ");
        String word=sc.nextLine();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(result.indexOf(String.valueOf(ch))==-1){
                result.append(ch);
            }
        }
        System.out.println("After removing duplicates: "+ result);

        //Replacing space with '_'

        System.out.print("enter the string= ");
        String word=sc.nextLine();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch==' '){
                result.append('_');
            }
            else{
                result.append(ch);
            }
        }
        System.out.println("Modified Sentence: "+ result);


    }
}
