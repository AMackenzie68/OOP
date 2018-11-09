import java.util.Scanner;

public class PontoonGame {
    Scanner kboard;
    Player player;
    Dealer dealer;
    private String gameResult;

    public PontoonGame() {
        //this.kboard = new Scanner(System.in);
        startPontoon();
    }

    public void checkWin() {
        if (this.player.total > 21) {
            System.out.println("Busted! You got over 21, try again.");
            gameResult = "lose";
        } else if (this.player.total > this.dealer.total) {
            System.out.println("You win!");
            gameResult = "win";
        } else if (this.dealer.total > 21) {
            System.out.println("The dealer Busted, you win by default!");
            gameResult = "win";
        } else if (this.player.total == this.dealer.total) {
            System.out.println("Draw! You got the same as the Dealer");
            gameResult = "draw";
        }else if (this.player.total < this.dealer.total) {
            System.out.println("You lose! The dealer got closer than you");
            gameResult = "lose";
        }

    }

    public String returnResult(){

        return gameResult;

    }

    public void startPontoon() {
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

    }
}

