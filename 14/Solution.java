/*
*�������� - ����� � ������, �������������� ����� ������. ��� ����� ���������� 
*���������������� �� ������ ����� ������. ������ ���������� ����� ������������� 
*��������, ��� ��������, ��� �� ����� ���������� ������ � �������� ����� ����������.
*�� ����� ��������� � ��������� �������� ���������� ����������� ���������� 
*������������, ����� ������ ��� ��������� � �������� ������������ ���� �� ������ 
*�����������. 
*
*�������� ���� ����������� �=�[1,2,3,5,9], ���������� ����� �������� 1. ��� �������� ����
*����� ���������� ����� ���������� �� ����� 2, 5 � 9, �.�. ���������� 3 �����������.
*
*������:
*
*5 1
*
*1 2 3 4 5
*�����: 2
*
*(�� ���� 2 � 4)
*
*������:
*
*8 2
*7 2 4 6 5 9 12 11
*�����: 3
*
*(�� ���� 4, 9 � 12)
*/

 import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the function below.
    static int ackerlandRadioTransmitters(int[] x, int k) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] x = new int[n];

        String[] xItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int xItem = Integer.parseInt(xItems[i]);
            x[i] = xItem;
        }

        int result = ackerlandRadioTransmitters(x, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

