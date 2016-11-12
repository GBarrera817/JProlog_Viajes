/**
 * Creado por Gabriela Barrera el 09-11-2016.
 * Proyecto: JProlog_Viajes
 */


import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
import vista.PanelExperto;
import vista.PanelViaje;
import vista.PanelUsuario;

import javax.swing.*;
import java.awt.*;


public class Test extends JFrame{


	private Test() {
		initComponents();
	}

	private void initComponents() {

		getContentPane().setLayout(new BorderLayout(0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);

		PanelUsuario panelUsuario = new PanelUsuario();
		tabbedPane.addTab("Distancia ciudades", null, panelUsuario, "Permite al usuario calcular la distancia entre las cuidades");
		tabbedPane.setEnabledAt(0, true);

			
		PanelViaje panelViajes = new PanelViaje();
		tabbedPane.addTab("Planificador de viajes", null, panelViajes, null);
		panelViajes.setLayout(null);

		PanelExperto panelExperto = new PanelExperto();
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
