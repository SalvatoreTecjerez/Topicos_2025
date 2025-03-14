
/*
 * 	TIPOS DE VARIABLE EN JAVA
 * 
 * 		1) Primitivas
 * 
 * 			TIPOS DE DATOS PRIMITIVOS
 * 
 * 				byte, short, int, long, float, double, char, boolean
 * 
 * 		2) REFERENCIA
 * 
 * 				Objetos (String, Array, Alumno, Perro......)
 * 
 * 
 * 	TIPOS DE VARIABLE POR SU AMBITO DE VIDA
 * 
 * 		1) Bloque
 * 		2) Locales
 * 		3) Instancia
 * 		4) Estaticas (Variables de CLASE)
 * 
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class VentanaInicio extends JFrame implements ActionListener{
	
	JButton btnRestablecer;
	
	JTextField cajaNombre;
	JPasswordField cajaContrasenia;
	JComboBox<String> comboEdad;
	
	public VentanaInicio() {
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Mi primera vez");
		setSize(180, 400);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//Agregar WIDGETS (componentes graficos)
		/*
		 * 1) Crear instancia del componente
		 * 2) Configurarlo
		 * 3) Agregarlo al JFRAME
		 */
		JLabel txtTitulo = new JLabel();
		txtTitulo.setText("Ejemplo de WIDGETS");
		add(txtTitulo);
		
		JLabel txtNombre = new JLabel("Nombre: ");
		add(txtNombre);
		cajaNombre = new JTextField(5);
		cajaNombre.setBackground(new Color(50, 100, 55));
		add(cajaNombre);
	
		JLabel txtContrasenia = new JLabel("Contrasenia: ");
		add(txtContrasenia);
		cajaContrasenia = new JPasswordField(5);
		cajaContrasenia.setBackground(Color.YELLOW);
		add(cajaContrasenia);
		
		
		JLabel txtEdad = new JLabel("Selecciona tu edad: ");
		add(txtEdad);
		comboEdad = new JComboBox<>();
		comboEdad.addItem("Elige opcion...");
		comboEdad.addItem("1");
		comboEdad.addItem("2");
		comboEdad.addItem("3");
		add(comboEdad);
		
		JLabel txtSemestre = new JLabel("Elige tu semestre: ");
		add(txtSemestre);
		
		String numeros[] = {"1", "2", "3"};
		SpinnerListModel modeloDatos = new SpinnerListModel(numeros);
		JSpinner spinnerSemestre = new JSpinner(modeloDatos);
		//spinnerSemestre.setEnabled(false);
		add(spinnerSemestre);
		
		JLabel txtCarrera = new JLabel("Elige tu carrera: ");
		add(txtCarrera);
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton radioISC = new JRadioButton("ISC");
		radioISC.setSelected(true);
		bg.add(radioISC);
		add(radioISC);
		JRadioButton radioIM= new JRadioButton("IM");
		bg.add(radioIM);
		add(radioIM);
		JRadioButton radioIIA = new JRadioButton("IIA");
		bg.add(radioIIA);
		add(radioIIA);
		
		JLabel txtActividades = new JLabel("Elige Actividades Extraescolares: ");
		add(txtActividades);
		JCheckBox checkboxDeportes = new JCheckBox("Deportes");
		add(checkboxDeportes);
		JCheckBox checkboxMusica = new JCheckBox("Musica");
		add(checkboxMusica);
		JCheckBox checkboxDanza = new JCheckBox("Danza");
		add(checkboxDanza);
		
		JButton btnCancelar = new JButton("Cancelar");
		add(btnCancelar);
		
		btnRestablecer = new JButton("Restablecer");
		add(btnRestablecer);
		btnRestablecer.addActionListener(this);
		JButton btnAceptar = new JButton("ACEPTAR >>");
		add(btnAceptar);
	}//constructor

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnRestablecer) {
			int respuesta = JOptionPane.showConfirmDialog(this, 
					"Deseas realmente borar la info");
			System.out.println(respuesta);
			if(respuesta==0) {
				cajaNombre.setText("");
				
				
				metodoMagicoQueRestableceCosasPorMi(cajaNombre, cajaContrasenia, comboEdad);
			}
		}
		
	}//actionPerformed
	
	/* VARARGS -> Argumentos variables
	 * 
	 * 		TipoDato ... conjuntoDatos
	 * 
	 */
	
	public void metodoMagicoQueRestableceCosasPorMi(JComponent...componentes) {
	
		//en Java es ENHACEMENT FOR  (FOREACH)
		
		for( JComponent c : componentes ) {
			System.out.println(c);
			if(c instanceof JTextField)
				((JTextField) c).setText("");
			else if(c instanceof JComboBox)
				((JComboBox) c).setSelectedIndex(0);
		}
		
	}
	
}//class

public class PruebaBotonRestablecer {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
			}
		});
	}
}
