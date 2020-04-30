package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.view;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ServiceOrderEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.BrakeRepairService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.CarCleaningService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.CustomsService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.EngineRepairService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.IBrakeRepairService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.ICarCleaningService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.ICustomsService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.IEngineRepairService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.IVehicleReceiptService;
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
        btnExecuteComboPREMIUM = new javax.swing.JButton();
        btnExecuteECONOMIC = new javax.swing.JButton();
        btnExecuteComboLCS = new javax.swing.JButton();
        lblLicenseNumber = new javax.swing.JLabel();
        txtLicenseNumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnExecuteComboPREMIUM.setText("Ejecutar combo PREMIUM");
        btnExecuteComboPREMIUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeComboPREMIUM(evt);
            }
        });

        btnExecuteECONOMIC.setText("Ejecutar combo ECONOMIC");
        btnExecuteECONOMIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeComboECONOMIC(evt);
            }
        });

        btnExecuteComboLCS.setText("Ejecutar combo Ejemplo");
        btnExecuteComboLCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeComboExample(evt);
            }
        });

        lblLicenseNumber.setText("Placa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnExecuteComboLCS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExecuteComboPREMIUM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExecuteECONOMIC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLicenseNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLicenseNumber)))
                .addContainerGap(226, Short.MAX_VALUE))
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
                .addComponent(btnExecuteComboPREMIUM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExecuteECONOMIC)
                .addContainerGap(180, Short.MAX_VALUE))
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

    private void executeComboPREMIUM(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeComboPREMIUM
        
        System.out.println("---------------------------");
        System.out.println("Combo PREMIUN");
        System.out.println("Se realizaran los siguientes servicios: ");
        System.out.println("1. \tLavado de Motor,\n" +
        "2. \tCambio de aceite al motor,\n" +
        "3. \tRevisión de bateria.\n" +
        "4. \tRevisión de luces interiores,\n" +
        "5. \tRotación de llantas,\n" +
        "6 \tInstalacion de tapón de tanque de combustible\n");
        IVehicleReceiptService receiptBay = new VehicleReceipt();
        ServiceOrderEntity order = receiptBay.receiveVehicle(this.txtLicenseNumber.getText());
        IEngineRepairService engineBay = new EngineRepairService();
        System.out.println("Se trabajará el vehículo con placas " + order.getVehicle().getLicenseNumber() + " marca " + order.getVehicle().getBrand() + " color " + order.getVehicle().getColor() + " modelo " + order.getVehicle().getModel());
        
        IBrakeRepairService beteryBay = new BrakeRepairService();
        IBrakeRepairService lightsBay = new BrakeRepairService();
        IBrakeRepairService tireBay = new BrakeRepairService();
        ICustomsService customsBay = new CustomsService();
        
        engineBay.MotorWash(order);
        engineBay.EngineOilChange(order);
        beteryBay.batteyReview(order);
        lightsBay.interiorlights(order);
        tireBay.tireRotation(order);
        customsBay.fueltankInstallation(order);
        
    }//GEN-LAST:event_executeComboPREMIUM

    private void executeComboECONOMIC(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeComboECONOMIC
         System.out.println("---------------------------");
        System.out.println("Combo ECONOMIC");
        System.out.println("Se realizaran los siguientes servicios: ");
        System.out.println("1. \tRevisión de batería y su nivel\n" +
        "2. \tLimpieza de tapicería\n" +
        "3. \tCambio de filtro de aceite.\n" +
        "4. \tServicio al sistema de enfriamiento cada 80,000km\n" );
        
        IVehicleReceiptService receiptBay = new VehicleReceipt();
        ServiceOrderEntity order = receiptBay.receiveVehicle(this.txtLicenseNumber.getText());
        IEngineRepairService batteryBay = new EngineRepairService();
        ICarCleaningService upholsteryBay = new CarCleaningService();
        ICustomsService customsBar = new CustomsService();
        IEngineRepairService engineBay = new EngineRepairService();
        
        System.out.println("Se trabajará el vehículo con placas " + order.getVehicle().getLicenseNumber() + " marca " + order.getVehicle().getBrand() + " color " + order.getVehicle().getColor() + " modelo " + order.getVehicle().getModel());
        
        batteryBay.BatteryCheckandLevel(order);
        upholsteryBay.UpholsteryCleaning(order);
        customsBar.OilFilterChange(order);
        engineBay.systemCooling(order);
        
        
        
    }//GEN-LAST:event_executeComboECONOMIC

    private void executeComboExample(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeComboExample
        
        System.out.println("Combo Ejemplo");
        System.out.println("Se realizará un cambio de aceite y rotación de llantas. Por último, un lavado exterior.");
        IVehicleReceiptService receiptBay = new VehicleReceipt();
        ServiceOrderEntity order = receiptBay.receiveVehicle(this.txtLicenseNumber.getText());
        System.out.println("Se trabajará el vehículo con placas " + order.getVehicle().getLicenseNumber() + " marca " + order.getVehicle().getBrand() + " color " + order.getVehicle().getColor() + " modelo " + order.getVehicle().getModel());
    }//GEN-LAST:event_executeComboExample

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExecuteComboLCS;
    private javax.swing.JButton btnExecuteComboPREMIUM;
    private javax.swing.JButton btnExecuteECONOMIC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLicenseNumber;
    private javax.swing.JTextField txtLicenseNumber;
    // End of variables declaration//GEN-END:variables
}
