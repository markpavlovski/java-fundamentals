package com.markpavlovski.getorganized;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("get organized");
        int myVar;
        myVar = 10;
        int otherVar = 100;
        System.out.println(myVar);
        System.out.println(otherVar);
        otherVar = myVar;
        System.out.println(otherVar);
        System.out.println(++otherVar);
        System.out.println(otherVar++);
        int iVal = 50;
        long lVal = iVal;
        System.out.println(lVal);
        long llVal = 50;
        int iiVal = (int) llVal;
        System.out.println(iiVal);
        int vMax = 10 > 5 ? 10 : 5;
        System.out.println(vMax);
        for (int i = 0; i< 10; i++){
            System.out.println(i);
        }

        float[] theVals = new float[3];
        theVals[0] = 10.0f;
        theVals[1] = 11.0f;
        theVals[2] = 12.0f;
        for (int i = 0; i< theVals.length; i++){
            System.out.println(theVals[i]);
        }

        float[] otherVals = {1.0f, 2.0f, 3.0f, 4.0f};
        for (int i = 0; i < otherVals.length; i++){
            System.out.println("\n");
            System.out.println(otherVals[i]);
        }

        float sum = 0f;
        for (float el : otherVals) sum += el;
        System.out.println(sum);

        Flight flight = new Flight();
        System.out.println(flight.passengers);
        flight.addPassenger();
        System.out.println(flight.passengers);
        flight.setSeats(99);
        System.out.println(flight.getSeats());



    }
}


class Flight {

    int passengers;
    private int seats;

    Flight(){
        seats = 150;
        passengers = 0;
    }

    void addPassenger(){
        if (passengers < seats) passengers++;
    }

    int getSeats(){
        return seats;
    }

    void setSeats(int seats){
        this.seats = seats;
    }
}
