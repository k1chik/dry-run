import java.util.*;
public class AddIntegers {
    
    public static void main (String arg[]){
        int N = 100; 
        double[] arr = new double[N];

        Random r = new Random();

        for(int i = 0; i < N; i++ ){
            arr[i] = r.nextDouble();
            
        }
    
        double StartTime = System.nanoTime();

        double sum = 0;
        for(double num: arr){
            sum += num;
        }
    
        double EndTime = System.nanoTime();

        System.out.println("Sum:" + sum);
        System.out.println("Time:" + (EndTime - StartTime));
    
    }

}
