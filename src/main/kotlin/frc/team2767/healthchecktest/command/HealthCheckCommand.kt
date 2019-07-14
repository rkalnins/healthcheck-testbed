package frc.team2767.healthchecktest.command

import edu.wpi.first.wpilibj.command.Command
import frc.team2767.healthchecktest.Robot
import org.strykeforce.thirdcoast.healthcheck.HealthCheck
import org.strykeforce.thirdcoast.healthcheck.healthCheck

class HealthCheckCommand : Command() {

    init {
        requires(Robot.TEST)
    }

    private lateinit var healthCheck: HealthCheck

    override fun initialize() {
        healthCheck = healthCheck {
            talonCheck {
                name = "motor healthcheck test"
                talons = Robot.TEST.getTalons()

                val curRange = 0.25..0.75
                val percent = 0.25
                val speedMin = 215
                val speedMax = 250

                timedTest {
                    percentOutput = percent
                    currentRange = curRange
                    speedRange = speedMin..speedMax
                }

                timedTest {
                    percentOutput = -percent
                    currentRange = curRange
                    speedRange = -speedMax..-speedMin
                }
            }
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