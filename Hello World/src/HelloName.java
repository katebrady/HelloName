import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class HelloName {
	public static void main(String[] args)
	{
	JFrame frame = new JFrame();
	Scanner userInput = new Scanner(System.in);
	String name = JOptionPane.showInputDialog("What is your name?");  
	JOptionPane.showMessageDialog(frame, "Hi, " + name + ".");
	String dayOfWeek[] = {"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	JFrame frame2 = new JFrame();
	String day = (String) JOptionPane.showInputDialog(frame2,
		"What day is it?",
		"Day",
		JOptionPane.QUESTION_MESSAGE,
		null,
		dayOfWeek,
		dayOfWeek[0]
		);
	switch (day)
		{
		case "Friday":
			{
			JOptionPane.showMessageDialog(frame2, name + ", it is " + day + "!");
			break;
			}
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Saturday":
		case "Sunday":
			{
			JOptionPane.showMessageDialog(frame2, "No, it is not " + day + ", "+ name + ".");
			break;
			}
		}
	}
}
