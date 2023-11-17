package com.trading.TradingUpFundationBackend.commons.domains.DTO;

import lombok.AllArgsConstructor;//Import to use all the arguments that a constructor normally has
import lombok.Builder;//Import to create objects easier
import lombok.Data;//Import to add the normal methods that an object has
import lombok.NoArgsConstructor;//Import who allow to create an object without args in the constructor
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;//Package to use this class like a byte sequence
import java.util.Optional;

@Data//Annotation to represent normal methods of a normal class
@Builder//Annotation who allows to build an object in an easier way
@AllArgsConstructor//Annotation who creates a constructor with all the arguments passed like parameters
@NoArgsConstructor//Annotation who creates an empty constructor
public class BookTradingDTO implements Serializable {
    private Optional<Integer> id;
    private String name;
    private String description;
    private Integer level;
    private MultipartFile image;
    private MultipartFile file;
}
