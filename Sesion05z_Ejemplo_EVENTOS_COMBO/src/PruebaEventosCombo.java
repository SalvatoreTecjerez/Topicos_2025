import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class VentanaInicio extends JFrame{

	JTextField cajaGradosC, cajaRes;
	JComboBox<String> comboTemp, comboTemp2;
	JButton btnConvertir;

	ConversorTemperaturas obj = new ConversorTemperaturas();

	String temps[] = {"ºC", "ºF", "ºK", "ºR"};
	
	
	public VentanaInicio() {
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Evento COMBO");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setVisible(true);

		JLabel txtConversor = new JLabel("----- Conversor TEMPERTURAS----");
		add(txtConversor);

		cajaGradosC = new JTextField(5);
		add(cajaGradosC);

	
		JLabel lblConvertirA = new JLabel("ºC - Convertir a: ");
		add(lblConvertirA);
		
		comboTemp2 = new JComboBox<>();
		comboTemp2.addItem("Elige opcion...");
		comboTemp2.addItem("ºF");
		comboTemp2.addItem("ºK");
		comboTemp2.addItem("ºR");
		add(comboTemp2);
	
		
		btnConvertir = new JButton("CONVERTIR");
		add(btnConvertir);
		btnConvertir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. Obtener Celcius y conversion 
				// 2. VERIFICAR A que tipo de temperatura se realizara la conversion
				// 3. Realizar la conversion y mostrar el resultado
				
				double gradosC = Double.parseDouble(cajaGradosC.getText());
				
				System.out.println(comboTemp2.getSelectedIndex());
				System.out.println(comboTemp2.getSelectedItem());
				
				if(comboTemp2.getSelectedIndex()==1) {
					System.out.println("Conversion a F");
				}
				
			}
		});

		cajaRes = new JTextField(5);
		add(cajaRes);

	}


}
public class PruebaEventosCombo {

		public static void main(String[] args) {
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					new VentanaInicio();
				}
			});
		}

}
