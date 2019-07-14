package frc.team2767.healthchecktest

import edu.wpi.first.wpilibj.TimedRobot
import edu.wpi.first.wpilibj.command.Scheduler
import frc.team2767.healthchecktest.control.Controls
import frc.team2767.healthchecktest.subsystem.TestSubsystem
import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

class Robot : TimedRobot() {

    override fun robotInit() {
        logger.info { "Healthcheck robot init" }
    }

    override fun teleopPeriodic() {
        Scheduler.getInstance().run()
    }

    companion object {
        val TEST = TestSubsystem()
        val CONTROLS = Controls()
    }
}
