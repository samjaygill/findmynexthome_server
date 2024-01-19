package com.gillies.findmynexthome.data;

import com.gillies.findmynexthome.model.Property;
import com.gillies.findmynexthome.repository.PropertyRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader {

    private final PropertyRepository propertyRepository;
    private List<Property> propertyList;

    @Autowired
    public DataLoader(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @PostConstruct
    public void loadData() {
        List<Property> initialProperties = createInitialData();
        propertyRepository.saveAll(initialProperties);
    }

    private List<Property> createInitialData() {
        propertyList = new ArrayList<>();

        Property property1 = new Property(1, "9 Cairn Close", "Semi-Detached", 3, 1, "Semi-Detatched house in a quiet location with nearby schools and parks.", 179000.00, Arrays.asList("www.semi-detatched.com", "www.semi-detatched2.com"));
        Property property2 = new Property(2, "11 Bowmore Road", "Flat", 2, 1, "Flat in a quiet location with nearby schools and parks.", 90000.00, Arrays.asList("www.flat.com", "www.flat2.com"));
        Property property3 = new Property(3, "5 Macbeth Avenue", "Flat", 2, 1, "Flat in a quiet location with nearby schools and parks.", 60000.00, Arrays.asList("www.flat.com", "www.flat2.com"));
        Property property4 = new Property(4, "63 Roundhouse Road", "Detached", 4, 3, "Detatched house in a quiet location with nearby schools and parks.", 460000.00, Arrays.asList("www.detached.com", "www.detached2.com"));

        propertyList.addAll(Arrays.asList(property1, property2, property3, property4));

        return propertyList;
    }
}


