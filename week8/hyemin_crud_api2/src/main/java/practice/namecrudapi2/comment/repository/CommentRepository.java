package practice.namecrudapi2.comment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.namecrudapi2.comment.entity.Comment;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPostId(Long postId);
}

