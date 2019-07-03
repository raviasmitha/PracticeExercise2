package com.stackroute.exercise2;

public class StudentGrades {

    // to find the maximum marks

    public int maximum(int [] arr,int length){
        int max=arr[0];
        for(int i=1;i<length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    // to find the minimum marks

    public int minimum(int [] arr,int length){
        int min=arr[0];
        for(int i=1;i<length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    // to find the average of marks

    public double average(int [] arr, int length){
        int sum=0;
        for(int i=0;i<length;i++){
            sum+=arr[i];
        }
        double avg=sum/length;
        return avg;
    }
}

