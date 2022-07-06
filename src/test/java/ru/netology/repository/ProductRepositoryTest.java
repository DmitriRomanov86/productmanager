package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.manager.ProductManager;


import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductRepositoryTest{
    Product book = new Book(1, "Rich Dad Poor Dad", 20, "Robert Kiyosaki");
    Product smph = new Smartphone(2, "11", 650, "Iphone");
    Product book1 = new Book(3, "The Alchemist", 10, "Paulo Coelho");
    Product smph2 = new Smartphone(4, "11 pro", 700, "Iphone");


    @Test
    public  void test1(){
        ProductRepository repo = new ProductRepository();

        repo.save(book);
        repo.save(smph);
        repo.save(book1);
        repo.save(smph2);

        assertThrows(NotFoundException.class, () ->{
            repo.removeById(9);
        });

    }

}