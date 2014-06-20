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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class AppTest1 extends JFrame{

	JPanel mainPanel;
	JFrame mainFrame;
	JButton equalButton,addButton,subButton,multiplyButton,divideButton,resetButton,sqrtButton,answerButton,exitButton;
	JTextField textField;
    JButton kgLbButton,lbKgButton,kmMlButton,mlKmButton;
	
	char operator='0';
	double num1=0,num2=0,answer=0;
	int check=0,posX=0,posY=0;
	Point mouseDownCompCoords = null;

	
	
	public static void main(String[] args) {
	
		
		new AppTest1();
	}
	
	public AppTest1()
	{
		mainFrame= new JFrame();
		mainFrame.setUndecorated(true);
		mainFrame.setSize(279, 338);
		mainFrame.setLocationRelativeTo(null);
		 mouseDownCompCoords = null;
		 
		mainFrame.setResizable(false);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setTitle("Calculator");
		
	    
		mainPanel=new JPanel();
		mainPanel.setBackground(new Color(0, 0, 102));
		
		
		ListenForButton buttonListen = new ListenForButton();
		
		
		equalButton=new JButton("=");
		equalButton.setForeground(new Color(255, 255, 255));
		equalButton.setBackground(new Color(0, 153, 153));
		equalButton.setBounds(141, 121, 112, 40);
		equalButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		addButton=new JButton("+");
		addButton.setForeground(new Color(255, 255, 255));
		addButton.setBackground(new Color(0, 153, 153));
		addButton.setBounds(17, 68, 50, 40);
		addButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		subButton=new JButton("-");
		subButton.setForeground(new Color(255, 255, 255));
		subButton.setBackground(new Color(0, 153, 153));
		subButton.setBounds(79, 68, 50, 40);
		subButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		multiplyButton=new JButton("x");
		multiplyButton.setForeground(new Color(255, 255, 255));
		multiplyButton.setBackground(new Color(0, 153, 153));
		multiplyButton.setBounds(141, 68, 50, 40);
		multiplyButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		divideButton=new JButton("/");
		divideButton.setForeground(new Color(255, 255, 255));
		divideButton.setBackground(new Color(0, 153, 153));
		divideButton.setBounds(203, 68, 50, 40);
		divideButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		sqrtButton=new JButton("sq. root");
		sqrtButton.setForeground(new Color(255, 255, 255));
		sqrtButton.setBackground(new Color(0, 153, 153));
		sqrtButton.setBounds(16, 121, 114, 40);
		sqrtButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		resetButton=new JButton("RESET");
		resetButton.setForeground(new Color(255, 255, 255));
		resetButton.setBackground(new Color(0, 153, 153));
		resetButton.setBounds(141, 174, 112, 40);
		resetButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		answerButton=new JButton("ANSWER");
		answerButton.setForeground(new Color(255, 255, 255));
		answerButton.setBackground(new Color(0, 153, 153));
		answerButton.setBounds(17, 174, 114, 40);
		answerButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		exitButton=new JButton("EXIT");
		exitButton.setForeground(new Color(255, 255, 255));
		exitButton.setBackground(new Color(0, 153, 153));
		exitButton.setBounds(79, 297, 114, 28);
		exitButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		

		
		textField=new JTextField("0",15);
		textField.setBackground(new Color(255, 255, 255));
		textField.setForeground(new Color(0, 51, 204));
		textField.setBounds(16, 23, 237, 28);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.selectAll();
		
		kgLbButton = new JButton("Kg. --> lb.");
		kgLbButton.setForeground(new Color(255, 255, 255));
		kgLbButton.setBackground(new Color(0, 153, 153));
		kgLbButton.setBounds(16, 227, 116, 25);
		kgLbButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbKgButton = new JButton("lb. --> Kg.");
		lbKgButton.setForeground(new Color(255, 255, 255));
		lbKgButton.setBackground(new Color(0, 153, 153));
		lbKgButton.setBounds(16, 265, 116, 25);
		lbKgButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		kmMlButton = new JButton("Km. --> ml.");
		kmMlButton.setForeground(new Color(255, 255, 255));
		kmMlButton.setBackground(new Color(0, 153, 153));
		kmMlButton.setBounds(143, 265, 110, 25);
		kmMlButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		mlKmButton = new JButton("ml. --> Km.");
		mlKmButton.setForeground(new Color(255, 255, 255));
		mlKmButton.setBackground(new Color(0, 153, 153));
		mlKmButton.setBounds(143, 227, 110, 25);
		mlKmButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		
		equalButton.addActionListener(buttonListen);
		addButton.addActionListener(buttonListen);
		subButton.addActionListener(buttonListen);
		multiplyButton.addActionListener(buttonListen);
		divideButton.addActionListener(buttonListen);
		sqrtButton.addActionListener(buttonListen);
		resetButton.addActionListener(buttonListen);
		answerButton.addActionListener(buttonListen);
		exitButton.addActionListener(buttonListen);
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
		mainPanel.add(exitButton);
		mainPanel.add(kgLbButton);
		mainPanel.add(lbKgButton);
		mainPanel.add(kmMlButton);
		mainPanel.add(mlKmButton);
		
		
		
	  

	  
	    
	
	mainFrame.add(mainPanel);
	
	mainFrame.addMouseListener(new MouseListener(){
        public void mouseReleased(MouseEvent e) {
            mouseDownCompCoords = null;
        }
        public void mousePressed(MouseEvent e) {
            mouseDownCompCoords = e.getPoint();
        }
        public void mouseExited(MouseEvent e) {
        }
        public void mouseEntered(MouseEvent e) {
        }
        public void mouseClicked(MouseEvent e) {
        }
    });

    mainFrame.addMouseMotionListener(new MouseMotionListener(){
        public void mouseMoved(MouseEvent e) {
        }

        public void mouseDragged(MouseEvent e) {
            Point currCoords = e.getLocationOnScreen();
            mainFrame.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
        }
    });
	
		mainFrame.setVisible(true);
		
		
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
    
	    // mainFrame method is called when an event occurs
	
    
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
	        
	        if(e.getSource() == exitButton)
	        {	
	        	System.exit(0);
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
