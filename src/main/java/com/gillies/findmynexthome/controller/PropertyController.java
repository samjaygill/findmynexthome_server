package com.gillies.findmynexthome.controller;

import com.gillies.findmynexthome.model.Property;
import com.gillies.findmynexthome.service.PropertyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/properties")
public class PropertyController {

    private final PropertyService propertyService;

    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @GetMapping
    public List<Property> findAllProperties(){
        return propertyService.findAllProperties();
    }

    @GetMapping("/{id}")
    public Optional<Property> findPropertyById(@PathVariable("id") Long id){
        return propertyService.findById(id);
    }

    @PostMapping
    public Property saveProperty(@RequestBody Property property){
        return propertyService.saveProperty(property);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Property> updateProperty(@RequestBody Property updatedProperty, @PathVariable Long id) {
        Property existingProperty = propertyService.findById(id).get();

        existingProperty.setAddress(updatedProperty.getAddress());
        existingProperty.setType(updatedProperty.getType());
        existingProperty.setBedrooms(updatedProperty.getBedrooms());
        existingProperty.setBathrooms(updatedProperty.getBathrooms());
        existingProperty.setDescription(updatedProperty.getDescription());
        existingProperty.setPrice(updatedProperty.getPrice());
        existingProperty.setImageUrls(updatedProperty.getImageUrls());
        
        propertyService.saveProperty(existingProperty);

        return new ResponseEntity<>(existingProperty, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteProperty(@PathVariable("id") Long id){
        propertyService.deleteProperty(id);
    }
}
