package com.nodey.mapper;

import com.nodey.dto.in.IpDtoIn;
import com.nodey.dto.out.IpDtoOut;
import com.nodey.ip.domain.Ip;
import org.mapstruct.Mapper;

@Mapper
public interface IpDtoMapper {

    Ip ipDtoInToIp(IpDtoIn ipDtoIn);

    IpDtoOut ipToIpDtoOut(Ip ips);
}
