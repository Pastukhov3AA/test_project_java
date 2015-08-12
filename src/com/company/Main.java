package com.company;

public class Main {

    public static void main(String[] args) {
        
    }

    public static int [] evaluate(int data[], int p){
        int [] powData = new int [data.length];
        for(int i = 0; i < data.length; ++i){
            Thread myThread = new Thread(new Runnable()
            {
                public void run()
                {
                    powData[i] = extLib.eval(data[i], p);    //Предполагаю, что тип, возвращаемый методом eval - int
                }
            });
            myThread.start();
        }
        return powData;
    }
}
