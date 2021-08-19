package newShopping;

import javax.swing.*;
import javax.swing.table.TableCellEditor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class MyButtonEditor  extends AbstractCellEditor implements
        TableCellEditor {

    /**
     * serialVersionUID
     */
    private  static  final  long serialVersionUID  =  -6546334664166791132L ;

    private  JPanel panel ;

    private  JButton button ;

    private  int num ;

    public MyButtonEditor ( )  {

        initButton ( ) ;

        initPanel ( ) ;

        panel. add ( this. button,  BorderLayout. CENTER ) ;
    }

    private  void initButton ( )  {
        button  =  new  JButton ( ) ;

        button. addActionListener ( new  ActionListener( )  {
            public  void actionPerformed ( ActionEvent e )  {
                int res  =  JOptionPane. showConfirmDialog ( null,
                        "Do you want to add 1 to it?",  "choose one",
                        JOptionPane. YES_NO_OPTION ) ;

                if (res  ==   JOptionPane. YES_OPTION ) {
                    num ++;
                }
                //stopped!!!!
                fireEditingStopped ( ) ;

            }
        } ) ;

    }

    private  void initPanel ( )  {
        panel  =  new  JPanel ( ) ;

        panel. setLayout ( new  BorderLayout ( ) ) ;
    }

    @Override
    public  Component getTableCellEditorComponent ( JTable table,  Object value,
                                                    boolean isSelected,  int row,  int column )  {
        num  =  ( Integer ) value ;

        button. setText (value  ==  null  ?  ""  :  String. valueOf (value ) ) ;

        return panel ;
    }

    @Override
    public  Object getCellEditorValue ( )  {
        return num ;
    }

}