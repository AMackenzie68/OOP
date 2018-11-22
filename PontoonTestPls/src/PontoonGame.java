import java.util.Scanner;


public class PontoonGame{
//Manages the current game of pontoon, could be more abstracted    




    Scanner kboard;
    Player player;
    Dealer dealer;

    public PontoonGame() {
        this.kboard = new Scanner(System.in);
    }


    public void checkWin() {
       //Checks the result of the game, should probably use CASE instead of many IF statements
        if (this.player.total > 21) {
            System.out.println("Busted! You got over 21, try again.");
        } else if (this.player.total > this.dealer.total) {
            System.out.println("You win!");
        } else if (this.dealer.total > 21) {
            System.out.println("The dealer Busted, you win by default!");
        } else {
            System.out.println(this.dealer.total);
        }

    }

    public void startPontoon() {

       //Runs the game of pontoon
        //Needs to be considered for more abstraction or restructuring
        this.player = new Player();
        this.dealer = new Dealer();
        this.dealer.dealerDraw();
        this.player.firstDraw();
        System.out.println("Would you like to draw again? (y/n)");

        for(String choice = this.kboard.next(); choice.equalsIgnoreCase("y"); choice = this.kboard.next()) {
            this.player.subsequentDraw();
            System.out.println(this.player.total);
            System.out.println("Would you like to draw again? (y/n)");
        }

        this.checkWin();
        System.out.println("Would you like to play again?");
        String replay = this.kboard.next();
        if (replay.equalsIgnoreCase("y")) {
            this.startPontoon();
        }
         kboard.close();
    }


}

