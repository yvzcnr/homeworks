package class9HomeWork;

public class GroceryList2DArray {
    public static void main(String[] args) {
        String [][] grocery={{"kiwi","orange","apple","banana"},
                {"onion","patato","cucumber","cabbage"},
                {"candy","caramel","marshmallows","jarry jam"},
                {"milk","cheese","yogurt","spagetti"}};

        for (int i=0; i< grocery.length;i++){
            for (int j = 0; j < grocery[i].length; j++) {
                System.out.print(grocery[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println("=========================");
    for (String [] row:grocery){
        for (String v:row){
            System.out.print(v+" ");
        }
        System.out.println();
    }





    }
}
