import java.io.IOException;
import java.util.Arrays;

public class Game {
    public void run() throws IOException {
        file_IO file = new file_IO();
        file_IO line_check = new file_IO();
        int line = line_check.line_chk();
        String[][] words = new String[line][2];
        file.read_f(words,line);
        Arrays.sort(words, (o1, o2) -> {
            if(o1[0].contentEquals(o2[0]))
                return o1[1].compareTo(o2[1]);
            else
                return o1[0].compareTo(o2[0]);
        }); // 2차원 배열 정렬식 복붙함
        /*  for(int i=0;i<line;i++){
            System.out.println(words[i][0]+" "+words[i][1]);
        } //!!DEBUG CODE!!*/
    }

}
