package frc.team2767.healthchecktest.control

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard
import frc.team2767.healthchecktest.command.HealthCheckCommand

class Controls {
    private val SmartdashboardControls = SmartdashboardControls()
}

class SmartdashboardControls {
    init {
        SmartDashboard.putData("Healthcheck", HealthCheckCommand())
    }
}