package newShopping;

import org.apache.commons.mail.HtmlEmail;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ForgetPasswordBoundary extends JFrame {
    private String verification;
    public static void main(String[] args){
        ForgetPasswordBoundary forgetPasswordBoundary=new ForgetPasswordBoundary();
        forgetPasswordBoundary.startForgetPasswordBoundary();
    }

    void startForgetPasswordBoundary(){
        EventQueue.invokeLater(()->{
            ForgetPasswordBoundary forgetPasswordBoundary=new ForgetPasswordBoundary();
            forgetPasswordBoundary.setVisible(true);
        });
    }

    ForgetPasswordBoundary() {
        //设置窗口大小、标题
        this.setSize(450, 350);
        this.setTitle("忘记密码");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        JPanel panel1 = new JPanel();

        ImageIcon image = new ImageIcon(this.getClass().getResource("ab3d91d4229589d01cc4b2d881560746.jpeg"));
        JLabel component1 = new JLabel(image);
        JLabel component2 = new JLabel("邮箱:");
        JTextField component3 = new JTextField(12);
        JLabel component4 = new JLabel("验证码:");
        JTextField component5 = new JTextField(12);
        JButton component6 = new JButton("下一步");
        component6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ForgetPasswordBoundary.this.dispose();
                if(!component5.getText().equals(verification)){
                    EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            JFrame frame=new JFrame();
                            frame.setSize(450, 350);
                            frame.setTitle("忘记密码");
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
                                customer.login();
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
                }else{

                }
            }
        });
        JButton component8 = new JButton("获取验证码");
        component8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verification=ForgetPasswordBoundary.this.randCode();
                ForgetPasswordBoundary.this.sendEmail(component3.getText(),verification);
            }
        });
        component6.addActionListener(e -> {
            ForgetPasswordBoundary.this.dispose();
            ForgetPasswordBoundary2 forgetPasswordBoundary2=new ForgetPasswordBoundary2();
            forgetPasswordBoundary2.startForgetPasswordBoundary2();
        });
        JButton component7 = new JButton("返回");
        component7.addActionListener(e -> {
            ForgetPasswordBoundary.this.dispose();
            Customer customer=new Customer();
            customer.login();
        });
        JLabel component9 = new JLabel("      ");
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

        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component8, gridBagConstraints);

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

        gridBagConstraints.gridx = 2;
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
        panel1.add(component8);
        panel1.add(component9);
        panel1.add(component10);
        panel1.add(component11);
        panel1.add(component12);
        this.add(panel1);

    }
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
