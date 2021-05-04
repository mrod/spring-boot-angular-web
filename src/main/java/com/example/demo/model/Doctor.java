//                                ASSIA, Inc.
//                                Copyright
//                      Confidential and Proprietary
//                          ALL RIGHTS RESERVED.
//
//       http://www.assia-inc.com, +1.650.654.3400
//
//       This software is provided under license and may be used,
//       copied, distributed (with or without modification), or made
//       available to the public, only in accordance with the terms
//       of such license.
//
package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private String name;

    public Doctor() {
    }

    public Doctor(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
