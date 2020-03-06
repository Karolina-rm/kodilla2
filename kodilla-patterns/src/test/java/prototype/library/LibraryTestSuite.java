package prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //Given
        Library library = new Library("My Library");
        Book book1 = new Book("Noce i dnie", "Maria Dąbrowska", LocalDate.of(1931, 10, 11));
        Book book2 = new Book("Pan Tadeusz", "Adam Mickiewicz", LocalDate.of(1898, 2, 21));
        Book book3 = new Book("Lalka", "Bolesław Prus", LocalDate.of(1834, 5, 11));

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        //When
        //making a shallow copy of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Project number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Then
        Assert.assertEquals(3, library.getBooks().size());
    }
}


