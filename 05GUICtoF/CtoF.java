import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class CtoF extends JFrame implements ActionListener{
    private Container pane;
    private JButton b,c;
    private JLabel l;
    private JTextField text;
    public CtoF() {
	this.setTitle("Celsius to Fahrenheit");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);


	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());

	b = new JButton("Celsius to Fahrenheit");
	c = new JButton("Fahrenheit to Celsius");
	l = new JLabel("Enter Text And Click A Button to Convert a Temperature",null,JLabel.CENTER);
	text = new JTextField(40);
	
	pane.add(l);
	pane.add(b);
	pane.add(text);
	pane.add(c);
	
	b.setActionCommand("Celsius to Fahrenheit");
	b.addActionListener(this);
	c.setActionCommand("Fahrenheit to Celsius");
	c.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
	double s = Double.parseDouble(text.getText());
	if (action.equals("Celsius to Fahrenheit")){
	    s = ((s * 9.0) / 5.0) + 32.0;
	}else{
	    s = ((s - 32.0) * 5.0) / 9.0;
	}
	text.setText("" + s);
    }
    public static void main(String[] args) {
	CtoF g = new CtoF();
	g.setVisible(true);
    }
}
