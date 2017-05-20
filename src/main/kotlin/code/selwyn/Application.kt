package code.selwyn

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Created by Selwyn on 5/19/2017.
 */
@SpringBootApplication
open class Application


fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}