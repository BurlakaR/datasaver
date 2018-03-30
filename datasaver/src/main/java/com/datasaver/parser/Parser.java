package com.datasaver.parser;

import com.datasaver.grpc.Connector;
import com.shopserver.database.objects.Product;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;

@Service
public class Parser {
    @Autowired
    private Connector connector;

    private static final String A_HREF = "a[href]";
    @PostConstruct
    public void init() throws IOException {
        String url = "https://rozetka.com.ua/computers-notebooks/c80253/";
        Document doc = Jsoup.connect(url).get();
        Elements links = doc.select(A_HREF);
        for (Element link : links) {
            if(link.hasClass("pab-h3-link"));
        }


        Elements names = doc.select(H1_DETAIL);
        Elements prices = doc.select(MERA_PRICE);
        Elements images = doc.select(IMG_BASE);
        Elements descriptions = doc.select(DIV_DESCRIPT);
        if (descriptions.size() == 0) descriptions = doc.select(DIV_DESCRIPT2);


        for (Element link : links) {
            linkQueue.add(link.attr(ABS_HREF));
        }


        String name = "";
        String price = "";
        String img = "";
        String description = "";
        try {
            name = names.get(0).text();
            img = images.get(0).attr(SRC);
            description = descriptions.get(0).text();
            for (Element priceT : prices) {
                if (priceT.attr(ITEMPROP).equals(PRICE)) {
                    price = priceT.attr(CONTENT);
                    break;
                }
            }

            productQueue.add(new Product(url, name, price, img, description));

        } catch (IndexOutOfBoundsException e) {

        }

    }
}
