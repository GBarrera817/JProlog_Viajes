package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.JSeparator;
import com.toedter.calendar.JCalendar;
import modelo.Prolog;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class PanelViaje extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JComboBox<String> cbHospedaje;
	private JComboBox<String> cbDestinoViaje;
	private JTextArea resultadoViaje;
	private JTextArea resultadoPasaje;
	private JComboBox<String> cbDestinoPasaje;
	private JButton btnPasaje;
	private JButton btnviaje;
	private JSpinner spinDias;
	private Prolog conocimiento;
	
	
	public PanelViaje(Prolog conocimiento){
		
		this.conocimiento = conocimiento;
		
		setLayout(null);
		
		JLabel label = new JLabel("Planficador de viaje");
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(289, 22, 216, 25);
		add(label);
		
		JLabel label_1 = new JLabel("Destino");
		label_1.setBounds(54, 78, 46, 14);
		add(label_1);
		
		cbDestinoViaje = new JComboBox<String>();
		cbDestinoViaje.setModel(new DefaultComboBoxModel<String>(new String[] {"altovalsol", "andacollo", "coquimbo", "el_islon", "el_penon", "guachalalume", "guampulla", "hurtado", "la_fundida", "la_serena", "las_rojas", "pan_de_azucar", "penuela", "pichasca", "placilla", "samo_alto", "vicuna"}));
		cbDestinoViaje.setSelectedIndex(1);
		cbDestinoViaje.setBounds(54, 103, 140, 20);
		add(cbDestinoViaje);
		
		JLabel label_2 = new JLabel("Hospedaje");
		label_2.setBounds(260, 78, 61, 14);
		add(label_2);
		
		cbHospedaje = new JComboBox<String>();
		cbHospedaje.setModel(new DefaultComboBoxModel<String>(new String[] {"camping", "hostal", "hotel"}));
		cbHospedaje.setSelectedIndex(1);
		cbHospedaje.setBounds(258, 103, 140, 20);
		add(cbHospedaje);
		
		JLabel label_3 = new JLabel("Dias");
		label_3.setBounds(455, 78, 46, 14);
		add(label_3);
		
		spinDias = new JSpinner();
		spinDias.setBounds(455, 103, 46, 20);
		add(spinDias);
		
		btnviaje = new JButton("consultar");
		btnviaje.addActionListener(this);
		btnviaje.setBounds(242, 147, 89, 23);
		add(btnviaje);
		
		resultadoViaje = new JTextArea();
		resultadoViaje.setBorder(new TitledBorder(null, "Resultados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		resultadoViaje.setBounds(54, 204, 449, 71);
		add(resultadoViaje);
		
		JLabel label_4 = new JLabel("Consulta pasaje");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_4.setBounds(289, 306, 179, 25);
		add(label_4);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 286, 760, 9);
		add(separator);
		
		JCalendar calendar = new JCalendar();
		calendar.setBorder(new LineBorder(new Color(0, 0, 0)));
		calendar.setBounds(546, 90, 184, 153);
		add(calendar);
		
		JLabel label_5 = new JLabel("Destino");
		label_5.setBounds(54, 345, 46, 14);
		add(label_5);
		
		resultadoPasaje = new JTextArea();
		resultadoPasaje.setBorder(new TitledBorder(null, "Resultados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		resultadoPasaje.setBounds(411, 354, 302, 71);
		add(resultadoPasaje);
		
		btnPasaje = new JButton("consultar");
		btnPasaje.addActionListener(this);
		btnPasaje.setBounds(260, 369, 89, 23);
		add(btnPasaje);
		
		cbDestinoPasaje = new JComboBox<String>();
		cbDestinoPasaje.setModel(new DefaultComboBoxModel<String>(new String[] {"altovalsol", "andacollo", "coquimbo", "el_islon", "el_penon", "guachalalume", "guampulla", "hurtado", "la_fundida", "la_serena", "las_rojas", "pan_de_azucar", "penuela", "pichasca", "placilla", "samo_alto", "vicuna"}));
		cbDestinoPasaje.setSelectedIndex(1);
		cbDestinoPasaje.setBounds(54, 370, 140, 20);
		add(cbDestinoPasaje);
	}


	public void actionPerformed(ActionEvent e) {
		
		Object evento = e.getSource();
		
		if (evento == btnviaje){
			consultaViaje();
		}
		
		if (evento == btnPasaje){
			consultaPasaje();
		}
	}
	
	private void consultaViaje(){
		
		//viaje(Destino,Dias,Hospedaje,Costo).
		
		String destino = cbDestinoViaje.getSelectedItem().toString();
		String hospedaje = cbHospedaje.getSelectedItem().toString();
		String dias = spinDias.getValue().toString();
		
		destino = conocimiento.txtToProlog(destino);
		hospedaje = conocimiento.txtToProlog(hospedaje);
		
		String consulta = "viaje("+destino+","+dias+","+hospedaje+",Costo).";
		String respuesta = conocimiento.consulta(consulta);
		
		if (respuesta.equalsIgnoreCase("false")){
			respuesta.concat("\nNo existe alternativa para este viaje...");
		}else{
			resultadoViaje.setText(respuesta); 
		}
	}
	
	private void consultaPasaje(){
		
		//transporte(Localidad,Precio).
		
		String destino = cbDestinoPasaje.getSelectedItem().toString();
		
		destino = conocimiento.txtToProlog(destino);
		
		String consulta = "transporte("+destino+",Precio).";
		String respuesta = conocimiento.consulta(consulta);
		
		if (respuesta.equalsIgnoreCase("false")){
			respuesta.concat("\nNo existe pasaje para este viaje...");
		}else{
			resultadoViaje.setText(respuesta); 
		}
	}
}
