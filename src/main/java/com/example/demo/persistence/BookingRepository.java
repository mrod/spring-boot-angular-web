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
package com.example.demo.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Booking;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Long> {
}
