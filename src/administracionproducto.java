import java.awt.FlowLayout; //Como se ordena los componentes
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
//Propociona las caracteristica de una ventana
import javax.swing.*;
public class administracionproducto extends JFrame{
	private JLabel etiqueta1;
	private JTextField nombre;
	private JTextField descripcion;
	private JTextField precio;
	private JLabel leyendas;
	private JButton botonadd;
	private Panel panelprincipal;
	private int x;
	private int y;
	private int separacion;
	private int ySeparacion;
	private JTable tablaprincipal;
    DefaultTableModel dtm= new DefaultTableModel(); 
	public administracionproducto() {
		super("Administracion del producto");
		x = 400;
		y = 300;
		separacion = 100;
		ySeparacion = 30;
		
		panelprincipal = new Panel();
		panelprincipal.setLayout(null);
		//setLayout(new FlowLayout());
		etiqueta1 = new JLabel("Nombre");
		etiqueta1.setToolTipText("Ingrese usuario");
		etiqueta1.setSize(100,20);
		etiqueta1.setLocation(x,y);
		panelprincipal.add(etiqueta1);
		//setLayout(new FlowLayout());
		
		nombre = new JTextField();
		nombre.setToolTipText("Ingrese usuario");
		nombre.setSize(300,20);
		nombre.setLocation(x + separacion,y);
		panelprincipal.add(nombre);
		y+=ySeparacion;
		
		
		etiqueta1 = new JLabel("Descripción");
		etiqueta1.setToolTipText("Ingrese usuario");
		etiqueta1.setSize(100,20);
		etiqueta1.setLocation(x,y);
		panelprincipal.add(etiqueta1);
		//setLayout(new FlowLayout());
		
		descripcion = new JTextField();
		descripcion.setToolTipText("Ingrese usuario");
		descripcion.setSize(300,20);
		descripcion.setLocation(x + separacion,y);
		panelprincipal.add(descripcion);
		y+=ySeparacion;
		
		etiqueta1 = new JLabel("Precio");
		etiqueta1.setToolTipText("Ingrese usuario");
		etiqueta1.setSize(100,20);
		etiqueta1.setLocation(x,y);
		panelprincipal.add(etiqueta1);
		//setLayout(new FlowLayout());
		
		precio = new JTextField();
		precio.setToolTipText("Ingrese usuario");
		precio.setSize(300,20);
		precio.setLocation(x + separacion,y);
		panelprincipal.add(precio);
		y+=ySeparacion;
		
		
		
	    
		botonadd = new JButton();
		botonadd.setLocation(x + separacion, y);
		botonadd.setSize(300,20);
		botonadd.setText("Ingresar");
	
		botonadd.addActionListener( new ActionListener() {
	    	 
	    	  @SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
	    	    String[] rows = {nombre.getText(), descripcion.getText(), precio.getText()};
	    	    dtm.insertRow(0,rows);
	    	    
	    	  }	
	    	});
	    panelprincipal.add(botonadd);
	   
	    y+=ySeparacion;
		
	    

	       dtm.addColumn("Nombre");
	    dtm.addColumn("Descripcion");
	    dtm.addColumn("Precio");
	    tablaprincipal = new JTable(dtm);
	    tablaprincipal.setLocation(x + separacion, y);
	    tablaprincipal.setSize(700,100);
	    JScrollPane sc = new JScrollPane(tablaprincipal);
	    
	    panelprincipal.add(sc);
	    
	    panelprincipal.add(tablaprincipal);

	    add(panelprincipal);
	}
	

	public static void main(String [] args) {
		administracionproducto admin = new administracionproducto();
		admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		admin.setSize(800,800);
		admin.setVisible(true);
	}

}
