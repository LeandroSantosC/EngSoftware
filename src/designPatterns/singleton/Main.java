package designPatterns.singleton;

public class Main {

    public static void main(String[] args) {

        Gps gps1 = Gps.getInstance();
        gps1.setLatitude(10f);
        gps1.setLongitude(23f);
        System.out.println("Longitude: "+gps1.getLongitude());
        System.out.println("Latitude: "+gps1.getLatitude());

        Gps gps2 = Gps.getInstance();
        System.out.println("Longitude: "+gps2.getLongitude());
        System.out.println("Latitude: "+gps2.getLatitude());
    }
}