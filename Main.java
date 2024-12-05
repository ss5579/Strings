package Strings;

public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"ab", "cd", "ef"};

        int totalLength = 0;
        for (String str : stringArray) {
            totalLength += str.length();
        }

        char[] charArray = new char[totalLength];

        int index = 0;
        for (String str : stringArray) {
            for (char c : str.toCharArray()) {
                charArray[index++] = c;
            }
        }
        System.out.println(java.util.Arrays.toString(charArray));
    }
}

/*
public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"ab", "cd", "ef"};
        char arr = stringArray.split(" , ");
            for (int i = 0; i < stringArray.length; i++)
                System.out.println(arr);
    }
}

/*
public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"ab", "cd", "ef"}; {
            String[] stringArrays = stringArray.split(" , "); {
                for (int i = 0; i < stringArray.length; i++) {
                    for (String item: stringArrays) {
                        System.out.println(item);
                }
            }
        }
        }
    }
}
*/