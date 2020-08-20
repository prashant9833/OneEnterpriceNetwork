package com.demo.one;

public class BubbleSort {

	public static void main(String[] args) {

		//int[] a={50,20,17,80,10};
		
		String[] a={"Ayushya","Raja","Kamal","Sudhir","Prem"}; //----> For String
		
		for(int i=0;i<a.length;i++){
			
			String temp;
			int flag=0;
			
			for(int j=0;j<a.length-1-i;j++){
				
				if(a[j].compareTo(a[j+1])>0){
					
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
					
				}
				
			}
			
			if(flag==0){
				
				break;
				
			}
		}
		
		for(int i=0;i<a.length;i++){
			
			System.out.print(a[i]+" ");
			
		}
	}

}
