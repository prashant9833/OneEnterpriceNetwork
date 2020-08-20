package com.demo.one;

public class InsertionSort {

	public static void main(String[] args) {

		//int[] a={20,10,50,30,40};
		
		String[] a={"Sonu","Monu","Ishant","Prashant"}; //------------> For String
	    String temp;
	    int j;
		
		for(int i=1;i<a.length;i++){
			
			temp=a[i];
			j=i;
			
			while(j>0 && a[j-1].compareTo(temp)>0){
				
				a[j]=a[j-1];
				j=j-1;
				
			}
			
			a[j]=temp;
			
		}
		
		for(int i=0;i<a.length;i++){
			
			System.out.print(a[i]+" ");
			
		}
	}

}
