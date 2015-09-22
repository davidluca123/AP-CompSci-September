
/**
 * Write a description of class ProgramingProjectTwoPointOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProgramingProjectTwoPointOne
{
    public static void main(String[] args){
        for (int i =0; i<=6; i++){
            for (int j =1; j<=(6-i); j++){
                System.out.print("*");
            }
            for (int k =1; k<=i+1; k++){
                System.out.print(" ");
            }
            for (int l =1; l<=6-i; l++){
                System.out.print("//");
            }
            for (int m =1; m<=i; m++){
                System.out.print("\\\\");
            }
            for (int n =1; n<=i+1; n++){
                System.out.print(" ");
            }
            for (int o =1; o<=(6-i); o++){
                System.out.print("*");
            }
            System.out.println(); 
        }

    }
}