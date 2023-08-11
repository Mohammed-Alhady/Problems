public class SulationOne {
    public static boolean checkStraightLine(int[][] coordinates) {
        int coorLength = coordinates.length;
        int xDiff = coordinates[1][0] - coordinates[0][0];
        int yDiff = coordinates[1][1] - coordinates[0][1];
        int currXDiff, currYDiff;

        for (int i = 2; i < coorLength; i++) {
            currXDiff = coordinates[i][0] - coordinates[i - 1][0];
            currYDiff = coordinates[i][1] - coordinates[i - 1][1];
            if ((xDiff * currYDiff) != (yDiff * currXDiff)) {
                return false;
            }
        }
        return true;
    }
}
