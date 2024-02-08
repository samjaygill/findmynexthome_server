package com.gillies.findmynexthome.data;

import com.gillies.findmynexthome.model.Blog;
import com.gillies.findmynexthome.model.Property;
import com.gillies.findmynexthome.repository.BlogRepository;
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

    private final BlogRepository blogRepository;
    private List<Blog> blogList;


    public DataLoader(PropertyRepository propertyRepository, BlogRepository blogRepository) {
        this.propertyRepository = propertyRepository;
        this.blogRepository = blogRepository;
    }

    @PostConstruct
    public void loadData() {
        List<Property> initialProperties = createInitialData();
        propertyRepository.saveAll(initialProperties);

        List<Blog> initialBlogs = createInitialBlogData();
        blogRepository.saveAll(initialBlogs);
    }

    private List<Property> createInitialData() {
        propertyList = new ArrayList<>();

        Property property1 = new Property(1, "2a Arran Avenue", "Kilmarnock", "Detached", 3, 2, "This three-bed detatched residence in a sought-after residential area features an open-plan dining kitchen, front and rear garden, multi-car driveway, family bathroom and a convenient WC cloakroom.", 290000.00, "22/01/2024", "sale", Arrays.asList("https://i.ibb.co/3FwQqVt/1-1.jpg", "https://i.ibb.co/tpWSqC6/1-3.jpg", "https://i.ibb.co/2FH2Nst/1-2.jpg", "https://i.ibb.co/8rpHDfz/1-4.jpg", "https://i.ibb.co/k9RD4cY/1-6.jpg", "https://i.ibb.co/92K3MSv/1-7.jpg"));
        Property property2 = new Property(2, "11 Jubilee Crescent", "Kilmarnock", "Semi-Detached", 3, 2, "This three-Bed semi-detached residence in a sought-after residential area features an open-plan dining kitchen, front and rear garden, multi-car driveway, EV charging point, family bathroom and a convenient WC cloakroom.", 150000.00, "21/01/2024", "sale", Arrays.asList("https://i.ibb.co/0DdwkSw/2-1.jpg", "https://i.ibb.co/vwj6F1H/2-2.jpg", "https://i.ibb.co/RQbcc64/2-3.jpg", "https://i.ibb.co/s1yyF8W/2-4.jpg","https://i.ibb.co/1ffLHxW/2-5.jpg", "https://i.ibb.co/DCnGGSH/2-6.jp"));
        Property property3 = new Property(3, "5 BurnBridge Avenue", "Irvine", "Semi-Detached", 3, 1, "This three-bed semi-detatched residence in a sought-after residential area features an open-plan dining kitchen, front and rear garden, driveway and family bathroom.", 100000.00, "19/01/2024","sale", Arrays.asList("https://i.ibb.co/z473Cd1/3-1.jpg", "https://i.ibb.co/Jrh5xjQ/3-2.jpg", "https://i.ibb.co/yYMsw3T/3-3.jpg", "https://i.ibb.co/JmdGcW5/3-4.jpg", "https://i.ibb.co/gyp67vP/3-5.jpg", "https://i.ibb.co/2vb9dp8/3-6.jpg"));
        Property property4 = new Property(4, "7a Jasmin Court", "Newton Mearns", "Flat", 3, 2, "An especially spacious three-bedroom ground floor flat enjoying a central Newton Mearns position.", 270000.00, "18/01/2024", "sale", Arrays.asList("https://i.ibb.co/KhdMnTW/4-1.jpg", "https://i.ibb.co/7yZCsL8/4-2.jpg", "https://i.ibb.co/m6MSyDP/4-3.jpg", "https://i.ibb.co/xszF5KD/4-4.jpg", "https://i.ibb.co/s1qQsnc/4-5.jpg", "https://i.ibb.co/ZzmRftw/4-6.jpg"));
        Property property5 = new Property(5, "70d Roundhouse Road","East Kilbride", "Flat", 2, 2, "This ground floor flat is finished to a high specification throughout and would be ideal for an individual or couple.", 795.00, "22/01/2024", "rent", Arrays.asList("https://i.ibb.co/nrR7Wpx/5-1.jpg", "https://i.ibb.co/bjtG3T3/5-2.jpg", "https://i.ibb.co/3h8yTQ5/5-3.jpg", "https://i.ibb.co/rmFWsMy/5-4.jpg", "https://i.ibb.co/v1spXgh/5-5.jpg", "https://i.ibb.co/qNq9dSN/5-6.jpg"));
        Property property6 = new Property(6, "2/1 60 Skilling Street","Shawlands", "Flat", 1, 1, "Occupying a favoured position within vibrant Shawlands and presented to market in excellent condition throughout is this exceptional one bedroom apartment.", 895.00, "22/01/2024", "rent", Arrays.asList("https://i.ibb.co/hDpxGPW/6-1.jpg", "https://i.ibb.co/449fzF5/6-2.jpg", "https://i.ibb.co/tQCKMjw/6-3.jpg", "https://i.ibb.co/60PNcPR/6-4.jpg", "https://i.ibb.co/cb9ZQRS/6-5.jpg", "https://i.ibb.co/2hxdYnv/6-6.jpg"));
        Property property7 = new Property(7, "30 Preistland Avenue","Bridge Of Weir", "Detached", 5, 3, "Luxury family 5 bedroomed modern new build villa set in a quiet residential area in Bridge of Weir.", 3500.00, "04/01/2024", "rent", Arrays.asList("https://i.ibb.co/d0jHpnT/7-1.jpg", "https://i.ibb.co/T8BPV5j/7-2.jpg", "https://i.ibb.co/37C9Wxw/7-3.jpg", "https://i.ibb.co/zXHyfGR/7-4.jpg", "https://i.ibb.co/xGNjVZ5/7-5.jpg", "https://i.ibb.co/7pzFp6B/7-6.jpg"));
        Property property8 = new Property(8, "3b Hallhead Road","Paisley", "Flat", 3, 1, "Luxury newly renovated 3 bedroomed traditional flat set in a quiet residential area in Paisley.", 1800.00, "21/01/2024", "rent", Arrays.asList("https://i.ibb.co/PchWLry/1-1.jpg", "https://i.ibb.co/rtWRWfz/1-2.jpg", "https://i.ibb.co/Z8Y6rG6/1-3.jpg", "https://i.ibb.co/Zd23Ph4/1-4.jpg", "https://i.ibb.co/3Rv2qXm/1-5.jpg", "https://i.ibb.co/qFLX5R5/1-6.jpg"));
        Property property9 = new Property(9, "20 Henry Street","Galston", "Terraced", 2, 1, "Lounge and open plan fully fitted modern kitchen, downstairs bedroom with fitted sliding wardrobe and shower room, the upper level benefits from a double bedroom and family bathroom.", 595.00, "21/01/2024", "rent", Arrays.asList("https://i.ibb.co/2hqL22Q/2-1.jpg", "https://i.ibb.co/72QK7Xx/2-2.jpg", "https://i.ibb.co/ZKY8cMQ/2-3.jpg", "https://i.ibb.co/Gpt2gjs/2-4.jpg", "https://i.ibb.co/SmCw0t4/2-5.jpg", "https://i.ibb.co/8mv04yt/2-6.jpg"));
        Property property10 = new Property(10, "9 Hardhat Street","Govan", "Semi-Detached", 4, 1, "Well presented four-bedroom semi-detached family home. Offered to the market un-furnished. This ideal family sized home is located within a short drive to the City Centre , Glasgow airport, M8 motorway and Braehead.", 1395.00, "20/01/2024", "rent", Arrays.asList("https://i.ibb.co/dG84jMj/3-1.jpg", "https://i.ibb.co/fxk7QXS/3-2.jpg", "https://i.ibb.co/0Ft5bg8/3-3.jpg", "https://i.ibb.co/bXt88T9/3-4.jpg", "https://i.ibb.co/r06CSbc/3-5.jpg", "https://i.ibb.co/28fsYLv/3-6.jpg"));
        Property property11 = new Property(11, "12 Harving Avenue","Newton Mearns", "Semi-Detached", 3, 2, "An extended, semi-detached villa set within generous gardens, extremely well located for amenities within the surrounding district. ", 1400.00, "24/01/2024", "rent", Arrays.asList("https://i.ibb.co/wsCb16S/4-1.jpg", "https://i.ibb.co/Qv1XnWZ/4-2.jpg", "https://i.ibb.co/k80PKLh/4-3.jpg", "https://i.ibb.co/QvKRvRw/4-4.jpg", "https://i.ibb.co/L8NS4K9/4-5.jpg", "https://i.ibb.co/Vt8gHsb/4-6.jpg", "https://i.ibb.co/BL6BKq2/4-7.jpg"));
        Property property12 = new Property(12, "3 Farkland Avenue","Newton Mearns", "Bungalow", 5, 3, "A locally admired and well presented traditional detached family home, positioned within generous with landscaped private corner garden grounds.", 695000.00, "20/01/2024", "sale", Arrays.asList("https://i.ibb.co/qWD0HmG/1-1.jpg", "https://i.ibb.co/LzqRqb4/1-2.jpg", "https://i.ibb.co/m9hFSY7/1-3.jpg", "https://i.ibb.co/F3mVhfs/1-4.jpg", "https://i.ibb.co/CMcg2QV/1-5.jpg", "https://i.ibb.co/b6p62L9/1-6.jpg", "https://i.ibb.co/CBGvPjT/1-7.jpg"));

        propertyList.addAll(Arrays.asList(property1, property2, property3, property4, property5, property6, property7, property8, property9, property10, property11, property12));
        return propertyList;
    }

    private List<Blog> createInitialBlogData() {
        blogList = new ArrayList<>();

        Blog blog1 = new Blog(1,"First Title", "First content");
        Blog blog2 = new Blog(2,"Second Title", "Second content");
        Blog blog3 = new Blog(3,"Third Title", "Third content");
        Blog blog4 = new Blog(4,"Fourth Title", "Fourth content");
        Blog blog5 = new Blog(5,"Fifth Title", "Fifth content");
        Blog blog6 = new Blog(6,"Sixth Title", "Sixth content");

        blogList.addAll(Arrays.asList(blog1, blog2, blog3, blog4, blog5, blog6));
        return blogList;
    }
}


