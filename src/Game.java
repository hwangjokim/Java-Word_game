import java.io.*;

public class Game {
    public void run() throws IOException {
        file_IO file = new file_IO();
        file_IO line_check = new file_IO();
        int line = line_check.line_chk();
        String[][] words = new String[line][2];
        file.read_f(words,line);
      /*  for(int i=0;i<line;i++){
            System.out.println(words[i][0]+" "+words[i][1]);
        } !!DEBUG CODE!! */
    }

}
