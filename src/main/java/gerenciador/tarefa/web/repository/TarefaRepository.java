package gerenciador.tarefa.web.repository;

import gerenciador.tarefa.web.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
