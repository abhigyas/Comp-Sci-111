public class MoreArrays
{
    public static void main(String[] args)
    {
        // More space to play with some arrays  
        //double[] moreNumbers = {2.0, 1.0, 3.4, 5.6, 7.7};
        //System.out.println(moreNumbers[2]); 

        
        int n = Integer.parseInt(args[0]);

        int moreArray[];   // declare
        moreArray = new int[n];  // create
        for (int i = 0; i < n; i++) moreArray[i] = (i+1);  // initialize  
        
        //Regular print of array
        for (int i = 0; i < n; i++) System.out.println(i + " " + moreArray[i]); 
        
        // Print the array in reverse
        for (int i = (moreArray.length-1); i >= 0; i--) System.out.println(i + " " + moreArray[i]); 
    
        // Actually reverse the array
        for (int i = 0; i < n; i++) System.out.print(moreArray[i] + " ");
        System.out.println("\n********************"); 

        //*****
        // Go into a loop and swap values on the ends
        for (int i = 0; i < moreArray.length/2; i++)
         {
            int temp = moreArray[i];
            moreArray[i] = moreArray[moreArray.length-i-1];
            moreArray[moreArray.length-i-1] = temp;
        }
        
        // Using same print command print the newly reversed array
        for (int i = 0; i < n; i++) System.out.print(moreArray[i] + " ");   */

  
       /* // Find the min and maximum
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
       int maxIndex = 0, minIndex=0;

       int a[] = { 123, 45, -3, 56, 77, 102, 3, 2, 45, 901, 34, 1003, 1001, 667};
       
       for (int i = 0; i < a.length; i++)
        {
            if (a[i] > max) { max = a[i];  maxIndex = i;}
            if (a[i] < min) { min = a[i];  minIndex = i;}
        }
        System.out.println();
        System.out.println(min + " " + max + " " + minIndex + " " + maxIndex);  
        */  
      
        // Do two things w the increment  
        long t = 1;  
        for (int i = 0; i < n; t *=10, i++) System.out.println(i + " " + t);
        
       
         
     
        

    }
}