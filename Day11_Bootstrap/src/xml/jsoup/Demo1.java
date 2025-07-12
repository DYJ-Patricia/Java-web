package xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        String path= Demo1.class.getClassLoader().getResource("student.XML").getPath();
        Document document=Jsoup.parse(new File(path),"UTF-8");
        Elements elements= document.getElementsByTag("name");

        Element element=elements.get(0);
        System.out.println(element.text());
    }
}
