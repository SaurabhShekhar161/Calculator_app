import java.awt.*;
import java.awt.event.*;
public class Calculator extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button add,sub,mul,div,reset;
	public CalculatorFrame(String t)
	{
		super(t);
		l1 = new Label("First No");
		l2 = new Label("Second No");
		setLayout(new BorderLayout());
		t1 = new TextField(5);
		t2 = new TextField(5);
		Panel p1 = new Panel();
		p1.setLayout(new FlowLayout(FlowLayout.CENTER));
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		add(p1,BorderLayout.NORTH);
		Panel p2 = new Panel();
		p2.setLayout(new FlowLayout(FlowLayout.CENTER));
		add = new Button("+");
		sub = new Button("-");
		mul = new Button("*");
		div = new Button("/");
		reset = new Button("Reset");
		p2.add(add);
		p2.add(sub);
		p2.add(mul);
		p2.add(div);
		p2.add(reset);
		add(p2,BorderLayout.CENTER);
		Panel p3 = new Panel();
		p3.setLayout(new FlowLayout(FlowLayout.CENTER));
		l3 = new Label("Result");
		t3 = new TextField(15);
		p3.add(l3);
		p3.add(t3);
		add(p3,BorderLayout.SOUTH);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		reset.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int res = 0;
		String str = ae.getActionCommand();
		int n1 = Integer.parseInt(t1.getText());
		int n2 = Integer.parseInt(t2.getText());
		if(str.equals("+"))
		{
			res = n1 + n2;
			t3.setText(""+res);
		}
		if(str.equals("-"))
		{
			res = n1 - n2;
			t3.setText(""+res);
		}
		if(str.equals("*"))
		{
			res = n1 * n2;
			t3.setText(""+res);
		}
		if(str.equals("/"))
		{
			res = n1 / n2;
			t3.setText(""+res);
		}
		if(str.equalsIgnoreCase("Reset"))
		{
			t1.setText("0");
			t2.setText("0");
			t3.setText("0");
		}
	}
}
class CalculatorDemo
{
	public static void main(String args[])
	{
		Calculator cf = new Calculator("Calculator");
		cf.setSize(300,400);
		cf.setVisible(true);
	}
}











