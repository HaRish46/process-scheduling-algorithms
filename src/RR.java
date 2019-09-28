

import java.awt.*;  
import java.awt.event.*;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.JFrame.*;
public class RR {
	public int count=0;
	public int[] at,bt,p,s,ct;
	public int n,tt=0;
	public int tq;
	String s1;
	RR(int n)
	{
		this.n=n;
		s1=new String(" ");
		at=new int[n];
		bt=new int[n];
		p=new int[n];
		s=new int[n];
		ct=new int[n];
		int i;
	}
	public void calculate(){
		
		int t=-1;
		for(int i=0;i<tt;i++)
		{
			t=pickProcess(i,t);
			if(t==-1)
			{
				break;
			}
			s1+=" | "+(t+1);//System.out.print(s+"\n");
			if(bt[t]-tq<0)
			{
				bt[t]=0;
			}
			else
			{
				bt[t]=bt[t]-tq;
				i++;
			}
		}
		//System.out.println("process completed");
		
	}
	public int pickProcess(int l,int temp) {
		int i=0,t=0,q;
		for(i=0;i<n;i++)
		{
			if((at[i]<=l && s[i]==0) && i!=temp)
			{
				s[i]=1;
				p[i]=count++;
			}
		}
		if(temp!=-1)
		{
		p[temp]=count++;
		s[temp]=1;
		}
		//finding shortest
		q=0;
		int c=0;
		for(i=0;i<n;i++)
		{
			if(bt[i]!=0)
			{
				
			if(p[i]<p[q] && p[i]!=-1)
			{
				q=i;
			}
			}
		}
		s[q]=0;
		return q;
	}
	public String get(){
		return s1;
	} 
}
