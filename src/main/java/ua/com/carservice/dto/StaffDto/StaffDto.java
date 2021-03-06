package ua.com.carservice.dto.StaffDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.com.carservice.entity.enums.Position;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffDto {

    private Long id;
    private Double salary;
    private String firstName;
    private String lastName;
    @Enumerated(value = EnumType.STRING)
    private Position position;
}
