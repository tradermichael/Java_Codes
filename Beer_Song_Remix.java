//This is a very serious business application
public class BeerSong_Remix {
    public static void main (String[] args) {
        int beerNum = 99;
        String word = "bottles";
        
        while (beerNum > 0) {
            if(beerNum ==1) {
                word = "precious bottle"; //singular, only one beer man
            }
            System.out.println(beerNum + " " + word + " of beer on the wall.");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;
            
            if(beerNum >0) {
                System.out.println(beerNum + " " + word + " beer on the wall.");
                
            } else {
            System.out.println("No more bottles of beer on the wall. You need to go to the store for more!");
            }
        }
    }
}
