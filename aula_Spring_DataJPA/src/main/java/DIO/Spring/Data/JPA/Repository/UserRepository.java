package DIO.Spring.Data.JPA.Repository;

import DIO.Spring.Data.JPA.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer > {



}
