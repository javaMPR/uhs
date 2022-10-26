package com.uhs.components;

import com.uhs.swing.MyTextArea;
import com.uhs.swing.MyTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class AddReport{
    public String[] stringprec;
    AddReport(){}
    AddReport(String pnme,String pmal,String dnam,String dmal){

        // create JFrame and JTable
        JFrame frame = new JFrame();
        JTable table = new JTable(){
            public boolean isCellEditable(int row,int column){
                return false;
            }
            @Override
            public Component prepareRenderer(TableCellRenderer renderer, int row,
                                             int col) {
                Component comp = super.prepareRenderer(renderer, row, col);
                ((JLabel) comp).setHorizontalAlignment(JLabel.CENTER);
                return comp;
            }
        };
        JTableHeader th=table.getTableHeader();
        th.setPreferredSize(new Dimension(30,40));

        // create a table model and set a Column Identifiers to this model
        Object[] columns = {"Report Id","Disease","Doctor","DEmail Id","Date","Till Date","Description","Prescription","Doses"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        // set the model to the table
        table.setModel(model);

        // Change A JTable Background Color, Font Size, Font Color, Row Height
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);
        Font font = new Font("",1,22);
        table.setFont(font);
        table.setRowHeight(30);

        // create JButtons
        JButton btnAdd = new JButton("Add");


        // create JScrollPane
        JScrollPane pane = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        pane.setBounds(0, 47, 1040, 200);
        table.setRowHeight(30);
        //table.setShowGrid(true);
        TableColumnModel columnModel=table.getColumnModel();
        columnModel.getColumn(3).setPreferredWidth(120);
        columnModel.getColumn(7).setPreferredWidth(120);
        columnModel.getColumn(8).setPreferredWidth(30);
        table.setFont(new Font("sansserif", Font.BOLD, 12));
        table.setGridColor(new Color(230, 230, 230));
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.setShowGrid(false);
        table.setShowVerticalLines(false);
        th.setFont(new Font("sansserif", Font.BOLD, 12));
        th.setBackground(Color.gray);

        JLabel reporthead=new JLabel("ADD NEW REPORT:");
        JLabel rid=new JLabel("REPORT Id:");
        JLabel pid=new JLabel("PATIENT EMAIL:");
        JLabel pname=new JLabel();
        JLabel did=new JLabel();
        JLabel dname=new JLabel();
        JLabel disease=new JLabel("DISEASE:");
        JLabel descp=new JLabel("PRESCRIPTION:");
        JLabel Drec=new JLabel("REPORT DATE:");
        JLabel Dupto=new JLabel("REPORT UPTO:");
        JLabel description=new JLabel("Report needed:");
        JLabel doses=new JLabel("DOSE:");

        MyTextField trid=new MyTextField();
        MyTextField tdisease=new MyTextField();
        MyTextArea tdescp=new MyTextArea();
        MyTextField tDrec=new MyTextField();
        MyTextField tDupto=new MyTextField();
        MyTextField tdescription=new MyTextField();
        MyTextField tdoses=new MyTextField();

        pname.setBounds(5,5,200,40);
        pname.setText("Patient Name : "+String.valueOf(pnme));
        pname.setFont(new Font("sansserif", Font.BOLD, 16));
        frame.add(pname);
        pid.setBounds(330,5,600,40);
        pid.setText("Patient Email Id : "+String.valueOf(pmal));
        pid.setFont(new Font("sansserif", Font.BOLD, 16));
        frame.add(pid);
        reporthead.setBounds(3,250,300,30);
        reporthead.setFont(new Font("sansserif", Font.BOLD, 18));
        frame.add(reporthead);
        rid.setBounds(5,280,100,40);
        rid.setFont(new Font("sansserif", 2, 16));
        frame.add(rid);
        trid.setBounds(120,280,200,40);
        trid.setFont(new Font("sansserif", 1, 14));
        trid.setHint("Enter report Id");
        frame.add(trid);
        dname.setBounds(5,320,300,40);
        dname.setText("Prescribe By Doctor : "+String.valueOf(dnam));
        dname.setFont(new Font("sansserif", 2, 16));
        frame.add(dname);
        did.setBounds(440,320,360,40);
        did.setText("Doctor Email Id : "+String.valueOf(dmal));
        did.setFont(new Font("sansserif", 2, 16));
        frame.add(did);
        disease.setBounds(5,360,100,40);
        disease.setFont(new Font("sansserif", 2, 16));
        frame.add(disease);
        tdisease.setBounds(120,360,200,40);
        tdisease.setFont(new Font("sansserif", 1, 14));
        tdisease.setHint("Diagnosis disease:");
        frame.add(tdisease);
        descp.setBounds(440,410,150,40);
        descp.setFont(new Font("sansserif", 2, 16));
        frame.add(descp);
        tdescp.setBounds(570,410,200,80);
        tdescp.setFont(new Font("sansserif", 1, 14));
        tdescp.setHint("Medicine Name");
        frame.add(tdescp);
        Drec.setBounds(440,280,180,40);
        Drec.setFont(new Font("sansserif", 2, 16));
        frame.add(Drec);
        tDrec.setBounds(570,280,200,40);
        tDrec.setFont(new Font("sansserif", 1, 14));
        tDrec.setHint("DD-MM-YYYY");
        frame.add(tDrec);
        Dupto.setBounds(440,360,180,40);
        Dupto.setFont(new Font("sansserif", 2, 16));
        frame.add(Dupto);
        tDupto.setBounds(570,360,200,40);
        tDupto.setFont(new Font("sansserif", 1, 14));
        tDupto.setHint("DD-MM-YYYY");
        frame.add(tDupto);
        description.setBounds(5,410,120,40);
        description.setFont(new Font("sansserif", 2, 16));
        frame.add(description);
        tdescription.setBounds(120,410,200,40);
        tdescription.setFont(new Font("sansserif", 1, 14));
        tdescription.setHint("Xrays,City scan,etc");
        frame.add(tdescription);
        doses.setBounds(5,460,120,40);
        doses.setFont(new Font("sansserif", 2, 16));
        frame.add(doses);
        tdoses.setBounds(120,460,50,40);
        tdoses.setFont(new Font("sansserif", 1, 14));
        tdoses.setHint("dose");
        JLabel d1=new JLabel("per day");
        frame.add(d1);
        d1.setBounds(180,460,80,40);
        d1.setFont(new Font("sansserif", 2, 16));
        frame.add(tdoses);

        frame.add(btnAdd);
        btnAdd.setBounds(858, 325, 100, 25);
        JButton btnDelete = new JButton("Clear");
        btnDelete.setBounds(858,380,100,25);
        frame.add(btnDelete);
        frame.setLayout(null);
        frame.add(pane);
        Object[] row = new Object[9];
        Object[] r00001={"R00001","Flue","Shubhum","shubhum123@hotmail.com","10-10-2022","29-10-2022","Xray of L2","Dolo350,crocin","3"};
        model.addRow(r00001);

        // button add row
        btnAdd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                row[0] = trid.getText();
                row[1] = tdisease.getText();
                row[2] = dnam;
                row[3] = dmal;
                row[4] = tDrec.getText();
                row[5] = tDupto.getText();
                row[6] = tdescription.getText();
                row[7] = tdescp.getText();
                row[8] = tdoses.getText();


                // add row to the model
                model.addRow(row);
            }
        });
        btnDelete.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                trid.setText("");
                tdisease.setText("");
                tdescp.setText("");
                tDrec.setText("");
                tDupto.setText("");
                tdescription.setText("");
                tdoses.setText("");
            }
        });
        // get selected row data From table to textfields
        table.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e){

                // i = the index of the selected row
                int i = table.getSelectedRow();
                String repID=model.getValueAt(i,0).toString();
                String rdisease=model.getValueAt(i,1).toString();
                String rdocn=model.getValueAt(i,2).toString();
                String rdocID=model.getValueAt(i,3).toString();
                String rdrec=model.getValueAt(i,4).toString();
                String rdupto=model.getValueAt(i,5).toString();
                String rcomment=model.getValueAt(i,6).toString();
                String rpres=model.getValueAt(i,7).toString();
                String rdose=model.getValueAt(i,8).toString();

                JOptionPane.showMessageDialog(null,model.getValueAt(i,7));
                Prescription pres=new Prescription(pnme,pmal,repID,rdocn,rdocID,rdisease,rdrec,rdupto,rcomment,rpres,rdose);
/*
                textId.setText(model.getValueAt(i, 0).toString());
                textFname.setText(model.getValueAt(i, 1).toString());
                textLname.setText(model.getValueAt(i, 2).toString());
                textAge.setText(model.getValueAt(i, 3).toString());*/
            }
        });


        frame.getContentPane().setBackground(Color.white);
        frame.setLocation(370,150);
        frame.setSize(1040,600);
        //frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public static void main(String[] args){
        new AddReport("user","user@gmail.com","user","user@gmail.com");

    }
}

/*
f.setSize(690, 600);
        f.setLocation(370,150);
        //f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
        }
public static void main(String[] args){
        new AddReport("Username","user@gmail.com");
        }
*/