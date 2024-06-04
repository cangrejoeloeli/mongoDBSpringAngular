package ms.desa.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import ms.desa.models.ERole;
import ms.desa.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
