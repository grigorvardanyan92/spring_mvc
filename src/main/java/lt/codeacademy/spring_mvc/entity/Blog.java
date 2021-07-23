package lt.codeacademy.spring_mvc.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="blog")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String header;
    private String intro;
    private String text;
}
