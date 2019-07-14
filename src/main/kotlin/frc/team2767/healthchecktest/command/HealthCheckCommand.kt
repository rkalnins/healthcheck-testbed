package frc.team2767.healthchecktest.command

import edu.wpi.first.wpilibj.command.Command
import frc.team2767.healthchecktest.Robot
import mu.KotlinLogging
import org.strykeforce.thirdcoast.healthcheck.HealthCheck
import org.strykeforce.thirdcoast.healthcheck.healthCheck

private val logger = KotlinLogging.logger {}

class HealthCheckCommand : Command() {

    init {
        requires(Robot.TEST)
    }

    private lateinit var healthCheck: HealthCheck

    override fun initialize() {
        healthCheck = healthCheck {

        }
    }

    override fun execute() {
        healthCheck.execute()
    }

    override fun isFinished() = healthCheck.isFinished()

    override fun end() {
        healthCheck.report()
    }
}