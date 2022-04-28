package groupproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jamendez
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class Server extends javax.swing.JFrame {

    /**
     * Creates new form Server
     */
    ServerSocket serversocketTW = null;
    Socket socketTW = null;
    DataOutputStream dosTW = null;
    DataInputStream disTW = null;

    DBConnection conTW = new DBConnection();

    public Server() {
        initComponents();
    }

    Thread t = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                serversocketTW = new ServerSocket(9000);
                socketTW = serversocketTW.accept();
                dosTW = new DataOutputStream(socketTW.getOutputStream());
                disTW = new DataInputStream(socketTW.getInputStream());
                String usernameTW = disTW.readUTF();
                txtStatusTW.setText(usernameTW + " Connected");
                dosTW.writeUTF("Hello, " + usernameTW + ". Interested in seing your future lover?\n So please give your answers by typing A or B\n");

                String[] answers = new String[5];

                dosTW.writeUTF("do you prefer being outdoors or indoors?\n A. Outdoors B. Indoors\n");
                answers[0] = disTW.readUTF();

                dosTW.writeUTF("do you prefer eating at restaurants  or cooking for yourself?\n A. Restaurents B. Cooking\n");
                answers[1] = disTW.readUTF();

                dosTW.writeUTF("would you like to travel frequently?\n A. yes B. no\n");
                answers[2] = disTW.readUTF();

                dosTW.writeUTF("do you enjoy being physically active?\n A. yes B. no\n");
                answers[3] = disTW.readUTF();

                dosTW.writeUTF("would you put pineapple on your pizza?\n A. yes B. no\n");
                answers[4] = disTW.readUTF();

                //create for loop & count answers by A & B 
                int countAJM = 0;
                int countBJM = 0;
                for(String countaJM:answers){
                    if(countaJM.equals("A")){
                        countAJM++;
                    }else{
                        countBJM++;
                    }
                }
                dosTW.writeUTF("\n Here is your result for Future Lover\n===================================\n\n");

                //use a if function & compare A & B

                String hairColorJM = "";
                    String eyeColorJM = "";
                    String heightSizeJM = "";
                    String BodytypeJM = "";
                    String salaryJM = "";
                
                if(countAJM > countBJM){
                    String selectHairColorJM = "SELECT A FROM haircolor ORDER BY RAND() LIMIT 1";
                    String selectEyeColorJM = "SELECT A FROM eyecolor ORDER BY RAND() LIMIT 1";
                    String selectHeightJM = "SELECT heightinfo FROM height ORDER BY RAND() LIMIT 1";
                    String selectBodyTypeJM = "SELECT A FROM bodytype ORDER BY RAND() LIMIT 1";
                    String selectSalaryJM = "SELECT money FROM salary ORDER BY RAND() LIMIT 1";
                    
                    hairColorJM = getRandomAnswer(selectHairColorJM, "A");
                    eyeColorJM = getRandomAnswer(selectEyeColorJM, "A");
                    heightSizeJM = getRandomAnswer(selectHeightJM, "heightinfo");
                    BodytypeJM = getRandomAnswer(selectBodyTypeJM, "A");
                    salaryJM = getRandomAnswer(selectSalaryJM, "money");
                    
                }else if(countBJM > countAJM){
                    String selectHairColor = "SELECT B FROM haircolor ORDER BY RAND() LIMIT 1";
                    String selectEyeColor = "SELECT B FROM eyecolor ORDER BY RAND() LIMIT 1";
                    String selectHeight = "SELECT heightinfo FROM height ORDER BY RAND() LIMIT 1";
                    String selectBodyType = "SELECT B FROM bodytype ORDER BY RAND() LIMIT 1";
                    String selectSalary = "SELECT money FROM salary ORDER BY RAND() LIMIT 1";
                    
                    hairColorJM = getRandomAnswer(selectHairColor, "B");
                    eyeColorJM = getRandomAnswer(selectEyeColor, "B");
                    heightSizeJM = getRandomAnswer(selectHeight, "heightinfo");
                    BodytypeJM = getRandomAnswer(selectBodyType, "B");
                    salaryJM = getRandomAnswer(selectSalary, "money");
                }
                dosTW.writeUTF("Hair Color : "+hairColorJM+"\n");
                dosTW.writeUTF("Eye Color : "+eyeColorJM+"\n");
                dosTW.writeUTF("Height : "+heightSizeJM+"\n");
                dosTW.writeUTF("Body Type : "+BodytypeJM+"\n");
                dosTW.writeUTF("Salary : "+salaryJM+"\n");
                dosTW.writeUTF("Good Bye. " + usernameTW + "\n");

            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    });

    private String getRandomAnswer(String SQL, String column) {
        String resultString = "";
        try {
            ResultSet result = conTW.getData(SQL);
            while (result.next()) {
                resultString = result.getString(column);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultString;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
		
		jLabel1 = new javax.swing.JLabel();
        btnStartServerTW = new javax.swing.JButton();
        txtStatusTW = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Excellent Love Fortune Teller ");
		
		
		jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Server");

        btnStartServerTW.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnStartServerTW.setForeground(new java.awt.Color(0, 102, 102));
        btnStartServerTW.setText("Start Server");
        btnStartServerTW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartServerTWActionPerformed(evt);
            }
        });
		
		
		txtStatusTW.setEditable(false);
        txtStatusTW.setToolTipText("This will show a client connected or Not");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(txtStatusTW, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnStartServerTW, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStatusTW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133)
                .addComponent(btnStartServerTW, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
		

        pack();
		setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

	private void btnStartServerTWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartServerTWActionPerformed
            txtStatusTW.setText("Not Connected");
            t.start();
    }//GEN-LAST:event_btnStartServerTWActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Server().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnStartServerTW;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtStatusTW;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
