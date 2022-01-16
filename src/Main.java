import java.io.IOException;
import  java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("============");
        System.out.println("1.영어 단어 맞추기");
        System.out.println("2. 프로그램 종료");
        System.out.print("입력 : ");
        Scanner sc= new Scanner(System.in);
        if(sc.nextInt() == 1){
           Game game = new Game();
           game.run();

        }
        else{
            System.exit(0);
        }
    }

}
