import java.awt.Graphics;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;
public class Game {
    private char[][] table;
    private int turn;
    private char[][] temp;
 
    public Game() {
        table = new char[3][3];
        temp = new char[3][3];

        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table[i].length; j++) {
                table[i][j] = '-';
            }
        }

        turn = 1;
    }
 
    public void printTable() {
        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
 
    public void insertXO(int r, int c) {
        if(r < 3 && c < 3) {
            if(turn == 1) {
                if(table[r][c] == '-') {
                    table[r][c] = 'X';
                    playXSound();
                }
            } else if(turn == 2) {
                if(table[r][c] == '-') {
                    table[r][c] = 'O';
                    playOSound();
                }
            }   
        }
 
        if(turn == 1) {
            turn++;
        } else if(turn == 2) {
            turn--;
        }
    }
 
    public boolean checkFull() {
        int count = 0;
        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table[i].length; j++) {
                if(table[i][j] == '-')count++;
            }
        }
        if(count == 0) {
            return true;
        } else {
            return false;
        }
    }
 
    public int checkTicTacToe() {
        String stack = "";
        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table[i].length; j++) {
                stack += table[i][j]+"";
            }
            stack+='-';
        }

 
        if(stack.indexOf("XXX") != -1) {
            return 1;
        } else if(stack.indexOf("OOO") != -1) {
            return 2;
        }

        stack = "";
        for(int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                stack += table[j][i]+"";
            }
            stack += '-';
        }


        if(stack.indexOf("XXX") != -1) {
            return 1;
        } else if(stack.indexOf("OOO") != -1) {
            return 2;
        }

        if( (table[0][0]+""+table[1][1]+""+table[2][2]).compareTo("XXX") == 0 || (table[0][2]+""+table[1][1]+""+table[2][0]).compareTo("XXX") == 0) {
            return 1;
        } else if( (table[0][0]+""+table[1][1]+""+table[2][2]).compareTo("OOO") == 0 || (table[0][2]+""+table[1][1]+""+table[2][0]).compareTo("OOO") == 0) {
            return 2;
        } 
        return 0;
    }

    public void draw(Graphics g) {
        int x = 50;
        int y = 50;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if(table[i][j] == 'X') {
                    g.drawString("X", x, y);
                } else if(table[i][j] == 'O') {
                    g.drawString("O", x, y);
                }
                x+=100;
            }
            y+=100;
            x = 50;
        }
    }

    public void reset() {
        table = new char[3][3];

        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table[i].length; j++) {
                table[i][j] = '-';
            }
        }

        turn = 1;
    }

    private void playXSound() {
        try {
            URL url = this.getClass().getClassLoader().getResource("sounds/x.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(url));
            clip.start();
        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    } 

    private void playOSound() {
        try {
            URL url = this.getClass().getClassLoader().getResource("sounds/o.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(url));
            clip.start();
        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    } 

    public char[][] getTable() {
        return table;
    }








    public void playComp() {
        boolean played = false;
        boolean done = false;

        if(!played) {

            for (int i = 0; i < temp.length; i++) {
                for (int j = 0; j < temp[i].length; j++) {
                    if(!done) {
                        inserttemp(i, j, 'X');
                        if(checkTicTacToetemp() == 1 && !done) {
                            insertXO(i, j);
                            System.out.println("played");
                            played = true;
                            done = true;
                            break;
                        }   
                    }
                    
                    if(done) {
                        break;
                    }
                }
                if(done) {
                    break;
                }
            }
        }

        if(!played) {
            boolean done1 = false;
            for (int i = 0; i < table.length; i++) {
                for (int j = 0; j < table[i].length; j++) {
                    System.out.println("hh");
                    if(!done1) {
                        if(table[i][j] == '-') {
                            insertXO(i, j);
                            done1 = true;
                            break;
                            // System.out.println("moved");
                        }
                    }
                }
                if(done1) break;
            }
        }

    }

    public void inserttemp(int r, int c, char x) {
        temp[r][c] = x;
    }


    public int checkTicTacToetemp() {
        String stack = "";
        for(int i = 0; i < temp.length; i++) {
            for(int j = 0; j < temp[i].length; j++) {
                stack += temp[i][j]+"";
            }
            stack+='-';
        }

 
        if(stack.indexOf("XXX") != -1) {
            return 1;
        } else if(stack.indexOf("OOO") != -1) {
            return 2;
        }

        stack = "";
        for(int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                stack += temp[j][i]+"";
            }
            stack += '-';
        }


        if(stack.indexOf("XXX") != -1) {
            return 1;
        } else if(stack.indexOf("OOO") != -1) {
            return 2;
        }

        if( (temp[0][0]+""+temp[1][1]+""+temp[2][2]).compareTo("XXX") == 0 || (temp[0][2]+""+temp[1][1]+""+temp[2][0]).compareTo("XXX") == 0) {
            return 1;
        } else if( (temp[0][0]+""+temp[1][1]+""+temp[2][2]).compareTo("OOO") == 0 || (temp[0][2]+""+temp[1][1]+""+temp[2][0]).compareTo("OOO") == 0) {
            return 2;
        } 
        return 0;
    }



}
