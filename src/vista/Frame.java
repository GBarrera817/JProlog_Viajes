package vista;

import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
import javax.swing.*;
import java.awt.*;

/**
 * Creado por Gabriela Barrera el 12-11-2016.
 * Proyecto: JProlog_Viajes
 */

public class Frame extends JFrame {
	
	private JMenuItem mntmNewMenuItem;
	

    private Frame(){
        initComponents();
    }

    private void initComponents() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Workspace IntelliJ IDEA\\JProlog_Viajes\\img\\ubicacion.jpg"));

        getContentPane().setLayout(new BorderLayout(0, 0));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Planificaci\u00F3n IA");
        setSize(820, 550);
        setMaximumSize(new Dimension(820, 550));
        setLocationRelativeTo(null);
        setVisible(true);


        JMenuBar menuBar = new JMenuBar();
        getContentPane().add(menuBar, BorderLayout.NORTH);

        JMenu menuArchivo = new JMenu("Archivo");
        menuBar.add(menuArchivo);
        
        this.mntmNewMenuItem = new JMenuItem("Abrir");
        menuArchivo.add(this.mntmNewMenuItem);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
        getContentPane().add(tabbedPane, BorderLayout.CENTER);
        
        
                PanelViaje panelViajes = new PanelViaje();
                tabbedPane.addTab("Planificador de viajes", null, panelViajes, null);
                panelViajes.setLayout(null);

        PanelUsuario panelUsuario = new PanelUsuario();
        tabbedPane.addTab("Distancia ciudades", null, panelUsuario, "Permite al usuario calcular la distancia entre las cuidades");
        tabbedPane.setEnabledAt(1, true);

        PanelExperto panelExperto = new PanelExperto();
        tabbedPane.addTab("M\u00F3dulo experto", null, panelExperto, "Permite al usuario experto crear la base de conocimiento para el sistema experto");
        panelExperto.setLayout(null);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(SyntheticaAluOxideLookAndFeel.class.getName());
            Frame ventana = new Frame();
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
