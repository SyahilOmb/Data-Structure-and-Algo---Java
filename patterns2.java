public class patterns2 {

    int rows;
    int cols;

    public patterns2(int r, int c) {
        this.rows = r;
        this.cols = c;
    }

    public void Hollowrectangle() {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // spaces inside
                }
            }
            System.out.println();
        }
    }

    public void invertedTriangle(int rows) {
        for (int i = rows; i >= 1; i--) {   // decrease from rows to 1
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // move to next row
        }
    }

    public static void main(String[] args) {
    patterns2 rec = new patterns2(4, 5);
        rec.Hollowrectangle();
        rec.invertedTriangle(5); // pass rows explicitly
    }
}