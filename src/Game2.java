import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

    class Game2 {
        private int number;
        private int inputNumber;
        private int NoofGuasses=0;
        ArrayList<Integer> attempts=new ArrayList<>();

        public int getNoofGuasses() {
            return NoofGuasses;
        }

        public void setNoofGuasses(int noofGuasses) {
            this.NoofGuasses = noofGuasses;
        }
        Game2(){
            Random rand=new Random();
            this.number=rand.nextInt(100);

        }
        int TakeInput(){
            System.out.println("Gueass the number");
            Scanner sc=new Scanner(System.in);
            inputNumber=sc.nextInt();
            return inputNumber;
        }
        boolean isCorrectNumber(){
            NoofGuasses++;
            if(inputNumber==number){
                System.out.println("you gueassed  the right number ");
                System.out.println("Congratulations !");
                return true;
            } else if (inputNumber>number) {
                System.out.println("too high");

            } else if (inputNumber<number) {
                System.out.println("too low");
            }
            return false;
        }
    }



