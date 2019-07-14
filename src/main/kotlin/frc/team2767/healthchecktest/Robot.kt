package frc.team2767.healthchecktest

import edu.wpi.first.wpilibj.TimedRobot
import edu.wpi.first.wpilibj.command.Scheduler
import frc.team2767.healthchecktest.subsystem.TestSubsystem
import org.strykeforce.thirdcoast.telemetry.TelemetryController
import org.strykeforce.thirdcoast.telemetry.TelemetryService
import java.util.*
import java.util.function.Function
import java.util.Date




import mu.KotlinLogging


private val logger = KotlinLogging.logger {}

class Robot : TimedRobot() {

    override fun robotInit() {
    
        logger.info { "Today is ${Date()}" }
    
    }

    override fun teleopPeriodic() {
        Scheduler.getInstance().run()
    }

    companion object {

        // Instantiate this before Subsystems because they use telemetry service.
        val TELEMETRY = TelemetryService(Function { TelemetryController(it) })
        val TEST = TestSubsystem()


    }

}
