package frc.team2767.healthchecktest.control

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard
import frc.team2767.healthchecktest.command.HealthCheckCommand

class SmartdashboardControls {
    init {
        SmartDashboard.putData("Healthcheck", HealthCheckCommand())
    }
}