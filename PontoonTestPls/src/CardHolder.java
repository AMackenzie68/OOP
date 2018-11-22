public abstract class CardHolder {
//Abstract Superclass for all objects which hold cards (dealer, player)
    
    int newcard = 0;
    int total = 0;

    public void drawCard() {
    //Basic card drawing method for use in player and dealer classes
        newcard = ((int)(Math.random() * 10.0D) + 1);
        this.total += newcard;
        //adds to the total of the hand of each object
    }

}
