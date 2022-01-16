import java.io.*;
import java.util.ArrayList;

public class Game {
    public void run() throws IOException {
        ArrayList<String> words= new ArrayList<>();
        file_IO file = new file_IO();
        file.read_f(words);
        for (int i=0; i<words.size();i+=2){
            System.out.println(words.get(i)+" "+words.get(i+1));
        }
    }

}
