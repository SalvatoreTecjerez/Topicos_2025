import javax.swing.border.CompoundBorder;
import javax.swing.*;
import java.awt.*;

class VentanaInicio extends JFrame{
	public VentanaInicio() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Layout NULO");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//agregacion de widgets
		
		JLabel txtTitulo = new JLabel("Calculadora BASICA");
		txtTitulo.setBounds(10, 10, 200, 50);
		//txtTitulo.setBackground(Color.GREEN);
		txtTitulo.setBorder(new CompoundBorder( // sets two borders
				BorderFactory.createMatteBorder(10, 10, 10, 10, Color.RED), // outer border
				BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		add(txtTitulo);
		
		JLabel txtPrimerNumero = new JLabel("Ingresa un numero: ");
		txtPrimerNumero.setBounds(10, 100, 200, 50);
		add(txtPrimerNumero);
		
		JTextField cajaPrimerNumero = new JTextField(5);
		cajaPrimerNumero.setBounds(150, 100, 100, 40);
		add(cajaPrimerNumero);
		
		//....mas codigo  =)
		
		JLabel txtResultado = new JLabel("RESULTADO: ");
		txtResultado.setBounds(10, 250, 130, 20);
		txtResultado.setIcon(new ImageIcon("./iconos/logo_tec.png"));
		add(txtResultado);
		
		JTextField cajaResultado = new JTextField("123456789");
		cajaResultado.setBounds(130, 250, 200, 50);
		
		cajaResultado.setFont(new Font("Roboto",Font.BOLD, 30));
		cajaResultado.setBackground(Color.ORANGE);
		cajaResultado.setEditable(false);
		cajaResultado.setEnabled(false);
		add(cajaResultado);
	}
}


public class PruebaLayoutNulo {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
			}
		});
	}

}
