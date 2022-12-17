package com.project.ChemistryStockControl.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ChemistryStockControl.exception.ResourceNotFoundException;
import com.project.ChemistryStockControl.model.User;
import com.project.ChemistryStockControl.repository.UserRepository;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api/v1/")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    // private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    // get all users
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // create user rest api
    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        // String encoder = this.passwordEncoder.encode(user.getSenha());
        // user.setSenha(encoder);
        return userRepository.save(user);
    }

    // get user by matricula rest api
    @GetMapping("/users/{matricula}")
    public ResponseEntity<User> getUserById(@PathVariable String matricula) { // change this for matricula
        User user = userRepository.findByMatricula(matricula)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id: " + matricula));
        return ResponseEntity.ok(user);
    }

    // update user rest api
    @PutMapping("/users/{matricula}")
    public ResponseEntity<User> updateUser(@PathVariable String matricula, @RequestBody User userDetails) {

        User user = userRepository.findByMatricula(matricula)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id :" + matricula));

        user.setEmail(userDetails.getEmail());
        user.setName(userDetails.getName());

        User updateUser = userRepository.save(user);
        return ResponseEntity.ok(updateUser);
    }

    // delete user rest api
    @DeleteMapping("/users/{matricula}")
    public ResponseEntity<Map<String, Boolean>> deleteUser(@PathVariable String matricula) {
        User user = userRepository.findByMatricula(matricula)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id :" + matricula));

        userRepository.delete(user);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
