import java.util.Scanner;

public class PontoonGame {

    Scanner kboard = new Scanner(System.in);

    Player p;

    Dealer d;

    public void checkWin(){

        if (p.total > 21){
            System.out.println("Busted! You got over 21, try again.");

        }else if (p.total > d.dealerTotal){

            System.out.println("You win!");
        }else if (d.dealerTotal > 21) {
            System.out.println("The dealer Busted, you win by default!");

        }else{
            System.out.println("You lose, the dealer scored higher than you with " + d.dealerTotal);
        }


    }

    public void startPontoon(){

        p = new Player();
        d = new Dealer();

        String choice;
        String replay;
        d.dealerDraw();
        p.firstDraw();

        System.out.println("Would you like to draw again? (y/n)");
        choice = kboard.next();

        while (choice.equalsIgnoreCase("y")){

            p.drawCard();
            System.out.println("You drew a " + p.newcard + ".");
            System.out.println("Your total is now "+p.total);
            System.out.println("Would you like to draw again? (y/n)");
            choice = kboard.next();

        }

        checkWin();
        System.out.println("Would you like to play again?");
        replay = kboard.next();
        if (replay.equalsIgnoreCase("y")){
            startPontoon();
        }


    }

}
