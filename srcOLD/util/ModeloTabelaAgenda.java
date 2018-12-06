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
public class ModeloTabelaAgenda extends DefaultTableCellRenderer {

    private Component componente;
    BLDatas bLDatas = new BLDatas();
    Date d3, d2;
    private static final long serialVersionUID = 1L;

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        this.setHorizontalAlignment(CENTER);
        setBackground(row % 2 == 0 ? Color.WHITE : Color.LIGHT_GRAY);
        setForeground(Color.BLACK);

        if (isSelected == true) {
            setBackground(Color.PINK);
        }

        TableModel model = table.getModel();
        d3 = (Date) model.getValueAt(row, 0);
        try {
            d2 = bLDatas.converterDataStringParaDate(bLDatas.retornaData()); //data atual
        } catch (Exception ex) {
            Logger.getLogger(ModeloTabelaAgenda.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (d2.equals(d3)) {
            setForeground(Color.red);
        }

        if (d2.after(d3)) {
            setForeground(Color.blue);
        }

        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Dialog", Font.BOLD, 14));

        ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);

        return componente;
    }
}
