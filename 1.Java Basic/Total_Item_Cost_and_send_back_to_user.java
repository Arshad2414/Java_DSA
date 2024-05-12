import java.util.Scanner;

public class Total_Item_Cost_and_send_back_to_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 3: Enter cost of 3 items from the user (using float data type) - a
        // pencil, a pen and
        // an eraser. You have to output the total cost of the items back to the user as
        // their bill.
        // (Add on : You can also try adding 18% gst tax to the items in the bill as an
        // advanced problem)

        int pencil,pen,eraser,total;
        float gst, totalwithgst;
        System.out.println("Inter A Pencil Cost");
        pencil = sc.nextInt();
        System.out.println("Inter A Pen Cost");
        pen = sc.nextInt();
        System.out.println("Inter A Eraser Cost");
        eraser = sc.nextInt();
        total = pencil+pen+eraser;
        System.out.println("Total Value Of Three Items: "+total);
        gst = (0.18f*total);
        System.out.println("18% GST Of Total Three Items: "+gst);
        totalwithgst = total+gst;
        System.out.println("Total Cost Of Three Items With GST :"+totalwithgst);
    }
}
