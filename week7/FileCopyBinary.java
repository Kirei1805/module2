package week7;

import java.io.*;
import java.util.Scanner;

public class FileCopyBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập đường dẫn tệp nguồn: ");
        String sourcePath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        if (!sourceFile.exists()) {
            System.out.println(" Tệp nguồn không tồn tại!");
            return;
        }

        System.out.print("Nhập đường dẫn tệp đích: ");
        String targetPath = scanner.nextLine();
        File targetFile = new File(targetPath);

        if (targetFile.exists()) {
            System.out.println("⚠ Tệp đích đã tồn tại. Ghi đè? (y/n): ");
            String confirm = scanner.nextLine();
            if (!confirm.equalsIgnoreCase("y")) {
                System.out.println(" Hủy thao tác.");
                return;
            }
        }

        try (
                FileInputStream fis = new FileInputStream(sourceFile);
                FileOutputStream fos = new FileOutputStream(targetFile)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            int totalBytes = 0;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                totalBytes += bytesRead;
            }

            System.out.println(" Sao chép hoàn tất.");
            System.out.println(" Tổng số byte đã sao chép: " + totalBytes);
        } catch (IOException e) {
            System.out.println(" Lỗi trong quá trình sao chép: " + e.getMessage());
        }
    }
}
