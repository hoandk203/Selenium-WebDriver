package Dangnhap;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserRegistrationUI {
	public static void main(String[] args) {
        JFrame frame = new JFrame("User Registration");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Tên người dùng
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 50, 100, 30);
        frame.add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(150, 50, 200, 30);
        frame.add(usernameField);

        // Mật khẩu
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 100, 100, 30);
        frame.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 200, 30);
        frame.add(passwordField);

        // Nút đăng ký
        JButton registerButton = new JButton("Register");
        registerButton.setBounds(150, 150, 100, 30);
        frame.add(registerButton);

        // Kết quả
        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(50, 200, 300, 30);
        frame.add(resultLabel);
    }
}
