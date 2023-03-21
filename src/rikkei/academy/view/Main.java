package rikkei.academy.view;

import rikkei.academy.config.Config;

public class Main {
    public Main() {
        do {
            System.out.println("******************STUDENT MANAGE******************");
            System.out.println("1. Show List student");
            System.out.println("2. Create Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Sort Student By Name");
            System.out.println("6. Thoát chương trình");
            System.out.println("Mời chọn: ");

            int chooseMenu;
            while (true) {
                try {
                    chooseMenu = Integer.parseInt(Config.scanner().nextLine());
                    break;
                } catch (NumberFormatException Err) {
                    System.err.println("Hãy nhập lựa chọn bằng số từ 1-5 ");

                }
            }
            switch (chooseMenu) {
                case 1:
                    new StudentView().showTableStudent();
                    break;
                case 2:
                    new StudentView().createStudentForm();
                    break;

                case 6:
                    System.exit(0);
                default:
                    System.err.println("Hãy nhập lại lựa chọn của bạn (1-5)");
            }
        } while (true);

    }

    public static void main(String[] args) {
        new Main();

    }
}