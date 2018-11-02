public class Dealer extends CardHolder{
 //Dealer is a subclass of CardHolder, so that a dealer can use the drawCard method
    int total = 0;

    public Dealer() {
    }

    public void dealerDraw() {
     //Uses inherited drawCard method to generate a hand for the Dealer
        while(this.total < 16) {
            drawCard();
        }

    }
}
