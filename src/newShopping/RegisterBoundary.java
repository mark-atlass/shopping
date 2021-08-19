package newShopping;


import org.apache.commons.mail.HtmlEmail;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

public class RegisterBoundary extends JFrame {
    private  String emailAddress;
    private  String name;
    private  String phoneNumber;
    private  char[] password;
    String verification2;

    RegisterBoundary(){
        //设置窗口大小、标题
        this.setSize(450, 350);
        this.setTitle("注册");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        JPanel panel1 = new JPanel();
        ImageIcon image = new ImageIcon(this.getClass().getResource("632610b9d5289aa92a5c07a972844da3.jpeg"));
        JLabel component1 = new JLabel(image);
        JLabel component2 = new JLabel("账号:");
        JTextField component3 = new JTextField(12);
        JLabel component13 = new JLabel("电话号码:");
        JTextField component14 = new JTextField(12);
        JLabel component15 = new JLabel("邮箱:");
        JTextField component16 = new JTextField(12);
        JLabel component18 = new JLabel("验证码:");
        JTextField component19 = new JTextField(12);
        JButton component20=new JButton("获取验证码");
        component20.addActionListener(e -> {
            emailAddress=component16.getText();
            String randCode=RegisterBoundary.this.randCode();
            verification2=randCode;
            RegisterBoundary.this.sendEmail( emailAddress,randCode);
        });

        JLabel component4 = new JLabel("密码:");
        JPasswordField component5 = new JPasswordField(12);

        JLabel component7 = new JLabel("确认密码:");
        JPasswordField component8 = new JPasswordField(12);
        JButton component6 = new JButton("注册");
        JLabel label=new JLabel("用户已存在");
        component6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterBoundary.this.dispose();
                String verification = component19.getText();
                if(verification.equals(verification2)){
                    password=component5.getPassword();
                    phoneNumber=component14.getText();
                    name=component3.getText();
                    Customer customer=new Customer();
                    customer.setName(RegisterBoundary.this.getCustomerName());
                    customer.setMail(RegisterBoundary.this.getEmailAddress());
                    customer.setPhoneNumber(RegisterBoundary.this.getPhoneNumber());
                    customer.setRegistration_time(RegisterBoundary.this.getRegistration_time());
                    customer.setPassword(RegisterBoundary.this.getPassword());
                    customer.setPassword(RegisterBoundary.this.getPassword());
                    Customer.CustomerMsg.add(customer);
                    customer.customerBoundary();
                }else{
                    EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            JFrame frame=new JFrame();
                            frame.setSize(450, 350);
                            frame.setTitle("注册");
                            frame.setLocationRelativeTo(null);
                            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                            frame.setResizable(false);
                            JPanel panel=new JPanel();
                            ImageIcon image = new ImageIcon(this.getClass().getResource("c5f22f11ff8b50f0135f60f06f10cbae.jpeg"));
                            JLabel label = new JLabel(image);
                            JLabel label1=new JLabel(" 验证码错误");
                            JLabel label2=new JLabel("  ");
                            JLabel label3=new JLabel("  ");
                            label1.setFont(new Font("宋体",Font.BOLD,20));
                            JButton button=new JButton("返回");
                            button.addActionListener(e1 -> {
                                Customer customer=new Customer();
                                customer.register();
                            });
                            GridBagLayout gridBagLayout = new GridBagLayout();
                            GridBagConstraints gridBagConstraints = new GridBagConstraints();
                            gridBagConstraints.fill = GridBagConstraints.BOTH;
                            panel.setLayout(gridBagLayout);

                            gridBagConstraints.gridx = 0;
                            gridBagConstraints.gridy = 0;
                            gridBagConstraints.gridwidth = 6;
                            gridBagConstraints.gridheight = 6;
                            gridBagLayout.setConstraints(label, gridBagConstraints);

                            gridBagConstraints.gridx = 0;
                            gridBagConstraints.gridy = 13;
                            gridBagConstraints.gridwidth = 4;
                            gridBagConstraints.gridheight = 2;
                            gridBagLayout.setConstraints(label3, gridBagConstraints);

                            gridBagConstraints.gridx = 1;
                            gridBagConstraints.gridy = 10;
                            gridBagConstraints.gridwidth = 4;
                            gridBagConstraints.gridheight = 2;
                            gridBagLayout.setConstraints(label1, gridBagConstraints);

                            gridBagConstraints.gridx = 0;
                            gridBagConstraints.gridy = 9;
                            gridBagConstraints.gridwidth = 4;
                            gridBagConstraints.gridheight = 2;
                            gridBagLayout.setConstraints(label2, gridBagConstraints);

                            gridBagConstraints.gridx = 1;
                            gridBagConstraints.gridy = 14;
                            gridBagConstraints.gridwidth = 1;
                            gridBagConstraints.gridheight = 1;
                            gridBagLayout.setConstraints(button, gridBagConstraints);

                            panel.add(label);
                            panel.add(label1);
                            panel.add(label2);
                            panel.add(label3);
                            panel.add(button);
                            frame.add(panel);
                            frame.setVisible(true);
                        }
                    });
                }
            }
        });
        JButton component17 = new JButton("返回");
        component17.addActionListener(e -> {
            RegisterBoundary.this.dispose();
            Customer customer=new Customer();
            customer.login();
        });
        JLabel component9 = new JLabel("      ");
        JLabel component10 = new JLabel("     ");
        JLabel component11 = new JLabel("     ");

        GridBagLayout gridBagLayout = new GridBagLayout();
        panel1.setLayout(gridBagLayout);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;

        gridBagConstraints.gridx = 1;
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
        gridBagLayout.setConstraints(component13, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component14, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component15, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component16, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component18, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component19, gridBagConstraints);

        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component20, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component4, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component5, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component7, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component8, gridBagConstraints);


        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component6, gridBagConstraints);

        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(label, gridBagConstraints);

        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component17, gridBagConstraints);

        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component10, gridBagConstraints);

        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 15;
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
        panel1.add(component8);
        panel1.add(component9);
        panel1.add(component10);
        panel1.add(component11);
        panel1.add(component13);
        panel1.add(component14);
        panel1.add(component15);
        panel1.add(component16);
        panel1.add(component17);
        panel1.add(component18);
        panel1.add(component19);
        panel1.add(component20);
        panel1.add(label);
        this.add(panel1);

    }

    String getEmailAddress(){
        return emailAddress;
    }

    String getRegistration_time(){
        return new Date().toString();
    }

    String getPhoneNumber(){
        return this.phoneNumber;
    }

    String getPassword(){
        StringBuilder tmp= new StringBuilder();
        for(char i:this.password)
            tmp.append(i);
        return tmp.toString();
    }

    String getCustomerName(){
        return this.name;
    }
    //发送邮箱验证码
    boolean sendEmail(String emailAddress, String code){
        try {
            HtmlEmail email = new HtmlEmail();//不用更改
            email.setHostName("smtp.yeah.net");//需要修改，126邮箱为smtp.126.com,163邮箱为163.smtp.com，QQ为smtp.qq.com
            email.setCharset("UTF-8");
            email.addTo(emailAddress);// 收件地址

            email.setFrom("atlass@yeah.net", "New Shopping");//此处填邮箱地址和用户名,用户名可以任意填写

            email.setAuthentication("atlass@yeah.net", "GEQSDRUKNLLRVSEG");

            email.setSubject("New Shopping验证码");//此处填写邮件名，邮件名可任意填写
            email.setMsg("尊敬的用户您好,您本次注册的验证码是:" + code);//此处填写邮件内容

            email.send();
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    //随机生成验证码
    String randCode(){
        StringBuilder strB = new StringBuilder();
        Random rand = new Random();
        for(int i = 0; i < 8; i++) {
            int r1 = rand.nextInt(3);
            int r2 = 0;
            switch (r1) {  // r2为ascii码值
                case 0: // 数字
                    r2 = rand.nextInt(10) + 48;  // 数字：48-57的随机数
                    break;
                case 1:
                    r2 = rand.nextInt(26) + 65;  // 大写字母
                    break;
                case 2:
                    r2 = rand.nextInt(26) + 97;  // 小写字母
                    break;
                default:
                    break;
            }
            strB.append((char)r2);
        }
        return strB.toString();
    }
}
