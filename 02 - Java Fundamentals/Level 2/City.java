
import java.util.Scanner;

public class City {
   
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      System.out.print("Enter name: ");
      String name =  input.nextLine();
      
      System.out.print("Enter fromCity: ");
      String fromCity =  input.nextLine();
      
      System.out.print("Enter viaCity: ");
      String viaCity = input.nextLine();
      
      System.out.print("Enter toCity: ");
      String toCity = input.nextLine();
      
      
      System.out.print("Enter distanceFromToVia: ");
      double distanceFromToVia = input.nextDouble();
      
      
      System.out.print("Enter distanceViaToFinalCity: ");
      double distanceViaToFinalCity = input.nextDouble();
    
   

      int timeFromToVia = 4 * 60 + 4;

      int timeViaToFinalCity = 4 * 60 + 25;


      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      int totalTime = timeFromToVia + timeViaToFinalCity;
      
      
      System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
   }
}
