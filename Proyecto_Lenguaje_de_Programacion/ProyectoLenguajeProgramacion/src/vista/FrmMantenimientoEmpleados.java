package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class FrmMantenimientoEmpleados extends JFrame {

	private JPanel contentPane;
	private JLabel lblMantenimientoEmpleados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMantenimientoEmpleados frame = new FrmMantenimientoEmpleados();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmMantenimientoEmpleados() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmMantenimientoEmpleados.class.getResource("/img/oxxo.png")));
		setTitle("Mantenimiento Empleados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblMantenimientoEmpleados = new JLabel("MANTENIMIENTO EMPLEADOS");
		lblMantenimientoEmpleados.setForeground(UIManager.getColor("Button.highlight"));
		lblMantenimientoEmpleados.setBackground(UIManager.getColor("Button.foreground"));
		lblMantenimientoEmpleados.setOpaque(true);
		lblMantenimientoEmpleados.setHorizontalAlignment(SwingConstants.CENTER);
		lblMantenimientoEmpleados.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMantenimientoEmpleados.setBounds(0, 0, 609, 35);
		contentPane.add(lblMantenimientoEmpleados);
	}

}
