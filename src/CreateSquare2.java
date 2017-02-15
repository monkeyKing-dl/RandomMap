import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;


public class CreateSquare2 {

	//http://www.voidcn.com/blog/zhangakui002/article/p-2129445.html
	public static void main(String[] args) {
		MapPicture mapPicture = new MapPicture();
		mapPicture.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MapPicture extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final int SQUARE = 5;
	public static final int SEEK = 5;
	public static final int HEIGHT_NUM = 200;
	public static final int WEIGHT_NUM = 200;
	public static final int HEIGHT = HEIGHT_NUM * SQUARE ;
	public static final int WEIGHT = WEIGHT_NUM * SQUARE ;
	public static Color color1 = new Color(0xAAAAAA);
	public static Color color2 = new Color(0xC5C1AA);
	public static Color color3 = new Color(0x3CB371);
	public static Color color4 = new Color(0x228B22);
	public static Color color5 = new Color(0x71C671);
	

	public MapPicture(){
		super("random map");
		setSize(HEIGHT, WEIGHT);
		setVisible(true);
	}
	
	public void paint(Graphics g){
		super.paint(g);
		//System.out.println("paint");
		g.setColor(Color.WHITE);
		//g.fillRect(0, 0, HEIGHT, WEIGHT);
		float[][] numArrays = CreateArrays.getArrays(HEIGHT_NUM, WEIGHT_NUM,SEEK);
		for(int i = 0;i<HEIGHT_NUM;i++){
			for(int j=0;j<WEIGHT_NUM;j++){
				g.setColor(GetColorByFloat(numArrays[i][j]));
				g.fillRect(j*SQUARE, i*SQUARE, SQUARE, SQUARE);
				g.setColor(Color.WHITE);
			}
		}
	}
	
	public  Color getColor(int weight){
		Color color = Color.YELLOW;
		switch (weight) {
		case 1:
			color = Color.green;
			break;
		case 2:
			color = Color.blue;
			break;
		case 3:
			color = Color.BLACK;
			break;
		case 4:
			color = Color.GRAY;
			break;
		default:
			break;
		}
		return color;
	}
	
	
	public Color GetColorByFloat(float noise)
    {
        noise = noise * 255;
        if (noise > 240) return Color.WHITE;
        if (noise > 210) return color1;
        if (noise > 180) return color2;
        if (noise > 165) return color3;
        if (noise > 130) return color4;
        if (noise > 70) return color5;
        return Color.BLUE;
    }
	
}
