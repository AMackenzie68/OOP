public class Player {

    int total = 0;
   // int card1 = 0;
   // int card2 = 0;
    int newcard = 0;
    boolean busted = false;


    public void drawCard(){

        int newcard = (int)(Math.random()*10)+1;
        System.out.println("You drew a "+ newcard);
        total = newcard + total;

    }

    public void firstDraw(){

        drawCard();

        drawCard();

        System.out.println("Your total is " + total);

    }







}
