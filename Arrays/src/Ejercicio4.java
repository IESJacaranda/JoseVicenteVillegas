import java.util.Arrays;

public class Ejercicio4 {

    public static void main(String[] args)  {
        int[] Array1 = {00,10,20,30,40,50};
        int[] Array2 = {60,70,80,90,100};
        
        int lenArray1 = Array1.length;
        int lenArray2 = Array2.length;
        
        int[] concate = new int[lenArray1 + lenArray2];
        
        System.arraycopy(Array1, 0, concate, 0, lenArray1);  
        System.arraycopy(Array2, 0, concate, lenArray1, lenArray2);  
        
        System.out.println("Array1: " + Arrays.toString(Array1));
        System.out.println("Array2: " + Arrays.toString(Array2));
        
        System.out.println("Array concatenado: " + Arrays.toString(concate)); 
        
        
        System.out.println(printMatriz(Array1,Array2));
        
    }
    
    public static int[] printMatriz(int[] Array1, int[] Array2) {
		
        int[] Array3 = new int[Array1.length + Array2.length];

        int i = 0;
        
        for (i = 0; i < Array1.length; i++ ){
        	Array3[i] = Array1[i];
        }

        for (int j = 0; j < Array2.length; j++ ){
        	Array3[i] = Array2[j];
            i++;
        }
    	
    	return Array3;
    	
    }

}
