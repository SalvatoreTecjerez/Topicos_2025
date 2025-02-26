import javax.swing.*;
import javax.swing.border.CompoundBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

									//PASO 1
class VentanaInicio extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	JButton btnSumar, btnRestar;
	JTextField cajaPrimerNumero, cajaSegundoNumero, cajaResultado;
	
	
	public VentanaInicio() {
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("GridBagLayout");
		setSize(250, 400);
		setVisible(true);
		
		JLabel txtTitulo = new JLabel("Calculadora BASICA");
		//txtTitulo.setBackground(Color.GREEN);
		txtTitulo.setBorder(new CompoundBorder( // sets two borders
				BorderFactory.createMatteBorder(10, 10, 10, 10, Color.RED), // outer border
				BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		add(txtTitulo);
		
		JLabel txtPrimerNumero = new JLabel("Ingresa un numero: ");
		add(txtPrimerNumero);
		cajaPrimerNumero = new JTextField(5);
		add(cajaPrimerNumero);
		
		JLabel txtSegundoNumero = new JLabel("Ingresa un numero: ");
		add(txtSegundoNumero);
		cajaSegundoNumero = new JTextField(5);
		add(cajaSegundoNumero);
		
		btnSumar = new JButton(" + ");
		btnSumar.setToolTipText("Sumar");
		btnSumar.addActionListener(this); //PASO 3
		add(btnSumar);
		btnRestar = new JButton(" - ");
		add(btnRestar);
		JButton btnMult = new JButton(" * ");
		add(btnMult);
		JButton btnDividir = new JButton(" / ");
		add(btnDividir);
		JButton btnResiduo = new JButton(" % ");
		add(btnResiduo);
		
		
		JLabel txtResultado = new JLabel("RESULTADO: ");
		txtResultado.setIcon(new ImageIcon("./iconos/logo_tec.png"));
		add(txtResultado);	
		cajaResultado = new JTextField("123456789");
		cajaResultado.setFont(new Font("Roboto",Font.BOLD, 20));
		cajaResultado.setBackground(Color.ORANGE);
		cajaResultado.setEditable(false);
		cajaResultado.setEnabled(false);
		add(cajaResultado);
	}

	//PASO 2
	@Override
	public void actionPerformed(ActionEvent e) {
		//PASO 4: Verificar que componente genero el evento
		
		if(e.getSource() == btnSumar) {
			//System.out.println("fue el boton sumar");
			
			//int -> Integer
			//double -> Double
			
			Double x = Double.parseDouble("2.3");
			//x.to
			
			try {
				cajaResultado.setText(String.valueOf(
			 	Double.parseDouble(cajaPrimerNumero.getText()) +
				Double.parseDouble(cajaSegundoNumero.getText()) ));
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(this, "Solo numeros, SABE!!!");
			}
			
			
			//obtener numeros
			//realizar operacion
			//mostrar el resultado
		}else if(e.getSource() == btnRestar) {
			
		}
		
	}
}

public class PruebaEventos {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
			}
		});

	}
}
