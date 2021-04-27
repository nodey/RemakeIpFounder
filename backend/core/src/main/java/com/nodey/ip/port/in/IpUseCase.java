package com.nodey.ip.port.in;

import com.nodey.ip.domain.Ip;

import java.util.List;

public interface IpUseCase {

    boolean checkIpForAccess(String ip) throws Exception;

    Ip getAccessIpList() throws Exception;

}
