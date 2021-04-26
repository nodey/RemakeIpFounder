package com.nodey.Ip.adapter;

import com.nodey.ip.domain.Ip;
import com.nodey.ip.port.out.IpPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
class IpAdapter implements IpPort {

    private List<Ip> ips;

    private InetAddress inetAddress;

    @PostConstruct
    public void init(){
        ips = new ArrayList<>();

        Ip ip1 = new Ip(1, "202.151.202.68", "3128");
        Ip ip2 = new Ip(2, "103.109.59.242", "53281");
        Ip ip3 = new Ip(3, "90.83.154.85", "8080");
        Ip ip4 = new Ip(4, "219.92.3.149", "8080");
        Ip ip5 = new Ip(4, "23.21.179.114", "8080");
        Ip ip6 = new Ip(4, "103.28.121.58", "80");
        Ip ip7 = new Ip(4, "77.68.125.33", "80");
        Ip ip8 = new Ip(4, "34.233.217.185", "8080");
        Ip ip9 = new Ip(4, "85.15.152.39", "3128");
        Ip ip10 = new Ip(4, "194.250.57.253", "8080");

        ips.add(ip1);
        ips.add(ip2);
        ips.add(ip3);
        ips.add(ip4);
        ips.add(ip5);
        ips.add(ip6);
        ips.add(ip7);
        ips.add(ip8);
        ips.add(ip9);
        ips.add(ip10);
    }

    @Override
    public Ip findIpById(Integer id) throws Exception{
        return ips.get(id);
    }

    @Override
    public boolean checkIpForAccess(String ip) throws Exception {

        inetAddress = InetAddress.getByName(ip);
        return inetAddress.isReachable(5000);
    }

    public Ip getAccessIpList() throws Exception{

        for (Ip ip : ips){
            if(checkIpForAccess(ip.getIp())){
                return ip;
            }
        }
        return null;
    }
}
