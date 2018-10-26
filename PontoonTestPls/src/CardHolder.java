public abstract class CardHolder {
//Abstract Superclass for all objects which hold cards (dealer, player)
    
    int newcard = 0;
    int total = 0;

    public void drawCard() {
        newcard = ((int)(Math.random() * 10.0D) + 1);
        this.total += newcard;
    }

}
