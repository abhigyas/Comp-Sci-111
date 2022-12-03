public class Pyramid {
    public static void printRow(int nStars){
        if(nStars == 0){
            System.out.println();
            return;
        }
    System.out.print("*");
    printRow(nStars-1);
    }
    public static void pyramid(int nStars){
        if(nStars == 0){
            return;
        }
    }
    public static void main(String[] args){
        int x = 5;
        printRow(x);
    }
}