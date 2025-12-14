package Execptions;

import java.awt.print.Book;

// custom Exception
class BookUnAvailable extends Exception{
    public BookUnAvailable(String message) {
        super(message);
    }
}

class invalidException extends Exception {
    public invalidException(String message){
        super(message);
    }
}


class Library {
//    int availableBooks = 3;
//    public void borrowBook( int bookReq){
//        try{
//            int[] books = { 101, 102, 103 };
//            System.out.println("Books request : " + books[bookReq]);
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Exception Occured, You req a book does not exist.");
//        } catch (NullPointerException e) {
//            System.out.println("Null pointer");
//        }
//    }


    //    ** throw & throws
//    int availableBooks = 3;
//
//    public void borrowBook(int bookReqCount) throws Exception {
//        if(bookReqCount > availableBooks){
//            throw new Exception("not enough books available");
//        }
//        if(bookReqCount < 0){
//            throw new Exception("invalid book number");
//        }
//        System.out.println("Book number is : " + bookReqCount);
//        try {
//
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception index outOf bound, You req a book does not exist.");
//        } catch (Exception e) {
//            System.out.println("Exception here..");
//        }


    //    custom Exception
    int availableBooks = 3;

    public void borrowBook( String memberName, int bookReqCount) throws Exception {

        if(memberName == null || memberName.isEmpty() ){
            throw new invalidException("MemberName was empty or null");
        }

        if (bookReqCount > availableBooks) {
            throw new BookUnAvailable("Not available books, u passed numbers");
        }
        if (bookReqCount < 0) {
            throw new Exception("invalid book count");
        }


        System.out.println("BooksCount : " + bookReqCount);
        System.out.println("MemberName : " + memberName);

    }



}

public class LibraryDemo {
    static void main(String[] args) {
        Library lab = new Library();
        try {
            lab.borrowBook("irfan", 1 );
            lab.borrowBook(null, 3 );
        }catch(BookUnAvailable e){
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
//            System.out.println(e.getMessage()); // throw exception ko handle kar raha hai
            System.out.println("Exception Occuring.." + e.getMessage());
        }

    }

}
