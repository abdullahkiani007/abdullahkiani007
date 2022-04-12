package javaapplication1;
class Movie{
    protected String rating,ID,title;
    Movie(){};
    Movie(String rating , String ID , String title){
        this.rating = rating;
        this.ID = ID;
        this.title = title;
    }
    public void setRating(String x){
        rating = x;
    }
    public void setID(String x){
        ID = x;
    }
    public void setTitle(String x){
        title = x;
    }
    String getRating(){
        return rating;
    }
    String getID(){
        return ID;
    }
    String getTitle(){
        return title;
    }
    @Override
    public boolean equals(Object obj){
        Movie m = (Movie) obj;
        return this.ID == m.ID;
    }
     public double calcLateFees(int d){
        return d*2;
    };
}
class Action extends Movie{
    Action(){
        super();
    }
    @Override
    public double calcLateFees(int d){
        return d*3;
    }
}
class Comedy extends Movie{
     @Override
     public double calcLateFees(int d){
        return 2.50*d;
    }
}
class Drama extends Movie{
     @Override
     public double calcLateFees(int d){
        return 2*d;
    }
}
public class JavaApplication1 {

    public static void main(String[] args) {
       Movie m1 = new Movie();
       Movie m2 = new Movie();
       m1.setID("123");
       m2.setID("123");
        System.out.println(m1.calcLateFees(3));
        Action a = new Action();
        
        System.out.println(a.calcLateFees(3));
    }

}
