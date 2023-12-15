import java.util.ArrayList;

    public class G2{
        public static void main(String[] args) {
            ArrayList<Integer> attempts=new ArrayList<>();
            Game2 p = new Game2();
            boolean b = false;
            int ch=0;
            int i=0;
            while (!b) {
                attempts.add(p.TakeInput());
                b = p.isCorrectNumber();
                System.out.println(b);
            }
            for (int c:attempts) {
                i++;
            }
            System.out.println("Total attempts= " +i);
        }
    }






