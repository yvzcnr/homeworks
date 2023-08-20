package class9HomeWork;

public class Country2DArray {
    public static void main(String[] args) {
        String [][] country={{"mexico","canada","haiti","cuba"},
                {"brazil","chile","peru","venezuela"},
                {"holland","germany","italy","portugal"},
                {"japan","chinese","S.Korea","n.Korea"},
                {"gana","nijer","egypt","kenya"}};

        int count=0;
        for (int i=0; i< country.length;i++){
            for (int j = 0; j < country[i].length; j++) {
                count++;

            }

        }System.out.println(count);
        System.out.println("=========================");

        int count2=0;
        for (String [] row:country){
        for (String v:row){
            count2++;
        }

    }System.out.println(count2);





    }
}
