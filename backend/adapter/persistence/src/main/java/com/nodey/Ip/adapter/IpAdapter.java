package com.nodey.Ip.adapter;

import com.nodey.ip.domain.Ip;
import com.nodey.ip.port.out.IpPort;
import com.nodey.parser.port.in.ParserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.net.InetAddress;

@Component
@RequiredArgsConstructor
class IpAdapter implements IpPort {

    private InetAddress inetAddress;

    private final ParserUseCase useCase;

    @Override
    public boolean checkIpForAccess(String ip) throws Exception {

        inetAddress = InetAddress.getByName(ip);
        return inetAddress.isReachable(5000);
    }

    public Ip getAccessIpList() throws Exception{

        for (Ip ip : useCase.getIpsFromParser()){
            if(checkIpForAccess(ip.getIp())){
                return ip;
            }
        }
        return null;
    }
}
