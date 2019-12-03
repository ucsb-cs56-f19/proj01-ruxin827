package earthquakes.searches;

public class EqSearch {

    private int distance;
    private int minmag;

    
    public void setDistance(int d){
        this.distance = d;
    }

    public void setMinmag(int m){
        this.minmag = m;
    }
    
    public int getDistance(){
        return distance;
    }

    public int getMinmag(){
        return minmag;
    }
}
