package Domaha;

public class Dom1 {
    public static void main(String[] args) {
        String str[] = {" the", " sky", " is", " blue "};
        for(int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
        }
        int n = str.length;
        for (int i = 0; i < n / 2; i++) {
            String temp = str[n-i-1];
            str[n-i-1] = str[i];
            str[i] = temp;
        }
        System.out.println();
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
        }

    }
}
