package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.view;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.EmployeeDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.AbstractPerson;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.MechanicEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ProductEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ServiceOrderEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.VehicleEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.BrakeRepairService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.EngineRepairService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.IBrakeRepairService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.IEngineRepairService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.IQAControlService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.IVehicleReceiptService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.QAControlService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.VehicleReceipt;
import java.awt.Component;

public class MainForm extends javax.swing.JFrame {

    public MainForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @Override
    public void setLocationByPlatform(boolean locationByPlatform) {
        super.setLocationByPlatform(locationByPlatform); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLocationRelativeTo(Component c) {
        super.setLocationRelativeTo(c); //To change body of generated methods, choose Tools | Templates.
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnExecuteComboLCR = new javax.swing.JButton();
        btnExecuteRRT = new javax.swing.JButton();
        btnExecuteComboLLI = new javax.swing.JButton();
        btnExecuteComboLCS = new javax.swing.JButton();
        lblLicenseNumber = new javax.swing.JLabel();
        txtLicenseNumber = new javax.swing.JTextField();
        btnExecuteCombo4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnExecuteComboLCR.setText("Ejecutar combo LCR");
        btnExecuteComboLCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeComboLCR(evt);
            }
        });

        btnExecuteRRT.setText("Ejecutar combo RRT");
        btnExecuteRRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeComboRRT(evt);
            }
        });

        btnExecuteComboLLI.setText("Ejecutar combo LLI");
        btnExecuteComboLLI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeComboLLI(evt);
            }
        });

        btnExecuteComboLCS.setText("Ejecutar combo Ejemplo");
        btnExecuteComboLCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeComboExample(evt);
            }
        });

        lblLicenseNumber.setText("Placa");

        btnExecuteCombo4.setText("Ejecutar combo LCS");
        btnExecuteCombo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeComboLCS(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnExecuteCombo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnExecuteComboLCS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExecuteComboLCR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExecuteRRT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExecuteComboLLI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblLicenseNumber)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtLicenseNumber))))
                .addContainerGap(243, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLicenseNumber)
                    .addComponent(txtLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(btnExecuteComboLCS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExecuteComboLCR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExecuteRRT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExecuteComboLLI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExecuteCombo4)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void executeComboLCR(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeComboLCR
        System.out.println("Combo LCR");
        System.out.println("Se realizará un lavado al motor, también se le cambiará el aceite y por último se hará una revisión a la bateria");
        
        IVehicleReceiptService receiptBay = new VehicleReceipt();
        
        ServiceOrderEntity order = receiptBay.receiveVehicle(this.txtLicenseNumber.getText());
        
        IEngineRepairService engineBay = new EngineRepairService();
        
        System.out.println("Se trabajará el vehículo con placas " + order.getVehicle().getLicenseNumber() + " marca " + order.getVehicle().getBrand() + " color " + order.getVehicle().getColor() + " modelo " + order.getVehicle().getModel());
        
        engineBay.MotorWash(order);
        
        engineBay.EngineOilChange(order);
        
        IQAControlService beteryBay = new QAControlService();
        
        beteryBay.batteyReview(order);
        
        IQAControlService lightsBay = new QAControlService();
        
        lightsBay.interiorlights(order);
        
        
            
        
    }//GEN-LAST:event_executeComboLCR

    private void executeComboRRT(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeComboRRT
        System.out.println("Combo RRT");
        
    }//GEN-LAST:event_executeComboRRT

    private void executeComboLLI(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeComboLLI
        System.out.println("Combo LLI");
    }//GEN-LAST:event_executeComboLLI

    private void executeComboExample(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeComboExample
        System.out.println("Combo Ejemplo");
        
        System.out.println("Se realizará un cambio de aceite y rotación de llantas. Por último, un lavado exterior.");
        
        IVehicleReceiptService receiptBay = new VehicleReceipt();
        
        ServiceOrderEntity order = receiptBay.receiveVehicle(this.txtLicenseNumber.getText());
        
        System.out.println("Se trabajará el vehículo con placas " + order.getVehicle().getLicenseNumber() + " marca " + order.getVehicle().getBrand() + " color " + order.getVehicle().getColor() + " modelo " + order.getVehicle().getModel());
    }//GEN-LAST:event_executeComboExample

    private void executeComboLCS(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeComboLCS
        // TODO add your handling code here:
        System.out.println("Combo LCS");
    }//GEN-LAST:event_executeComboLCS

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExecuteCombo4;
    private javax.swing.JButton btnExecuteComboLCR;
    private javax.swing.JButton btnExecuteComboLCS;
    private javax.swing.JButton btnExecuteComboLLI;
    private javax.swing.JButton btnExecuteRRT;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLicenseNumber;
    private javax.swing.JTextField txtLicenseNumber;
    // End of variables declaration//GEN-END:variables
}
