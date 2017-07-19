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

public class Principal extends JFrame {

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
                    Principal frame = new Principal();
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
    public Principal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 405, 281);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblBI = new JLabel("\u00A1 B I E N V E N I D O !");
        lblBI.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblBI.setBounds(127, 24, 159, 36);
        contentPane.add(lblBI);

        JLabel lblSeleccioneElTipo = new JLabel("SELECCIONE EL TIPO DE USUARIO");
        lblSeleccioneElTipo.setBounds(104, 71, 219, 14);
        contentPane.add(lblSeleccioneElTipo);

        JButton btnEmpleado = new JButton("EMPLEADO");
        btnEmpleado.setBounds(119, 107, 167, 23);
        contentPane.add(btnEmpleado);

        JButton btnAdministrador = new JButton("ADMINISTRADOR");
        btnAdministrador.setBounds(119, 141, 167, 23);
        contentPane.add(btnAdministrador);

        btnEmpleado.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                IngresaEmpleado ie = new IngresaEmpleado();
                ie.setVisible(true);
                dispose();
            }
        });

        btnAdministrador.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                MenuOpcionesAdmin moa = new MenuOpcionesAdmin();
                moa.setVisible(true);
                dispose();
            }
        });
    }

}
