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
import javax.swing.SwingConstants;
import javax.swing.UIManager;

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
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Segoe UI", Font.BOLD, 20));
        label.setBounds(289, 22, 216, 25);
        add(label);

        JLabel label_1 = new JLabel("Destino");
        label_1.setFont(new Font("Segoe UI Emoji", Font.BOLD, 13));
        label_1.setBounds(54, 78, 61, 14);
        add(label_1);

        destinoViaje = new JComboBox<String>();
        this.destinoViaje.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        destinoViaje.setModel(new DefaultComboBoxModel(new String[] {"altovalsol", "andacollo", "coquimbo", "el_islon", "el_penon", "guachalalume", "guampulla", "hurtado", "la_fundida", "la_serena", "las_rojas", "pan_de_azucar", "penuela", "pichasca", "placilla", "samo_alto", "vicuna"}));
        destinoViaje.setSelectedIndex(1);
        destinoViaje.setBounds(54, 103, 140, 20);
        add(destinoViaje);

        JLabel label_2 = new JLabel("Hospedaje");
        label_2.setFont(new Font("Segoe UI Emoji", Font.BOLD, 13));
        label_2.setBounds(260, 78, 89, 14);
        add(label_2);

        hospedaje = new JComboBox<String>();
        this.hospedaje.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        hospedaje.setModel(new DefaultComboBoxModel(new String[] {"camping", "hostal", "hotel"}));
        hospedaje.setSelectedIndex(1);
        hospedaje.setBounds(258, 103, 140, 20);
        add(hospedaje);

        JLabel lblDas = new JLabel("D\u00EDas");
        lblDas.setFont(new Font("Segoe UI Emoji", Font.BOLD, 13));
        lblDas.setBounds(455, 78, 46, 14);
        add(lblDas);

        dias = new JSpinner();
        this.dias.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        dias.setBounds(455, 103, 46, 20);
        add(dias);

        btnviaje = new JButton("Consultar");
        this.btnviaje.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        btnviaje.setBounds(242, 147, 89, 23);
        add(btnviaje);

        resultadoViaje = new JTextArea();
        this.resultadoViaje.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        resultadoViaje.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Resultados", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
        resultadoViaje.setBounds(54, 204, 449, 71);
        add(resultadoViaje);

        JLabel lblConsultaDePasajes = new JLabel("Consulta de pasajes");
        lblConsultaDePasajes.setHorizontalAlignment(SwingConstants.CENTER);
        lblConsultaDePasajes.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblConsultaDePasajes.setBounds(302, 306, 203, 25);
        add(lblConsultaDePasajes);

        JSeparator separator = new JSeparator();
        separator.setBounds(10, 286, 804, 9);
        add(separator);

        JCalendar calendar = new JCalendar();
        calendar.getYearChooser().getSpinner().setFont(new Font("Segoe UI", Font.PLAIN, 11));
        calendar.getMonthChooser().getComboBox().setFont(new Font("Segoe UI", Font.PLAIN, 11));
        calendar.setBorder(new LineBorder(new Color(0, 0, 0)));
        calendar.setBounds(532, 90, 250, 153);
        add(calendar);

        JLabel label_5 = new JLabel("Destino");
        label_5.setFont(new Font("Segoe UI Emoji", Font.BOLD, 13));
        label_5.setBounds(54, 345, 61, 14);
        add(label_5);

        resultadoPasaje = new JTextArea();
        this.resultadoPasaje.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        resultadoPasaje.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Resultados", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
        resultadoPasaje.setBounds(411, 354, 302, 71);
        add(resultadoPasaje);

        btnPasaje = new JButton("Consultar");
        this.btnPasaje.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        btnPasaje.setBounds(260, 369, 89, 23);
        add(btnPasaje);

        destinoPasaje = new JComboBox<String>();
        this.destinoPasaje.setFont(new Font("Segoe UI", Font.PLAIN, 11));
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

