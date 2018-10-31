package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyLinkedListQueue queueWoman = new MyLinkedListQueue();
        MyLinkedListQueue queueMan = new MyLinkedListQueue();

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Employee("viet", "NAM", new int[]{1, 1, 1996}));
        employeeArrayList.add(new Employee("hoang", "NAM", new int[]{6, 8, 1997}));
        employeeArrayList.add(new Employee("tung", "NAM", new int[]{14, 10, 1997}));
        employeeArrayList.add(new Employee("huy", "NAM", new int[]{2, 8, 1997}));
        employeeArrayList.add(new Employee("trang", "NU", new int[]{1, 1, 1996}));
        employeeArrayList.add(new Employee("linh", "NU", new int[]{7, 12, 1997}));
        employeeArrayList.add(new Employee("nhung", "NU", new int[]{2, 10, 1997}));
        employeeArrayList.add(new Employee("phuong", "NU", new int[]{1, 10, 1997}));
        selectionSort(employeeArrayList);

        for(int i = 0; i < employeeArrayList.size(); i++){
            if(employeeArrayList.get(i).getSex().equals("NAM")){
                queueMan.enqueue(employeeArrayList.get(i));
            }else{
                queueWoman.enqueue(employeeArrayList.get(i));
            }
        }

        System.out.println("Man Queue: ");
        while(queueMan.getTail() != null){
            System.out.println(queueMan.dequeue());
        }

        System.out.println("Woman Queue: ");
        while(queueWoman.getTail() != null){
            System.out.println(queueWoman.dequeue());
        }
    }

    public static void selectionSort(ArrayList<Employee> arrayList){
        selectionSortYear(arrayList);
        selectionSortMonth(arrayList);
        selectionSortDay(arrayList);
    }

    public static void selectionSortYear(ArrayList<Employee> arrayList){
        for(int i = 0; i < arrayList.size()-1; i++){
            if(arrayList.get(i).getAge()[2] < arrayList.get(i+1).getAge()[2]) {
                swap(arrayList, i, i + 1);
            }
        }
    }

    public static void selectionSortMonth(ArrayList<Employee> arrayList){
        for(int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i).getAge()[2] == arrayList.get(i + 1).getAge()[2]) {
                if (arrayList.get(i).getAge()[1] > arrayList.get(i + 1).getAge()[1]) {
                    swap(arrayList, i, i + 1);
                }
            }
        }
    }

    public static void selectionSortDay(ArrayList<Employee> arrayList){
        for(int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i).getAge()[2] == arrayList.get(i + 1).getAge()[2] && arrayList.get(i).getAge()[1] == arrayList.get(i + 1).getAge()[1]) {
                if (arrayList.get(i).getAge()[0] > arrayList.get(i + 1).getAge()[0]) {
                    swap(arrayList, i, i + 1);
                }
            }
        }
    }
    public static void swap(ArrayList<Employee> arrayList, int i, int j){
        Employee temp = arrayList.get(i);
        Employee temp2 = arrayList.get(i + 1);
        arrayList.remove(i);
        arrayList.remove(i);
        arrayList.add(i, temp);
        arrayList.add(i, temp2);
    }
}
