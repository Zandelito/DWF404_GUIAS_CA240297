package sv.edu.udb.spring_api_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.edu.udb.spring_api_rest.repository.domain.Post;
public interface PostRepository extends JpaRepository<Post, Long> {
}

