package polimorfisme;
public class Fans {
    private String name;
    public Fans(){
        name = "noname";
    }
    public Fans(String name){
        this.name = name;
    }
    public void ShowName(){
        System.out.print(name + ": ");
    }
    public void WatchingPerfomances(){
        System.out.print(name + ": melihat idolanya di youtube \n");
    }
    public void WatchingPerfomances(Musician m){
        System.out.print(name + ": melihat idolanya  "); 
        m.Perform();
    }
}
