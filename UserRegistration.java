import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

package registration.module;

public class UserRegistrationForm extends JFrame{
	private JTextField nameField;
	   private JTextField emailField;
	   private JPasswordField passwordField;
	   private JPasswordField confirmPasswordField;
	   private JButton submitButton;
	   private JButton clearButton;

	   public UserRegistrationForm() {
	      setTitle("User Registration");
	      setSize(300, 200);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setLayout(new GridLayout(5, 2, 5, 5));

	      
	      add(new JLabel("Name:"));
	      nameField = new JTextField();
	      add(nameField);

	      add(new JLabel("Email:"));
	      emailField = new JTextField();
	      add(emailField);

	      add(new JLabel("Password:"));
	      passwordField = new JPasswordField();
	      add(passwordField);

	      add(new JLabel("Confirm Password:"));
	      confirmPasswordField = new JPasswordField();
	      add(confirmPasswordField);

	      submitButton = new JButton("Submit");
	      clearButton = new JButton("Clear");

	      add(submitButton);
	      add(clearButton);

	      
	      submitButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            String name = nameField.getText();
	            String email = emailField.getText();
	            String password = new String(passwordField.getPassword());
	            String confirmPassword = new String(confirmPasswordField.getPassword());

	            if (name.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
	            	System.out.println("Error: All fields must be filled in.");
	                return;
	            }

	            if (!password.equals(confirmPassword)) {
	            	System.out.println("Error: Passwords do not match.");
	                return;
	            }

	            System.out.println("Registration Successful!");
	            System.out.println("Name: " + name);
	            System.out.println("Email: " + email);
	         }
	      });

	      clearButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            nameField.setText("");
	            emailField.setText("");
	            passwordField.setText("");
	            confirmPasswordField.setText("");
	         }
	      });

	      setVisible(true);
	   }

	   public static void main(String[] args) {
	      
	}



}
