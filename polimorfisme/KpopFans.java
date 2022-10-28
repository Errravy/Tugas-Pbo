package polimorfisme;
public class KpopFans extends Fans{
    public KpopFans(){
        
    }
    public KpopFans(String name){
        super(name);
    }
    public void WatchingPerfomances(Musician m ,String expression){
        ShowName();
        System.out.print( expression + " melihat idolanya ");
        m.Perform();
    }
}
