package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class IngresaEmpleado extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    IngresaEmpleado frame = new IngresaEmpleado();
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
    public IngresaEmpleado() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblIngresaTusDatos = new JLabel("INGRESA TUS DATOS PARA ENTRAR");
        lblIngresaTusDatos.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblIngresaTusDatos.setBounds(98, 49, 224, 23);
        contentPane.add(lblIngresaTusDatos);
        
        JLabel lblNumeroDeEmpleado = new JLabel("NUMERO DE EMPLEADO");
        lblNumeroDeEmpleado.setBounds(27, 112, 136, 14);
        contentPane.add(lblNumeroDeEmpleado);
        
        textField = new JTextField();
        textField.setBounds(173, 109, 224, 20);
        contentPane.add(textField);
        textField.setColumns(10);
        
        JButton btnEntrar = new JButton("ENTRAR");
        btnEntrar.setBounds(152, 196, 116, 23);
        contentPane.add(btnEntrar);
        
        JButton btnRegresar = new JButton("REGRESAR");
        btnRegresar.setBounds(295, 196, 100, 23);
        contentPane.add(btnRegresar);
        
        btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Principal principal = new Principal();
                principal.setVisible(true);
                dispose();
            }
        });
    }
    
}
