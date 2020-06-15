package prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() throws CloneNotSupportedException {

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
        clonedLibrary = library.shallowCopy();
        clonedLibrary.setName("Project number 2");

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        deepClonedLibrary = library.deepCopy();
        deepClonedLibrary.setName("Project number 3");

        library.removeBook(book3);
        //Then
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}


