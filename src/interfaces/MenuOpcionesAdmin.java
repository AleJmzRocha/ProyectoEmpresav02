package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MenuOpcionesAdmin extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MenuOpcionesAdmin frame = new MenuOpcionesAdmin();
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
    public MenuOpcionesAdmin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 452, 326);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblquDeseaHacer = new JLabel("\u00BFQU\u00C9 DESEA HACER?");
        lblquDeseaHacer.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblquDeseaHacer.setBounds(156, 11, 145, 17);
        contentPane.add(lblquDeseaHacer);

        JButton btnNewButton = new JButton("REGISTRAR EMPLEADO");
        btnNewButton.setBounds(108, 39, 226, 23);
        contentPane.add(btnNewButton);

        JButton btnEditarEmpleado = new JButton("EDITAR EMPLEADO");
        btnEditarEmpleado.setBounds(108, 73, 226, 23);
        contentPane.add(btnEditarEmpleado);

        JButton btnDarDeBaja = new JButton("DAR DE BAJA UN EMPLEADO");
        btnDarDeBaja.setBounds(108, 107, 226, 23);
        contentPane.add(btnDarDeBaja);

        JButton btnBuscarEmpleado = new JButton("BUSCAR EMPLEADO");
        btnBuscarEmpleado.setBounds(108, 143, 226, 23);
        contentPane.add(btnBuscarEmpleado);

        JButton btnEmpleadosActuales = new JButton("EMPLEADOS ACTUALES");
        btnEmpleadosActuales.setBounds(108, 179, 226, 23);
        contentPane.add(btnEmpleadosActuales);

        JButton btnVerReporte = new JButton("VER REPORTE");
        btnVerReporte.setBounds(108, 213, 226, 23);
        contentPane.add(btnVerReporte);

        JButton btnRegresar = new JButton("REGRESAR");
        btnRegresar.setBounds(108, 248, 226, 23);
        contentPane.add(btnRegresar);

        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//				RegistroEmpleado re = new RegistroEmpleado();
//				re.setVisible(true);
//				dispose();
            }
        });

        btnEmpleadosActuales.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Principal prin = new Principal();
                prin.setVisible(true);
                dispose();
            }
        });
    }

}
