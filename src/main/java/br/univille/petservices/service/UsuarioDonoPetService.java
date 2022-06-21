package br.univille.petservices.service;

import java.util.List;

import br.univille.petservices.dto.UsuarioDonoPetDTO;

public interface UsuarioDonoPetService {
    public List<UsuarioDonoPetDTO> getAll();
    public UsuarioDonoPetDTO save(UsuarioDonoPetDTO usuariodonopet);
    public UsuarioDonoPetDTO findById(long id);
    public void delete(long id);
}







