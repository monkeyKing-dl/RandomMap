import java.util.Random;


public class CreateArrays {
	
	public static Random random = new Random();
	public static float[][] getArrays(int height,int weight,int seek){
		
		
		            float[][] whiteNoise = PerlinNoise.GenerateWhiteNoise(height, weight,seek);
		            float[][] perlinNoise = PerlinNoise.GeneratePerlinNoise(whiteNoise, 5);
		            return perlinNoise;

	}
	
}
