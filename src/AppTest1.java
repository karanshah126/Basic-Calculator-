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
	JButton equalButton,addButton,subButton,multiplyButton,divideButton,resetButton,sqrtButton,answerButton;
	JTextField textField;
    JButton kgLbButton,lbKgButton,kmMlButton,mlKmButton;
	
	char operator='0';
	double num1=0,num2=0,answer=0;
	int check=0;

	
	
	public static void main(String[] args) {
	
		
		new AppTest1();
	}
	
	public AppTest1()
	{
		this.setSize(279, 338);
		this.setLocationRelativeTo(null);
		
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Calculator");
		mainPanel=new JPanel();
		mainPanel.setBackground(new Color(0, 153, 204));
		
		
		ListenForButton buttonListen = new ListenForButton();
		
		equalButton=new JButton("=");
		equalButton.setForeground(new Color(51, 0, 255));
		equalButton.setBackground(new Color(135, 206, 250));
		equalButton.setBounds(141, 121, 112, 40);
		equalButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		addButton=new JButton("+");
		addButton.setForeground(new Color(51, 0, 255));
		addButton.setBackground(new Color(135, 206, 250));
		addButton.setBounds(17, 64, 50, 40);
		addButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		subButton=new JButton("-");
		subButton.setForeground(new Color(51, 0, 255));
		subButton.setBackground(new Color(135, 206, 250));
		subButton.setBounds(79, 64, 50, 40);
		subButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		multiplyButton=new JButton("x");
		multiplyButton.setForeground(new Color(51, 0, 255));
		multiplyButton.setBackground(new Color(135, 206, 250));
		multiplyButton.setBounds(141, 64, 50, 40);
		multiplyButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		divideButton=new JButton("/");
		divideButton.setForeground(new Color(51, 0, 255));
		divideButton.setBackground(new Color(135, 206, 250));
		divideButton.setBounds(203, 64, 50, 40);
		divideButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		sqrtButton=new JButton("sq. root");
		sqrtButton.setForeground(new Color(51, 0, 255));
		sqrtButton.setBackground(new Color(135, 206, 250));
		sqrtButton.setBounds(16, 121, 114, 40);
		sqrtButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		resetButton=new JButton("RESET");
		resetButton.setForeground(new Color(51, 0, 255));
		resetButton.setBackground(new Color(135, 206, 250));
		resetButton.setBounds(141, 174, 112, 40);
		resetButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		answerButton=new JButton("ANSWER");
		answerButton.setForeground(new Color(51, 0, 255));
		answerButton.setBackground(new Color(135, 206, 250));
		answerButton.setBounds(17, 174, 114, 40);
		answerButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		equalButton.addActionListener(buttonListen);
		addButton.addActionListener(buttonListen);
		subButton.addActionListener(buttonListen);
		multiplyButton.addActionListener(buttonListen);
		divideButton.addActionListener(buttonListen);
		sqrtButton.addActionListener(buttonListen);
		resetButton.addActionListener(buttonListen);
		answerButton.addActionListener(buttonListen);
		
		textField=new JTextField("0",15);
		textField.setForeground(new Color(51, 0, 255));
		textField.setBounds(16, 23, 237, 28);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.selectAll();
		
		kgLbButton = new JButton("Kg. --> lb.");
		kgLbButton.setForeground(new Color(51, 0, 255));
		kgLbButton.setBackground(new Color(135, 206, 250));
		kgLbButton.setBounds(16, 227, 116, 25);
		kgLbButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbKgButton = new JButton("lb. --> Kg.");
		lbKgButton.setForeground(new Color(51, 0, 255));
		lbKgButton.setBackground(new Color(135, 206, 250));
		lbKgButton.setBounds(16, 265, 116, 25);
		lbKgButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		kmMlButton = new JButton("Km. --> ml.");
		kmMlButton.setForeground(new Color(51, 0, 255));
		kmMlButton.setBackground(new Color(135, 206, 250));
		kmMlButton.setBounds(143, 265, 110, 25);
		kmMlButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		mlKmButton = new JButton("ml. --> Km.");
		mlKmButton.setForeground(new Color(51, 0, 255));
		mlKmButton.setBackground(new Color(135, 206, 250));
		mlKmButton.setBounds(143, 227, 110, 25);
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
		mainPanel.add(answerButton);
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

	    return false;  
	  }     
	}
	
	private void msgbox(String s){
		   JOptionPane.showMessageDialog(null, s);
			 clearTextField();
		}
	
	private void clearTextField()
	{
        textField.setText("0");
        textField.grabFocus();
        textField.selectAll();
	}

	private void displayResult(){
		
		textField.setText(num2+"");
		answer=num2;
		operator='0';
		textField.selectAll();
		textField.grabFocus();
	}
		
	private void previousCalculation()
	{	
			switch(operator)
			{
			case '+':
				num1=num1+Double.parseDouble(textField.getText());
				break;
				
			case '-':
				num1=num1-Double.parseDouble(textField.getText());
				break;
				
			case '*':
				num1=num1*(Double.parseDouble(textField.getText()));
				break;
				
			case '/':
				if(Double.parseDouble(textField.getText())!=0)
				num1=num1/(Double.parseDouble(textField.getText()));
				else 
					msgbox("The number cannot be 0");
				break;
				
			case '0':
				num1=Double.parseDouble(textField.getText());
				break;
			}
			
			textField.setText(num1+"");
	        textField.grabFocus();
	        textField.selectAll();
		
	}
	



