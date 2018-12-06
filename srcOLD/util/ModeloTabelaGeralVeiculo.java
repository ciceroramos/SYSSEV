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
public class ModeloTabelaGeralVeiculo extends DefaultTableCellRenderer {

    private Component componente;
    private static final long serialVersionUID = 1L;

    String situacao;

    //getTableCellRendererComponent
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        this.setHorizontalAlignment(CENTER);

        setBackground(row % 2 == 0 ? Color.WHITE : Color.LIGHT_GRAY);
        setForeground(Color.BLACK);
        if (isSelected == true) {
            setBackground(Color.yellow);
        }

        TableModel model = table.getModel();
        situacao = (String) model.getValueAt(row, 6);

        if (situacao.equals("RESERVADO")) {
             setFont(getFont().deriveFont(Font.BOLD));
             setForeground(Color.RED);
        }       
        
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Dialog", Font.BOLD, 14));

        ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);

        return componente;
    }
}
