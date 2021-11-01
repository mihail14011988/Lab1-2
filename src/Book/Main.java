package Book;

public class Main {
    public static void main(String[] args) {
        Storage storage1 = new Storage("Проспект", "Москва");
        Storage storage2 = new Storage("Питер", "Санкт-Петербург");
        Storage storage3 = new Storage("БХВ", "Санкт-Петебург");
        Storage storage4 = new Storage("Диалектика", "Киев");
        Books[] books = {
                new Books("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных", new String[] {"Седжвик Роберт", "Уэйн Кевин"}, 2018, storage2),
                new Books("Разработка требований к программному обеспечению. 3-е издание, дополненное", "Вигерс Карл", 2019, storage3),
                new Books("Java. Полное руководство, 10-е издание", "Шилдт Герберт", 2018, storage4),
                new Books("C/C++. Процедурное программирование", "Полубенцева М.И.", 2017, storage3),
                new Books("Конституция РФ", 2020, storage1)
        };


        for (Books book : books) {
            if (book.getPublish().getNamePublish().equals("БХВ")) {
                book.getPublish().setCity("Санкт-Петербург");
            }
        }

        Books.printAll(books); // Исправлено название Спб
    }



    }

