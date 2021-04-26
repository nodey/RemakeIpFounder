package com.nodey.ip.port.in;

import com.nodey.ip.domain.Ip;

public interface IpUseCase {

    Ip getIp(Integer id) throws Exception;

    boolean checkIpForAccess(String ip) throws Exception;

    Ip getAccessIpList() throws Exception;

}
