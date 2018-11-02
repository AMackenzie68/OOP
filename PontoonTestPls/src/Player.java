public class Player extends CardHolder{
//Player class is a CardHolder who can also draw and show more cards  

    int total = 0;
    int newcard = 0;
    boolean busted = false;

    public Player() {
    }

    public void firstDraw() {
       //Generates first two cards for the player, showing each individual card drawn
        this.drawCard();
        System.out.println("First Card: "+newcard);
        this.drawCard();
        System.out.println("Second Card: "+newcard);
        System.out.println("Total: " +this.total);
    }

    public void subsequentDraw(){
      //Draws Player cards other than 
        this.drawCard();
        System.out.println("New Card: " +newcard);
        System.out.println("New Total: "+total);
    }
}
