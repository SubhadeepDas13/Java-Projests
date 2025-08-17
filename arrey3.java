// Creating a table with random numbers - using arrey and for loop.

public class arrey3 {
       public static void main(String[] args)
    {

     int nums[][] = new int [6][7]; 
    
        for(int a =0;a<6;a++)
    { 
          for(int b=0;b<7;b++)
        {
            nums[a][b] = (int)(Math.random() * 10);
        }
       
    }
        for(int a =0;a<6;a++)

    { 
        for(int b=0;b<7;b++)
        {
            System.out.print(nums[a][b] + " "); 
        }
        System.out.println();
    }

   }

}

