
/**
 * Write a description of class ChristmusTrees here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChristmusTrees
{
      public static void main(String[] args){
       int x = 1;
       int y = 4;
       int z = 5;
       trinagleOne(x,y);
       trinagleTwo(x,y);
       trinagleThree(x,y);
       stem();
       trinagleOne(x,z);
       trinagleTwo(x,z);
       stem();
    }
    public static void trinagleOne(int numberOne, int numberTwo){
        for(int i=numberOne; i<=numberTwo; i++){
            for( int j=numberOne; j<=numberTwo; j++){
                System.out.print(" ");
            for( int k=numberOne; k<=numberTwo; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
    public static void trinagleTwo(int numberOne, int numberTwo){}
    public static void trinagleThree(int numberOne, int numberTwo){}
    public static void stem() {}
}

