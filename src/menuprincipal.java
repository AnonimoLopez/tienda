import java.awt.FlowLayout; //Como se ordena los componentes
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame; //Propociona las caracteristica de una ventana
import javax.swing.*;

public class menuprincipal extends JFrame {
	private JMenuBar menubar;
	private JMenu menu, submenu;
	private JMenuItem menuItem;
	//private JMenuBar OpcionesSalir;
	public menuprincipal(){
		super("Menu");
		setLayout(null);
		menubar = new JMenuBar();
		menu = new JMenu("Producto");
		menubar.add(menu);
		
		menuItem = new JMenuItem("Alta de producto");
		menuItem.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				administracionproducto administras = new administracionproducto();
				administras.setExtendedState(administras.MAXIMIZED_BOTH);
			administras.setVisible(true);
			}}); 
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Venta de producto");
		menuItem.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "venta del producto");	
			}}); 
		menu.add(menuItem);
		
		menu = new JMenu("Salir");
		menuItem = new JMenuItem("Salir");
		menuItem.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Esta saliendo de la aplicación");	
			}}); 
		menu.add(menuItem);
		menubar.add(menu);
		
		setJMenuBar(menubar);
		
		
		
	}
	
 public static void main(String [] args) {
	 menuprincipal inicio = new menuprincipal();
	 inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 inicio.setSize(800,800);
	 inicio.setVisible(true);
 }
}
