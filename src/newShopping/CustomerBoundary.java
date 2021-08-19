package newShopping;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.KeyEvent;

public class CustomerBoundary extends JFrame {

    CustomerBoundary(){
        this.setSize(1500,800);
        this.setLocationRelativeTo(null);
        this.setTitle("Welcome to New SHopping");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        //选项卡
        JTabbedPane tabbedPane=new JTabbedPane();
        //买
        JScrollPane scrollPane  =  new  JScrollPane ( ) ;
        scrollPane. setBounds ( 10,  10,  394,  222 ) ;
        tabbedPane. add (scrollPane ) ;
        JTable table;
        table  =  new  JTable ( ) ;
        scrollPane. setViewportView (table ) ;
        Object [ ] [ ] data  =  {
                { 1,"龟",  "杰尼龟","添加至购物车" },
                { 2,  5,  6 },
                { 3,  8,  9 } } ;
        table. setModel ( new  DefaultTableModel( )  {
            @Override
            public  Object getValueAt ( int row,  int column )  {
                return data [row ] [column ] ;
            }

            @Override
            public  int getRowCount ( )  {
                return  3 ;
            }

            @Override
            public  int getColumnCount ( )  {
                return  3 ;
            }
            @Override
            public  void setValueAt ( Object aValue,  int row,  int column ) {
                data [row ] [column ]  = aValue ;
                fireTableCellUpdated (row, column ) ;
            }

            @Override
            public  boolean isCellEditable ( int row,  int column )  {
                if  (column  ==  2 )  {
                    return  true ;
                }  else  {
                    return  false ;
                }
            }
        } ) ;

        table. getColumnModel ( ). getColumn ( 2 ). setCellEditor (
                new MyButtonEditor ( ) ) ;

        table. getColumnModel ( ). getColumn ( 2 ). setCellRenderer (
                new MyButtonRenderer ( ) ) ;

        table. setRowSelectionAllowed ( false ) ;
        tabbedPane.add("买买买",scrollPane);
        //购物车
        Object[][] tableData1=new Object[5][8];
        String[] name1={"序号","商品名","详情","状态"};
        JTable table1=new JTable(tableData1,name1);
        table1.setRowHeight(55);
        tabbedPane.add("购物车", table1);
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_1);
        //我的
        JPanel panel1=new JPanel();
        tabbedPane.add("我的shopping",panel1);



        this.add(tabbedPane);
    }
}
