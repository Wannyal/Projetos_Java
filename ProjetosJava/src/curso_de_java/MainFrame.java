package ProjetosJava.src.curso_de_java;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame {
    final private Font mainFont = new Font  ("Segeo Print" , Font.BOLD , 18);
    JTextField tfFirstNome, tfLastNome;
    JLabel ibBemVindo;

    public void Inicio() { 

        JLabel ibFirstName = new JLabel("Informe seu primeiro nome:");
        ibFirstName.setFont(mainFont);

        tfFirstNome = new JTextField();
        tfFirstNome.setFont(mainFont);

        JLabel ibLastNome = new JLabel("Agora informe seu segundo nome:");
        ibLastNome.setFont(mainFont); 

        tfLastNome = new JTextField();
        tfLastNome.setFont(mainFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4,1,5,5));
        formPanel.setOpaque(false);
        formPanel.add(ibFirstName);
        formPanel.add(tfFirstNome);
        formPanel.add(ibLastNome);
        formPanel.add(tfLastNome);



       ibBemVindo = new JLabel();   
       ibBemVindo.setFont(mainFont);     
       
       
       JButton btnOk = new JButton("Ok");
       btnOk.setFont(mainFont);
       btnOk.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
           String firstName = tfFirstNome.getText();
           String lastName = tfLastNome.getText();
           ibBemVindo.setText("Bem vindo(a) "+ firstName + " " + lastName);
        }

       });


       JButton btnClear = new JButton("Tentar Novamente");
       btnClear.setFont(mainFont);
       btnClear.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            tfFirstNome.setText("");
            tfLastNome.setText("");
            ibBemVindo.setText("");
        }
        
       });

       JPanel buttonsPanel = new JPanel();
       buttonsPanel.setLayout(new GridLayout(1,2,5,5));
       buttonsPanel.setOpaque(false);
       buttonsPanel.add(btnOk); 
       buttonsPanel.add(btnClear);

       
       
       JPanel mainPanel = new JPanel();
       mainPanel.setLayout(new BorderLayout());
       mainPanel.setBackground(new Color ( 128, 128, 255));
       mainPanel.add(formPanel, BorderLayout.NORTH);
       mainPanel.add(ibBemVindo, BorderLayout.CENTER);
       mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
       
       
       
       add(mainPanel);


        setTitle("Primeira Tela");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }
        public static void main(String[] args) {
            MainFrame myFrame = new MainFrame();
            myFrame.Inicio();
        }
    }
    

