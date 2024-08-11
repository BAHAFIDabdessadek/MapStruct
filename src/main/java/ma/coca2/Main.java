package ma.coca2;

import ma.coca2.dto.PersonDto;
import ma.coca2.models.PersonEntity;

public class Main {
    public static void main(String[] args) {


        PersonDto personDto = new PersonDto();
        personDto.setId(1L);
        personDto.setFirstName("Uranus");
        personDto.setLastName("L9itar");

        PersonEntity person = PersonMapper.INSTANCE.toEntity(personDto);

        System.out.println(person.getLastName());




    }
}