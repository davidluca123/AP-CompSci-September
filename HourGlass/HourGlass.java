
/**
 * Write a description of class HourGlass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HourGlass
{
    
    public static void main(String[] args){
        printBar();
        loopOne();
        System.out.println("     ||");
        loopTwo();
        printBar();
    }
    public static void printBar(){
        System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
    }
    public static void loopOne(){
        for (int i=1; i<=4; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int k=1; k<=10-(2*i); k++){
                System.out.print(":");
            }
            System.out.println("/");
        }
    }
    public static void loopTwo(){
        for (int i=4; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            System.out.print("/");
            for (int k=1; k<=10-(2*i); k++){
                System.out.print(":");
            }
            System.out.println("\\");
        }
    }

}
