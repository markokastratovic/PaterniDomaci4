/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marko
 */
public class MathTableModel extends AbstractTableModel {
    
    

    
    @Override
    public int getRowCount() {
        return controller.Controller.getInstance().getMaths().size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        List<Math> maths = controller.Controller.getInstance().getMaths();
        Math math = maths.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return math.getA();
            case 1:
                return math.getB();
            case 2:
                return math.getMathOperator();
            case 3:
                return math.getResult();

        }
        return "n/a";
    }

   
    
    

}
