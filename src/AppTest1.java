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

	JPanel mainPanel;
	JButton equalButton,addButton,subButton,multiplyButton,divideButton,resetButton,sqrtButton;
	JTextField textField;
	
	
	double result;
    double num1=0,num2=0;int decide=0;
    JButton kgLbButton,lbKgButton,kmMlButton,mlKmButton;
	
	
	public static void main(String[] args) {
	
		
		new AppTest1();
	}
	
	public AppTest1()
	{
		this.setSize(369, 338);
		this.setLocationRelativeTo(null);
		
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Calculator and Converter");
		mainPanel=new JPanel();
		mainPanel.setBackground(new Color(0, 153, 204));
		
		
		ListenForButton buttonListen = new ListenForButton();
		
		equalButton=new JButton("=");
		equalButton.setForeground(new Color(51, 0, 255));
		equalButton.setBackground(new Color(135, 206, 250));
		equalButton.setBounds(194, 121, 100, 40);
		equalButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		addButton=new JButton("+");
		addButton.setForeground(new Color(51, 0, 255));
		addButton.setBackground(new Color(135, 206, 250));
		addButton.setBounds(53, 64, 50, 40);
		addButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		subButton=new JButton("-");
		subButton.setForeground(new Color(51, 0, 255));
		subButton.setBackground(new Color(135, 206, 250));
		subButton.setBounds(117, 64, 50, 40);
		subButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		multiplyButton=new JButton("x");
		multiplyButton.setForeground(new Color(51, 0, 255));
		multiplyButton.setBackground(new Color(135, 206, 250));
		multiplyButton.setBounds(184, 64, 50, 40);
		multiplyButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		divideButton=new JButton("/");
		divideButton.setForeground(new Color(51, 0, 255));
		divideButton.setBackground(new Color(135, 206, 250));
		divideButton.setBounds(254, 64, 50, 40);
		divideButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		sqrtButton=new JButton("sq. root");
		sqrtButton.setForeground(new Color(51, 0, 255));
		sqrtButton.setBackground(new Color(135, 206, 250));
		sqrtButton.setBounds(53, 121, 114, 40);
		sqrtButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		resetButton=new JButton("RESET");
		resetButton.setForeground(new Color(51, 0, 255));
		resetButton.setBackground(new Color(135, 206, 250));
		resetButton.setBounds(129, 174, 100, 40);
		resetButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		equalButton.addActionListener(buttonListen);
		addButton.addActionListener(buttonListen);
		subButton.addActionListener(buttonListen);
		multiplyButton.addActionListener(buttonListen);
		divideButton.addActionListener(buttonListen);
		sqrtButton.addActionListener(buttonListen);
		resetButton.addActionListener(buttonListen);
		
		textField=new JTextField("0",15);
		textField.setForeground(new Color(51, 0, 255));
		textField.setBounds(53, 23, 251, 28);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.selectAll();
		
		kgLbButton = new JButton("Kg. --> lb.");
		kgLbButton.setForeground(new Color(51, 0, 255));
		kgLbButton.setBackground(new Color(135, 206, 250));
		kgLbButton.setBounds(53, 227, 120, 25);
		kgLbButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbKgButton = new JButton("lb. --> Kg.");
		lbKgButton.setForeground(new Color(51, 0, 255));
		lbKgButton.setBackground(new Color(135, 206, 250));
		lbKgButton.setBounds(53, 265, 120, 25);
		lbKgButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		kmMlButton = new JButton("Km. --> ml.");
		kmMlButton.setForeground(new Color(51, 0, 255));
		kmMlButton.setBackground(new Color(135, 206, 250));
		kmMlButton.setBounds(184, 265, 120, 25);
		kmMlButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		mlKmButton = new JButton("ml. --> Km.");
		mlKmButton.setForeground(new Color(51, 0, 255));
		mlKmButton.setBackground(new Color(135, 206, 250));
		mlKmButton.setBounds(184, 227, 120, 25);
		mlKmButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		kgLbButton.addActionListener(buttonListen);
		lbKgButton.addActionListener(buttonListen);
		kmMlButton.addActionListener(buttonListen);
		mlKmButton.addActionListener(buttonListen);
		
		mainPanel.setLayout(null);
		mainPanel.add(textField);
		mainPanel.add(addButton);
		mainPanel.add(subButton);
		mainPanel.add(multiplyButton);
		mainPanel.add(divideButton);
		mainPanel.add(sqrtButton);
		mainPanel.add(equalButton);
		mainPanel.add(resetButton);
		mainPanel.add(kgLbButton);
		mainPanel.add(lbKgButton);
		mainPanel.add(kmMlButton);
		
	
		mainPanel.add(mlKmButton);
		
		getContentPane().add(mainPanel);
		
	
		
		this.setVisible(true);
		
		
	}
	
	private boolean isNumeric()  
	{  
	  try  
	  {  
	    double d = Double.parseDouble(textField.getText());  
	    return true; 
	  }  
	  catch(NumberFormatException nfe)  
	  {  
		 msgbox("Please enter valid number!");
		 clearTextField();
	    return false;  
	  }     
	}
	
	private void msgbox(String s){
		   JOptionPane.showMessageDialog(null, s);
		}
	
	private void clearTextField()
	{
        textField.setText("");
        textField.grabFocus();
	}





