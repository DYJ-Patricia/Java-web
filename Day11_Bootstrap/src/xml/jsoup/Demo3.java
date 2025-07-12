package xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        String path=Demo3.class.getClassLoader().getResource("student.XML").getPath();
        Document doc= Jsoup.parse(new File(path), "UTF-8");
        Elements elements=doc.getElementsByTag("student");
        System.out.println(elements);
        System.out.println("-------------------------------------------------");
        Elements elements2=doc.getElementsByAttributeValue("number","S001");
        System.out.println(elements2);
        System.out.println("-------------------------------------------------");
        Element element=doc.getElementsByTag("student").first();
        String str=element.attr("number");
        System.out.println(str);
    }
}
