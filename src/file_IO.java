import  java.io.*;
import java.util.StringTokenizer;

public class file_IO {
    public void read_f(String[][] words, int ll) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("c:/dic.txt")); // fileread는 bufferedReader+FileReader 로 한줄씩 읽어야 한다. (무조건 String형)
        for(int i=0;i<ll;i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            for (int j = 0; j < 2; j++) {
                words[i][j] = st.nextToken();
            }
        }
            br.close();
    }
    public int line_chk() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("c:/dic.txt"));
        int result=0;
        while(true) {
            String line = br.readLine();
            if (line==null) break;  // 더 이상 읽을 라인이 없을 경우 while 문을 빠져나간다.
            result+=1;
        }
        br.close();
        return result;
    }
}