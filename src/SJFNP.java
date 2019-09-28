import java.util.*;
import java.lang.*;
public class SJFNP{
     public int n,t,q,r,j,s,m,rr,sj;
     public int[][] a;
     public int [] b,c;
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
        //System.out.print(" f "+ sj +"\n");
        if(p<t){
            for(int k=0;k<n;k++)
                if(a[k][0]==p)b[q++]=k+1;
        }
        if(sj==-1){
            for(int i=0;i<n;i++){
                if(b[i]!=0)
                {
                    sj=i;
                    i=n;
                }
            }
            if(sj==-1)sj=0;
            for(int i=sj;i<n;i++){
                if(b[i]!=0)
                if(a[b[i]-1][1]<a[b[sj]-1][1]){
                    sj=i;
                }
            }//System.out.print(" fr "+ sj +"\n");
            //for(int i=0;i<n;i++)System.out.print(b[i]);
            if(b[sj]!=0){
            if(r<t){
                c[r++]=b[sj];
                a[b[sj]-1][1]--;
            }
            if(a[b[sj]-1][1]==0){
                a[b[sj]-1][2]=p-a[b[sj]-1][0]+1;
            a[b[sj]-1][3]=a[b[sj]-1][2]-a[b[sj]-1][3];
                b[sj]=0;
                sj=-1;
            }}
            //q++;
        }
        
        else{
            if(r<t){
                c[r++]=b[sj];
                a[b[sj]-1][1]--;
            }
            if(a[b[sj]-1][1]==0){
                
            a[b[sj]-1][2]=p-a[b[sj]-1][0]+1;
            a[b[sj]-1][3]=a[b[sj]-1][2]-a[b[sj]-1][3];
            b[sj]=0;
                sj=-1;
            }
            //if(j<n)
            //a[b[j]-1][1]--;
        }
        
    }
    SJFNP(int n){
        t=q=r=s=0;j=0;
        sj=-1;
        this.n=n;
        //Scanner in = new Scanner(System.in);
        //n=Integer.parseInt(in.nextLine());System.out.print(n);
        System.out.print(n);
        //for(int i=0;i<n;i++) System.out.print(a[i][0]+" "+a[i][1]+" "+a[i][2]+" "+a[i][3]+" \n");
       a=new int[n][4];
        

        b=new int[n];
        //for(int i=0;i<n;i++)b[i]=0;
        
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

}