package learn.war.spring.webdisplay.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import learn.war.spring.webdisplay.user.UserModel;

@Repository
public interface Repo extends CrudRepository<UserModel, Integer> {

}
