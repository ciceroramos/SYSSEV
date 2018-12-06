package util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

/**
 *
 * @author cicero.ramos
 */
public class ModeloTabelaContasPagar extends DefaultTableCellRenderer {
    
    BLDatas bl = new BLDatas();
    private Component componente;
    Date d3;
    Date d2 = null;
    private static final long serialVersionUID = 1L;

    //getTableCellRendererComponent
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        this.setHorizontalAlignment(CENTER);
        try {
            d2 = bl.converterDataStringParaDate(bl.retornaData()); //data atual
        } catch (Exception ex) {
            Logger.getLogger(ModeloTabelaContasPagar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        TableModel model = table.getModel();
        d3 = (Date) model.getValueAt(row, 4);

        if (d2.equals(d3)) {
            setFont(getFont().deriveFont(Font.BOLD));
            setForeground(Color.blue);
        }else if(d3.after(d2)){
            setForeground(Color.BLACK);
            
        }else{            
            setForeground(Color.RED);
        }
        
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Dialog", Font.BOLD, 14));
        ((DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        
        return componente;
    }
    
    
    
    
    
    
    
}


