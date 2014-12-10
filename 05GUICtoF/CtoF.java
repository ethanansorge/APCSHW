import javax.swing.*;
import java.awt.*;
public class CtoF extends JFrame {
    private Container pane;

    private JButton b,c;
    private JLabel l;
    private JTextField t;
    public CtoF() {
	this.setTitle("Celsius to Fahrenheit");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);


	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());

	b = new JButton("Celsius to Fahrenheit");
	c = new JButton("Fahrenheit to Celsius");
	l = new JLabel("Click Here to Convert a Temperature",null,JLabel.CENTER);
	t = new JTextField(12);
	
	pane.add(l);
	pane.add(b);
	pane.add(t);
	pane.add(c);
    }
    
    public static void main(String[] args) {
        CtoF g = new CtoF();
        g.setVisible(true);
    }
}
