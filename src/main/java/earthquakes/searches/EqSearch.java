package earthquakes.searches;

public class EqSearch {

    private int distance;
    private int minmag;
    private double lat;
    private double lon;
    private String location;

    
    public void setDistance(int d){
        this.distance = d;
    }

    public void setMinmag(int m){
        this.minmag = m;
    }

    public void setLat(double latitude){
        this.lat = latitude;
    }

    public void setLon(double longtitude){
        this.lon = longtitude;
    }

    public void setLocation(String place){
        this.location = place;
    }
    
    
    public int getDistance(){
        return distance;
    }

    public int getMinmag(){
        return minmag;
    }

    public double getLat(){
        return lat;
    }

    public double getLon(){
        return lon;
    }

    public String getLocation(){
        return location;
    }
}
