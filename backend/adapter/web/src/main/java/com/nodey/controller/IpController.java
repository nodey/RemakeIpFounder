package com.nodey.controller;

import com.nodey.dto.out.IpDtoOut;
import com.nodey.ip.port.in.IpUseCase;
import com.nodey.mapper.IpDtoMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ip")
@RequiredArgsConstructor
class IpController {

    private final IpUseCase useCase;
    private final IpDtoMapper mapper;

    @SneakyThrows
    @GetMapping("{id}")
    public IpDtoOut getIp(@PathVariable("id") Integer id) {
        return mapper.ipToIpDtoOut(useCase.getIp(id));
    }

    @SneakyThrows
    @GetMapping
    public IpDtoOut getAccessIp(){
        return mapper.ipToIpDtoOut(useCase.getAccessIpList());
    }

}
