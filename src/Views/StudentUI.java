package Views;
import Controllers.*;
import Models.*;
import Models.Student;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.*;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.*;
/**
 *
 * @author Shane
 */
public class StudentUI extends javax.swing.JFrame{

    /**
     * Creates new form StudentGUI
     */
    MainMenuCntl theMainMenuCntl;
    JFileChooser chooser;
    BufferedReader br;
    String[] fullName;
    String firstName;
    String lastName;
    int studentId;
    ArrayList<Student> theStudentList;
    File theFile;
    String theCourseId;
    
    
    public StudentUI(MainMenuCntl theMainMenuCntl) {
        this.theMainMenuCntl = theMainMenuCntl;
        initComponents();
        initCustomComponents();
        this.setVisible(true);
    }
    
    
    public void initCustomComponents(){
        this.setTitle("Add Student");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addStudentsLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        userIDLabel = new javax.swing.JLabel();
        userIdField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        bulkAddLabel = new javax.swing.JLabel();
        browseBtn = new javax.swing.JButton();
        separator = new javax.swing.JSeparator();
        browseField = new javax.swing.JTextField();
        courseComboBox = new javax.swing.JComboBox();
        separator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        addStudentsLabel.setText("Add Students");

        firstNameLabel.setText("First Name: ");

        lastNameLabel.setText("Last Name: ");

        userIDLabel.setText("User ID:");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        bulkAddLabel.setText("Bulk Add: ");

        browseBtn.setText("Browse...");
        browseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtnActionPerformed(evt);
            }
        });

        browseField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseFieldActionPerformed(evt);
            }
        });

        courseComboBox.setModel(new javax.swing.DefaultComboBoxModel(PersistentDataModelCntl.getPDMCntl().getPDM().getInstructor().getCourseIds(PersistentDataModelCntl.getPDMCntl().getPDM().getInstructor().getCourseList())));
        courseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Course");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separator)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameLabel)
                            .addComponent(userIDLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastNameField)
                            .addComponent(userIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(firstNameLabel)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(51, 51, 51)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(addStudentsLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(bulkAddLabel)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(browseBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(browseField))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 72, Short.MAX_VALUE)
                                .addComponent(cancelButton)
                                .addGap(18, 18, 18)
                                .addComponent(addButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(separator1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addStudentsLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userIDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(browseBtn)
                    .addComponent(bulkAddLabel)
                    .addComponent(browseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
        theMainMenuCntl.updateMainMenuUI();
        
        theStudentList = PersistentDataModelCntl.getPDMCntl().getPDM().getInstructor().getCourseList().get(0).getStudentList();
        System.out.println("Full List" + theStudentList.size());
        for (int i =  0; i < theStudentList.size(); i++){
                System.out.print(theStudentList.get(i).getFirstName() + " " + theStudentList.get(i).getLastName());
        }
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void browseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtnActionPerformed
        chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "Text Files", "txt");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: " +
                chooser.getSelectedFile().getName());
        }
        browseField.setText(chooser.getSelectedFile().getName());
    }//GEN-LAST:event_browseBtnActionPerformed

    private void browseFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_browseFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
        theCourseId = courseComboBox.getSelectedItem().toString();
        System.out.println(theCourseId);
        
        if (browseField.getText().isEmpty()){
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String userId = userIdField.getText();
            PersistentDataModelCntl.getPDMCntl().getPDM().getInstructor().getCourseById(theCourseId).getStudentList().add(new Student(firstName, lastName, userId));
        }
        
        else { 
            theStudentList = PersistentDataModelCntl.getPDMCntl().getPDM().getInstructor().getCourseById(theCourseId).getStudentList();
            
            try {
                theFile = chooser.getSelectedFile();
                FileReader fileReader = new FileReader(theFile);
                BufferedReader br = new BufferedReader(fileReader);
                StringBuffer stringBuffer = new StringBuffer();
                String line;
                int id = theStudentList.size();
                while ((line = br.readLine()) != null){
                    stringBuffer.append(line);
                    fullName = line.split(" ");
                    System.out.println(fullName[0]);
                    System.out.println(fullName[1]);
                    stringBuffer.append("\n");
                    PersistentDataModelCntl.getPDMCntl().getPDM().getInstructor().getCourseById(theCourseId).getStudentList().add(new Student(fullName[0], fullName[1], "test"));
                }
                fileReader.close();
                System.out.println("Contents of file");
                System.out.println(stringBuffer.toString());
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        
        // Refactor the JTree on the Main Menu
        theMainMenuCntl.getMainMenuUI().populateTree();
        theMainMenuCntl.getMainMenuUI().repaint();
        PersistentDataModelCntl.getPDMCntl().writePDMFile();
    }//GEN-LAST:event_addButtonActionPerformed

    
    private void courseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel addStudentsLabel;
    private javax.swing.JButton browseBtn;
    private javax.swing.JTextField browseField;
    private javax.swing.JLabel bulkAddLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox courseComboBox;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JSeparator separator;
    private javax.swing.JSeparator separator1;
    private javax.swing.JLabel userIDLabel;
    private javax.swing.JTextField userIdField;
    // End of variables declaration//GEN-END:variables
}

