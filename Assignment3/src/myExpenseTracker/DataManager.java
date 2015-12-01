package myExpenseTracker;

import java.io.*;
import java.util.*;
import java.awt.Color;

import javax.lang.model.element.VariableElement;
import javax.swing.JTextField;

class Expense{
	String expense;
	int amount;
	
	public Expense (String expense, int amount){
		this.expense = expense;
		this.amount = amount;
	}
	public int getAmount(){
		return amount;
	}
}
public class DataManager {

	
	private Map<Color, Expense> expenses = new LinkedHashMap<Color, Expense>();
	
	private Color [] expenseColors;

	private int limit = 0;
	
	public boolean Update(JTextField[] form) 
    {
		int sum = 0;
		
    	Expense expense;
    	expenseColors = new Color[4];
    	expenseColors[0] = Color.red;
    	expenseColors[1] = Color.green;
    	expenseColors[2] = Color.blue;
    	expenseColors[3] = Color.black;
    	
    	for (int i = 0; i < form.length; i++) {
    		
    		String type = form[i].getName();
    		int amount;
    		
    		if(form[i].getText().equals("")) amount = 0;
    		
    		try {
    			amount = Integer.parseInt(form[i].getText());
    		  } catch (NumberFormatException e) {
    		    amount = 0;
    		  }
			
    		if((sum+=amount) > limit) { 
    			System.out.println("You exceeded your limit");
    			return false;
    		}  			
			expense = new Expense(type, amount);
			
			expenses.put(expenseColors[i], expense);
		}
    	
    	return true;
    }

    public Map<Color, Expense> getData()
    {
    	return expenses;
    }
    
    public void setLimit(int limit) {
    	System.out.println(limit);
    	this.limit  = limit;
    }
    
}