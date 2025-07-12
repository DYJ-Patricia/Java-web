package xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        String path= Demo1.class.getClassLoader().getResource("student.XML").getPath();
      //  Document document=Jsoup.parse(new File(path),"UTF-8");
     /*   String str="<student><name>张三</name><age>18</age></student>";
        Document doc=Jsoup.parse(str);
        System.out.println(doc);*/

        URL url=new URL("https://www.baidu.com");
        Document document=Jsoup.parse(url, 10000);
        System.out.println(document.title());
    }
}
