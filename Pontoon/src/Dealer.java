public class Dealer {

    int dealerTotal = 0;


    public void dealerDraw(){

       while (dealerTotal < 16) {

           int newcard = (int) (Math.random() * 10) + 1;

           dealerTotal = newcard + dealerTotal;
       }
    }


}