class ListenForButton implements ActionListener{
    
	    // This method is called when an event occurs
	
    
	    public void actionPerformed(ActionEvent e){
	         
	        // Check if the source of the event was the button
	         
	        
	        if(e.getSource() == addButton && isNumeric() == true){
	        	
	         
	        	   num1=Double.parseDouble(textField.getText());
	               
	        	   clearTextField();
	               decide=1;
	        	   }
	        
	        
	        if(e.getSource() == subButton && isNumeric() == true){
	        	
	          
	        	   num1=Double.parseDouble(textField.getText());
	               
	        	   clearTextField();
	               decide=2;
	        	   }
	        	
	        
	        if(e.getSource() == multiplyButton && isNumeric() == true){
	        	
	          
	        	   num1=Double.parseDouble(textField.getText());
	               
	        	   clearTextField();
	               decide=3;
	        	   }
	        
	        
	        if(e.getSource() == divideButton  && isNumeric() == true){
	        	
	          
	        	   num1=Double.parseDouble(textField.getText());
	        	   
	        	   clearTextField();
	               decide=4;
	        	   }
	        
	        if(e.getSource() == sqrtButton  && isNumeric() == true){
	        
            double NumberX = Double.parseDouble(textField.getText());
            
            	if(NumberX>=0)
            	textField.setText(String.valueOf(Math.sqrt(NumberX)));
            	
            	else{
            	msgbox("Number can not be negative.");
            	clearTextField();
            	}
            
	        }
	        
	        if(e.getSource() == equalButton  && isNumeric() == true)
	        {
	        	num2=Double.parseDouble(textField.getText());
	        	if(decide == 1)
	        		{
	        		result=num1+num2;
	        		textField.setText(result+"");
	        		}
	        	if(decide == 2)
        		{
        		result=num1-num2;
        		textField.setText(result+"");
        		}
	        	if(decide == 3)
        		{
        		result=num1*num2;
        		textField.setText(result+"");
        		}
	        	if(decide == 4)
        		{
        		result=num1/num2;
        		textField.setText(result+"");
        		}
	        	
	        }
	        
	        if(e.getSource() == resetButton)
	        {
	        	num1=0;num2=0;decide=0;result=0;
	        	clearTextField();
	        }
	        
	        if(e.getSource() == kmMlButton  && isNumeric() == true)
	        {
	        	textField.setText(0.621371*(Double.parseDouble(textField.getText()))+"");
	        }
	        if(e.getSource() == mlKmButton  && isNumeric() == true)
	        {
	        	textField.setText(1.609371*(Double.parseDouble(textField.getText()))+"");
	        }
	        if(e.getSource() == kgLbButton  && isNumeric() == true)
	        {
	        	textField.setText(2.20462*(Double.parseDouble(textField.getText()))+"");
	        }
	        if(e.getSource() == lbKgButton  && isNumeric() == true)
	        {
	        	textField.setText(0.453592*(Double.parseDouble(textField.getText()))+"");
	        }
	    }

}	
}
