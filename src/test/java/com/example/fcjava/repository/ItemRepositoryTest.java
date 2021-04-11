package com.example.fcjava.repository;

import com.example.fcjava.FcJavaApplicationTests;
import com.example.fcjava.model.entity.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;

public class ItemRepositoryTest extends FcJavaApplicationTests {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void create() {

        Item item = new Item();
        item.setStatus("UNREGISTERED");
        item.setName("Thinkpad");
        item.setPrice(100000);
        item.setContent("A brand new laptop.");
        item.setTitle("X1");
        item.setBrandName("IBM");
        item.setRegisteredAt(LocalDateTime.now());
        item.setCreatedBy("Partner01");
        item.setPartnerId(1L);

        Item newItem = itemRepository.save(item);
        Assertions.assertNotNull(newItem);
    }

    @Test
    public void read() {

        Long id = 1L;

        Optional<Item> item = itemRepository.findById(id);

        Assertions.assertTrue(item.isPresent());

    }
}
