import java.util.*;
public class LuckyDivision {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int[] lucky = {4,7,44,47,74,77,444,447,474,477,744,747,774,777};
        int count=0;
        int n = sc.nextInt();
        for(int i=0; i<lucky.length; i++){
            if(n%lucky[i]==0){
                count++;
                break;
            }
        }
        if (count!=0){
            System.out.println("YES");
        }
        else {System.out.println("NO");}
    }
}