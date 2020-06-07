public class NestedLoops {
    public void drawFilledBox() {
        for(int i = 0; i < 10; i++) {
            for(int x = 0; x<10; x++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public void drawFilledBox(int w, int h) {
        for(int i = 0; i<h; i++) {
            for(int x = 0; x<w; x++) {
                System.out.println("#");
            }
            System.out.println();
        }
    }

    public void drawMultiChart() {
        for(int i = 1; i<10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.println((j*i) + "  ");
            }
            System.out.println();
        }
    }

    public void drawTriangle() {
        for(int i = 0; i< 5; i++) {
            for(int j = 0; j<i; j++) {
                System.out.println("#");
            }
        }
    }
}