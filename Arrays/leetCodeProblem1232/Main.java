public class Main {
    public static void main(String[] args) {

        int arrayOne[][] = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 6, 7 } };
        int arrayTwo[][] = { { 1, 1 }, { 2, 2 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 7, 7 } };
        int arrayThree[][] = { { 1, 1 }, { 2, 2 }, { 3, 3 }, { 4, 4 }, { 5, 5 }, { 7, 7 } };

        System.out.println(SulationOne.checkStraightLine(arrayOne));
        System.out.println(SulationOne.checkStraightLine(arrayTwo));
        System.out.println(SulationOne.checkStraightLine(arrayThree));
    }
}
