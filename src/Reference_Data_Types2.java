import java.awt.*;

public class Reference_Data_Types2 {
    public static void main(String[] args){
        Point point1 = new Point(1,2);
        Point point2 = point1;
        System.out.println(point2);
        point1.x = 5;
        System.out.println(point2); /*in reference variable they allocate one memory location for the dynamic varibale.
        /point 2 will hold the memeory address of the point1. in another location. so if the changes made to point will
        affect to the point 2 */

        int x = 10;
        int y = x;
        x = 5;
        System.out.println(y);/*in this primitive type two memory locations will create to the two variables and
        changes made in x will not apply for the y. they are independant from each others*/
    }
}
