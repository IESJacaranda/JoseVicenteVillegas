
public class Ejercicio2 {

	public static String printMatrix(int[][] matrix) {
		
		StringBuilder sb = new StringBuilder();
		
		if(matrix.length>0) {
			for(int i=0; i<matrix.length;i++) {
				for(int j=0; j<matrix.length; j++) {
					sb.append(matrix[i][j]);
					if(j==0) {
						sb.append("[");
					}
					
					sb.append(matrix[i][j]);
					
					if(j==matrix[i].length-1) {
						sb.append("]");
					}else {
						sb.append(",");
					}
				}
				sb.append("\n");
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		int[][] matriz= {{1,2,3},{3,4,7}};
		printMatrix(matriz);

	}

}
