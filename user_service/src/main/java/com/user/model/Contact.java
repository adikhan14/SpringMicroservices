package com.user.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @Setter @Getter @NoArgsConstructor
public class Contact {

    private Long cId;
    private String email;
    private String contactName;

    private Long userId;

    public Contact(Long cId, String email, String contactName) {
        this.cId = cId;
        this.email = email;
        this.contactName = contactName;
    }
}
