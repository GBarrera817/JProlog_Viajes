package vista;

import javax.swing.*;
import java.awt.Font;

/**
 * Creado por Gabriela Barrera el 10-11-2016.
 * Proyecto: JProlog_Viajes
 */
public class PanelExperto extends JPanel {
	
	private JLabel lblMduloExperto;
	private JLabel lblDistancia;
	private JTextField textField;
	private JLabel lblOrigen;
	private JLabel lblDestino;
	private JTextField textField_1;
	private JLabel lblDistancia_1;
	private JTextField textField_2;
	private JLabel lblKm;
	private JButton btnAgregarHecho;
	private JSeparator separator;
	private JLabel lblAgregarPasajes;
	private JLabel lblLocalidadDeOrigen_1;
	private JTextField textField_3;
	private JLabel lblPrecio;
	private JTextField textField_4;
	private JButton button;
	private JSeparator separator_1;
	private JLabel lblAgregarLocalidad;
	private JLabel lblLocalidadDeOrigen;
	private JTextField textField_5;
	private JLabel lblTipo;
	private JComboBox comboBox;
	private JButton button_1;
	private JLabel lblPrecio_1;
	private JTextField textField_6;
	
	
	public PanelExperto() {
		initComponents();
	}
	
	
	private void initComponents() {
		setLayout(null);
		
		lblMduloExperto = new JLabel("M\u00F3dulo Experto");
		lblMduloExperto.setHorizontalAlignment(SwingConstants.CENTER);
		lblMduloExperto.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMduloExperto.setBounds(319, 27, 186, 20);
		add(lblMduloExperto);
		
		lblDistancia = new JLabel("Agregar distancia: ");
		lblDistancia.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDistancia.setBounds(37, 59, 146, 17);
		add(lblDistancia);
		
		textField = new JTextField();
		textField.setBounds(148, 93, 88, 20);
		add(textField);
		textField.setColumns(10);
		
		lblOrigen = new JLabel("Localidad de origen:");
		lblOrigen.setBounds(36, 96, 102, 14);
		add(lblOrigen);
		
		lblDestino = new JLabel("Localidad de destino: ");
		lblDestino.setBounds(246, 96, 105, 14);
		add(lblDestino);
		
		textField_1 = new JTextField();
		textField_1.setBounds(361, 93, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		lblDistancia_1 = new JLabel("Distancia: ");
		lblDistancia_1.setBounds(469, 96, 64, 14);
		add(lblDistancia_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(532, 93, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		lblKm = new JLabel("km");
		lblKm.setBounds(628, 96, 46, 14);
		add(lblKm);
		
		btnAgregarHecho = new JButton("Agregar hecho");
		btnAgregarHecho.setBounds(672, 92, 117, 23);
		add(btnAgregarHecho);
		
		separator = new JSeparator();
		separator.setBounds(10, 149, 779, 2);
		add(separator);
		
		lblAgregarPasajes = new JLabel("Agregar pasajes: ");
		lblAgregarPasajes.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAgregarPasajes.setBounds(37, 176, 146, 17);
		add(lblAgregarPasajes);
		
		lblLocalidadDeOrigen_1 = new JLabel("Localidad de origen:");
		lblLocalidadDeOrigen_1.setBounds(36, 224, 102, 14);
		add(lblLocalidadDeOrigen_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(148, 221, 105, 20);
		add(textField_3);
		
		lblPrecio = new JLabel("Precio: $");
		lblPrecio.setBounds(263, 224, 53, 14);
		add(lblPrecio);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(326, 221, 86, 20);
		add(textField_4);
		
		button = new JButton("Agregar hecho");
		button.setBounds(672, 220, 117, 23);
		add(button);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(10, 280, 779, 2);
		add(separator_1);
		
		lblAgregarLocalidad = new JLabel("Agregar Hostal: ");
		lblAgregarLocalidad.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAgregarLocalidad.setBounds(37, 307, 146, 17);
		add(lblAgregarLocalidad);
		
		lblLocalidadDeOrigen = new JLabel("Localidad de origen:");
		lblLocalidadDeOrigen.setBounds(37, 357, 101, 14);
		add(lblLocalidadDeOrigen);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(148, 354, 98, 20);
		add(textField_5);
		
		lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(256, 357, 40, 14);
		add(lblTipo);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Camping", "Hostal", "Hotel"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(296, 354, 86, 20);
		add(comboBox);
		
		button_1 = new JButton("Agregar hecho");
		button_1.setBounds(672, 353, 117, 23);
		add(button_1);
		
		lblPrecio_1 = new JLabel("Precio: $");
		lblPrecio_1.setBounds(412, 357, 46, 14);
		add(lblPrecio_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(469, 354, 86, 20);
		add(textField_6);
	}
}
