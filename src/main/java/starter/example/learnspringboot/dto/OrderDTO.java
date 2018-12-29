package starter.example.learnspringboot.dto;


import lombok.Data;

@Data
public class OrderDTO {

    private long userId;
    private long id;
    private String title;
    private Boolean completed;
}
