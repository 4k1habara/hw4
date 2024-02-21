public class Main {
    public static void main(String[] args) {

//task1
        System.out.println("");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

//task2
        System.out.println("");
        int temp = 5;
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            if (temp > 5) {
                System.out.println("Сегодня тепло, можно идти без шапки");
            } else {
                System.out.println("Сегодня ровно 5 градусов");
            }
        }

//task3
        System.out.println("");
        int speed = 69;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

//task4
        System.out.println("");
        int age4 = 99;
        if ((age4 > 2) && (age4 <= 6)) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в детский сад");
        } else {
            if ((age4 >= 7) && (age4 <= 17)) {
                System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в школу");
            } else {
                if ((age4 >= 18) && (age4 <= 24)) {
                    System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в университет");
                } else {
                    if (age4 > 24) {
                        System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить на работу");
                    }
                }
            }
        }

//task5
        System.out.println("");
        int childAge = 17;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        } else {
            if ((childAge >= 5) && (childAge <= 14)) {
                System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении");
            } else {
                if (childAge > 14) {
                    System.out.println("Если возраст ребенка равен " + childAge + ", " +
                            "то ему можно кататься на аттракционе без сопровождения взрослого");
                }
            }
        }

//task6
        System.out.println("");
        int peopleCurrently = 102;
        int peopleCapacity = 102;
        int seatingPlaces = 60;
        int standingPlaces = peopleCapacity - seatingPlaces;
        if (peopleCurrently < seatingPlaces) {
            System.out.println("В вагоне есть " + (seatingPlaces - peopleCurrently) + " сидячих мест");
        } else {
            if ((peopleCurrently >= 60) && (peopleCurrently < peopleCapacity)) {
                System.out.println("В вагоне есть " + (peopleCapacity - peopleCurrently) + " стоячих мест");
            } else {
                System.out.println("Вагон переполнен");
            }
        }

//task7
        System.out.println("");
        int one = 7;
        int two = 10;
        int three = 1;
        if ((one > two) && (one > three)) {
            System.out.println("Первое число наибольшее: " + one);
        } else {
            if ((two > one) && (two > three)) {
                System.out.println("Второе число наибольшее: " + two);
            } else {
                if ((three > one) && (three > two)) {
                    System.out.println("Третье число наибольшее: " + three);
                } else {
                    System.out.println("В списке несколько наибольших чисел");
                }
            }
        }
    }
}