import javax.swing.*;
import javax.swing.border.CompoundBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

								
class VentanaInicio extends JFrame implements ActionListener, KeyListener {

	private static final long serialVersionUID = 1L;

	JButton btnSumar, btnRestar;
	JTextField cajaPrimerNumero, cajaSegundoNumero, cajaResultado;
	
	CalculadoraSencilla cs = new CalculadoraSencilla();
	
	
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
		cajaPrimerNumero.addActionListener(this);	
		cajaPrimerNumero.addKeyListener(this);
		
		
		JLabel txtSegundoNumero = new JLabel("Ingresa un numero: ");
		add(txtSegundoNumero);
		cajaSegundoNumero = new JTextField(5);
		add(cajaSegundoNumero);
		
		btnSumar = new JButton(" + ");
		btnSumar.setToolTipText("Sumar");
		add(btnSumar);
		btnSumar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
						
				try {
					cajaResultado.setText(
						String.valueOf(
						cs.realizarSuma( 
						Double.parseDouble(cajaPrimerNumero.getText()),
						Double.parseDouble(cajaSegundoNumero.getText())
						)));
				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "Solo se permiten numeros");
				}
				
				
				
			}
		});
		
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


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cajaPrimerNumero) {
			JOptionPane.showMessageDialog(this, "Magia magia");
		}
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		
		//JOptionPane.showMessageDialog(this, "Presionaste tecla");
		//JOptionPane.showMessageDialog(this, e.getKeyChar() + "\n" + e.getKeyCode()
		//									+ "\n" + e.getKeyLocation());
		
		
		char c = e.getKeyChar();
		if(c<'0' || c>'9')
			e.consume();
		System.out.println(Character.isDigit(c));
	}
}

public class PruebaEventosTeclado {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
			}
		});

	}
}