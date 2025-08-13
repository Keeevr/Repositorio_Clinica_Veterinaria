package CRUD_Veterinaria;

import com.github.lgooddatepicker.components.DateTimePicker;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Metodos {

    public void limpiarCampos(JTextField... campos) {
        for (JTextField campo : campos) {
            campo.setText("");
        }
    }

    public void limpiarDateChooser(JDateChooser... fechas) {
        for (JDateChooser fecha : fechas) {
            fecha.setDate(null);
        }
    }
    
    public void limpiarDateTimePicker(DateTimePicker... fechas_hora) {
        for (DateTimePicker dtp : fechas_hora) {
            dtp.getDatePicker().setDate(null);
            dtp.getTimePicker().setTime(null);
        } 
    }

    //Seleciona al primero.
    public void limpiarComboBox(JComboBox<?>... combos) {
        for (JComboBox<?> combo : combos) {
            if (combo.getItemCount() > 0) {
                combo.setSelectedIndex(0); // selecciona el primer ítem
            } else {
                combo.setSelectedItem(null); // o lo deja sin selección
            }
        }
    }

    //Elimina todo    
    public void vaciarComboBox(JComboBox<?>... combos) {
        for (JComboBox<?> combo : combos) {
            combo.removeAllItems();
        }
    }
}
