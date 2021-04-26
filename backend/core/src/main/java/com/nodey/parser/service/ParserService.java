package com.nodey.parser.service;

import com.nodey.ip.domain.Ip;
import com.nodey.parser.port.in.ParserPort;
import com.nodey.parser.port.in.ParserUseCase;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ParserService implements ParserUseCase {

    private final ParserPort port;


    @Override
    @SneakyThrows
    public void getParserIpList() {
        port.parseNewIp();
    }

    @Override
    @SneakyThrows
    public List<Ip> getAllNewIp() {
        return port.getAllNewIp();
    }
}
