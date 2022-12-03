public class Test {
    public static void main(String[] args) {
        int row = Integer.parseInt(args[0]);
        int column = Integer.parseInt(args[1]);
        int count = 2;
        int ratings[] = new int[column];
        int movie[][] = new int[row][column];
        for(int i = 0;i<column;i++){
            for(int j = 0;j<row;j++){
                movie[j][i] = Integer.parseInt(args[count]);
                count++;
            }
        }
        for(int i=0;i<row;i++){
            for(int j = 0;j<column;j++){
                ratings[j] += movie[i][j];
        }
    }
    int sum = 0;
    int largest = 0;
    for(int i = 0;i<column;i++){
        if(largest<ratings[i]){
            largest = ratings[i];
            sum = i;
        }
    }
    System.out.println(sum);

}
}