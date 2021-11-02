package Book;

import java.util.Arrays;

public class Books {


    private String name;
    private Storage storage;
    private int year;
    private String [] authors;
    private String author;

    public Books(String name, int year, Storage storage) {
        setName(name);
        setYear(year);
        setPublish(storage);
    }
    public Books(String name, String[] authors, int year, Storage storage) {
        this(name, year, storage);
        setAuthors(authors);
    }
    public Books(String name, String author, int year, Storage storage) {
        this(name, year, storage);
        setAuthor(author);
    }

    public String getName() {
        return name;
    }
    public Storage getPublish() {
        return storage;
    }
    public int getYear() {
        return year;
    }
    public String[] getAuthors() {
        return authors;
    }
    public String getAuthor() {
        return author;
    }
    public String getAuthor(int i) {
        if(i>=0 && i< authors.length) {
            return authors[i];
        }else {
            throw new IllegalArgumentException("Поля авторов не должны быть пустыми");
        }
    }

    public void setName(String name) {
        if(name != null && ! name.equals("")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Название книги не должно быть пустым");
        }
    }

    public void setPublish(Storage storage) {
        if(storage != null) {
            this.storage = storage;
        } else {
            throw new IllegalArgumentException("Название издательства не должно быть пустым");
        }
    }
    public void setYear(int year) {
        if(year > 0) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Год издания должен быть строго больше нуля");
        }
    }

    public void setAuthors(String[] authors) {
        if(authors != null) {
            this.authors = authors;
        } else {
            throw new IllegalArgumentException("Поле автора не должно быть пустым");
        }
    }

    public void setAuthor(String author) {
        if(author != null && ! author.equals("")) {
            this.author = author;
        } else {
            throw new IllegalArgumentException("Поле автора не должно быть пустым");
        }
    }


    public void print() {
        if(getAuthor() != null && ! getAuthor().equals("")) {
            System.out.println("Название книги: " + name + "; Автор: " + author + " ; Издательство: " + getPublish().getNamePublish() + "," + getPublish(). getCity() + "; Год издания: " + year);
        }
        else if(getAuthors() != null && getAuthors().length > 0) {
            System.out.println("Название книги: " + name + "; Авторы: " + Arrays.toString(getAuthors()) + " ; Издательство: " + getPublish().getNamePublish() + "," + getPublish(). getCity() + "; Год издания: " + year);
        }
        else  {
            System.out.println("Название книги: " + name + ";  Издательство: " + getPublish().getNamePublish() + "," + getPublish(). getCity() + "; Год издания: " + year);
        }
    }

    public static void printAll(Books[] books) {
        for(Books book: books)
            book.print();
    }

}
