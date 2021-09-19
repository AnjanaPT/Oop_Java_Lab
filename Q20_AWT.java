import java.awt.*;
import java.awt.event.*;
class Q20_AWT implements ActionListener
{
	Frame f;
	TextField t1,t2,t3,t4;
	Label l1,l2,l3,l4,l5;
	Button b;
	Q20_AWT()
	{
		f=new Frame();
		f.setLayout(null);
		f.setSize(1000,1000);
		f.setTitle("Maximum Of Three Numbers");
		f.setVisible(true);
		l1=new Label("Enter First Number ");
		t1=new TextField("");
		l2=new Label("Enter Second Number ");
		t2=new TextField("");
		l3=new Label("Enter Third Number ");
		t3=new TextField("");
		l4=new Label("Highest Number");
		t4=new TextField("");
		t4.setEnabled(false);
		l5=new Label("");
		b=new Button("F I N D");
		l1.setBounds(200,200,200,30);
		t1.setBounds(450,200,200,30);
		l2.setBounds(200,250,200,30);
		t2.setBounds(450,250,200,30);
		l3.setBounds(200,300,200,30);
		t3.setBounds(450,300,200,30);
		l4.setBounds(200,400,200,30);
		t4.setBounds(450,400,200,30);
		b.setBounds(450,350,200,30);
		b.addActionListener(this);
		f.addWindowListener(
			new WindowAdapter()
			{
				public void windowClosing(WindowEvent we){
					System.exit(0);
				}
			}
		);

		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(l4);
		f.add(t4);
		f.add(b);
	}

	public void actionPerformed(ActionEvent e)
	{
		String s1=t1.getText();
		String s2=t2.getText();
		String s3=t3.getText();
		int a1,a2,a3;
		a1=Integer.parseInt(s1);
		a2=Integer.parseInt(s2);
		a3=Integer.parseInt(s3);
		if(a1==a2 && a2==a3)
			t4.setText(Integer.toString(a1));
		else if((a2==a3 && a1>a3) || (a1>a2 && a1>a3))
			t4.setText(Integer.toString(a1));				
		else if((a2==a3 && a1<a3) || (a3>a1 && a3>a2) || (a1==a3 && a3>a2))
			t4.setText(Integer.toString(a3));				
		else if((a1==a2 && a2>a3) || (a1==a3 && a2>a3) || (a2>a1 && a2>a3))
			t4.setText(Integer.toString(a2));				
	}
	public static void main(String args[])
	{
		Q20_AWT awt=new Q20_AWT();
	}
}