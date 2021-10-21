import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.JFrame;


public class AhorcadoV1 extends JFrame implements ActionListener{

	// VARIABLES DEL FORM
	private JPanel panel;
	private JLabel etiqueta;
	private JButton boton1;
	
	public AhorcadoV1() {
		//PANEL
		panel=new JPanel();
		panel.setBackground(Color.black);
		panel.setLayout(null);
		this.getContentPane().add(panel);
		//ETIQUETA
		etiqueta = new JLabel("AHORCADO¡¡");
		etiqueta.setBounds(190,10,390,60);
		etiqueta.setForeground(Color.white);
		etiqueta.setFont(new Font("Snap ITC",1,40));
		panel.add(etiqueta);
		
		//IMAGEN
		ImageIcon img= new ImageIcon("basidios.png");
		JLabel imagen = new JLabel();
		imagen.setBounds(30,30,200,300);
		imagen.setIcon(new ImageIcon(img.getImage().getScaledInstance(imagen.getWidth(),imagen.getHeight(), Image.SCALE_SMOOTH)));
		panel.add(imagen);
		
		//IMAGEN DEL ROBOOT
		
		ImageIcon asustado= new ImageIcon("dorada.png");
		JLabel imgs = new JLabel();
		imgs.setBounds(100,120,150,150);
		imgs.setIcon(new ImageIcon(asustado.getImage().getScaledInstance(imgs.getWidth(),imgs.getHeight(), Image.SCALE_SMOOTH)));
		panel.add(imgs);
		
		//BOTON DE INICIO
		boton1= new JButton();
		boton1.setBounds(320,140,200,90);
		ImageIcon clic = new ImageIcon("TrypanosomaCruzi.png");
		boton1.setIcon(new ImageIcon(clic.getImage().getScaledInstance(boton1.getWidth(),boton1.getHeight(), Image.SCALE_SMOOTH)));
		panel.add(boton1);
		boton1.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == boton1) {
			JOptionPane.showMessageDialog(null,"Bienvenido al jeugo");
			
			Juego a = new Juego ();
			a.setVisible(true);
			this.dispose();
			
		}
	}
	
	public static void main(String[] args) {
		//FORM
		AhorcadoV1 a= new AhorcadoV1();
		a.setSize(600,400);
		a.setVisible(true);
		a.setTitle("Ingreso");
		a.setLocationRelativeTo(null);
		a.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
