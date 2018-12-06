package util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

/**
 *
 * @author cicero.ramos
 */
public class ModeloTabelaEstoque extends DefaultTableCellRenderer {

    private Component componente;
    float estoque, index = 3;
    int cont = 0;

    private static final long serialVersionUID = 1L;

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        TableModel model = table.getModel();
        estoque = (float) model.getValueAt(row, 4);
        
            if (estoque <= index) {

                componente.setForeground(Color.MAGENTA.darker());

        }
            
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Dialog", Font.BOLD, 14));    
        ((DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        
        return componente;
    }

}
