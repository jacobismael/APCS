public class Grade {
  private double score1;
  private double score2;
  private double score3;

  public Grade(double x, double y, double z) {
    this.score1 = x;
    this.score2 = y;
    this.score3 = z;
  }

  public boolean checkPass() {
    if(score1 > 90 || score2 > 90 || score3 > 90) {
      return true;
    } else if((score1 > 80 && score2 > 80) || (score2 > 80 && score3 > 80) || (score1 > 80 && score3 > 80)) {
      return true;
    } else if(score1 > 70 && score2 > 70 & score3 > 70) {
      return true;
    } else {
      return false;
    }
  }
}
