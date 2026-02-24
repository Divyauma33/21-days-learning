public class Nestedfor{
    public static void main(String[] args){

        //Print square patterns of 5 rows
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Print number patterns
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //Print same numbers

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        //print decresing order
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Print multiplication table 1 to 5

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(i * j);
            }
            System.out.println();
        }

        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print(j);
            }
            System.out.println();
        }


    }

}
