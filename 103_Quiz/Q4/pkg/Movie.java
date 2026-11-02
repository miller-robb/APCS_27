package pkg;
public class Movie{
    private String movieName;
    private double rating;
    private int numRating;
    private int revenue;

    public Movie(){
        movieName="Avengers";
        rating=8.0;
        numRating=33;
        revenue=623357910;
    }
    public Movie(String name){
        movieName=name;
        rating=8.0;
        numRating=33;
        revenue=623357910;
        
    }
    public Movie(double stars){
        movieName="Avengers";
        numRating=33;
        revenue=623357910;
        rating=stars;
        
    }
    public Movie(int amount){
        movieName="Avengers";
        rating=8.0;
        revenue=623357910;
        numRating=amount;
        
    }
    public Movie(String name,double stars){
        movieName=name;
        rating=stars;
        numRating=33;
        revenue=623357910;
    }
    public Movie(String name,double stars,int amount, int profit){
        movieName=name;
        rating=stars;
        numRating=amount;
        revenue=profit;
    }

    public void movieToString(){
        System.out.println("Movie: "+movieName);
        System.out.println("Rating: "+rating);
        System.out.println("Number of ratings: "+numRating);
        System.out.println("Revenue: "+revenue);
        System.out.println("");
    }
    public String getMovieName(){
        return movieName;
    }
    public double getRating(){
        return rating;
    }
    public int getRevenue(){
        return revenue;
    }
    public void addRating(double rate){
        rating=((numRating*rating)+rate)/(numRating+1);
        numRating=numRating+1;
    }
    public boolean compareRatings(Movie x){
        if (rating>x.getRating()){
            return true;

        }
        else {
            return false;
        }
    }
    
    public Movie pirateMovie(){
        Movie pirated=new Movie(movieName,rating,numRating,revenue);
        return pirated;

    }


}