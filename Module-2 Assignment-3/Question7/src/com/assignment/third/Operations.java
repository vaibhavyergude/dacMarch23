package com.assignment.third;

public class Operations {

	public void addMatrix(int[][] arr1, int[][] arr2) {
		int[][] result=new int[arr1.length][arr1[0].length];
		if(arr1.length==arr2.length && arr1[0].length==arr2[0].length) {
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr1[0].length;j++)
					result[i][j]=arr1[i][j] + arr2[i][j];
			}
			Operations.printRecord(result);
		}
		else
			System.out.println("Rows and columns of both matrix should be same");
	}
	
	public void subtractMatrix(int[][] arr1, int[][] arr2) {
		int[][] result=new int[arr1.length][arr1[0].length];
		if(arr1.length==arr2.length && arr1[0].length==arr2[0].length) {
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr1[0].length;j++)
					result[i][j]=arr1[i][j] - arr2[i][j];
			}
			Operations.printRecord(result);
		}
		else
			System.out.println("Rows and columns of both matrix should be same");
	}
	
	public void multiplyMatrix(int[][] arr1, int[][] arr2) {
		int[][] result=new int[arr1.length][arr2[0].length];
		if(arr1[0].length==arr2.length) {
			for(int i=0;i<result.length;i++) {
				for(int j=0;j<result[0].length;j++) {
					for(int k=0;k<arr2.length;k++) {
						result[i][j]+=arr1[i][k]*arr2[k][j];
					}
				}
			}
			Operations.printRecord(result);
		}
		else
			System.out.println("Col of 1st matrix should be same as row of 2nd matrix ");
	}
	
	public void transposeMatrix(int[][] arr1) {
		int [][] result=new int[arr1[0].length][arr1.length];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				if(i==j)
					result[i][j]=arr1[i][j];
				else
					result[j][i]=arr1[i][j];
			}
		}
		Operations.printRecord(result);
	}
	
	private static void printRecord(int[][] result) {
		for(int[] arr: result) {
			for(int i:arr) 
				System.out.print(i + "	");
			System.out.println();
		}
		
	}

	



	

}
