public class numberDisplay {

    //Variables

        private int limit;
        private int value;

    //Methods

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

        String getDisplayValue(){

            if (value < 10){

                return ("0" + this.value);

            }else{

                return ("" +this.value);

            }

        }

        void increment(){

            value = (value + 1) % limit;

        }

}//end of class
