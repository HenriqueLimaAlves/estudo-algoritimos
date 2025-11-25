package projeto.pessoal.estudo_algoritimos.aHeadFirst.cap1;

public class BottleSong {

    private int bottleNum = 10;
    private String word = "Bottles";

    public void bottleSong(){
        while(bottleNum > 0){

            if(bottleNum == 1){
                word = "Bottle";
            }

            System.out.println(bottleNum + " green" + word + ", hanging on the wall");
            System.out.println(bottleNum + " green" + word + ", hanging on the wall");
            System.out.println("and if one green bottle accidentally fall");

            bottleNum--;

            if(bottleNum > 0){
                System.out.println( "There'll be " + bottleNum + " green " + word +
                        ", hanging on the wall");
            }else{
                System.out.println("There'll be no green bottle hanging on the wall");
            }
        }
    }
}
