import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

class VentanaInicio extends JFrame implements ActionListener{

	JComboBox<String> comboEstados, comboMunicipios;
	
	public VentanaInicio() {
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("COMBOS DEPENDIENTES");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JLabel txtEstados = new JLabel("Elige ESTADO de nacimiento: ");
		add(txtEstados);
		comboEstados = new JComboBox<String>();
		comboEstados.addItem("Elige una opcion...");
		comboEstados.addItem("Aguascalientes");
		comboEstados.addItem("...");
		comboEstados.addItem("Guanajuato");
		comboEstados.addItem("...");
		comboEstados.addItem("Zacatecas");
		add(comboEstados);
		comboEstados.addActionListener(this);
		
		JLabel txtMunicipio = new JLabel("Elige MUNICIPIO de nacimiento: ");
		add(txtMunicipio);
		comboMunicipios = new JComboBox<String>();
		comboMunicipios.addItem("Elige una opcion...");
		add(comboMunicipios);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == comboEstados) {
			
			String dato = (String)comboEstados.getSelectedItem();
			
			if(dato.equalsIgnoreCase("Guanajuato")) {
				comboMunicipios.removeAllItems();
				comboMunicipios.addItem("Abasolo");
			}else if(dato.equalsIgnoreCase("Zacatecas")) {
				comboMunicipios.removeAllItems();
				comboMunicipios.addItem("Apozol");
			}
		}
	}
}

public class PruebaCombosDependientes {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
			}
		});
	}

}
