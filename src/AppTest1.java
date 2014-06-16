/**
 * 
 */

/**
 * @author Karan
 *
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AppTest1 extends JFrame{

	JPanel Pan;
	JLabel LB1;
	JButton Button1,badd,bsub,bmul,bdiv,breset;
	JTextField TF1;
	int BCount;
	
	float result,cres;
    float num1=0,num2=0;int decide=0;
    JTextField TFCon;
    JButton bkg2lb,blb2kg,bkm2ml,bml2km;
	
	
	public static void main(String[] args) {
		
		new AppTest1();
	}
	
	public AppTest1()
	{
		this.setSize(600, 444);
		this.setLocationRelativeTo(null);
		
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Calculator and Converter");
		Pan=new JPanel();
		LB1=new JLabel("Value:");
		LB1.setBounds(232, 13, 40, 19);
		LB1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		
		ListenForButton bl = new ListenForButton();
		
		Button1=new JButton("CALC");
		Button1.setBounds(120, 160, 100, 40);
		Button1.setFont(new Font("Tahoma", Font.BOLD, 13));
		badd=new JButton("+");
		badd.setBounds(80, 85, 70, 40);
		badd.setFont(new Font("Tahoma", Font.BOLD, 19));
		bsub=new JButton("-");
		bsub.setBounds(180, 85, 70, 40);
		bsub.setFont(new Font("Tahoma", Font.BOLD, 19));
		bmul=new JButton("X");
		bmul.setBounds(280, 85, 70, 40);
		bmul.setFont(new Font("Tahoma", Font.BOLD, 19));
		bdiv=new JButton("/");
		bdiv.setBounds(380, 85, 70, 40);
		bdiv.setFont(new Font("Tahoma", Font.BOLD, 19));
		breset=new JButton("RESET");
		breset.setBounds(300, 160, 100, 40);
		breset.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		Button1.addActionListener(bl);
		badd.addActionListener(bl);
		bsub.addActionListener(bl);
		bmul.addActionListener(bl);
		bdiv.addActionListener(bl);
		breset.addActionListener(bl);
		
		TF1=new JTextField("0",15);
		TF1.setBounds(156, 42, 231, 28);
		TF1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		TF1.selectAll();
		
		bkg2lb = new JButton("Kg. --> lb.");
		bkg2lb.setBounds(251, 295, 120, 25);
		bkg2lb.setFont(new Font("Tahoma", Font.BOLD, 13));
		blb2kg = new JButton("lb. --> Kg.");
		blb2kg.setBounds(251, 333, 120, 25);
		blb2kg.setFont(new Font("Tahoma", Font.BOLD, 13));
		bkm2ml = new JButton("Km. --> ml.");
		bkm2ml.setBounds(381, 333, 120, 25);
		bkm2ml.setFont(new Font("Tahoma", Font.BOLD, 13));
		bml2km = new JButton("ml. --> Km.");
		bml2km.setBounds(381, 295, 120, 25);
		bml2km.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		bkg2lb.addActionListener(bl);
		blb2kg.addActionListener(bl);
		bkm2ml.addActionListener(bl);
		bml2km.addActionListener(bl);
		
		Pan.setLayout(null);
	
		Pan.add(LB1);
		Pan.add(TF1);
		Pan.add(badd);
		Pan.add(bsub);
		Pan.add(bmul);
		Pan.add(bdiv);
		Pan.add(Button1);
		Pan.add(breset);
		Pan.add(bkg2lb);
		Pan.add(blb2kg);
		Pan.add(bkm2ml);
		
		TFCon=new JTextField("0",15);
		TFCon.setBounds(53, 313, 171, 22);
		TFCon.selectAll();
		
		Pan.add(TFCon);
		Pan.add(bml2km);
		
		getContentPane().add(Pan);
		
	
		
		this.setVisible(true);
		
		
	}





class ListenForButton implements ActionListener{
    
	    // This method is called when an event occurs
	
    
	    public void actionPerformed(ActionEvent e){
	         
	        // Check if the source of the event was the button
	         
	        
	        if(e.getSource() == badd){
	        	
	          
	        	   num1=Float.parseFloat(TF1.getText());
	               
	               TF1.setText("");
	               TF1.grabFocus();
	               decide=1;
	        	   }
	        
	        
	        if(e.getSource() == bsub){
	        	
	          
	        	   num1=Float.parseFloat(TF1.getText());
	               
	               TF1.setText("");
	               TF1.grabFocus();
	               decide=2;
	        	   }
	        	
	        
	        if(e.getSource() == bmul){
	        	
	          
	        	   num1=Float.parseFloat(TF1.getText());
	               
	               TF1.setText("");
	               TF1.grabFocus();
	               decide=3;
	        	   }
	        
	        
	        if(e.getSource() == bdiv){
	        	
	          
	        	   num1=Float.parseFloat(TF1.getText());
	               
	               TF1.setText("");
	               TF1.grabFocus();
	               decide=4;
	        	   }
	        
	        
	        if(e.getSource() == Button1)
	        {
	        	num2=Float.parseFloat(TF1.getText());
	        	if(decide == 1)
	        		{
	        		result=num1+num2;
	        		TF1.setText(result+"");
	        		}
	        	if(decide == 2)
        		{
        		result=num1-num2;
        		TF1.setText(result+"");
        		}
	        	if(decide == 3)
        		{
        		result=num1*num2;
        		TF1.setText(result+"");
        		}
	        	if(decide == 4)
        		{
        		result=num1/num2;
        		TF1.setText(result+"");
        		}
	        	
	        }
	        
	        if(e.getSource() == breset)
	        {
	        	num1=0;num2=0;decide=0;result=0;
	        	TF1.setText("");TF1.grabFocus();
	        }
	        
	        if(e.getSource() == bkm2ml)
	        {
	        	TFCon.setText(0.621371*(Float.parseFloat(TFCon.getText()))+"");
	        }
	        if(e.getSource() == bml2km)
	        {
	        	TFCon.setText(1.609371*(Float.parseFloat(TFCon.getText()))+"");
	        }
	        if(e.getSource() == bkg2lb)
	        {
	        	TFCon.setText(2.20462*(Float.parseFloat(TFCon.getText()))+"");
	        }
	        if(e.getSource() == blb2kg)
	        {
	        	TFCon.setText(0.453592*(Float.parseFloat(TFCon.getText()))+"");
	        }
	    }

}	
}
