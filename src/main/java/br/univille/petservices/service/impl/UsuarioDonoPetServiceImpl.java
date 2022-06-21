package br.univille.petservices.service.impl;

import java.util.List;
import java.util.Optional;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.petservices.dto.UsuarioDonoPetDTO;
import br.univille.petservices.entity.UsuarioDonoPet;
import br.univille.petservices.mapper.UsuarioDonoPetMapper;
import br.univille.petservices.repository.UsuarioDonoPetRepository;
import br.univille.petservices.service.UsuarioDonoPetService;

@Service
public class UsuarioDonoPetServiceImpl implements UsuarioDonoPetService{


    @Autowired
    private UsuarioDonoPetRepository repository;

    
    private UsuarioDonoPetMapper mapper
    = Mappers.getMapper(UsuarioDonoPetMapper.class);

    @Override
    public List<UsuarioDonoPetDTO> getAll() {
        return mapper.mapUsuarioDonoPet(repository.findAll());
    }

    @Override
    public UsuarioDonoPetDTO save(UsuarioDonoPetDTO usuariodonopet) {
        UsuarioDonoPet usuariodonopetEntity = mapper.mapUsuarioDonoPetDTO(usuariodonopet);
        repository.save(usuariodonopetEntity);
        return mapper.mapUsuarioDonoPet(usuariodonopetEntity);
    }

    @Override
    public UsuarioDonoPetDTO findById(long id) {
        Optional<UsuarioDonoPet> usuariodonopet = repository.findById(id);
        if(usuariodonopet.isPresent()){
            UsuarioDonoPet usuariodonopetEntity = usuariodonopet.get();

            return mapper.mapUsuarioDonoPet(usuariodonopetEntity);
        }
        return new UsuarioDonoPetDTO();
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }
    
}
