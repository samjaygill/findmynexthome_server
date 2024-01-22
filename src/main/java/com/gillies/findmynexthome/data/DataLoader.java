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

        Property property1 = new Property(1, "2a Arran Avenue", "Detatched", 3, 2, "New build detatched home in sought after area. Mature, private, and landscaped gardens. Monoblock driveway and spacious garage.", 290000.00, "22/01/2024", "sale", Arrays.asList("https://i.ibb.co/3FwQqVt/1-1.jpg", "https://i.ibb.co/tpWSqC6/1-3.jpg", "https://i.ibb.co/2FH2Nst/1-2.jpg", "https://i.ibb.co/8rpHDfz/1-4.jpg", "https://i.ibb.co/k9RD4cY/1-6.jpg", "https://i.ibb.co/92K3MSv/1-7.jpg"));
        Property property2 = new Property(2, "11 Bowmore Road", "Flat", 2, 1, "Flat in a quiet location with nearby schools and parks.", 90000.00, "21/01/2024", "sale", Arrays.asList("www.flat.com", "www.flat2.com"));
        Property property3 = new Property(3, "5 Macbeth Avenue", "Flat", 2, 1, "Flat in a quiet location with nearby schools and parks.", 60000.00, "19/01/2024","sale", Arrays.asList("www.flat.com", "www.flat2.com"));
        Property property4 = new Property(4, "63 Roundhouse Road", "Detached", 4, 3, "Detatched house in a quiet location with nearby schools and parks.", 460000.00, "16/01/2024", "sale", Arrays.asList("www.detached.com", "www.detached2.com"));
        Property property5 = new Property(5, "67 Roundhouse Road", "Detached", 4, 3, "Detatched house in a quiet location with nearby schools and parks.", 1400.00, "22/01/2024", "rent", Arrays.asList("www.detached.com", "www.detached2.com"));


        propertyList.addAll(Arrays.asList(property1, property2, property3, property4, property5));

        return propertyList;
    }
}


