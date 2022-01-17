import java.util.Scanner;

class cars{
    int value=0;
    int weight=-1;
}

class time extends cars {
     time(int n){
        this.weight=n;
    }
    void dayCost(int n){
         this.value=10000*n*weight;
    }
}

public class parking {
    public void park(){
        Scanner sc = new Scanner(System.in);
        System.out.println("치종을 입력해주세요.");
        System.out.println("소/중형:1 , 대형:2");
        int select = sc.nextInt();
        time result = new time(select);
        System.out.println("주차 일수를 입력해주세요.");
        select= sc.nextInt();
        result.dayCost(select);
        System.out.println("요금은 "+result.value+"원 입니다.");
    }

}
