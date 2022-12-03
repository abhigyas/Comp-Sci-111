public class multiplicationTable {
public static void  mt(int x){
    for(int i = 1; i<x; i++)
    {
        for(int j = 1;j<x;j++){
            System.out.print(i*j+"\t");
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    System.out.println(mt(a));
}
}