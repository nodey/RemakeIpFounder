package com.nodey.parser.adapter;

import com.nodey.ip.domain.Ip;
import com.nodey.parser.port.in.ParserPort;
import lombok.RequiredArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
class ParserAdapter implements ParserPort {

    @Value("${com.nodey.parser.url}")
    private String url;

    @Value("${com.nodey.parser.tableTag}")
    private String tableTag;

    @Value("${com.nodey.parser.rowSettings}")
    private String rowSettings;

    @Value("${com.nodey.parser.ipSequence}")
    private String ipSequence;

    @Value("${com.nodey.parser.portSequence}")
    private String portSequence;

    private List<Ip> parserList;

    @Override
    public List<Ip> parseNewIps() throws Exception {

        parserList = new ArrayList<>();

        Document doc = Jsoup.connect(url).get();
        Element table = doc.select(tableTag).get(0);

        for (Element row : table.select(rowSettings)) {
            Elements ips = row.select(ipSequence);
            Elements ports = row.select(portSequence);
            String ip = ips.text();
            String port = ports.text();
            Ip obj = new Ip();
            obj.setIp(ip);
            obj.setPort(port);
            parserList.add(obj);
        }
        return parserList;
    }

    @Override
    public List<Ip> getIpsFromParser() throws Exception {
        return parseNewIps();
    }
}