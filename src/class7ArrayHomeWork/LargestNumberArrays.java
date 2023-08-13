package class7ArrayHomeWork;

public class LargestNumberArrays {
    public static void main(String[] args) {
        int [] num={100,200,500,501};
        int maxNumber=num[1];
        for (int i = 0; i <num.length; i++) {

           if(num[1]<num[i]){
               maxNumber=num[i];
           }

        }System.out.println("maxNumber: "+maxNumber);

    }
}
