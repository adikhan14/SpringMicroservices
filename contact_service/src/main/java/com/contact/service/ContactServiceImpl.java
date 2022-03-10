package com.contact.service;

import com.contact.model.Contact;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements  ContactService{

    List<Contact> contacts = Arrays.asList(
            new Contact(1L,"bilal@gmail.com","Bilal",1L),
            new Contact(2L,"khurram@gmail.com","Khurram",1L),
            new Contact(3L,"ammar@gmail.com","Ammar", 3L),
            new Contact(4L,"ali@gmail.com","Ali",2L)
    );

    @Override
    public List<Contact> getContactsUser(Long userId) {
        return contacts.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
