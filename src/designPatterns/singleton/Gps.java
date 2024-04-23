package designPatterns.singleton;

public class Gps {

    private float longitude;
    private float latitude;
    private static Gps instacia;

    private Gps(){

    }

    public float getLatitude(){
        return latitude;
    }

    public float getLongitude(){
        return longitude;
    }

    public void setLatitude(float valor){
        this.latitude = valor;
    }

    public void setLongitude(float valor){
        this.longitude = valor;
    }

    public static Gps getInstance(){
        if(instacia == null){
            instacia = new Gps();
        }
        return instacia;
    }

}
