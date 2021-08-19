package newShopping;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Customer extends People{
    static File CustomerMsgFile=new File("src\\CustomerMsg.txt");
    static List<Customer> CustomerMsg=new ArrayList<>();

    Customer(){
        if(!CustomerMsgFile.exists()){
            try {
                CustomerMsgFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (FileReader f = new FileReader(CustomerMsgFile); BufferedReader f1 = new BufferedReader(f)) {
            String str;
            while ((str = f1.readLine()) != null) {
                Customer customer=new Customer();
                customer.setId(str);
                customer.setName(f1.readLine());
                customer.setRegistration_time(f1.readLine());
                customer.setPhoneNumber(f1.readLine());
                customer.setMail(f1.readLine());
                customer.setPassword(f1.readLine());
                customer.setRoot(false);
                CustomerMsg.add(customer);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void login(){
        EventQueue.invokeLater(() -> {
            LoginBoundary loginBoundary = new LoginBoundary();
            loginBoundary.setVisible(true);

        });
    }

    void register(){
        EventQueue.invokeLater(()->{
            RegisterBoundary registerBoundary=new RegisterBoundary();
            registerBoundary.setVisible(true);

        });
    }



    void customerBoundary(){
        EventQueue.invokeLater(()->{
            CustomerBoundary customerBoundary=new CustomerBoundary();
            customerBoundary.setVisible(true);
        });
    }

}
