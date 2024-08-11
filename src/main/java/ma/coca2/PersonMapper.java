package ma.coca2;

import ma.coca2.dto.PersonDto;
import ma.coca2.models.PersonEntity;
import org.mapstruct.factory.Mappers;

@org.mapstruct.Mapper

public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);
    PersonEntity toEntity(PersonDto personDto);

    PersonDto toDto(PersonEntity person);





}
