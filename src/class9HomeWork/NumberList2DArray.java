package class9HomeWork;

public class NumberList2DArray {
    public static void main(String[] args) {
        int [][] numbers={{15,20,25},
                        {40,41,52},
                        {65,67,70},};
        int sum=0;
        for (int row=0;row< numbers.length;row++){
            for (int col=0; col< numbers[row].length;col++){
                sum=sum+numbers[row][col];

            }
        }System.out.println(sum);





    }
}
