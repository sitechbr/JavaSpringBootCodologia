package spring.boot2.repos;

import org.springframework.data.repository.CrudRepository;
import spring.boot2.domain.Message;

public interface MessageRepo  extends CrudRepository<Message,Long> {
}
