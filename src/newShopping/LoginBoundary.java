package newShopping;

import javax.swing.*;
import java.awt.*;


public class LoginBoundary extends JFrame {

    LoginBoundary() {
        //设置窗口大小、标题
        this.setSize(450, 350);
        this.setTitle("New Shopping");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);


        //用户登录界面
        JPanel panel1 = new JPanel();

        ImageIcon image = new ImageIcon(this.getClass().getResource("f0c6991f8f776320c7ce557092953cc6.jpeg"));
        JLabel component1 = new JLabel(image);
        Customer customer=new Customer();
        JLabel component2 = new JLabel("用户账号:");
        JTextField component3 = new JTextField(12);
        customer.setName(component3.getText());
        JLabel component4 = new JLabel("用户密码:");
        JPasswordField component5 = new JPasswordField(12);
        StringBuilder tmp = new StringBuilder();
        for (char i:
             component5.getPassword()) {
            tmp.append(i);
        }
        customer.setPassword(tmp.toString());
        JButton component6 = new JButton("安全登录");
        component6.addActionListener(e -> {
            boolean flag=true;
            for (Customer c: Customer.CustomerMsg) {
                if(customer.getName().equals(c.getName())&&customer.getPassword().equals(c.getPassword())){
                    flag=true;
                    break;
                }
            }
            if(flag){
                LoginBoundary.this.dispose();
                Customer customer1=new Customer();
                customer1.customerBoundary();
            }else{
                LoginBoundary.this.dispose();
                Customer customer1=new Customer();
                customer1.login();
            }

        });
        JButton component7 = new JButton("管理员登录");
        component7.addActionListener(e -> {
            LoginBoundary.this.dispose();
            AdministratorLogin administratorLogin=new AdministratorLogin();
            administratorLogin.startAdministrationLogin();
        });
        JButton component8=new JButton("注册");
        component8.addActionListener(e -> {
            LoginBoundary.this.dispose();
            Customer customer2=new Customer();
            customer2.register();
        });
        JButton component9 = new JButton("忘记密码？");
        component9.addActionListener(e -> {
            LoginBoundary.this.dispose();
            ForgetPasswordBoundary forgetPasswordBoundary=new ForgetPasswordBoundary();
            forgetPasswordBoundary.startForgetPasswordBoundary();
        });
        JLabel component10 = new JLabel("     ");
        JLabel component11 = new JLabel("     ");
        JLabel component12 = new JLabel("     ");

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

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component8, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
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
        panel1.add(component8);
        panel1.add(component9);
        panel1.add(component7);
        panel1.add(component10);
        panel1.add(component11);
        panel1.add(component12);
        this.add(panel1);


    }

}
