import java.awt.Color;
import java.awt.*;
import javax.swing.*;



public class Ventana extends JFrame{
	
	public Ventana(){
		setSize(300,300);
		this.setBackground(Color.BLACK);
		setTitle("Curriculum");
		
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		componentes();
		setVisible(true);
	}
	@SuppressWarnings("unused")
	private void componentes(){
	//JPanel panelCentral = new JPanel();
	JLabel nombrelbl = new JLabel("Nombre");
	JTextField nombretxt = new JTextField(4);
	JLabel direccionlbl = new JLabel("Direccion");
	JTextField direcciontxt = new JTextField(4);
	JLabel Telefonolbl = new JLabel("Telefono");
	JTextField Telefonolbltxt = new JTextField(4);
	JLabel otrosdatostxt = new JLabel("Otros Datos");
	JTextArea areatxt = new JTextArea(4,4);
	String []combo = {"Ing sistemas", "Ing Comercial", "Ing Telecomunicaciones"};
	JComboBox conocimiento = new JComboBox<>(combo);
	JRadioButton  hombre = new JRadioButton("Hombre");
	JRadioButton Mujer = new JRadioButton("Mujer");
	JCheckBox disponibilidad = new JCheckBox("Disponibilidad");
	JCheckBox poseeauto = new JCheckBox("Posee auto Propio");
	JCheckBox exento = new JCheckBox("Exento Servicio militar");
	add(nombrelbl);
	add(nombretxt);
	add(direccionlbl);
	add(direcciontxt);
	add(Telefonolbl);
	add(Telefonolbltxt);
	add(otrosdatostxt);
	add(areatxt);
	add(conocimiento);
	add(hombre);
	add(Mujer);
	add(disponibilidad);
	add(poseeauto);
	add(exento);
	
	
	
	}
}
