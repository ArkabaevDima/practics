package ru.mirea.arkabaev.pract1;

public class Book {
    String Author;
    String Name;
    int Year;
    int PageCount;

    public String toString() {
        return Author + " " + Name + " " + Year + " " + PageCount;
    }

    public Book(String Author, String Name, int Year, int PageCount) {
        this.Author = Author;
        this.Name = Name;
        this.Year = Year;
        this.PageCount = PageCount;
    }
}
