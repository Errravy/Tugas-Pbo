package polimorfisme;
public class Test {
    public static void main(String[] args) {
        Fans fans1 = new Fans();
        Fans fans2 = new Fans("Mona");
        Fans fans3 = new KpopFans("Tomi");
        KpopFans fans4 = new KpopFans("Febi");
        
        fans1.WatchingPerfomances();
        fans2.WatchingPerfomances(new Musician());
        fans2.WatchingPerfomances(new Singer());
        fans3.WatchingPerfomances(new Biduan());
        fans4.WatchingPerfomances(new Kpop(),"teriak histeris");
    }
    
}
