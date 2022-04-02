package miu.edu.demo.domain.dto;


import lombok.Data;
import miu.edu.demo.domain.Post;

import java.util.List;

@Data
public class UserDto {

    private int id;
    private String name;
    private List<Post> posts;

}
