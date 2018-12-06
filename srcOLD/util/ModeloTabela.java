package util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

/**
 *
 * @author cicero.ramos
 */

public class ModeloTabela extends DefaultTableCellRenderer {

    private Component componente;
    Date d3;
    String d2;
    private static final long serialVersionUID = 1L;

    //getTableCellRendererComponent
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        this.setHorizontalAlignment(CENTER);
        setBackground(row % 2 == 0 ? Color.WHITE : Color.LIGHT_GRAY);
        setForeground(Color.BLACK);
        if (isSelected == true) {
            setBackground(Color.PINK);
        }
        TableModel model = table.getModel();
        d3 = (Date) model.getValueAt(row, 2);

        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.setTime(d3);
        int mesNascimento = dataNascimento.get(Calendar.MONTH) + 1;
        int diaNascimento = dataNascimento.get(Calendar.DAY_OF_MONTH);

        Calendar hoje = Calendar.getInstance();
        int mesAtual = hoje.get(Calendar.MONTH) + 1;
        int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);

        if (mesAtual == mesNascimento && diaAtual == diaNascimento) {

            setFont(getFont().deriveFont(Font.BOLD));
            setForeground(Color.RED);

        }
        
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Dialog", Font.BOLD, 14));
        
        ((DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        
        return componente;
    }
}
