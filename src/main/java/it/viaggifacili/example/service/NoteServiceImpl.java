package it.viaggifacili.example.service;

import it.viaggifacili.example.model.Nota;
import it.viaggifacili.example.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("noteService")
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public void saveNota(Nota nota) {
        noteRepository.save(nota);
    }

    @Override
    public List<Nota> getAll() {
        return noteRepository.findAll();
    }

    @Override
    public void update(Nota n) {
        noteRepository.save(n);
    }

    @Override
    public Optional<Nota> findById(Integer notaId) {
        return noteRepository.findById(notaId);
    }

}