class ListenForButton implements ActionListener{
    
	    // This method is called when an event occurs
	
    
	    public void actionPerformed(ActionEvent e){
	         
	        // Check if the source of the event was the button
	        
	        
	        if(e.getSource() == addButton && isNumeric() == true){
	       
	        	previousCalculation();
	        	       	operator='+';
	        	       	}
	        
	        if(e.getSource() == subButton && isNumeric() == true){
	        	//if (check==0)
	        	//{
	        	//	check=1;
	        	
	        	previousCalculation();
	        	
	        	operator='-';
	        	
	        	   }
	        	
	        
	        if(e.getSource() == multiplyButton && isNumeric() == true){
	        	previousCalculation();
	        	operator='*';
        	
	        	   }
	        
	        
	        if(e.getSource() == divideButton  && isNumeric() == true){
	        	previousCalculation();
	        	operator='/';
        		
	        	   }
	        
	        if(e.getSource() == sqrtButton  && isNumeric() == true){
	        
            double NumberX = Double.parseDouble(textField.getText());
            
            	if(NumberX>=0)
            	{
            		answer=Math.sqrt(NumberX);
            		textField.setText(String.valueOf(answer));
            	 
            	}
            	
            	else{
            	msgbox("Number can not be negative.");

            	}
            
	        }
	        
	        if(e.getSource() == equalButton  && isNumeric() == true) {
	        	
				switch(operator)
				{
				case '+':
					num2=num1+Double.parseDouble(textField.getText());
					break;
				case '-':
					num2=num1-Double.parseDouble(textField.getText());
					break;
				case '*':
					num2=num1*Double.parseDouble(textField.getText());
					break;
				case '/':
					if(Double.parseDouble(textField.getText())!=0)
						num2=num1/(Double.parseDouble(textField.getText()));
						else 
							msgbox("The number cannot be 0");
					break;
				}
				displayResult();

	        }
	        
	        if(e.getSource() == resetButton)
	        {
	        	num1=0;num2=0;operator='0';
	        	clearTextField();
	        }
	        
	        if(e.getSource() == answerButton)
	        {	
	        	textField.setText(answer+"");
	        }
	        
	        if(e.getSource() == kmMlButton  && isNumeric() == true)
	        	
	        {
	        	answer=0.621371*(Double.parseDouble(textField.getText()));
	        	textField.setText(answer+"");
	        }
	        if(e.getSource() == mlKmButton  && isNumeric() == true)
	        {
	        	answer=1.609371*(Double.parseDouble(textField.getText()));
	        	textField.setText(answer+"");
	        	
	        }
	        if(e.getSource() == kgLbButton  && isNumeric() == true)
	        {
	        	answer=2.20462*(Double.parseDouble(textField.getText()));
	        	textField.setText(answer+"");
	        	
	        }
	        if(e.getSource() == lbKgButton  && isNumeric() == true)
	        {
	        	answer=0.453592*(Double.parseDouble(textField.getText()));
	        	textField.setText(answer+"");
	        }
	    }

}	
}
