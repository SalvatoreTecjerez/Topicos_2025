
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class VentanaInicio extends JFrame implements ActionListener{

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
		checkTodos.addActionListener(this);

		ButtonGroup bg1 = new ButtonGroup();

		radioMillas = new JRadioButton("     Millas     ");
		add(radioMillas);
		bg1.add(radioMillas);
		cajaResultadoM = new JTextField("", 5);
		add(cajaResultadoM);
		radioMillas.addActionListener(this);

		radioPies = new JRadioButton("     Pies     ");
		add(radioPies);    	
		bg1.add(radioPies);
		cajaResultadoPies = new JTextField("", 5);
		add(cajaResultadoPies);
		radioPies.addActionListener(this);

		radioPulgadas = new JRadioButton("Pulgadas");
		add(radioPulgadas);
		bg1.add(radioPulgadas);
		radioPulgadas.addActionListener(this);

		cajaResultadoPulgadas = new JTextField("", 5);
		add(cajaResultadoPulgadas);
		
		btn = new JButton("CONVERTIR");
		add(btn);
		btn.addActionListener(this);
		

	}//constructor

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object componente = e.getSource();
		
		if(componente == btn) {
			
			if(radioMillas.isSelected()) {
				cajaResultadoM.setText("millas");
			}
			
		}else if(componente == radioPies) {
			cajaResultadoM.setText("");
			cajaResultadoPulgadas.setText("");
		}else  if(componente == checkTodos) {
			cajaResultadoM.setText("100");
			cajaResultadoPies.setText("100");
			cajaResultadoPulgadas.setText("100");
		}
		
	}//actionPerfomed


}//class


public class PruebaCheckboxRadiobutton {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
			}
		});
	}

}
