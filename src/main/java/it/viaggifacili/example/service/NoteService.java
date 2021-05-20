package it.viaggifacili.example.service;

import it.viaggifacili.example.model.Nota;

import java.util.List;
import java.util.Optional;

public interface NoteService {

    public void saveNota(Nota nota);

    public List<Nota> getAll();

    public void update(Nota n);

    public Optional<Nota> findById(Integer notaId);
}
