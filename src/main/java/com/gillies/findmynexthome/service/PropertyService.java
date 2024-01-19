package com.gillies.findmynexthome.service;

import com.gillies.findmynexthome.model.Property;

import java.util.List;
import java.util.Optional;

public interface PropertyService {


    List<Property> findAllProperties();
    Optional<Property> findById(Long id);

    Property saveProperty(Property property);

    Property updateProperty(Property property);
    void deleteProperty(Long id);

}
