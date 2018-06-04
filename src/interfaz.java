import java.awt.FlowLayout; //Como se ordena los componentes
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame; //Propociona las caracteristica de una ventana

import javax.swing.*;
public class interfaz extends JFrame{
	private JLabel etiqueta1;
	private JTextField usuario;
	private JLabel etiquetaPassword;
	private JPasswordField password;
	private JButton botonlogin;
	private Panel panelprincipal;
	private int x;
	private int y;
	private int separacion;
	private int ySeparacion;

	public interfaz() {
		
		super("Prueba");
		
		x = 400;
		y = 300;
		separacion = 100;
		ySeparacion = 30;
		
		panelprincipal = new Panel();
		panelprincipal.setLayout(null);
		//setLayout(new FlowLayout());
		etiqueta1 = new JLabel("Usuario");
		etiqueta1.setToolTipText("Ingrese usuario");
		etiqueta1.setSize(100,20);
		etiqueta1.setLocation(x,y);
		panelprincipal.add(etiqueta1);
		//setLayout(new FlowLayout());
		
		usuario = new JTextField();
		usuario.setToolTipText("Ingrese usuario");
		usuario.setSize(300,20);
		usuario.setLocation(x + separacion,y);
		panelprincipal.add(usuario);
		
		//Siguiente salto de linea
	    y +=ySeparacion;
		//setLayout(new FlowLayout());
		etiquetaPassword = new JLabel("Contraseña");
		etiquetaPassword.setToolTipText("Esta es una etiqueta");
		etiquetaPassword.setSize(etiqueta1.getWidth(),etiqueta1.getHeight());
		etiquetaPassword.setLocation(x,y);
		panelprincipal.add(etiquetaPassword);
		
		//setLayout(new FlowLayout());
		password = new JPasswordField();
		//password.setToolTipText("Ingrese contraseña");
		password.setLocation(x + separacion, usuario.getY() + 30);
	    password.setSize(usuario.getWidth(),usuario.getHeight());
	    panelprincipal.add(password);
	    
	    y+=ySeparacion;
	    
	    botonlogin = new JButton();
	    botonlogin.setLocation(x + separacion, y);
	    botonlogin.setSize(300,20);
	    botonlogin.setText("Ingresar");
	
	    botonlogin.addActionListener( new ActionListener() {
	    	 
	    	  @SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
	    			JOptionPane.showMessageDialog(null, usuario.getText());
	    	    if (password.getText().equals("paola") && usuario.getText().equals("paola")) {
	    	    	JOptionPane.showMessageDialog(null, "Acceso exitoso");
	    	    	menuprincipal menu = new menuprincipal();
	    	    	menu.setExtendedState(menu.MAXIMIZED_BOTH);
	    	    	menu.show();
	    	    	
	    	    	setVisible(false);
	    	    }else {
	    	    	JOptionPane.showMessageDialog(null, "Acceso denegado");
	    	    }
	    	    
	    	  }	
	    	});
	    panelprincipal.add(botonlogin);
	   
	    y+=ySeparacion;
	  
	    
	    
	    
	    add(panelprincipal);
		
	

	
		
		
	}
	
	

	public static void main(String [] args) {
		interfaz login = new interfaz();
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		login.setExtendedState(login.MAXIMIZED_BOTH);
		login.setVisible(true);
	}
	
}
