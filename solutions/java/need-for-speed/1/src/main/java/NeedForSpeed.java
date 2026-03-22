class NeedForSpeed {
    public int speed;
    public int batteryDrain;
    private int battery = 100;
    private int distance = 0;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
       return distance;
    }

    public void drive() {
        if (battery != 0) {
            distance += speed;
        battery -= batteryDrain;
        }
        
    }

    public static NeedForSpeed nitro() {
       NeedForSpeed nitro = new NeedForSpeed(50,4);
        return nitro;
    }
}

class RaceTrack {
    int distance = 0;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
       return (car.speed * 100 / car.batteryDrain) >= distance ; 
    }
}
