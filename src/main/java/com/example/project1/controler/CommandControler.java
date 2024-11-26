package com.example.project1.controler;

import com.example.project1.entity.CommandEntity;
import com.example.project1.exception.CommandException;
import com.example.project1.service.CommandService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommandControler {

    private final CommandService commandService;

    public CommandControler(CommandService commandService) {
        this.commandService = commandService;
    }

    @PostMapping("/commands/")
    public CommandEntity createCommand(@RequestBody CommandEntity command) {
        return commandService.createCommand(command);
    }

    @GetMapping("/commands/")
    public List<CommandEntity> getCommands() {
        return commandService.getCommands();
    }

    @GetMapping("/commands/{id}")
    public CommandEntity getCommand(@PathVariable Long id) throws CommandException {
        return commandService.getCommand(id);
    }
}
