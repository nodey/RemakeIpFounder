package com.nodey.parser.port.in;

import com.nodey.ip.domain.Ip;

import java.util.List;

public interface ParserUseCase {

    void getParserIpList() throws Exception;

    List<Ip> getAllNewIp() throws Exception;
}
