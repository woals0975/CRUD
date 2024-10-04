package Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;  //id를 식별할 고유 번호
    private String name; //이게 id
    private String password; //password
    private String email; //id, password 찾기할때 사용



}
