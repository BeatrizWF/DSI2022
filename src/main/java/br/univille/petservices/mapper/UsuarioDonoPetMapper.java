package br.univille.petservices.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import br.univille.petservices.dto.UsuarioDonoPetDTO;
import br.univille.petservices.entity.UsuarioDonoPet;

@Mapper
public interface UsuarioDonoPetMapper {
    List<UsuarioDonoPetDTO> mapUsuarioDonoPet(List<UsuarioDonoPet> usuariodonopet);
    List<UsuarioDonoPet> mapUsuarioDonoPetDTO(List<UsuarioDonoPetDTO> usuariodonopet);
    UsuarioDonoPetDTO mapUsuarioDonoPet(UsuarioDonoPet usuariodonopet);
    UsuarioDonoPet mapUsuarioDonoPetDTO(UsuarioDonoPetDTO usuariodonopet);
}
