package com.datasaver.images;


import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.*;
import java.net.URL;


public class ImageSaver {
    @PostConstruct
    public void init() throws IOException {
        URL url = new URL("https://img4.goodfon.ru/wallpaper/big/e/46/klubnika-tart-sweet-iagody-delicious-berries-chernika-slad-5.jpg");
        saveImage(url);
    }


    public void saveImage(URL url) throws IOException {

        InputStream in = new BufferedInputStream(url.openStream());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        int n = 0;
        while (-1!=(n=in.read(buf)))
        {
            out.write(buf, 0, n);
        }
        out.close();
        in.close();
        byte[] response = out.toByteArray();
        FileOutputStream fos = new FileOutputStream("/home/roman/Pictures/save2.img");
        fos.write(response);
        fos.close();
    }
}
