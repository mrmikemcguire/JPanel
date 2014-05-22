import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JPanelDemo extends JFrame
	{
	private static final long serialVersionUID = 1L;
	static String variable;

	public static void main(String[] args)
		{
		String[] preMadeArray = new String[] {"First Option", "Second Option", "Third Option"}; 
		JButton button = new JButton("Enter");
		
		final JComboBox<String> dropdown = new JComboBox<String>(preMadeArray);
		final TextField txtfield = new TextField(20);
		final JLabel words = new JLabel("Text");
		
		final JFrame frame = new JFrame("JFrame Name");
		frame.setSize(400, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
		
		final JPanel panel = new JPanel();
		panel.setBackground(Color.red);
		frame.add(panel);
		panel.add(words);
		panel.add(dropdown);
		panel.add(txtfield);
		panel.add(button);
		button.addActionListener(new ActionListener()
				{
				public void actionPerformed(ActionEvent arg0) 
					{
					//System.out.println(dropdown.getSelectedItem());
					variable = dropdown.getSelectedItem().toString();
					System.out.println("The variable is " + variable);
					System.out.println(txtfield.getText());
					}
				});
		}
		public static final String[] pizzas = { "Cheese", "Pepperoni", "Sausage", "Veggie" };

			{
			final JFrame frame = new JFrame("JFrame Name");
		    String favoritePizza = (String) JOptionPane.showInputDialog(frame, 
		            "What is your favorite pizza?",
		            "Favorite Pizza",
		            JOptionPane.QUESTION_MESSAGE, 
		            null, 
		            pizzas, 
		            pizzas[0]);

		        // favoritePizza will be null if the user clicks Cancel
		        System.out.printf("Favorite pizza is %s.\n", favoritePizza);
		frame.setVisible(true);
		}
	}