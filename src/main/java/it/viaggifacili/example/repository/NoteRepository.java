package it.viaggifacili.example.repository;

import it.viaggifacili.example.model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("noteRepository")
public interface NoteRepository extends JpaRepository<Nota, Integer> {

}
