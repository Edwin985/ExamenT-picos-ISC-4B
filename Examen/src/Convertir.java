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
	private JTextField diasR;
	private JTextField horasR;
	private JTextField minutosR;
	private JTextField segundosR;
	 private JButton btnAceptar;
	 private JTextField R;
	 public Convertir (String titulo) {
		 Container contenedorPrincipal = this.getContentPane();
		 this.setTitle(titulo);
	     this.setResizable(true);
	     this.setLayout(new GridBagLayout());
		 getContentPane().setBackground(Color.YELLOW);
	     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     
	     
	     //restricciones
	     GridBagConstraints restricciones = new GridBagConstraints();
	     
	     
	     //campo de dias
	     diasR = new JTextField("                          ");
	     restricciones.gridx = 1;//columna
	 	 restricciones.gridy = 0;//fila
	 	 restricciones.gridwidth = 1;//anchura en celdas
		 restricciones.gridheight = 1;//altura en celdas
		 restricciones.weightx = 1;//Para redimiensionar
		 restricciones.weighty = 1;//Para redimensionar
		 restricciones.fill = GridBagConstraints.BOTH;//Rellenamiento mediante la redmiension que se le de
		 restricciones.anchor = GridBagConstraints.CENTER;//posición dependiendo el tamaño de su columna
	     contenedorPrincipal.add(diasR, restricciones);
	     JLabel lblDias = new JLabel("Días: ");
	     restricciones.gridx = 0;//columna
		 restricciones.gridy = 0;//fila
		 restricciones.gridwidth = 1;//anchura en celdas
		 restricciones.gridheight = 1;//altura en celdas
		 restricciones.weightx = 1;//Para redimiensionar
		 restricciones.weighty = 1;//Para redimensionar
		 restricciones.fill = GridBagConstraints.BOTH;//Rellenamiento mediante la redmiension que se le de
		 restricciones.anchor = GridBagConstraints.CENTER;//posición dependiendo el tamaño de su columna
		 contenedorPrincipal.add(lblDias, restricciones);
		 
		 
		//campo de horas
		 horasR = new JTextField("                          ");
	     restricciones.gridx = 1;//columna
	 	 restricciones.gridy = 1;//fila
	 	 restricciones.gridwidth = 1;//anchura en celdas
		 restricciones.gridheight = 1;//altura en celdas
		 restricciones.weightx = 1;//Para redimiensionar
		 restricciones.weighty = 1;//Para redimensionar
		 restricciones.fill = GridBagConstraints.BOTH;//Rellenamiento mediante la redmiension que se le de
		 restricciones.anchor = GridBagConstraints.CENTER;//posición dependiendo el tamaño de su columna
	     contenedorPrincipal.add(horasR, restricciones);
	     JLabel lblHoras = new JLabel("Horas: ");
	     restricciones.gridx = 0;//columna
		 restricciones.gridy = 1;//fila
		 contenedorPrincipal.add(lblHoras, restricciones);
		 
		 
		//campo de minutos
		 minutosR = new JTextField("                          ");
	     restricciones.gridx = 1;//columna
	 	 restricciones.gridy = 2;//fila
	     contenedorPrincipal.add(minutosR, restricciones);
	     JLabel lblMinutos = new JLabel("Minutos: ");
	     restricciones.gridx = 0;//columna
		 restricciones.gridy = 2;//fila
		 contenedorPrincipal.add(lblMinutos, restricciones);
		 
		 
		//campo de segundos
		 segundosR = new JTextField("                          ");
	     restricciones.gridx = 1;//columna
	 	 restricciones.gridy = 3;//fila
	     contenedorPrincipal.add(segundosR, restricciones);
	     JLabel lblSegundos = new JLabel("Segundos: ");
	     restricciones.gridx = 0;//columna
		 restricciones.gridy = 3;//fila
		 contenedorPrincipal.add(lblSegundos, restricciones);
		 
		 
		 //Campo aceptar
		 btnAceptar = new JButton("Aceptar");
		 restricciones.gridx = 0;//columna
		 restricciones.gridy = 4;//fila
		 contenedorPrincipal.add(btnAceptar, restricciones);
		 R = new JTextField("                          ");
	     restricciones.gridx = 1;//columna
	 	 restricciones.gridy = 4;//fila
	     contenedorPrincipal.add(R, restricciones);
	     
	     
	     //CreaciÃ³n de oyentes
	        AccionBoton oyenteBtnAceptar = new AccionBoton();
	      //Vincular oyente al componente
	        btnAceptar.addActionListener(oyenteBtnAceptar);
	 }
	 public static void main(String[] args)
	    {
	        Convertir ventana = new Convertir("EXAMEN");
	        ventana.setLocation(200,100);
	        ventana.pack();
	        ventana.setSize(400,200);
	        ventana.setVisible(true);
	        
			
	    }
	 class AccionBoton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String dato;
			dato = R.getText();
			double datoDouble = Double.parseDouble(dato)/86400;
			String datoString = String.valueOf(datoDouble);
			diasR.setText(datoString);
			
			String dato2;
			dato2 = R.getText();
			double datoDouble2 = Math.floor((Double.parseDouble(dato2)%86400) / 3600);
			String datoString2 = String.valueOf(datoDouble2);
			horasR.setText(datoString2);
			
			String dato3;
			dato3 = R.getText();
			double datoDouble3 = Math.floor(((Double.parseDouble(dato3)%86400) % 3600) / 60);
			String datoString3 = String.valueOf(datoDouble3);
			minutosR.setText(datoString3);
			
			String dato4;
			dato4 = R.getText();
			double datoDouble4 = ((Double.parseDouble(dato4)%86400)%3600) % 60;
			String datoString4 = String.valueOf(datoDouble4);
			segundosR.setText(datoString4);
			
		}
		 
	 }
	
}
