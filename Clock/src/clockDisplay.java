import java.util.Timer;
import java.util.TimerTask;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class clockDisplay {

    //Objects
        private numberDisplay hour;
        private numberDisplay minute;
        private numberDisplay seconda;

    //Methods

        //Assigns appropriate limits to hour and minute objects, and sets time
        private clockDisplay(int hours,int minutes,int thirdamount){
            hour = new numberDisplay(24);
            minute = new numberDisplay(60);
            seconda = new numberDisplay(60);

            setTime(hours,minutes,thirdamount);
        }


        private clockDisplay(){
            hour = new numberDisplay(24);
            minute = new numberDisplay(60);
            seconda = new numberDisplay(60);

            updateDisplay();
        }


        //Increments the value of minute object, or hour object if limit of minute has been reached
        private void timeTick(){

            seconda.increment();
            if (seconda.getValue() == 0){
                minute.increment();
            }
            if (minute.getValue() == 0){
                hour.increment();
            }

            updateDisplay();

        }


        //Sets hour and minute objects value to hours and minutes received from clockDisplay
        private void setTime(int hours, int minutes,int seconds){
            hour.setValue(hours);
            minute.setValue(minutes);
            seconda.setValue(seconds);
        }


        //Updates the clock display with new values
        private void updateDisplay(){
            String displayString;
            displayString = hour.getDisplayValue() + ":" + minute.getDisplayValue()+":"+seconda.getDisplayValue();
            System.out.println(displayString);
        }


        public static void main(String[] args){
            //Creates new Calendar
            GregorianCalendar today = new GregorianCalendar();

            //Creates new clock
            new clockDisplay();
            new clockDisplay(12,32,11);

            clockDisplay clock = new clockDisplay(today.get(Calendar.HOUR_OF_DAY),today.get(Calendar.MINUTE),today.get(Calendar.SECOND));

            //Creates new timer
            Timer ticker =  new Timer();
            TimerTask taskNew = new TimerTask(){
                @Override
                public void run() {
                    clock.timeTick();
                }
            };

            ticker.scheduleAtFixedRate(taskNew,0,1000);

            }
        }


