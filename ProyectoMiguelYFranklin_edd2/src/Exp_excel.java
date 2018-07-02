import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author miguel
 */
public class Exp_excel implements ActionListener {

    Administracion_Registros modeloE = new Administracion_Registros();
    Principal vistaE = new Principal();
    JFileChooser selectArchivo = new JFileChooser();
    File archivo;
    int contAccion = 0;

    public Exp_excel(Administracion_Registros modeloE, Principal vistaE) {
        this.vistaE = vistaE;
        this.modeloE = modeloE;
        this.vistaE.btnExportar.addActionListener(this);
    }

    public void agregarFiltro() {
        selectArchivo.setFileFilter(new FileNameExtensionFilter("Excel(*.xls)", "xls"));
        selectArchivo.setFileFilter(new FileNameExtensionFilter("Excel(*.xlsx)", "xlsx"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}