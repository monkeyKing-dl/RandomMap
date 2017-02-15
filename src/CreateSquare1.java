
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class CreateSquare1
{
    public static void main ( String[] args )
    {
        new WinGrid ();
    }
}
 
class WinGrid extends JFrame
{
    private static final long serialVersionUID = 1L;
    GridLayout grid;
    JPanel chessboard;
 
    WinGrid ()
    {
        chessboard = new JPanel ();
        grid = new GridLayout (10, 10);
        chessboard.setLayout (grid);
        Label[][] label = new Label[10][10];
        for ( int i = 0; i < label.length; i++ )
        {
            for ( int j = 0; j < label[i].length; j++ )
            {
                label[i][j] = new Label ();
                if (( i + j ) % 2 == 0)
                    label[i][j].setBackground (Color.pink);
                else
                    label[i][j].setBackground (Color.black);
                chessboard.add (label[i][j]);
            }
        }
        add (chessboard, BorderLayout.CENTER);
        setBounds (10, 10, 570, 390);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setVisible (true);
    }
}
