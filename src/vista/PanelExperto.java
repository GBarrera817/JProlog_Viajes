package vista;

import javax.swing.*;
import java.awt.*;

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
	private JComboBox comboBox;
	private JButton button_1;
	private JLabel lblPrecio_1;
	private JTextField textField_6;
	private JLabel lblNewLabel;
	
	
	public PanelExperto() {
		initComponents();
	}
	
	
	private void initComponents() {
		setLayout(null);
		
		lblMduloExperto = new JLabel("M\u00F3dulo Experto");
		lblMduloExperto.setHorizontalAlignment(SwingConstants.CENTER);
		lblMduloExperto.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblMduloExperto.setBounds(319, 11, 186, 27);
		add(lblMduloExperto);
		
		lblDistancia = new JLabel("Agregar distancia: ");
		lblDistancia.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblDistancia.setBounds(37, 76, 129, 17);
		add(lblDistancia);
		
		textField = new JTextField();
		this.textField.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		textField.setBounds(165, 111, 102, 20);
		add(textField);
		textField.setColumns(10);
		
		lblOrigen = new JLabel("Localidad de origen:");
		this.lblOrigen.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblOrigen.setBounds(36, 113, 119, 14);
		add(lblOrigen);
		
		lblDestino = new JLabel("Localidad de destino: ");
		this.lblDestino.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblDestino.setBounds(37, 138, 118, 14);
		add(lblDestino);
		
		textField_1 = new JTextField();
		this.textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		textField_1.setBounds(165, 135, 102, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		lblDistancia_1 = new JLabel("Distancia: ");
		this.lblDistancia_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblDistancia_1.setBounds(37, 163, 63, 14);
		add(lblDistancia_1);
		
		textField_2 = new JTextField();
		this.textField_2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		textField_2.setBounds(165, 161, 102, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		lblKm = new JLabel("km");
		this.lblKm.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblKm.setBounds(277, 164, 33, 14);
		add(lblKm);
		
		btnAgregarHecho = new JButton("Agregar hecho");
		this.btnAgregarHecho.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnAgregarHecho.setBounds(97, 198, 117, 23);
		add(btnAgregarHecho);
		
		separator = new JSeparator();
		this.separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(302, 76, 8, 202);
		add(separator);
		
		lblAgregarPasajes = new JLabel("Agregar pasajes: ");
		lblAgregarPasajes.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblAgregarPasajes.setBounds(319, 75, 118, 17);
		add(lblAgregarPasajes);
		
		lblLocalidadDeOrigen_1 = new JLabel("Localidad de origen:");
		this.lblLocalidadDeOrigen_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblLocalidadDeOrigen_1.setBounds(319, 111, 118, 14);
		add(lblLocalidadDeOrigen_1);
		
		textField_3 = new JTextField();
		this.textField_3.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		textField_3.setColumns(10);
		textField_3.setBounds(439, 107, 105, 20);
		add(textField_3);
		
		lblPrecio = new JLabel("Precio: $");
		this.lblPrecio.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblPrecio.setBounds(319, 139, 53, 14);
		add(lblPrecio);
		
		textField_4 = new JTextField();
		this.textField_4.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		textField_4.setColumns(10);
		textField_4.setBounds(439, 136, 105, 20);
		add(textField_4);
		
		button = new JButton("Agregar hecho");
		this.button.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		button.setBounds(373, 198, 117, 23);
		add(button);
		
		separator_1 = new JSeparator();
		this.separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(554, 76, 8, 202);
		add(separator_1);
		
		lblAgregarLocalidad = new JLabel("Agregar Hostal: ");
		lblAgregarLocalidad.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblAgregarLocalidad.setBounds(572, 76, 105, 17);
		add(lblAgregarLocalidad);
		
		lblLocalidadDeOrigen = new JLabel("Localidad de origen:");
		this.lblLocalidadDeOrigen.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblLocalidadDeOrigen.setBounds(564, 111, 113, 14);
		add(lblLocalidadDeOrigen);
		
		textField_5 = new JTextField();
		this.textField_5.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		textField_5.setColumns(10);
		textField_5.setBounds(684, 111, 98, 20);
		add(textField_5);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Camping", "Hostal", "Hotel"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(684, 136, 86, 20);
		add(comboBox);
		
		button_1 = new JButton("Agregar hecho");
		this.button_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		button_1.setBounds(621, 199, 117, 23);
		add(button_1);
		
		lblPrecio_1 = new JLabel("Precio: $");
		this.lblPrecio_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblPrecio_1.setBounds(568, 164, 63, 14);
		add(lblPrecio_1);
		
		textField_6 = new JTextField();
		this.textField_6.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		textField_6.setColumns(10);
		textField_6.setBounds(684, 161, 86, 20);
		add(textField_6);
		
		this.lblNewLabel = new JLabel("Tipo: ");
		this.lblNewLabel.setBounds(574, 139, 46, 14);
		add(this.lblNewLabel);
	}


}
