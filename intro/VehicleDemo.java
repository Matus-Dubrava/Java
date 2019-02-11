class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    void range() {
        System.out.println("Range is " + fuelcap * mpg);
    }

    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}

class VehicleDemo {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle(7, 16, 21);

        minivan.range();
    }
}