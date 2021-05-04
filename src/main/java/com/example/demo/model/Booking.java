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

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private Long userId;
    private Long doctorId;
    private Date date;

    public Booking() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", userId=" + userId +
                ", doctorId=" + doctorId +
                ", date=" + date +
                '}';
    }
}
