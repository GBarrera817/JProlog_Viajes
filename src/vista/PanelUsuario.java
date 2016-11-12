package vista;

import javax.swing.*;
import java.awt.*;

/**
 * Creado por Gabriela Barrera el 11-11-2016.
 * Proyecto: JProlog_Viajes
 */

public class PanelUsuario extends JPanel{

	private String[] datos = new String[] {"Altovalsol", "Andacollo", "Coquimbo", "El Isl\u00F3n", "El pe\u00F1\u00F3n", "Guachalalume", "Guampulla", "Hurtado", "La Fundida", "La Serena", "Las Rojas", "Pan de Az\u00FAcar", "Pe\u00F1uelas", "Pichasca", "Placilla", "Samo Alto", "Vicu\u00F1a "};

    private JLabel lblDistanciaEntreLas;
    private JLabel lblOrigen;
    private JPanel panelResultado;
    private JLabel lblDestino;
    private JLabel lblOrigen_1;
    private JLabel lblDestino_1;
    private JLabel lblNewLabel;
    private JList listaOrigen;
    private JList listaDestino;
    private JScrollPane scrollPane;
    private JScrollPane scrollPane_1;
    private JSeparator separator;
    private JSeparator separator_1;
    private JSeparator separator_2;
    private JButton btnCalcular;
    private JLabel lblNewLabel_1;

    public PanelUsuario(){
        initComponents();
    }

    private void initComponents() {
    	setSize(new Dimension(820, 500));

        setLayout(null);

        lblDistanciaEntreLas = new JLabel("Distancia entre las ciudades vecinas");
        lblDistanciaEntreLas.setHorizontalAlignment(SwingConstants.CENTER);
        lblDistanciaEntreLas.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblDistanciaEntreLas.setBounds(240, 119, 365, 25);
        add(lblDistanciaEntreLas);

        lblOrigen = new JLabel("Origen");
        lblOrigen.setHorizontalAlignment(SwingConstants.CENTER);
        lblOrigen.setFont(new Font("Segoe UI Emoji", Font.BOLD, 13));
        lblOrigen.setBounds(181, 156, 60, 25);
        add(lblOrigen);

        panelResultado = new JPanel();
        panelResultado.setBounds(304, 204, 193, 153);
        add(panelResultado);
        panelResultado.setLayout(null);

        lblOrigen_1 = new JLabel("Origen: ");
        lblOrigen_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblOrigen_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lblOrigen_1.setBounds(10, 11, 75, 26);
        panelResultado.add(lblOrigen_1);
        
                separator = new JSeparator();
                separator.setForeground(new Color(255, 140, 0));
                separator.setBounds(10, 42, 173, 2);
                panelResultado.add(separator);

        lblDestino_1 = new JLabel("Destino: ");
        lblDestino_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblDestino_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lblDestino_1.setBounds(10, 49, 75, 20);
        panelResultado.add(lblDestino_1);

        lblNewLabel = new JLabel("X km");
        lblNewLabel.setBounds(20, 86, 163, 56);
        panelResultado.add(lblNewLabel);
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setBackground(new Color(255, 140, 0));
        lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        separator_1 = new JSeparator();
        separator_1.setForeground(new Color(255, 140, 0));
        separator_1.setBounds(10, 11, 173, 2);
        panelResultado.add(separator_1);
        
        separator_2 = new JSeparator();
        separator_2.setForeground(new Color(255, 140, 0));
        separator_2.setBounds(10, 74, 173, 2);
        panelResultado.add(separator_2);

        lblDestino = new JLabel("Destino");
        lblDestino.setHorizontalAlignment(SwingConstants.CENTER);
        lblDestino.setFont(new Font("Segoe UI", Font.BOLD, 13));
        lblDestino.setBounds(551, 155, 72, 25);
        add(lblDestino);

        scrollPane = new JScrollPane();
        scrollPane.setBounds(150, 191, 130, 224);
        add(scrollPane);

        listaOrigen = new JList();
        listaOrigen.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        scrollPane.setViewportView(listaOrigen);
        listaOrigen.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaOrigen.setModel(new AbstractListModel() {
            String[] values = datos;
            public int getSize() {
                return values.length;
            }
            public Object getElementAt(int index) {
                return values[index];
            }
        });
        listaOrigen.setSelectedIndex(0);

        scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(523, 191, 132, 224);
        add(scrollPane_1);

        listaDestino = new JList();
        listaDestino.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        scrollPane_1.setViewportView(listaDestino);
        listaDestino.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaDestino.setModel(new AbstractListModel() {
            String[] values = datos;
            public int getSize() {
                return values.length;
            }
            public Object getElementAt(int index) {
                return values[index];
            }
        });
        listaDestino.setSelectedIndex(0);
    	
    	btnCalcular = new JButton("Calcular");
    	this.btnCalcular.setFont(new Font("Segoe UI", Font.PLAIN, 11));
    	btnCalcular.setBounds(357, 380, 89, 23);
    	add(btnCalcular);
    	
    	this.lblNewLabel_1 = new JLabel("New label");
    	this.lblNewLabel_1.setIcon(new ImageIcon("D:\\Workspace IntelliJ IDEA\\JProlog_Viajes\\img\\banner_mapa.jpg"));
    	this.lblNewLabel_1.setBounds(0, 0, 820, 108);
    	add(this.lblNewLabel_1);
    }

}
