package cv_server.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;


public class User {

//    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;

    private String username;
    private String email;
    private String password;
    private Integer term;
    private Boolean status;
}
