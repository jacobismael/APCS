import java.util.ArrayList;
public class Practice {
    public String getDomain(String email) {
        int st = email.indexOf('@');
        int st2 = email.lastIndexOf('.');
        return email.substring(st+1, st2);
    }

    public void print(Card[] arr) {
        for (Card card : arr) {
            System.out.print(card+", ");
        }
        System.out.println();
    }

    public void print(ArrayList<Card> arr) {
        for(Card card : arr) {
            System.out.print(card+", ");
        }
        System.out.println();
    }

    public int getLargest(Card[] arr) {
        int largest = arr[0].getValue();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getValue() > largest) {
                largest = arr[i].getValue();
            }
        }
        return largest;
    }

    public int getSmallest(ArrayList<Card> arr) {
        int smallest = arr.get(0).getValue();
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).getValue() < smallest) {
                smallest = arr.get(i).getValue();
            }
        }
        return smallest;
    }

    public void scramble(Card[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int tempI = (int)(Math.random() * arr.length);
            Card temp = arr[tempI];
            arr[tempI] = arr[i];
            arr[i] = temp;
        }
    }

    public void scramble(ArrayList<Card> arr) {
        for(int i = 0; i < arr.size(); i++) {
            int tempI = (int)(Math.random()*arr.size());
            Card temp = arr.get(tempI);
            arr.set(tempI, arr.get(i));
            arr.set(i, temp);
        }
    }

    public void sort(Card[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i].getValue() < arr[j].getValue()) {
                    Card temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public void sort(ArrayList<Card> arr) {
        for(int i = 0; i < arr.size(); i++) {
            for(int j = 0; j < arr.size(); j++) {
                if(arr.get(i).getValue() < arr.get(j).getValue()) {
                    Card temp = arr.get(j);
                    arr.set(j, arr.get(i));
                    arr.set(i, temp);
                }
            }
        }
    }

    public void searchReplace(int x, Card[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].getValue() == 1) {
                arr[i] = new Card(x);
            }
        }
    }

    public void searchReplace(int x, ArrayList<Card> arr) {
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i).getValue() == 1) {
                arr.set(i, new Card(x));
            }
        }
    }

    public void searchDelete(int x, ArrayList<Card> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).getValue() == x) {
                arr.remove(i);
            }
        }
    }
}