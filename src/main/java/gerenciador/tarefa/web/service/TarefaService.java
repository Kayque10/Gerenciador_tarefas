package gerenciador.tarefa.web.service;


import gerenciador.tarefa.web.model.Tarefa;
import gerenciador.tarefa.web.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> listarTarefas(){
        return tarefaRepository.findAll();
    }

    public Tarefa salvarTarefa(Tarefa tarefa){
        return tarefaRepository.save(tarefa);
    }

    public void deletarTarefa(Long id){
        tarefaRepository.deleteById(id);
    }
}
