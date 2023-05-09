package dev.quercusdata.ibermaticademov2;

import dev.quercusdata.ibermaticademov2.model.Task;
import dev.quercusdata.ibermaticademov2.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IbermaticaDemoV2Application {

	public static void main(String[] args) {
		SpringApplication.run(IbermaticaDemoV2Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(TaskRepository taskRepository) {
		return args -> {
			Task task = new Task();
			task.setName("Sample Task");
			task.setDescription("This is a sample task");
			task.setStatus("Pending");

			taskRepository.save(task);
		};
	}
}
