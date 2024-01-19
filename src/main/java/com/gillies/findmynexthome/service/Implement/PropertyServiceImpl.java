package com.gillies.findmynexthome.service.Implement;

import com.gillies.findmynexthome.model.Property;
import com.gillies.findmynexthome.repository.PropertyRepository;
import com.gillies.findmynexthome.service.PropertyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class PropertyServiceImpl implements PropertyService {

    private final PropertyRepository propertyRepository;

    public PropertyServiceImpl(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @Override
    public List<Property> findAllProperties() {
        return propertyRepository.findAll();
    }

    @Override
    public Optional<Property> findById(Long id) {
        return propertyRepository.findById(id);
    }

    @Override
    public Property saveProperty(Property property) {
        return propertyRepository.save(property);
    }

    @Override
    public Property updateProperty(Property property) {
        return propertyRepository.save(property);
    }

    @Override
    public void deleteProperty(Long id) {
        propertyRepository.deleteById(id);
    }
}
