package week7;

import java.io.*;
import java.util.Scanner;

public class FileCopyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập đường dẫn tệp nguồn: ");
        String sourcePath = scanner.nextLine();

        System.out.print("Nhập đường dẫn tệp đích: ");
        String targetPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        if (!sourceFile.exists()) {
            System.out.println(" Tệp nguồn không tồn tại.");
            return;
        }

        if (targetFile.exists()) {
            System.out.println(" Tệp đích đã tồn tại. Không thể ghi đè.");
            return;
        }

        int charCount = 0;

        try (
                FileInputStream inputStream = new FileInputStream(sourceFile);
                FileOutputStream outputStream = new FileOutputStream(targetFile)
        ) {
            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                outputStream.write(byteData);
                charCount++;
            }

            System.out.println("Sao chép thành công.");
            System.out.println("Số ký tự đã sao chép: " + charCount);

        } catch (IOException e) {
            System.out.println("Lỗi khi sao chép tệp: " + e.getMessage());
        }

        scanner.close();
    }
}
