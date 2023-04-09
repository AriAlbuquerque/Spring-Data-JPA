package DIO.Spring.Data.JPA;

import DIO.Spring.Data.JPA.Model.User;
import DIO.Spring.Data.JPA.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
   @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {

        User user= new User();
        user.setName("Ariane");
        user.setUserName("AriAlbuquerque");
        user.setPassword("Ari123");

        repository.save(user);


        for (User user1 : repository.findAll()){
            System.out.println(user1);
        }
    }
}
