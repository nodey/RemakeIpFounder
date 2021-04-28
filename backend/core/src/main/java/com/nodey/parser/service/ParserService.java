package com.nodey.parser.service;

import com.nodey.ip.domain.Ip;
import com.nodey.parser.port.out.ParserPort;
import com.nodey.parser.port.in.ParserUseCase;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
class ParserService implements ParserUseCase {

    private final ParserPort port;

    @Override
    @SneakyThrows
    public List<Ip> getIpsFromParser() {
        return port.getIpsFromParser();
    }
}
