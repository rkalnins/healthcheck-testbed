package frc.team2767.healthchecktest.subsystem

import com.ctre.phoenix.motorcontrol.FeedbackDevice
import com.ctre.phoenix.motorcontrol.can.TalonSRX
import com.ctre.phoenix.motorcontrol.can.TalonSRXConfiguration
import edu.wpi.first.wpilibj.command.Subsystem
import mu.KotlinLogging

class TestSubsystem : Subsystem() {
    private val logger = KotlinLogging.logger {}
    private val id = 6
    private val talon = TalonSRX(id)

    override fun initDefaultCommand() {
    }

    init {
        configTalon()
    }

    fun getTalons() = listOf(talon)

    private fun configTalon() {
        val talonConfig = TalonSRXConfiguration().apply {
            primaryPID.selectedFeedbackSensor = FeedbackDevice.CTRE_MagEncoder_Relative
            continuousCurrentLimit = 10
            peakCurrentLimit = 0
            peakCurrentDuration = 0
            slot0.kP = 0.1
            motionAcceleration = 10_000
            motionCruiseVelocity = 800
        }

        talon.configAllSettings(talonConfig)
        logger.info { "Talons configured" }
    }
}