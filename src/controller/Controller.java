/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import model.Math;
import ui.components.IViewData;
import ui.form.FormViewComboboxMath;

/**
 *
 * @author student1
 */
public class Controller {

    private final List<model.Math> maths;
    private final List<JDialog> views;
    private static Controller controller;

    private Controller() {
        maths = new ArrayList<>();
        views = new ArrayList<>();
    }

    public void add(model.Math math) {
        maths.add(math);
        for (JDialog view : views) {
            ((IViewData)view).refreshData();
        }
    }
    
   public void remove(model.Math math) {
        maths.remove(math);
        for (JDialog view : views) {
            ((IViewData)view).refreshData();
        }
    }

    public static Controller getInstance() {
        if (controller == null) {
            controller = new Controller();
        }
        return controller;
    }

    public List<Math> getMaths() {
        return maths;
    }

    public void register(JDialog view) {
        views.add(view);
    }
    
     public void remove(JDialog dialog){
    views.remove(dialog);
    }

    public void setSelectedItem(int index) {
         for (JDialog view : views) {
            ((IViewData)view).setSelected(index);
        }
    }
    
}
