/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author:
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {
            int row = Integer.parseInt(args[0]);
            int column = Integer.parseInt(args[1]);
            int count = 2;
            int ratings[] = new int[column];
            int movie[][] = new int[row][column];
            for(int i = 0;i<row;i++){
                for(int j = 0;j<column;j++){
                    movie[i][j] = Integer.parseInt(args[count]);
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
