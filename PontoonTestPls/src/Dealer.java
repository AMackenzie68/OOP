public class Dealer extends CardHolder{
 //Dealer is a subclass of CardHolder, so that a dealer can use the drawCard method
    int total = 0;

    public Dealer() {
    }

    public void dealerDraw() {
        while(this.total < 16) {
            drawCard();
        }

    }
}
