import java.util.Scanner;

public class GameStatTrack {

    private int NumberOfWins;
    private int NumberOfLosses;
    private int NumberOfDraws;
    private int counter = 0;
    private boolean playerChoice = true;
    private String tempResult;

    public GameStatTrack(){
        //Starts Game
        startGame();

    }

    public void startGame(){
     //Plays pontoon and loops game until either five games have been played,
        // or the player chooses to quit at the end of a game
        do{
            PontoonGame game = new PontoonGame();
            tempResult = game.returnResult();
            storeResult(tempResult);
            playerChoice = replayCheck();
            counter++;
        }while((counter < 5 )&& (playerChoice == true));
        displayResults();

    }

    public boolean replayCheck() {
     //Checks if the player would like to play again
        Scanner kboard = new Scanner(System.in);

        while (true) {

            System.out.println("Would you like to play again? (y/n)");
            String replay = kboard.next();

            if (replay.equalsIgnoreCase("y")) {
                kboard.close();
                return true;
            } else if (replay.equalsIgnoreCase("n")) {
                kboard.close();
                return false;
            } else {
                System.out.println("Please enter either 'y' or 'n'");
            }
        }


    }

    public void storeResult(String tempResult){
    //Stores the result of the latest game
        switch (tempResult){
            case "win": NumberOfWins++;
            break;

            case "lose": NumberOfLosses++;
            break;

            case "draw": NumberOfDraws++;
            break;
        }

    }

    public void displayResults(){
    //Displays the results of the games played
        System.out.println("--Overall Game Stats for " +counter+" Games--");
        System.out.println("Number of wins: " + NumberOfWins);
        System.out.println("Number of losses: " + NumberOfLosses);
        System.out.println("Number of draws: " + NumberOfDraws);

    }
}
