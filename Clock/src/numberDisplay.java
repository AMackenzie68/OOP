public class numberDisplay {

    //*****VARIABLES*****

        private int limit;
        private int value;

    //*****METHODS*****

        //Sets the limit for a unit of time
        public numberDisplay(int limitInput){

            value = 0;
            limit = limitInput;

        }

        int getValue(){

            return this.value;

        }

        void setValue(int replacementValue){

            this.value = replacementValue;

        }

        //Returns value. If value less than ten, it returns the value with a 0 preceeding it to conform with the format
        String getDisplayValue(){

            if (value < 10){

                return ("0" + this.value);

            }else{

                return ("" +this.value);

            }

        }

        //increments the value of the unit of time, returning to zero when limit is reached
        void increment(){

            value = (value + 1) % limit;

        }

}//END OF CLASS
