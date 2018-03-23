import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Convertir extends JFrame {
	private JTextField horasR;
	private JTextField minutosR;
	private JTextField segundosR;
	 private JButton btnAceptar;
	 private JTextField R;
	 public Convertir (String titulo) {
		 Container contenedorPrincipal = this.getContentPane();
		 this.setTitle(titulo);
	     this.setResizable(true);
	     this.setLayout(null);
	 	 this.getContentPane().setLayout(null);
		 getContentPane().setBackground(Color.YELLOW);
	     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     
	     
	     JLabel lblHoras = new JLabel("Horas: ");
	     lblHoras.setBounds(10, 10, 100, 30);
	     contenedorPrincipal.add(lblHoras);
	     
	     
	     horasR = new JTextField();
	     horasR.setBounds(120, 10, 100, 30);
	     contenedorPrincipal.add(horasR);
	     
	        JLabel lblMinutos = new JLabel("Minutos: ");
	        lblMinutos.setBounds(10, 50, 100, 30);
	        contenedorPrincipal.add(lblMinutos);

	        minutosR = new JTextField();
	        minutosR.setBounds(120, 50, 100, 30);
	        contenedorPrincipal.add(minutosR);

	        JLabel lblSegundos = new JLabel("Segundos: ");
	        lblSegundos.setBounds(10, 90, 100, 30);
	        contenedorPrincipal.add(lblSegundos);

	        segundosR = new JTextField();
	        segundosR.setBounds(120, 90, 100, 30);
	        contenedorPrincipal.add(segundosR);
	        
	        btnAceptar = new JButton("Aceptar");
	        btnAceptar.setBounds(140, 140, 80, 30);
	        contenedorPrincipal.add(btnAceptar);
	        AccionBoton oyenteBtnAceptar = new AccionBoton();
	        btnAceptar.addActionListener(oyenteBtnAceptar);
	        
	        R = new JTextField();
		    R.setBounds(130, 170, 100, 30);
		    contenedorPrincipal.add(R);
	     
		
	 }
	 public static void main(String[] args)
	    {
	        Convertir ventana = new Convertir("EXAMEN");
	        ventana.setSize(300,300);
	        ventana.setLocation(200,100);
	        ventana.setVisible(true);
	        
			
	    }
	 class AccionBoton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String dato;
			dato = R.getText();
			double datoC = Double.parseDouble(dato);
			
			
			horasR.setText(dato);
			
		}
		 
	 }
	
}
