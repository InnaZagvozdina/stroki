public class Main {
    // Задание 1
    public static void main(String[] args) {
        String firstName = "Иван ";
        String middleName = "Иванович";
        String lastName = "Иванов ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println();


        // Задание 2

        String fullNameUpper = fullName.toUpperCase();

        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameUpper);
        System.out.println();


        // Задание 3

        String fullNameI = "Иванов Семён Семёнович";
        fullNameI = fullNameI.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника -" + fullNameI);


    }
}






