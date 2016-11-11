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
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class PanelViaje extends JPanel implements ActionListener {
    private JComboBox<String> hospedaje;
    private JComboBox<String> destinoViaje;
    private JTextArea resultadoViaje;
    private JTextArea resultadoPasaje;
    private JComboBox<String> destinoPasaje;
    private JButton btnPasaje;
    private JButton btnviaje;
    private JSpinner dias;

    public PanelViaje() {

        setLayout(null);

        JLabel label = new JLabel("Planificador de viaje");
        label.setFont(new Font("Tahoma", Font.BOLD, 20));
        label.setBounds(289, 22, 216, 25);
        add(label);

        JLabel label_1 = new JLabel("Destino");
        label_1.setBounds(54, 78, 46, 14);
        add(label_1);

        destinoViaje = new JComboBox<String>();
        destinoViaje.setModel(new DefaultComboBoxModel(new String[] {"altovalsol", "andacollo", "coquimbo", "el_islon", "el_penon", "guachalalume", "guampulla", "hurtado", "la_fundida", "la_serena", "las_rojas", "pan_de_azucar", "penuela", "pichasca", "placilla", "samo_alto", "vicuna"}));
        destinoViaje.setSelectedIndex(1);
        destinoViaje.setBounds(54, 103, 140, 20);
        add(destinoViaje);

        JLabel label_2 = new JLabel("Hospedaje");
        label_2.setBounds(260, 78, 61, 14);
        add(label_2);

        hospedaje = new JComboBox<String>();
        hospedaje.setModel(new DefaultComboBoxModel(new String[] {"camping", "hostal", "hotel"}));
        hospedaje.setSelectedIndex(1);
        hospedaje.setBounds(258, 103, 140, 20);
        add(hospedaje);

        JLabel label_3 = new JLabel("Dias");
        label_3.setBounds(455, 78, 46, 14);
        add(label_3);

        dias = new JSpinner();
        dias.setBounds(455, 103, 46, 20);
        add(dias);

        btnviaje = new JButton("consultar");
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
        separator.setBounds(10, 286, 804, 9);
        add(separator);

        JCalendar calendar = new JCalendar();
        calendar.setBorder(new LineBorder(new Color(0, 0, 0)));
        calendar.setBounds(532, 90, 250, 153);
        add(calendar);

        JLabel label_5 = new JLabel("Destino");
        label_5.setBounds(54, 345, 46, 14);
        add(label_5);

        resultadoPasaje = new JTextArea();
        resultadoPasaje.setBorder(new TitledBorder(null, "Resultados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        resultadoPasaje.setBounds(411, 354, 302, 71);
        add(resultadoPasaje);

        btnPasaje = new JButton("consultar");
        btnPasaje.setBounds(260, 369, 89, 23);
        add(btnPasaje);

        destinoPasaje = new JComboBox<String>();
        destinoPasaje.setModel(new DefaultComboBoxModel(new String[] {"altovalsol", "andacollo", "coquimbo", "el_islon", "el_penon", "guachalalume", "guampulla", "hurtado", "la_fundida", "la_serena", "las_rojas", "pan_de_azucar", "penuela", "pichasca", "placilla", "samo_alto", "vicuna"}));
        destinoPasaje.setSelectedIndex(1);
        destinoPasaje.setBounds(54, 370, 140, 20);
        add(destinoPasaje);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub

    }

}

