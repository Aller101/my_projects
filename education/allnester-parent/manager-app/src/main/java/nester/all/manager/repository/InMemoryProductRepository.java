/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nester.all.manager.repository;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import nester.all.manager.entity.Product;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryProductRepository implements ProductRepository {

    private final List<Product> products
            = Collections.synchronizedList(new LinkedList<>());

    public InMemoryProductRepository() {
        IntStream.rangeClosed(1, 4)
                .forEach(i -> this.products.add(new Product(i, "Товар №%d"
                .formatted(i), "Описание товара №%d".formatted(i))));
    }

    @Override
    public List<Product> findAll() {
        return Collections.unmodifiableList(this.products);
    }

}
