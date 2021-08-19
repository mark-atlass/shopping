package newShopping;

import javax.swing.*;
import java.awt.*;

public class ForgetPasswordBoundary2 extends JFrame {
    public static void main(String[] args){
        ForgetPasswordBoundary2 forgetPasswordBoundary2=new ForgetPasswordBoundary2();
        forgetPasswordBoundary2.startForgetPasswordBoundary2();
    }

    void startForgetPasswordBoundary2(){
        EventQueue.invokeLater(()->{
            ForgetPasswordBoundary2 forgetPasswordBoundary2=new ForgetPasswordBoundary2();
            forgetPasswordBoundary2.setVisible(true);
        });
    }

    ForgetPasswordBoundary2() {
        //设置窗口大小、标题
        this.setSize(450, 350);
        this.setTitle("忘记密码");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        JPanel panel1 = new JPanel();

        ImageIcon image = new ImageIcon(this.getClass().getResource("5f55f737e770f64dcec111849726031a.jpeg"));
        JLabel component1 = new JLabel(image);
        JLabel component2 = new JLabel("密码已重置,重置密码已发送到您的邮箱");
        JButton component7 = new JButton("返回");
        component7.addActionListener(e -> {
            ForgetPasswordBoundary2.this.dispose();
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

        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component2, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagLayout.setConstraints(component12, gridBagConstraints);

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
        panel1.add(component7);
        panel1.add(component9);
        panel1.add(component10);
        panel1.add(component11);
        panel1.add(component12);
        this.add(panel1);

    }
}
