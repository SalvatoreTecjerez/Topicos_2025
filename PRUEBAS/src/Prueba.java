
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class VentanaInicio extends JFrame  {

	private JRadioButton radioMillas, radioPies, radioPulgadas;
	private JCheckBox checkTodos;
	private JLabel etiquetaKm, etiquetaResultado;
	private JTextField cajaKm, cajaResultadoM, cajaResultadoPies, cajaResultadoPulgadas;

	private JButton btn;
	
	public VentanaInicio() {
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Evento COMBO");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setVisible(true);

		//configuracion de la ventana principal (JFrame)-------------------------------------------
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Ejemplo Eventos RadioButtons - Checkboxes");
		getContentPane().setLayout( new FlowLayout() );
		setSize(200, 300);
		setLocationRelativeTo(null); // deber ir despues del metodo setSize
		setVisible(true);

		//AGREGAR DE COMPONENTES AL JFRAME--------------------------------------------------
		etiquetaKm = new JLabel("Ingresa Kilometros");
		add(etiquetaKm);

		cajaKm = new JTextField("70", 10);
		cajaKm.setHorizontalAlignment(JTextField.RIGHT);
		add(cajaKm);

		checkTodos = new JCheckBox(" <<< TODOS >>>");
		add(checkTodos);

		ButtonGroup bg1 = new ButtonGroup();

		radioMillas = new JRadioButton("     Millas     ");

		add(radioMillas);
		bg1.add(radioMillas);
		cajaResultadoM = new JTextField("", 5);
		add(cajaResultadoM);

		radioPies = new JRadioButton("     Pies     ");

		add(radioPies);    	
		bg1.add(radioPies);
		cajaResultadoPies = new JTextField("", 5);
		add(cajaResultadoPies);


		radioPulgadas = new JRadioButton("Pulgadas");
		add(radioPulgadas);
		bg1.add(radioPulgadas);


		cajaResultadoPulgadas = new JTextField("", 5);
		add(cajaResultadoPulgadas);
		
		btn = new JButton("OK");
		add(btn);

		

	}//constructor

}//class


public class Prueba {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
			}
		});
	}

}
