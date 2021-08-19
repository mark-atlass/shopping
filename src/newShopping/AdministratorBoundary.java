package newShopping;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class AdministratorBoundary extends JFrame {

    public static void main(String[] args){
        AdministratorBoundary administratorBoundary=new AdministratorBoundary();
        administratorBoundary.startAdministratorBoundary();
    }

    void startAdministratorBoundary(){
        EventQueue.invokeLater(()->{
            AdministratorBoundary administratorBoundary=new AdministratorBoundary();
            administratorBoundary.setVisible(true);
        });
    }

    AdministratorBoundary(){
        this.setSize(1500,800);
        this.setLocationRelativeTo(null);
        this.setTitle("Welcome to New Shopping");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);


        GridBagConstraints gridBagConstraints=new GridBagConstraints();
        gridBagConstraints.fill=GridBagConstraints.BOTH;

        //选项卡
        JTabbedPane tabbedPane=new JTabbedPane();
        //商品管理
        JPanel panel1=new JPanel();
        tabbedPane.add("商品管理", panel1);
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

        //客户管理
        JPanel panel2=new JPanel();
        tabbedPane.add("客户管理", panel2);
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_1);
        //密码管理
        JPanel panel3=new JPanel();
        tabbedPane.add("密码管理",panel3);



        this.add(tabbedPane);
    }
}
