package Sem5Lesson1;
/*Создать структуру для хранения Номеров паспортов и Фамилий 
сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов. */
public class Program {
    public static void main(String[] args) {
        Pasport ps = new Pasport();
        ps.addData("123456", "Иванов");
        ps.addData("321456", "Васильев");
        ps.addData("234561", "Петрова");
        ps.addData("234432", "Иванов");
        ps.addData("654321", "Петрова");
        ps.addData("345678", "Иванов");

        System.out.println((ps.findUserByName("Иванов")));
    }
}

