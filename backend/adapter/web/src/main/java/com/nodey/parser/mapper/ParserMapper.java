package com.nodey.parser.mapper;

import com.nodey.parser.domain.Parser;
import com.nodey.parser.dto.out.ParserDtoOut;
import org.mapstruct.Mapper;

@Mapper
public interface ParserMapper {

    ParserDtoOut parserToParserDtoOut(Parser parsers);
}
