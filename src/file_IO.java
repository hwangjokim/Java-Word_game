import  java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class file_IO {
    public void read_f(ArrayList<String> words) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("c:/dic.txt"));
        while(true) {
            String line = br.readLine();
            if (line==null) break;  // 더 이상 읽을 라인이 없을 경우 while 문을 빠져나간다.
            StringTokenizer st = new StringTokenizer(line);
            for(int i=0;i<2;i++) words.add(st.nextToken());
        }
        br.close();
    }
}