import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JOptionPaneDemo extends JFrame
	{
	private static final long serialVersionUID = 1L;
	static String name; 
	static int className;
	static JFrame frame = new JFrame();

	public static void main(String[] args)
	    {
		name = JOptionPane.showInputDialog("What is your name?");  
		JOptionPane.showMessageDialog(frame, "Hi, " + name);
		
		Object[] options = {"Druid", "Ranger", "Monk"};
		className = JOptionPane.showOptionDialog(frame, "What class would you like to be?",
				"Your Vocation",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[2]);
		 
		
		switch(className)
			{
			case 0:
				{
				JOptionPane.showMessageDialog(frame, "Ah, a nature lover...God's first Bible...");
				break;
				}
			case 1:
				{
				JOptionPane.showMessageDialog(frame, "Ah, another Aragorn wannabe, eh?");
				break;
				}
			case 2:
				{
				JOptionPane.showMessageDialog(frame, "If I had to do it all over again... Trappist monk...");
				break;
				}
			}
		final String[] genre = { "Dungeon", "Wilderness", "Sci-Fi", "Random" };

			{
			final JFrame frame = new JFrame();
		    String adventureType = (String) JOptionPane.showInputDialog(frame, 
		            "What type of adventure would you like to experience?",
		            "Adventure Genre",
		            JOptionPane.QUESTION_MESSAGE, 
		            null, 
		            genre, 
		            genre[0]);
		    JOptionPane.showMessageDialog(frame, "Oh dear, you have no idea what you've just done...");


		      }
	    }
	}