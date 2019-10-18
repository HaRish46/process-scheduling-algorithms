import java.awt.*;  
import java.awt.event.*;

import javax.sound.midi.Synthesizer;
import javax.swing.*;
import javax.swing.JFrame.*;
import javafx.scene.control.TextField;  
public class PriPUI extends Frame {  
    JTextField[] tfArrival; 
    JTextField[] tfBurst; 
    JTextField[] tfTurnAround; 
    JTextField[] tfWaiting; 
    JTextField[] tfPriority;
    Label lb[];
    Button b;
    Button b1,b2,b3;  
    int n;    
    JTextArea lb2,lb3;
    Frame frame;
    Label lbCount,lbType,lbGnatt,lbProcess;
    PriP prinp;
    JPanel c1,c2;
    GridBagConstraints c;
    int t,t1;
    PriPUI(int n){ 
        setTitle("Priority Premptive");
        c = new GridBagConstraints();
        this.n=n;
        lb2=new JTextArea();
        lb2.setEditable(false);
        lb3=new JTextArea();
        lb2.setEditable(false);
        b2=new Button("Finish");
        b3=new Button("Next");
        c2 =new JPanel();
        c1 =new JPanel();
        lbGnatt=new Label("Gantt Table");
        lbProcess=new Label("Process");
        c1.setLayout(new GridLayout(n+2,6));
        c2.setLayout(new GridLayout(3,1));
        setLayout(new GridBagLayout());
        c.fill = GridBagConstraints.HORIZONTAL;
        
        c.gridx = 0;
        c.gridy = 0;
        add(c1,c);
        
        c.gridx = 0;
        c.gridy = 1;
        add(c2,c);
        c2.add(lbGnatt);
        c2.add(lb2);
        c2.add(lbProcess);
        c2.add(lb3);
        c2.add(b2);
        setVisible(true);
        b=new Button("Submit");
        
        tfArrival=new JTextField[n];
        tfBurst=new JTextField[n];
        tfTurnAround=new JTextField[n];
        tfWaiting=new JTextField[n];
        tfPriority=new JTextField[n];
        lb=new Label[n+6];
        lb[0]=new Label("Process");
        lb[1]=new Label("Arrival time");
        lb[2]=new Label("Burst time");
        lb[3]=new Label("Priority");
        c1.add(lb[0]);
        c1.add(lb[1]);
        c1.add(lb[2]);
        lb[4]=new Label("TurnAround");
        lb[5]=new Label("Wating");
        c1.add(lb[3]);
        c1.add(lb[4]);
        c1.add(lb[5]);
        for(int i=0;i<n;i++){
            lb[i+5]=new Label("process "+(i+1));
            c1.add(lb[i+5]);
            tfArrival[i]=new JTextField();
            c1.add(tfArrival[i]);
            tfBurst[i]=new JTextField();
            c1.add(tfBurst[i]);
            tfPriority[i]=new JTextField();
            c1.add(tfPriority[i]);
            tfTurnAround[i]=new JTextField();
            c1.add(tfTurnAround[i]);
            tfTurnAround[i].setEditable(false);
            tfWaiting[i]=new JTextField();
            tfWaiting[i].setEditable(false);
            c1.add(tfWaiting[i]);
        }
        c1.add(b);
        c1.add(new Label());
        c1.add(b3);
        c1.add(new Label());
        c1.add(new Label());
        c1.setVisible(true);
        setSize(400,500);  
        addListeners();
        setVisible(true); 
        setSize(600,400); 
        
    }
    public void addListeners(){
    
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                          System.exit(0);
            }
          });


        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(t1<=t+1){
                    prinp.display(prinp.a,prinp.b,prinp.c,t1);
                    lb2.setText(prinp.getGnat());
                    lb3.setText(prinp.getProcess());
                    t1++;
                }
                else{
                    for(int i=0;i<n;i++){
                        tfWaiting[i].setText(" "+prinp.a[i][3]);
                        tfTurnAround[i].setText(" "+prinp.a[i][2]);
                    }
                }
                }
            });
       b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });

        b.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {  
        prinp=new PriP(n); 
        t1=0;
        
        for(int i=0;i<n;i++){
            prinp.a[i][0]=Integer.parseInt(tfArrival[i].getText());
            prinp.a[i][3]=prinp.a[i][1]=Integer.parseInt(tfBurst[i].getText());
            prinp.a[i][4]=Integer.parseInt(tfPriority[i].getText());
            prinp.t+=prinp.a[i][1];
            
        }
        prinp.c=new int[prinp.t+2];
        for(int i=0;i<n;i++)prinp.b[i]=0;
        for(int i=0;i<prinp.t;i++)prinp.c[i]=0;
        t=prinp.t;
        t1=0;
    }
        });
    }
    
    }
      