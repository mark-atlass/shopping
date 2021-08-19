package newShopping;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public  class MyButtonRenderer  implements TableCellRenderer {
    private JPanel panel ;

    private  JButton button ;

    private  int num ;

    public MyButtonRenderer ( )  {
        initButton ( ) ;

        initPanel ( ) ;

        panel. add (button,  BorderLayout. CENTER ) ;
    }

    private  void initButton ( )  {
        button  =  new  JButton ( ) ;

    }

    private  void initPanel ( )  {
        panel  =  new  JPanel ( ) ;

        panel. setLayout ( new  BorderLayout ( ) ) ;
    }

    public  Component getTableCellRendererComponent ( JTable table,  Object value,
                                                      boolean isSelected,  boolean hasFocus,  int row,  int column )  {
        num  =  ( Integer ) value ;

        button. setText (value  ==  null  ?  ""  :  String. valueOf (value ) ) ;

        return panel ;
    }

}
