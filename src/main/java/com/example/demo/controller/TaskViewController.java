package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Task;
import com.example.demo.repository.TaskRepository;

@Controller
public class TaskViewController {

    @Autowired
    private TaskRepository taskRepository;

    // 一覧画面の表示
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("tasks", taskRepository.findAll());
        return "index";  // → templates/index.html を表示
    }

    // フォームからの新規登録
    @PostMapping("/add")
    public String add(@RequestParam String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskRepository.save(task);
        return "redirect:/";
    }

    // 完了チェックの切り替え
    @PostMapping("/toggle/{id}")
    public String toggle(@org.springframework.web.bind.annotation.PathVariable Long id) {
        Task task = taskRepository.findById(id).orElseThrow();
        task.setCompleted(!task.isCompleted());
        taskRepository.save(task);
        return "redirect:/";
    }

    // 削除
    @PostMapping("/delete/{id}")
    public String delete(@org.springframework.web.bind.annotation.PathVariable Long id) {
        taskRepository.deleteById(id);
        return "redirect:/";
    }
}
