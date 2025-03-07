import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

class VentanaInicio extends JFrame implements ActionListener{

	
	JMenu menuAlumnos, menuAsignaturas, menuConsultas;
	JMenuItem itemAltas, itemBajas, itemCambios;
	JInternalFrame IF_Altas;
	
	public VentanaInicio() {
		getContentPane().setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Menus e InternalFrames");
		setSize(700, 700);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//--------------- MENU ---------------
		JMenuBar menuBar = new JMenuBar();
			menuAlumnos = new JMenu("Alumnos");
			menuAlumnos.setMnemonic(KeyEvent.VK_A);
			//menuAlumnos.setAccelerator(
					//KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
			
				itemAltas = new JMenuItem("Agregar");
				itemAltas.setMnemonic(KeyEvent.VK_E);
				itemAltas.setAccelerator(
					KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
				itemAltas.setIcon(new ImageIcon("./imagenes/save.png"));
				menuAlumnos.add(itemAltas);
				itemAltas.addActionListener(this);
				
				itemBajas = new JMenuItem("Eliminar");
				menuAlumnos.add(itemBajas);
				
				itemCambios = new JMenuItem("Modificar");
				menuAlumnos.add(itemCambios);
				
				menuAlumnos.addSeparator();
				
				menuConsultas = new JMenu("Buscar");
					menuConsultas.add(new JMenuItem("Busqueda normal"));
					menuConsultas.add(new JMenuItem("Busqueda avanzada"));
				menuAlumnos.add(menuConsultas);
		
				
			menuBar.add(menuAlumnos);
			
			menuAsignaturas = new JMenu("Asignaturas");
			menuBar.add(menuAsignaturas);
			
		setJMenuBar(menuBar);
		
		JToolBar toolBar = new JToolBar();
			JButton btnToolBarGuardar = new JButton();
			btnToolBarGuardar.setIcon(new ImageIcon("./imagenes/save.png"));
			toolBar.add(btnToolBarGuardar);
			btnToolBarGuardar.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Magia Magia");
				}
			});
			
			JButton btnToolBarEliminar = new JButton();
			btnToolBarEliminar.setIcon(new ImageIcon("./imagenes/delete.png"));
			toolBar.add(btnToolBarEliminar);
		
		add(toolBar, BorderLayout.PAGE_START);
		
		//------------------INTERNALFRAMES --------------------------
		JDesktopPane desktopPane = new JDesktopPane();
		
			IF_Altas = new JInternalFrame();
			IF_Altas.setSize(400, 200);
			//IF_Altas.setVisible(true);
			IF_Altas.setClosable(true);
			IF_Altas.setMaximizable(true);
			IF_Altas.setIconifiable(true);
			IF_Altas.setResizable(true);
			IF_Altas.setDefaultCloseOperation(HIDE_ON_CLOSE);
			//IF_Altas.getContentPane().setLayout(new FlowLayout());
			
				JPanel panel1 =  new JPanel();
				panel1.setLayout(new FlowLayout());
				panel1.setBackground(Color.YELLOW);
				panel1.add(new JLabel("----- Datos Personales -----"));
				panel1.add(new JLabel("Nombre: "));
				panel1.add(new JTextField(5));
			IF_Altas.add(panel1, BorderLayout.NORTH);
				JPanel panel2 =  new JPanel();
				panel2.setLayout(new FlowLayout());
				panel2.setBackground(Color.GREEN);
				panel2.add(new JLabel("----- Datos Academicos -----"));
				panel2.add(new JLabel("Numero de control: "));
				panel2.add(new JTextField(5));
				
				String [][] rowData = {{"01", "Liuke", "Skywalker", "50", "10", "ISC"},
						{"01", "Liuke", "Skywalker", "50", "10", "ISC"},
						{"01", "Liuke", "Skywalker", "50", "10", "ISC"},
						{"01", "Liuke", "Skywalker", "50", "10", "ISC"}};
				
				String[] columNames = {"Num. Control", "Nombre", "Primer Ap.",
						"Edad", "Semestre", "Carrera"};
				
				JTable tabla1 = new JTable(rowData, columNames);
				//tabla1.set
				panel2.add(tabla1);
				
			IF_Altas.add(panel2, BorderLayout.CENTER);
			
			IF_Altas.add(new Panel().add(new JButton("GUARDAR")), BorderLayout.SOUTH);
				
		desktopPane.add(IF_Altas);
		
		add(desktopPane, BorderLayout.CENTER);
		
	}//constructor

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==itemAltas) {
			IF_Altas.setVisible(true);
		}
		
	}
}


public class PruebaMenusInternalFrames {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
			}
		});
	}

}
