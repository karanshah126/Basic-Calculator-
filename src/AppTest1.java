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
	JLabel valueLabel;
	JButton equalButton,addButton,subButton,multiplyButton,divideButton,resetButton;
	JTextField textField;
	
	
	double result;
    double num1=0,num2=0;int decide=0;
    JButton kgLbButton,lbKgButton,kmMlButton,mlKmButton;
	
	
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
		mainPanel=new JPanel();
		valueLabel=new JLabel("Value:");
		valueLabel.setBounds(232, 13, 40, 19);
		valueLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		
		ListenForButton buttonListen = new ListenForButton();
		
		equalButton=new JButton("CALC");
		equalButton.setBounds(120, 160, 100, 40);
		equalButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		addButton=new JButton("+");
		addButton.setBounds(80, 85, 70, 40);
		addButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		subButton=new JButton("-");
		subButton.setBounds(180, 85, 70, 40);
		subButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		multiplyButton=new JButton("X");
		multiplyButton.setBounds(280, 85, 70, 40);
		multiplyButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		divideButton=new JButton("/");
		divideButton.setBounds(380, 85, 70, 40);
		divideButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		resetButton=new JButton("RESET");
		resetButton.setBounds(300, 160, 100, 40);
		resetButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		equalButton.addActionListener(buttonListen);
		addButton.addActionListener(buttonListen);
		subButton.addActionListener(buttonListen);
		multiplyButton.addActionListener(buttonListen);
		divideButton.addActionListener(buttonListen);
		resetButton.addActionListener(buttonListen);
		
		textField=new JTextField("0",15);
		textField.setBounds(156, 42, 231, 28);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.selectAll();
		
		kgLbButton = new JButton("Kg. --> lb.");
		kgLbButton.setBounds(251, 295, 120, 25);
		kgLbButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbKgButton = new JButton("lb. --> Kg.");
		lbKgButton.setBounds(251, 333, 120, 25);
		lbKgButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		kmMlButton = new JButton("Km. --> ml.");
		kmMlButton.setBounds(381, 333, 120, 25);
		kmMlButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		mlKmButton = new JButton("ml. --> Km.");
		mlKmButton.setBounds(381, 295, 120, 25);
		mlKmButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		kgLbButton.addActionListener(buttonListen);
		lbKgButton.addActionListener(buttonListen);
		kmMlButton.addActionListener(buttonListen);
		mlKmButton.addActionListener(buttonListen);
		
		mainPanel.setLayout(null);
	
		mainPanel.add(valueLabel);
		mainPanel.add(textField);
		mainPanel.add(addButton);
		mainPanel.add(subButton);
		mainPanel.add(multiplyButton);
		mainPanel.add(divideButton);
		mainPanel.add(equalButton);
		mainPanel.add(resetButton);
		mainPanel.add(kgLbButton);
		mainPanel.add(lbKgButton);
		mainPanel.add(kmMlButton);
		
	
		mainPanel.add(mlKmButton);
		
		getContentPane().add(mainPanel);
		
	
		
		this.setVisible(true);
		
		
	}





class ListenForButton implements ActionListener{
    
	    // This method is called when an event occurs
	
    
	    public void actionPerformed(ActionEvent e){
	         
	        // Check if the source of the event was the button
	         
	        
	        if(e.getSource() == addButton){
	        	
	          
	        	   num1=Double.parseDouble(textField.getText());
	               
	               textField.setText("");
	               textField.grabFocus();
	               decide=1;
	        	   }
	        
	        
	        if(e.getSource() == subButton){
	        	
	          
	        	   num1=Double.parseDouble(textField.getText());
	               
	               textField.setText("");
	               textField.grabFocus();
	               decide=2;
	        	   }
	        	
	        
	        if(e.getSource() == multiplyButton){
	        	
	          
	        	   num1=Double.parseDouble(textField.getText());
	               
	               textField.setText("");
	               textField.grabFocus();
	               decide=3;
	        	   }
	        
	        
	        if(e.getSource() == divideButton){
	        	
	          
	        	   num1=Double.parseDouble(textField.getText());
	               
	               textField.setText("");
	               textField.grabFocus();
	               decide=4;
	        	   }
	        
	        
	        if(e.getSource() == equalButton)
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
	        	textField.setText("");textField.grabFocus();
	        }
	        
	        if(e.getSource() == kmMlButton)
	        {
	        	textField.setText(0.621371*(Double.parseDouble(textField.getText()))+"");
	        }
	        if(e.getSource() == mlKmButton)
	        {
	        	textField.setText(1.609371*(Double.parseDouble(textField.getText()))+"");
	        }
	        if(e.getSource() == kgLbButton)
	        {
	        	textField.setText(2.20462*(Double.parseDouble(textField.getText()))+"");
	        }
	        if(e.getSource() == lbKgButton)
	        {
	        	textField.setText(0.453592*(Double.parseDouble(textField.getText()))+"");
	        }
	    }

}	
}
