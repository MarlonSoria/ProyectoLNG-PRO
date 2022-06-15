package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class FrmMantenimientoProductos extends JFrame {

	private JPanel contentPane;
	private JLabel lblMantenimientoProductos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMantenimientoProductos frame = new FrmMantenimientoProductos();
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
	public FrmMantenimientoProductos() {
		setBackground(SystemColor.activeCaption);
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmMantenimientoProductos.class.getResource("/img/oxxo.png")));
		setTitle("Mantenimiento Productos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblMantenimientoProductos = new JLabel("MANTENIMIENTO PRODUCTOS");
		lblMantenimientoProductos.setForeground(UIManager.getColor("Button.highlight"));
		lblMantenimientoProductos.setBackground(UIManager.getColor("Button.foreground"));
		lblMantenimientoProductos.setOpaque(true);
		lblMantenimientoProductos.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMantenimientoProductos.setHorizontalAlignment(SwingConstants.CENTER);
		lblMantenimientoProductos.setBounds(0, 0, 587, 31);
		contentPane.add(lblMantenimientoProductos);
	}

}
