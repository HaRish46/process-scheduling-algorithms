import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;
import javax.swing.JFrame.*;

import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldTreeCell;
public class OSAssesAlgo1 extends Frame implements ActionListener{  
    JTextField tf1;  
    List l1;
    Button b1;  
    int n;    
    Label lbCount,lbType;
    OSAssesAlgo1(int n){ 
        //Container c=new Container();
        //add(c);
        this.n=n;
        
        //tf1.setBounds(50,50,150,20);  
        l1=new List(4, false);  
       // l1.setBounds(100,100, 70,70);  
        l1.add("FCFS");  
        l1.add("SJF Non-Preemtive");  
        l1.add("SJF Preemtive");  
        l1.add("Priority Non-Preemtive");
        l1.add("Priority Preemtive");
        l1.add("Round Roubin");
        b1=new Button("Submit");
        lbCount=new Label("Total Processes:");
       lbType=new Label("Select Algorithm:");
        b1.addActionListener(this);  
        add(lbCount);
        tf1=new JTextField();  
        add(tf1);
        add(lbType);
        add(l1);
        add(new Label());
        add(b1); 
        add(new Label());
        setSize(500,200);  
        setLayout(new GridLayout(2,4));  
        setVisible(true);  
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                          System.exit(0);
            }
          });
        
    }         
    public void actionPerformed(ActionEvent e) {  
        String s1=tf1.getText();  
       String type1=l1.getItem(l1.getSelectedIndex());
       if(type1.equals(new String("FCFS"))){
       new FCFSUI(Integer.parseInt(s1));  
       }else if(type1.equals(new String("SJF Non-Preemtive"))){
        new SJFNPUI(Integer.parseInt(s1));  
        }
        else if(type1.equals(new String("SJF Preemtive"))){
            new SJFPUI(Integer.parseInt(s1));
        }
        else if(type1.equals(new String("Priority Non-Preemtive"))){
            new PriNPUI(Integer.parseInt(s1));
        }
        else if(type1.equals(new String("Priority Preemtive"))){
            new PriPUI(Integer.parseInt(s1));
        }
        else if(type1.equals(new String("Round Roubin"))){
            new RRUI(Integer.parseInt(s1));
        }

    }  
public static void main(String[] args) {  
    new OSAssesAlgo1(2);  
}  
}  