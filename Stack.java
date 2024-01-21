import java.io.*;
import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        stackMethods St = new stackMethods();
        St.Menu();
        
        read.close();
    }
}

class stackMethods {
    Scanner read = new Scanner(System.in);
    int[] stk = new int[10];
    int top = -1;

    void push(int x) {
        if(top == stk.length-1){
            System.out.println("Overflow, Stack is full");
            return;
        }
        top = top + 1;
        stk[top] = x;
    }
    int pop() {
        if(top == -1){
            System.out.println("Underflow, Stack is empty");
            return 0;
        }
        int val = stk[top];
        top = top - 1;
        return val;
    }
    void printStack(int[] arr){
        for(int i = top; i >= 0; i--){
            System.out.print(" |"+arr[i]+"\n");
        }
    }
    void Menu(){
        
        int ch=0, val;
        System.out.println("Operations on Stack: ");
        while(ch != 4) {
            System.out.print("1.Push 2.Pop  3.Display  4.Exit : ");
            ch = read.nextInt();
        
            switch(ch){
                case 1: 
                System.out.print("Enter value: ");
                val = read.nextInt();
                this.push(val);
                break;
        
                case 2:
                val = this.pop();
                System.out.println("Popped "+val);
                break;
        
                case 3:
                System.out.println("--Stack--");
                this.printStack(this.stk);
                System.out.println();
                break;
        
                case 4:
                System.exit(0);
                break;

        
                default:
                System.out.println("Invalid input");
        
            }
        }
    }
}

