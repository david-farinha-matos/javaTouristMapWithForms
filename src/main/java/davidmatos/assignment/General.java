package davidmatos.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author david
 */
public class General extends javax.swing.JFrame {

    /**
     * Creates new form General
     */
    public General() {
        initComponents();
        setSize(1130, 620);
        updateTable();
        addButtons();
        hideButtons();
    }

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    String facilityName = "";

    ArrayList<JButton> btnHealthcareList = new ArrayList<>();
    ArrayList<JButton> btnEmergencyServicesList = new ArrayList<>();
    ArrayList<JButton> btnTransportationList = new ArrayList<>();
    ArrayList<JButton> btnRentalFacilitiesList = new ArrayList<>();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupCollege = new javax.swing.ButtonGroup();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGeneral = new javax.swing.JTable();
        btnOrangeHospital = new javax.swing.JButton();
        btnQuadBus = new javax.swing.JButton();
        btnVortexCarRental = new javax.swing.JButton();
        btnUltimateCarRental = new javax.swing.JButton();
        btnGreatfeelPharmacy = new javax.swing.JButton();
        btnProrailTram = new javax.swing.JButton();
        btnEastPolice = new javax.swing.JButton();
        btnUrgentAmbulance = new javax.swing.JButton();
        btnRentalRideBikes = new javax.swing.JButton();
        btnRescueFireBrigade = new javax.swing.JButton();
        btnCabsterTaxi = new javax.swing.JButton();
        btnVitaGP = new javax.swing.JButton();
        btnRollinTrain = new javax.swing.JButton();
        btnCipherAAndE = new javax.swing.JButton();
        btnSouthbaseAirport = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbxFacilityType = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnViewFacilities = new javax.swing.JButton();
        txtFacilityAddress = new javax.swing.JTextField();
        txtFacilityName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblMap = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSearchBar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 500));
        getContentPane().setLayout(null);

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(1000, 530, 97, 32);

        tblGeneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "facilityType", "facilityName", "address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblGeneral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGeneralMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGeneral);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(640, 250, 452, 157);

        btnOrangeHospital.setText("Orange Hospital");
        btnOrangeHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrangeHospitalActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrangeHospital);
        btnOrangeHospital.setBounds(100, 180, 140, 23);

        btnQuadBus.setText("Quad Bus");
        btnQuadBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuadBusActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuadBus);
        btnQuadBus.setBounds(350, 350, 120, 23);

        btnVortexCarRental.setText("Vortex Car Rental");
        btnVortexCarRental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVortexCarRentalActionPerformed(evt);
            }
        });
        getContentPane().add(btnVortexCarRental);
        btnVortexCarRental.setBounds(320, 180, 150, 23);

        btnUltimateCarRental.setText("Ultimate Car Rental");
        btnUltimateCarRental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimateCarRentalActionPerformed(evt);
            }
        });
        getContentPane().add(btnUltimateCarRental);
        btnUltimateCarRental.setBounds(140, 450, 160, 23);

        btnGreatfeelPharmacy.setText("Greatfeel Pharmacy");
        btnGreatfeelPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGreatfeelPharmacyActionPerformed(evt);
            }
        });
        getContentPane().add(btnGreatfeelPharmacy);
        btnGreatfeelPharmacy.setBounds(300, 120, 140, 23);

        btnProrailTram.setText("Prorail Tram");
        btnProrailTram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProrailTramActionPerformed(evt);
            }
        });
        getContentPane().add(btnProrailTram);
        btnProrailTram.setBounds(100, 120, 120, 23);

        btnEastPolice.setText("East Police");
        btnEastPolice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEastPoliceActionPerformed(evt);
            }
        });
        getContentPane().add(btnEastPolice);
        btnEastPolice.setBounds(50, 290, 150, 23);

        btnUrgentAmbulance.setText("Urgent Ambulance");
        btnUrgentAmbulance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrgentAmbulanceActionPerformed(evt);
            }
        });
        getContentPane().add(btnUrgentAmbulance);
        btnUrgentAmbulance.setBounds(260, 270, 140, 23);

        btnRentalRideBikes.setText("Rental Ride Bikes");
        btnRentalRideBikes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentalRideBikesActionPerformed(evt);
            }
        });
        getContentPane().add(btnRentalRideBikes);
        btnRentalRideBikes.setBounds(210, 340, 140, 23);

        btnRescueFireBrigade.setText("Rescue Fire Brigade");
        btnRescueFireBrigade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRescueFireBrigadeActionPerformed(evt);
            }
        });
        getContentPane().add(btnRescueFireBrigade);
        btnRescueFireBrigade.setBounds(20, 440, 160, 23);

        btnCabsterTaxi.setText("Cabster Taxi");
        btnCabsterTaxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCabsterTaxiActionPerformed(evt);
            }
        });
        getContentPane().add(btnCabsterTaxi);
        btnCabsterTaxi.setBounds(440, 270, 150, 23);

        btnVitaGP.setText("Vita GP");
        btnVitaGP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVitaGPActionPerformed(evt);
            }
        });
        getContentPane().add(btnVitaGP);
        btnVitaGP.setBounds(420, 450, 120, 23);

        btnRollinTrain.setText("Rollin Train");
        btnRollinTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRollinTrainActionPerformed(evt);
            }
        });
        getContentPane().add(btnRollinTrain);
        btnRollinTrain.setBounds(380, 410, 120, 23);

        btnCipherAAndE.setText("Cipher A and E");
        btnCipherAAndE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCipherAAndEActionPerformed(evt);
            }
        });
        getContentPane().add(btnCipherAAndE);
        btnCipherAAndE.setBounds(240, 420, 140, 23);

        btnSouthbaseAirport.setText("Southbase Airport");
        btnSouthbaseAirport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSouthbaseAirportActionPerformed(evt);
            }
        });
        getContentPane().add(btnSouthbaseAirport);
        btnSouthbaseAirport.setBounds(250, 490, 140, 23);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("General Facilities");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(16, 6, 350, 48);

        cbxFacilityType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Healthcare", "Emergency Services", "Transportation Services", "Rental Facilities" }));
        getContentPane().add(cbxFacilityType);
        cbxFacilityType.setBounds(810, 80, 160, 22);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Select the facility type that you would like to view");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(680, 50, 389, 25);

        btnViewFacilities.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnViewFacilities.setText("View Facilities");
        btnViewFacilities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFacilitiesActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewFacilities);
        btnViewFacilities.setBounds(810, 110, 160, 32);
        getContentPane().add(txtFacilityAddress);
        txtFacilityAddress.setBounds(800, 470, 260, 30);
        getContentPane().add(txtFacilityName);
        txtFacilityName.setBounds(800, 430, 260, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Facility Address");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(670, 470, 123, 25);

        lblMap.setIcon(new javax.swing.ImageIcon("C:\\Users\\david\\OneDrive\\Documents\\NetBeansProjects\\assignment\\src\\main\\java\\davidmatos\\assignment\\bristolMap.jpg")); // NOI18N
        getContentPane().add(lblMap);
        lblMap.setBounds(16, 60, 584, 500);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Facility Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(670, 430, 105, 25);

        txtSearchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchBarKeyReleased(evt);
            }
        });
        getContentPane().add(txtSearchBar);
        txtSearchBar.setBounds(810, 210, 260, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Search Facility");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(680, 210, 120, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Or search the text box to find the facility");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(710, 180, 481, 25);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Click on the record in the table that you would like to view");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(640, 160, 481, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Or");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(880, 140, 30, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void addButtons() {
        btnHealthcareList.addAll(Arrays.asList(btnOrangeHospital, btnCipherAAndE, btnGreatfeelPharmacy, btnVitaGP));
        btnEmergencyServicesList.addAll(Arrays.asList(btnEastPolice, btnRescueFireBrigade, btnUrgentAmbulance));
        btnTransportationList.addAll(Arrays.asList(btnQuadBus, btnRollinTrain, btnProrailTram, btnCabsterTaxi, btnSouthbaseAirport));
        btnRentalFacilitiesList.addAll(Arrays.asList(btnVortexCarRental, btnUltimateCarRental, btnRentalRideBikes));
    }

    public void hideButtons() {

        for (int i = 0; i < btnHealthcareList.size(); i++) {
            btnHealthcareList.get(i).setVisible(false);
        }
        for (int i = 0; i < btnEmergencyServicesList.size(); i++) {
            btnEmergencyServicesList.get(i).setVisible(false);
        }
        for (int i = 0; i < btnTransportationList.size(); i++) {
            btnTransportationList.get(i).setVisible(false);
        }
        for (int i = 0; i < btnRentalFacilitiesList.size(); i++) {
            btnRentalFacilitiesList.get(i).setVisible(false);
        }
    }

    public void showButtons() {
        hideButtons();
        switch (cbxFacilityType.getSelectedItem().toString()) {
            case "Healthcare" -> {
                for (int i = 0; i < btnHealthcareList.size(); i++) {
                    btnHealthcareList.get(i).setVisible(true);
                }
            }
            case "Emergency Services" -> {
                for (int i = 0; i < btnEmergencyServicesList.size(); i++) {
                    btnEmergencyServicesList.get(i).setVisible(true);
                }
            }
            case "Transportation Services" -> {
                for (int i = 0; i < btnTransportationList.size(); i++) {
                    btnTransportationList.get(i).setVisible(true);
                }
            }
            case "Rental Facilities" -> {
                for (int i = 0; i < btnRentalFacilitiesList.size(); i++) {
                    btnRentalFacilitiesList.get(i).setVisible(true);
                }
            }
        }
    }

    private void tblGeneralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGeneralMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblGeneral.getModel();
        int selectedIndex = tblGeneral.getSelectedRow();

        String facilityTypeValue;
        int facilityTypeIndex = 0;

        facilityTypeValue = model.getValueAt(selectedIndex, 1).toString();
        txtFacilityName.setText(model.getValueAt(selectedIndex, 2).toString());
        txtFacilityAddress.setText(model.getValueAt(selectedIndex, 3).toString());

        switch (facilityTypeValue) {
            case "Healthcare" -> facilityTypeIndex = 0;
            case "Emergency Services" -> facilityTypeIndex = 1;
            case "Transportation Services" -> facilityTypeIndex = 2;
            case "Rental Facilities" -> facilityTypeIndex = 3;

        }
        cbxFacilityType.setSelectedIndex(facilityTypeIndex);
        showButtons();
    }//GEN-LAST:event_tblGeneralMouseClicked

    private void btnViewFacilitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFacilitiesActionPerformed

        showButtons();

    }//GEN-LAST:event_btnViewFacilitiesActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Home homeScreen = new Home();
        homeScreen.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnOrangeHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrangeHospitalActionPerformed
        // TODO add your handling code here:
        facilityName = btnOrangeHospital.getText();
        selectFacilityDetails();
    }//GEN-LAST:event_btnOrangeHospitalActionPerformed

    private void btnQuadBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuadBusActionPerformed
        // TODO add your handling code here:
        facilityName = btnQuadBus.getText();
        selectFacilityDetails();
    }//GEN-LAST:event_btnQuadBusActionPerformed

    private void btnVortexCarRentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVortexCarRentalActionPerformed
        // TODO add your handling code here:
        facilityName = btnVortexCarRental.getText();
        selectFacilityDetails();
    }//GEN-LAST:event_btnVortexCarRentalActionPerformed

    private void btnUltimateCarRentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimateCarRentalActionPerformed
        // TODO add your handling code here:
        facilityName = btnUltimateCarRental.getText();
        selectFacilityDetails();
    }//GEN-LAST:event_btnUltimateCarRentalActionPerformed

    private void btnGreatfeelPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGreatfeelPharmacyActionPerformed
        // TODO add your handling code here:
        facilityName = btnGreatfeelPharmacy.getText();
        selectFacilityDetails();
    }//GEN-LAST:event_btnGreatfeelPharmacyActionPerformed

    private void btnProrailTramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProrailTramActionPerformed
        // TODO add your handling code here:
        facilityName = btnProrailTram.getText();
        selectFacilityDetails();
    }//GEN-LAST:event_btnProrailTramActionPerformed

    private void btnEastPoliceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEastPoliceActionPerformed
        // TODO add your handling code here:
        facilityName = btnEastPolice.getText();
        selectFacilityDetails();
    }//GEN-LAST:event_btnEastPoliceActionPerformed

    private void btnUrgentAmbulanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrgentAmbulanceActionPerformed
        // TODO add your handling code here:
        facilityName = btnUrgentAmbulance.getText();
        selectFacilityDetails();
    }//GEN-LAST:event_btnUrgentAmbulanceActionPerformed

    private void btnRentalRideBikesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentalRideBikesActionPerformed
        // TODO add your handling code here:
        facilityName = btnRentalRideBikes.getText();
        selectFacilityDetails();
    }//GEN-LAST:event_btnRentalRideBikesActionPerformed

    private void btnRescueFireBrigadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRescueFireBrigadeActionPerformed
        // TODO add your handling code here:
        facilityName = btnRescueFireBrigade.getText();
        selectFacilityDetails();
    }//GEN-LAST:event_btnRescueFireBrigadeActionPerformed

    private void btnCabsterTaxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCabsterTaxiActionPerformed
        // TODO add your handling code here:
        facilityName = btnCabsterTaxi.getText();
        selectFacilityDetails();
    }//GEN-LAST:event_btnCabsterTaxiActionPerformed

    private void btnVitaGPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVitaGPActionPerformed
        // TODO add your handling code here:
        facilityName = btnVitaGP.getText();
        selectFacilityDetails();
    }//GEN-LAST:event_btnVitaGPActionPerformed

    private void btnRollinTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRollinTrainActionPerformed
        // TODO add your handling code here:
        facilityName = btnRollinTrain.getText();
        selectFacilityDetails();
    }//GEN-LAST:event_btnRollinTrainActionPerformed

    private void btnCipherAAndEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCipherAAndEActionPerformed
        // TODO add your handling code here:
        facilityName = btnCipherAAndE.getText();
        selectFacilityDetails();
    }//GEN-LAST:event_btnCipherAAndEActionPerformed

    private void btnSouthbaseAirportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSouthbaseAirportActionPerformed
        // TODO add your handling code here:
        facilityName = btnSouthbaseAirport.getText();
        selectFacilityDetails();
    }//GEN-LAST:event_btnSouthbaseAirportActionPerformed

    private void txtSearchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchBarKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblGeneral.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tblGeneral.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearchBar.getText().trim()));
    }//GEN-LAST:event_txtSearchBarKeyReleased

    public void selectFacilityDetails() {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/david/OneDrive/Documents/CityPlanner.accdb");
            pst = con.prepareStatement("SELECT * FROM General WHERE facilityName=?");
            pst.setString(1, facilityName);
            rs = pst.executeQuery();

            while (rs.next()) {
                txtFacilityName.setText(rs.getString("facilityName"));
                txtFacilityAddress.setText(rs.getString("address"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EditUser.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateTable() {
        try {
            int c;
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/david/OneDrive/Documents/CityPlanner.accdb");
            pst = con.prepareStatement("SELECT * FROM General");
            rs = pst.executeQuery();

            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            DefaultTableModel dft = (DefaultTableModel) tblGeneral.getModel();
            dft.setRowCount(0);

            while (rs.next()) {
                Vector vector = new Vector();
                for (int i = 1; i <= c; i++) {
                    vector.add(rs.getString("ID"));
                    vector.add(rs.getString("facilityType"));
                    vector.add(rs.getString("facilityName"));
                    vector.add(rs.getString("address"));
                }
                dft.addRow(vector);

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EditUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EditUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new General().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCabsterTaxi;
    private javax.swing.JButton btnCipherAAndE;
    private javax.swing.JButton btnEastPolice;
    private javax.swing.JButton btnGreatfeelPharmacy;
    private javax.swing.ButtonGroup btnGroupCollege;
    private javax.swing.JButton btnOrangeHospital;
    private javax.swing.JButton btnProrailTram;
    private javax.swing.JButton btnQuadBus;
    private javax.swing.JButton btnRentalRideBikes;
    private javax.swing.JButton btnRescueFireBrigade;
    private javax.swing.JButton btnRollinTrain;
    private javax.swing.JButton btnSouthbaseAirport;
    private javax.swing.JButton btnUltimateCarRental;
    private javax.swing.JButton btnUrgentAmbulance;
    private javax.swing.JButton btnViewFacilities;
    private javax.swing.JButton btnVitaGP;
    private javax.swing.JButton btnVortexCarRental;
    private javax.swing.JComboBox<String> cbxFacilityType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMap;
    private javax.swing.JTable tblGeneral;
    private javax.swing.JTextField txtFacilityAddress;
    private javax.swing.JTextField txtFacilityName;
    private javax.swing.JTextField txtSearchBar;
    // End of variables declaration//GEN-END:variables
}
