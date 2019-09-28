import java.util.*;
import java.lang.*;
public class FCFS{
    public int n,t,q,r,j,s,m;
    public int[][] a;
    public int[] b,c;
    void display(int a[][],int b[],int c[],int p){
        for(int i=0;i<n;i++){
            if(b[i]!=0)
            System.out.print(b[i]+"  ");
            else System.out.print(" - ");
        }System.out.print(" \n");
        for(int i=0;i<t;i++){
            if(c[i]!=0)
            System.out.print(c[i]+" ");
            else System.out.print(" - ");
        }System.out.print(" \n");

        if(p<t){
            for(int k=0;k<n;k++)
                if(a[k][0]==p)b[q++]=k+1;
        }
        if(b[j]!=0 && a[b[j]-1][1]==0){
            a[b[j]-1][2]=p-a[b[j]-1][0];
            a[b[j]-1][3]=a[b[j]-1][2]-a[b[j]-1][3];
            b[j++]=0;
            if(r<t)
            c[r++]=b[j];
            if(j<n)
            a[b[j]-1][1]--;
            //q++;
        }
        else{
            if(b[j]!=0)
           {a[b[j]-1][1]--;
            c[r++]=b[j];}
        }
        
    }
    public String getGnat(){
        String s=new String();
        for(int i=0;i<n;i++){
            if(b[i]==0){
                s+=" - | ";
            }
            else s+=b[i]+" | ";
        }System.out.print("\n"+s+" f\n");
        return s;
    }
    public String getProcess(){
        String s=new String();
        for(int i=0;i<t;i++){
            if(c[i]==0){
                s+=" - | ";
            }
            else s+=c[i]+" | ";
        }System.out.print("\n"+s+" fp\n");
        return s;
    }
    FCFS(int n){
        this.n=n;
        t=q=r=s=0;j=0;
        //System.out.print("enter total number of jobs:");
        //Scanner in = new Scanner(System.in);
        //n=Integer.parseInt(in.nextLine());System.out.print(n);
        a=new int[n][4];
        
        for(int i=0;i<n;i++) System.out.print(a[i][0]+" "+a[i][1]+" "+a[i][2]+" "+a[i][3]+" \n");

        //int[] h=new int[t];
       
        //for(int i=0;i<t;i++)System.out.print(h[i]);

        b=new int[n];
        
        System.out.print("\n"+t);
        //for(int i=0;i<n;i++) System.out.print(a[i][0]+" "+a[i][1]+" "+a[i][2]+" "+a[i][3]+" \n");
    }
}