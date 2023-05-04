import java.util.InputMismatchException;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try{ Geometry object1=new Geometry();
            Scanner input=new Scanner(System.in);

            float userlength=input.nextFloat();
            float userbreadth=input.nextFloat();
            System.out.println(object1.areaOfRectangle(userlength,userbreadth));
        }
        catch(InputMismatchException e){
            System.out.println("Try dey follow instructions");
        }
        catch(Exception ime){
            System.out.println("Invalid");
        }

    }
}