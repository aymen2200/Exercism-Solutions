public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        
        if (speed == 10) {
            return 2210 * 0.77;
        }  
        if (speed == 9) {
            return 9 * 221 * 0.8;
        } 
        if (speed > 4) {
            return speed * 221 * 0.9;
        } 
        if (speed > 0) {
            return speed * 221;
        }
        return 0;
        
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
