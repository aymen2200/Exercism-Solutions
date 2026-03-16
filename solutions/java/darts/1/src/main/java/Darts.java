class Darts {
    int score(double x, double y) {
        double d = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        if (d <= 1) {
            return 10;
        }
        if (d <= 5) {
            return 5;
        }
        if (d <= 10) {
            return 1;
        }
        return 0;
    }
}
