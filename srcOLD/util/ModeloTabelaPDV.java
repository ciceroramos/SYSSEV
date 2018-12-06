package util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

/**
 *
 * @author cicero.ramos
 */
public class ModeloTabelaPDV extends DefaultTableCellRenderer {

    private Component componente;
    
    private static final long serialVersionUID = 1L;

    //getTableCellRendererComponent
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        this.setHorizontalAlignment(CENTER);
        
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Dialog", Font.BOLD, 12));
        ((DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        
        return componente;
    }
}
