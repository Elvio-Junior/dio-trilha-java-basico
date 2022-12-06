package dio.firstwebapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.firstwebapi.model.Usuario;
import dio.firstwebapi.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    public UserRepository userRepository;

    @GetMapping()
    public List<Usuario> getUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/{userName}")
    public Usuario getOne(@PathVariable("userName") String userName) {
        return userRepository.findByUsername(userName);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        userRepository.deleteById(id);
    }

    @PostMapping("")
    public void postUser(@RequestBody Usuario usuario) {
        userRepository.save(usuario);
    }
}
