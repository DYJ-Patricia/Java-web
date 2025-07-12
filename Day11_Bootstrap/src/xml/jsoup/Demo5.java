package xml.jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Demo5 {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        String path=Demo3.class.getClassLoader().getResource("student.XML").getPath();
        Document doc= Jsoup.parse(new File(path), "UTF-8");

        JXDocument jxDocument = new JXDocument(doc);
        List<JXNode> jxNodes= jxDocument.selN("//student");
        System.out.println(jxNodes);
        System.out.println("-------------------------------------------------");
        List<JXNode> jxNodes2= jxDocument.selN("//student[@number='S001']");
        System.out.println(jxNodes2);
    }
}
