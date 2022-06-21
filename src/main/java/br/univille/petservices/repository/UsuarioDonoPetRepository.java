package br.univille.petservices.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.petservices.entity.UsuarioDonoPet;

    @Repository
    public interface UsuarioDonoPetRepository extends JpaRepository<UsuarioDonoPet, Long> {
        
    }
