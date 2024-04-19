package mx.untg.s24;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.event.ActionListener;

//Declaramos una clase que sirvirá de ventana
public class Ventana extends JFrame{
     private JTextField txtUsuario;
     private JPasswordField txtClave;

     public Ventana(){
        //Invocando al constructor de clase padre
         super("Autenticación de usuario");
         //Dimesiones de la ventana 
         setSize(300, 200);
         //Cunado de click en boton x se cierra 
         setDefaultCloseOperation(EXIT_ON_CLOSE);
 
         //Coloco un contenedor de componentes GUI
         JPanel panel = new JPanel(new GridBagLayout());
         //Coloco restricciones para la rejilla
         GridBagConstraints gbc = new GridBagConstraints();
         gbc.insets = new Insets(5, 5, 5, 5);

         //Etiquetas para los campos
         JLabel lblUsuario = new JLabel("Usuario: ");
         JLabel lblClave = new JLabel("Clave:");

         //Inicio las cajas de texto
         txtUsuario = new JTextField(15);
         txtClave = new JPasswordField(15);

         //Boton de Login
         JButton btnLogin = new JButton("Login");

         //Action Button
         btnLogin.addActionListener(
            new ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    String usuario = txtUsuario.getText();
                    char[] charsClave = txtClave.getPassword();
                    String clave = new String(charsClave);

                    if (validarLogin(usuario, clave)) {
                        JOptionPane.showMessageDialog(Ventana.this, "Login Correcto");
                    } else{
                        JOptionPane.showMessageDialog(Ventana.this, "Usuario o Clave Incorrectos");

                    }
                }
            }
         );

         //Colocando en la celda (0,0) la etiqueta de texto
         gbc.gridx=0;
         gbc.gridy=0;
         panel.add(lblUsuario, gbc);
        //Colocando en la celda (1,0) la caja de texto
         gbc.gridx=1;
         gbc.gridy=1;
         panel.add(txtUsuario, gbc);

         //Colocando en la celda (0,1) la etiqueta de texto
         gbc.gridx=0;
         gbc.gridy=1;
         panel.add(lblClave, gbc);
        //Colocando en la celda (1,1) la caja de texto
         gbc.gridx=1;
         gbc.gridy=1;
         panel.add(txtClave, gbc);

         //Colocando en la celda (0,3) la etiqueta de texto
         gbc.gridx=0;
         gbc.gridy=2;
         panel.add(btnLogin, gbc);

         //Ventana centra 
         setLocationRelativeTo(null);

         panel.add(txtUsuario, gbc);
         this.add(panel);

         //Hace visible la ventana por defecto esta en false
         setVisible(true);
        
     }

     public static void main(String[] args) {
        new Ventana();
     }

     private boolean validarLogin(String usuario, String clave){
        return usuario.equals("utng") && clave.equals("1234");
     }
}