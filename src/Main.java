import java.io.IOException;
import  java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("============");
            System.out.println("1.영어 단어 맞추기");
            System.out.println("2. 프로그램 종료");
            System.out.print("입력 : ");
            Scanner sc = new Scanner(System.in);
            if (sc.nextInt() == 1) {
                Game game = new Game();
                System.out.println(game.run() + "점을 획득하셨습니다.");
            } else {
                System.exit(0);
            }
        }
    }
}
