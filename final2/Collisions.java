public class Collisions {
    public static boolean collide(int x1, int y1, int w1, int l1, int x2, int y2, int w2, int l2) {
        if(x1  < x2 + w2 &&  x1  > x2) {
            if(y1 < y2 + l2 && y1 > y2) {
                return true;
            }
        }
    
        if(x2  < x1 + w1 && y2 > y1) {
            if(x2  > x1 && y2 < y1 + l1) {
                return true;
            }
        }
    
        if(x1 + w1  > x2 + w2 && y1 + l1 > y2 + l2) {
            if(x1 + w1 < x2 && y1 + l1 < y2 + l2) {
                return true;
            }
        }
    
        if(x2 + w2  > x1 + w1 && y2 + l2 > y1 + l1) {
            if(x2 + w2 < x1 && y2 + l2 < y1 + l1) {
                return true;
            }
        }
    
    
    
    
        return false;
    }
}