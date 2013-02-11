import java.sql.*;
import java.lang.Exception;
import javax.swing.ImageIcon;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Toolkit;
import java.io.*;
import javax.swing.JOptionPane;
public class Client extends javax.swing.JFrame {

   
    public Client() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        Name = new javax.swing.JTextField();
        Surname = new javax.swing.JTextField();
        Spot = new javax.swing.JTextField();
        Location = new javax.swing.JTextField();
        Age = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Time = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ΚΑΤΑΧΩΡΗΣΗ ΠΕΛΑΤΗ");
        setResizable(false);

        jLabel1.setText("ONOMA");

        jLabel2.setText("ΕΠΩΝΥΜΟ");

        jLabel3.setText("ΗΛΙΚΙΑ");

        jLabel4.setText("ΘΕΣΗ");

        jLabel5.setText("ΔΙΑΔΡΟΜΗ");

        jLabel6.setText("ΩΡΑ");

        jCheckBox1.setText("ΜΕΤΡΗΤΑ");

        jCheckBox2.setText("ΤΡΑΠΕΖΑΣ");

        jButton1.setText("ΟΚ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox2))
                    .addComponent(Name)
                    .addComponent(Surname)
                    .addComponent(Spot)
                    .addComponent(Location)
                    .addComponent(Age)
                    .addComponent(Time))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Spot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-328)/2, (screenSize.height-446)/2, 328, 446);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String MessageCash="Go Pay";
       String MessageBank="Enter Card Details";
       Document document = new Document(); 
       
       if (jCheckBox1.isSelected())
       {
        try {               
            String str1=Name.getText();
            String str2=Surname.getText();
            String str3=Age.getText();
            String str4=Spot.getText();
            String str5=Location.getText();
            String str6=Time.getText();
            PdfWriter.getInstance(document, new FileOutputStream("Ticket.pdf"));
            document.open();
            document.add(new Paragraph("TicketHouse"));
            PdfPTable table=new PdfPTable(2);
            table.addCell("Name");
            table.addCell(str1);
            table.addCell("Surname");
            table.addCell(str2);            
            table.addCell("Age");
            table.addCell(str3);
            table.addCell("Spot");
            table.addCell(str4);
            table.addCell("Location");
            table.addCell(str5);
            table.addCell("Time");
            table.addCell(str6);
            document.add(table);
            document.close();
        
        }
        catch(Exception e){
            
        }
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null,MessageCash);
       }  
       else if (jCheckBox2.isSelected())
       {
           try {               
            String str1=Name.getText();
            String str2=Surname.getText();
            String str3=Age.getText();
            String str4=Spot.getText();
            String str5=Location.getText();
            String str6=Time.getText();
            
            
            Toolkit.getDefaultToolkit().beep();
            String input = JOptionPane.showInputDialog("Enter CardNumber:");
            
            PdfWriter.getInstance(document, new FileOutputStream("Ticket.pdf"));
            document.open();
            document.add(new Paragraph("TicketHouse"));
            PdfPTable table=new PdfPTable(2);
            table.addCell("Name");
            table.addCell(str1);
            table.addCell("Surname");
            table.addCell(str2);            
            table.addCell("Age");
            table.addCell(str3);
            table.addCell("Spot");
            table.addCell(str4);
            table.addCell("Location");
            table.addCell(str5);
            table.addCell("Time");
            table.addCell(str6);
            table.addCell("CardNumber");
            table.addCell(input);
            document.add(table);
            document.close();
        
        }
        catch(Exception e){
            
        }
    
       } 
     
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age;
    private javax.swing.JTextField Location;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Spot;
    private javax.swing.JTextField Surname;
    private javax.swing.JTextField Time;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
