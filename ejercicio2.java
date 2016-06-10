package boletin5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ejercicio2 extends JFrame implements ActionListener {
	JTextField area1;
	JTextField area2;
	JButton boton1;
	JButton boton2;
	JLabel etiqueta1;

	// constructor
	public Ejercicio2() {
		// titulo
		super("ejercicio2");
		this.setLayout(new FlowLayout());

		// area1;
		area1 = new JTextField(9);
		area1.addActionListener(this);
		add(area1);
		// area2
		area2 = new JTextField(9);
		area2.addActionListener(this);
		add(area2);
		// boton1
		boton1 = new JButton("Division");
		boton1.addActionListener(this);
		add(boton1);
		// boton2
		boton2 = new JButton("Raiz Cuadrada");
		boton2.addActionListener(this);
		add(boton2);
		// etiqueta
		etiqueta1 = new JLabel("  ");
		add(etiqueta1);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double division = 0.0;
		double raiz = 0.0;
		try {
		if (e.getSource() == boton1) {
			//comporbacion si es division entre 0
			if(Double.parseDouble(area2.getText().trim())==0) {
				JOptionPane.showMessageDialog(this, "Division entre 0, no se puede hacer");

			}else {
			division = Double.parseDouble(area1.getText().trim()) / Double.parseDouble(area2.getText().trim());
			etiqueta1.setText(String.format("El resultado es %.2f", division));
			
		}
		
			
		}
		if (e.getSource() == boton2) {

			if(Double.parseDouble(area1.getText().trim())<0) {
				JOptionPane.showMessageDialog(this, "No se puede hacer  la raiz cuadrada de un numero negativo");
			}else {
				raiz = Math.sqrt(Double.parseDouble(area1.getText().trim()));
				
				etiqueta1.setText(String.valueOf(String.format("El resultado es %.2f",raiz)));
			}
		}
		}catch(java.lang.NumberFormatException p) {
			JOptionPane.showMessageDialog(this,"no has introducido nada o has introducido letras o numeros con decimales o otroas" );
			
			
		}

	}
}
