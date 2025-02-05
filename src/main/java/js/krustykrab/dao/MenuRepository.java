package js.krustykrab.dao;


import js.krustykrab.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    Menu save(Menu menu);

    Optional<Menu> findByMenuId(Long menuId);

    List<Menu> findAll();
}
