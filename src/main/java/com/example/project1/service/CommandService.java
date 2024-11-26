package com.example.project1.service;

import com.example.project1.entity.CommandEntity;
import com.example.project1.exception.CommandException;
import com.example.project1.repository.CommandRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandService {

    private final CommandRepository commandRepository;

    public CommandService(CommandRepository commandRepository) {
        this.commandRepository = commandRepository;
    }

    public CommandEntity createCommand(CommandEntity command) {
        return commandRepository.save(command);
    }

    public CommandEntity getCommand(Long id) throws CommandException {
        return commandRepository.findById(id).orElseThrow(() -> new CommandException(CommandException.CommandError.COMMAND_NOT_FOUND));
    }

    public List<CommandEntity> getCommands() {
        return commandRepository.findAll();
    }
}
