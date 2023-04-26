import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число строк и столбцов матрицы");
        System.out.print("Число строк = ");
        int rows = scanner.nextInt();
        System.out.print("Число столбцов = ");
        int columns = scanner.nextInt();

        TaskMatrix taskMatrix = new TaskMatrix(rows, columns);
        if (rows == 0 || columns == 0)
        {
            System.out.println("Матрица не была создана");
        }
        else if (rows != columns)
        {
            System.out.println("Матрица не квадратная");
        }
        else
        {
            System.out.println("Введите элементы квадратной матрицы");
            for(int i = 0; i < rows; i++)
            {
                for (int j = 0; j < columns; j++)
                {
                    taskMatrix.setElemMatrix(scanner.nextInt(), i, j);
                }
            }

            TaskMatrix newMatrix = taskMatrix.modifiedMatrix();
            int summa = newMatrix.sum();
            String strokaElemMatrix = newMatrix.newString();
            System.out.println("Изначальная матрица: ");
            taskMatrix.printMatrix();

            System.out.println("a) Сформировать треугольную матрицу");
            newMatrix.printMatrix();

            System.out.println("c) Найти сумму элементов треугольной матрицы.");
            System.out.println(summa);

            System.out.println("d) Сформировать строку из всех положительных элементов числовой квадратной матрицы разделяя их пробелами.");
            System.out.println(strokaElemMatrix);
        }
        System.out.println("Введите строку: ");
        scanner.nextLine();
        String text = scanner.nextLine();

        TaskStroka taskStroka = new TaskStroka(text);

        System.out.println("b) Удалить из строки каждое третье слово.");
        System.out.println(taskStroka.deleteThreeWord());
    }
}