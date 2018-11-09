public class Player extends CardHolder{
  

    int total = 0;
    int newcard = 0;
    boolean busted = false;

    public Player() {
    }

    public void firstDraw() {
        this.drawCard();
        System.out.println("First Card: "+newcard);
        this.drawCard();
        System.out.println("Second Card: "+newcard);
        System.out.println("Total: " +this.total);
    }

    public void subsequentDraw(){
        this.drawCard();
        System.out.println("New Card: " +newcard);
        System.out.println("New Total: "+total);
    }
}
