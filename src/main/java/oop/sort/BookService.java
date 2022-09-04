package oop.sort;

public class BookService {

    /**
     * Используя алгоритм сортировки выбором отсортируйте книги по их году.
     * Алгоритм можно найти тут - https://favtutor.com/blogs/sorting-algorithms-java
     * В данной задаче ЗАПРЕЩЕНО использовать Comparator.
     * @param books неупорядоченные книги
     * @return отсортированные книги по году.
     */
    public Book[] sortBookByYear(Book[] books) {
        int pos;
        Book temp;
        for (int i = 0; i < books.length; i++)
        {
            pos = i;
            for (int j = i+1; j < books.length; j++)
            {
                if (books[j].getCreatedYear() < books[pos].getCreatedYear())                  //find the index of the minimum element
                {
                    pos = j;
                }
            }

            temp = books[pos];            //swap the current element with the minimum element
            books[pos] = books[i];
            books[i] = temp;
        }
        return books;
    }
}
