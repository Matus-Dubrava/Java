class Vehicle {
    private int passengers;
    private int fuelcap;
    private int mpg;

    public Vehicle(int p, int f, int m) {
        this.passengers = p;
        this.fuelcap = f;
        this.mpg = m;
    }

    public int getPassengers() {
        return this.passengers;
    }

    public int getFuelcap() {
        return this.fuelcap;
    }

    public int getMpg() {
        return this.mpg;
    }

    public void setPassengers(int p) {
        this.passengers = p;
    }

    public void setFuelcap(int f) {
        this.fuelcap = f;
    }

    public void setMpg(int m) {
        this.mpg = m;
    }

    public void range() {
        System.out.println("Range is " + this.fuelcap * this.mpg);
    }

    public double fuelNeeded(int miles) {
        return (double) miles / this.mpg;
    }
}

class Truck extends Vehicle {
    private int cargocap;

    public Truck(int p, int f, int m, int c) {
        super(p, f, m);
        this.cargocap = c;
    }

    public int getCargo() {
        return this.cargocap;
    }

    public void setCargo(int c) {
        this.cargocap = c;
    }
}

class VehicleDemo {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        minivan.range();

        Truck semi = new Truck(2, 200, 7, 44000);

        double gallons;
        int dist = 252;
        gallons = semi.fuelNeeded(dist);

        System.out.println("Semi can carry: " + semi.getCargo());
        System.out.println("Semi needs " + gallons + " gallons to travel " + dist + " km");
    }
}