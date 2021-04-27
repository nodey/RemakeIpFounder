package com.nodey.parser.port.in;

import com.nodey.ip.domain.Ip;

import java.util.List;

public interface ParserUseCase {

    List<Ip> getParserIpList() throws Exception;
}
