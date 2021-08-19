package newShopping;

import javax.swing.*;
import java.awt.*;

public class AdministratorLogin extends JFrame {
    public static void main(String[] args) {
        AdministratorLogin administratorLogin=new AdministratorLogin();
        administratorLogin.startAdministrationLogin();
    }

    void startAdministrationLogin(){
        EventQueue.invokeLater(() -> {
            AdministratorLogin administratorLogin=new AdministratorLogin();
            administratorLogin.setVisible(true);
        });
    }

    AdministratorLogin() {
        //设置窗口大小、标题
        this.setSize(450, 350);
        this.setTitle("管理员登录");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        JPanel panel1 = new JPanel();

        ImageIcon image = new ImageIcon(this.getClass().getResource("a02828eea79c38217c1e0d083e3f546c.jpeg"));
        JLabel component1 = new JLabel(image);
        JLabel component2 = new JLabel("管理员账号:");
        JTextField component3 = new JTextField(12);
        JLabel component4 = new JLabel("管理员密码:");
        JPasswordField component5 = new JPasswordField(12);
        JButton component6 = new JButton("安全登录");
        component6.addActionListener(e -> {
            AdministratorLogin.this.dispose();
            AdministratorBoundary administratorBoundary=new AdministratorBoundary();
            administratorBoundary.startAdministratorBoundary();
        });
        JButton component7 = new JButton("返回");
        component7.addActionListener(e -> {
            AdministratorLogin.this.dispose();
            Customer customer=new Customer();
            customer.login();
        });
        JLabel component9 = new JLabel("      ");
        JLabel component10 = new JLabel("     ");
        JLabel component11 = new JLabel("     ");
        JLabel component12 = new JLabel("     ");
        JLabel component13 = new JLabel("     ");

        GridBagLayout gridBagLayout = new GridBagLayout();
        panel1.setLayout(gridBagLayout);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 6;
        gridBagLayout.setConstraints(component1, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component11, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component2, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component3, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component4, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component5, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component12, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component6, gridBagConstraints);

        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component13, gridBagConstraints);

        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component7, gridBagConstraints);

        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component10, gridBagConstraints);

        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component9, gridBagConstraints);

        panel1.add(component1);
        panel1.add(component2);
        panel1.add(component3);
        panel1.add(component4);
        panel1.add(component5);
        panel1.add(component6);
        panel1.add(component7);
        panel1.add(component9);
        panel1.add(component10);
        panel1.add(component11);
        panel1.add(component12);
        panel1.add(component13);
        this.add(panel1);

    }
}
