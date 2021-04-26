package com.nodey.ip.service;

import com.nodey.ip.domain.Ip;
import com.nodey.ip.port.in.IpUseCase;
import com.nodey.ip.port.out.IpPort;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class IpService implements IpUseCase {

    private final IpPort port;

    @Override
    @SneakyThrows
    public Ip getIp(Integer id) {
        return port.findIpById(id);
    }

    @Override
    @SneakyThrows
    public boolean checkIpForAccess(String ip) {
        return port.checkIpForAccess(ip);
    }

    @Override
    @SneakyThrows
    public Ip getAccessIpList() {
        return port.getAccessIpList();
    }

}
