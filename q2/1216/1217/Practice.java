public class Practice {
    // Instance Variables
    String name;

    // Constructors
    public Practice() {
        this.name = "Jen";
    }

    public Practice(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }

    public boolean checkNum(int num1, int num2, int num3) {
        if(num1 == num2 && num1 == num3) {
            return true;
        } else {
            return false;
        }
    }

    public void whileCount1(int num) {
        int runner = 1;
        while(runner <= num) {
            System.out.println(runner);
            runner++;
        }
    }

    public void forCount1(int num1, int num2) {
        if(num1 < num2) {
            for(int i = num1; i <= num2; i++) {
                System.out.println(i);
            }
        } else if(num2 < num1) {
            for(int i = num2; i <= num1; i++) {
                System.out.println(i);
            }
        } else if(num1 == num2) {
            System.out.println(num1);
        }
    }

    public int summation(int num) {
        int total = 0;
        for(int i = num; i >= 0; i--) {
            total += i;
        }
        return total;
    }

    public String getIfElse(int x) {
        if(x == 1) {
            return "Cat";
        } else if(x == 2) {
            return "Dog";
        } else if(x == 3) {
            return "Bear";
        } else {
            return "Not Valid";
        }
    }

    public void printSwitch(int x) {
        switch(x) {
            case 1:
                System.out.println("Car");
                break;
            case 2:
                System.out.println("Airplane");
                break;
            case 3:
                System.out.println("Door");
                break;
            default:
                System.out.println("Not Valid");
                break;
        }
    }

    public int getRand1() {
        return (int)(Math.random() * 14 + 4);
    }

    public void print(int[] arr) {
        for(int x : arr) {
            System.out.println(x);
        }
    }

    public int[] replace5(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 5) {
                arr[i] = 0;
            }
        }
        return arr;
    }
}