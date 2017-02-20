package demat

import org.slf4j.LoggerFactory

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Application : CommandLineRunner {
    private val log = LoggerFactory.getLogger(Application::class.java)

    override fun run(vararg args: String?) {
        log.info("run")
        var sb = StringBuilder()
        for (option in args) {
            sb.append(" ").append(option)
            log.info("OPTION: {}", option)
        }
        sb = if (sb.length == 0) sb.append("No Options Specified") else sb
        log.info(String.format("WAR launched with following options: %s", sb.toString()))
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}
