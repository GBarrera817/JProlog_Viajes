/**
 * Creado por Gabriela Barrera el 09-11-2016.
 * Proyecto: JProlog_Viajes
 */


import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
import vista.PanelExperto;
import vista.PanelViaje;

import javax.swing.*;
import java.awt.*;


public class Test extends JFrame{
	
	private String[] datosOrigen = {"La serena", "Coquimbo", "Altovalsol", "Las Rojas"};
	private String[] datosDestino = {"El penon", "Guachalalume", "Altovalsol", "Las Rojas"};
	
	private JTabbedPane tabbedPane;
	private JPanel panelUsuario;
	private PanelExperto panelExperto;
	private JLabel lblDistanciaEntreLas;
	private JLabel lblOrigen;
	private JPanel panelResultado;
	private JLabel lblDestino;
	private PanelViaje panelViajes;
	private JList listaOrigen;
	private JScrollPane scrollPane;
	private JList listaDestino;
	private JScrollPane scrollPane_1;
	private JLabel lblOrigen_1;
	private JLabel lblDestino_1;
	private JLabel lblNewLabel;
	private JSeparator separator;
	
	public Test() {

		initComponents();

	}

	private void initComponents() {


		getContentPane().setLayout(new BorderLayout(0, 0));
		
		tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		panelUsuario = new JPanel();
		tabbedPane.addTab("Distancia ciudades", null, panelUsuario, "Permite al usuario calcular la distancia entre las cuidades");
		tabbedPane.setEnabledAt(0, true);
		panelUsuario.setLayout(null);
		
		lblDistanciaEntreLas = new JLabel("Distancia entre las ciudades vecinas");
		lblDistanciaEntreLas.setHorizontalAlignment(SwingConstants.CENTER);
		lblDistanciaEntreLas.setFont(new Font("Segoe WP Black", Font.PLAIN, 18));
		lblDistanciaEntreLas.setBounds(123, 11, 354, 25);
		panelUsuario.add(lblDistanciaEntreLas);


		
		lblOrigen = new JLabel("Origen");
		lblOrigen.setBounds(26, 77, 46, 14);
		panelUsuario.add(lblOrigen);
		
		panelResultado = new JPanel();
		panelResultado.setBounds(228, 122, 193, 168);
		panelUsuario.add(panelResultado);
		panelResultado.setLayout(null);
		
		lblOrigen_1 = new JLabel("Origen: ");
		lblOrigen_1.setBounds(10, 11, 173, 14);
		panelResultado.add(lblOrigen_1);
		
		lblDestino_1 = new JLabel("Destino: ");
		lblDestino_1.setBounds(10, 46, 173, 14);
		panelResultado.add(lblDestino_1);
		
		lblNewLabel = new JLabel("625 km");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(255, 140, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(20, 75, 163, 56);
		panelResultado.add(lblNewLabel);
		
		separator = new JSeparator();
		separator.setBounds(20, 36, 173, 2);
		panelResultado.add(separator);
		
		lblDestino = new JLabel("Destino");
		lblDestino.setBounds(481, 77, 72, 14);
		panelUsuario.add(lblDestino);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 102, 130, 227);
		panelUsuario.add(scrollPane);
		
		listaOrigen = new JList();
		scrollPane.setViewportView(listaOrigen);
		listaOrigen.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listaOrigen.setModel(new AbstractListModel() {
			String[] values = new String[] {"Altovalsol", "Andacollo", "Coquimbo", "El Isl\u00F3n", "El pe\u00F1\u00F3n", "Guachalalume", "Guampulla", "Hurtado", "La Fundida", "La Serena", "Las Rojas", "Pan de Az\u00FAcar", "Pe\u00F1uelas", "Pichasca", "Placilla", "Samo Alto", "Vicu\u00F1a"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listaOrigen.setSelectedIndex(0);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(481, 102, 132, 224);
		panelUsuario.add(scrollPane_1);
		
		listaDestino = new JList();
		scrollPane_1.setViewportView(listaDestino);
		listaDestino.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listaDestino.setModel(new AbstractListModel() {
			String[] values = new String[] {"Altovalsol", "Andacollo", "Coquimbo", "El Isl\u00F3n", "El pe\u00F1\u00F3n", "Guachalalume", "Guampulla", "Hurtado", "La Fundida", "La Serena", "Las Rojas", "Pan de Az\u00FAcar", "Pe\u00F1uelas", "Pichasca", "Placilla", "Samo Alto", "Vicu\u00F1a"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listaDestino.setSelectedIndex(0);
		
			
			panelViajes = new PanelViaje();
			tabbedPane.addTab("Planificador de viajes", null, panelViajes, null);
			panelViajes.setLayout(null);
		
		panelExperto = new PanelExperto();
		tabbedPane.addTab("M\u00F3dulo experto", null, panelExperto, "Permite al usuario experto crear la base de conocimiento para el sistema experto");
		panelExperto.setLayout(null);



		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Planificaci\u00F3n IA");
		setSize(820, 500);
		setMaximumSize(new Dimension(820, 500));
		setLocationRelativeTo(null);
		setVisible(true);
	}

    public static void main(String[] args) {

		/*
        String consult = "consult('distancia.pl')";
		Query conexion = new Query(consult);
		System.out.println(consult+ " " + (conexion.hasSolution() ? " => Correcto" : " => Fallado"));

		System.out.println("\nEstan conectadas las cuidades?\n");

		Variable X = new Variable("X");

		Query q1 = new Query( new Compound("distancia", new Term[]{ new Atom("tokyo"), new Atom("sydney"), X } ));

		Map<String, Term> solucion1, solucion2;

		while(q1.hasMoreSolutions()){
			solucion1 = q1.nextSolution();
			System.out.println(" X = "+ solucion1.get("X"));
		}


		Query q2 = new Query( new Compound("conectadas", new Term[] { new Atom("london"), new Atom("sydney"), new Variable("X")}));

		while(q2.hasMoreSolutions()){
			solucion2 = q2.nextSolution();
			System.out.println(" X = "+ solucion2.get("X"));
		}
		*/

		// GUI

        try {
			UIManager.setLookAndFeel(SyntheticaAluOxideLookAndFeel.class.getName());
			Test ventana = new Test();
		} catch (final Exception e) {
			e.printStackTrace();
			System.exit(0);
		}

    }
}
