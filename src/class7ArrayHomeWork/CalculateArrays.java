package class7ArrayHomeWork;

public class CalculateArrays {
    public static void main(String[] args) {
        int [] num={45,85,75,60,40,50};
        int sum=0;
        for (int i = 0; i < 6; i++) {
            System.out.println(num[i]);
            sum=sum+num[i];
        }
        System.out.println("total num: "+sum);
    }
}
