package xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        String path=Demo3.class.getClassLoader().getResource("student.XML").getPath();
        Document doc= Jsoup.parse(new File(path), "UTF-8");
        Elements elements=doc.select("student[number='S001']");
        System.out.println(elements);
        System.out.println("-------------------------------------------------");
        Elements elements2=doc.select("student[number='S001'] > name");
        System.out.println(elements2);
    }
}
