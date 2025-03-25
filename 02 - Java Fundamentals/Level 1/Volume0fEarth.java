public class Volume0fEarth {
    public static void main(String[] args) {
       double radius = 6378;

        double kmToMiles = 0.6;

        double volumeInKm3 = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        double radiusInMiles = radius * kmToMiles;
        double volumeInMiles3 = (4.0 / 3) * Math.PI * Math.pow(radiusInMiles, 3);

        System.out.println("The volume of Earth in cubic kilometers is " + volumeInKm3);
        System.out.println("The volume of Earth in cubic miles is " + volumeInMiles3);
    
    }
}