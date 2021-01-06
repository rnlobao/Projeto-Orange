package robson.projetoorange.repository;

import org.springframework.data.repository.CrudRepository;
import robson.projetoorange.model.UsuárioModel;

public interface UsuarioRepository extends CrudRepository<UsuárioModel, Integer> {
}
