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

        Property property1 = new Property(1, "2a Arran Avenue", "Detatched", 3, 2, "This three-bed detatched residence in a sought-after residential area features an open-plan dining kitchen, front and rear garden, multi-car driveway, family bathroom and a convenient WC cloakroom.", 290000.00, "22/01/2024", "sale", Arrays.asList("https://i.ibb.co/3FwQqVt/1-1.jpg", "https://i.ibb.co/tpWSqC6/1-3.jpg", "https://i.ibb.co/2FH2Nst/1-2.jpg", "https://i.ibb.co/8rpHDfz/1-4.jpg", "https://i.ibb.co/k9RD4cY/1-6.jpg", "https://i.ibb.co/92K3MSv/1-7.jpg"));
        Property property2 = new Property(2, "11 Jubilee Crescent", "Semi-Detatched", 3, 2, "This three-Bed semi-detached residence in a sought-after residential area features an open-plan dining kitchen, front and rear garden, multi-car driveway, EV charging point, family bathroom and a convenient WC cloakroom.", 150000.00, "21/01/2024", "sale", Arrays.asList("https://i.ibb.co/0DdwkSw/2-1.jpg", "https://i.ibb.co/vwj6F1H/2-2.jpg", "https://i.ibb.co/RQbcc64/2-3.jpg", "https://i.ibb.co/s1yyF8W/2-4.jpg","https://i.ibb.co/1ffLHxW/2-5.jpg", "https://i.ibb.co/DCnGGSH/2-6.jp"));
        Property property3 = new Property(3, "5 BurnBridge Avenue", "Semi-Detatched", 3, 1, "This three-bed semi-detatched residence in a sought-after residential area features an open-plan dining kitchen, front and rear garden, driveway and family bathroom.", 100000.00, "19/01/2024","sale", Arrays.asList("https://i.ibb.co/z473Cd1/3-1.jpg", "https://i.ibb.co/Jrh5xjQ/3-2.jpg", "https://i.ibb.co/yYMsw3T/3-3.jpg", "https://i.ibb.co/JmdGcW5/3-4.jpg", "https://i.ibb.co/gyp67vP/3-5.jpg", "https://i.ibb.co/2vb9dp8/3-6.jpg"));
        Property property4 = new Property(4, "7a Jasmin Court", "Flat", 3, 2, "An especially spacious three-bedroom ground floor flat enjoying a central Newton Mearns position.", 270000.00, "16/01/2024", "sale", Arrays.asList("https://i.ibb.co/KhdMnTW/4-1.jpg", "https://i.ibb.co/7yZCsL8/4-2.jpg", "https://i.ibb.co/m6MSyDP/4-3.jpg", "https://i.ibb.co/xszF5KD/4-4.jpg", "https://i.ibb.co/s1qQsnc/4-5.jpg", "https://i.ibb.co/ZzmRftw/4-6.jpg"));
        Property property5 = new Property(5, "70d Roundhouse Road", "Flat", 2, 2, "This ground floor flat is finished to a high specification throughout and would be ideal for an individual or couple.", 795.00, "22/01/2024", "rent", Arrays.asList("https://i.ibb.co/nrR7Wpx/5-1.jpg", "https://i.ibb.co/bjtG3T3/5-2.jpg", "https://i.ibb.co/3h8yTQ5/5-3.jpg", "https://i.ibb.co/rmFWsMy/5-4.jpg", "https://i.ibb.co/v1spXgh/5-5.jpg", "https://i.ibb.co/qNq9dSN/5-6.jpg"));


        propertyList.addAll(Arrays.asList(property1, property2, property3, property4, property5));

        return propertyList;
    }
}


