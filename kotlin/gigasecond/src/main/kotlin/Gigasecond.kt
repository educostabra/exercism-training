import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.temporal.ChronoUnit

class Gigasecond {

    var date: LocalDateTime?

    val GIGASECOND: Long = 1000000000L

    constructor(startDate: LocalDate) {
        date = LocalDateTime.of(startDate, LocalTime.MIN).plus(GIGASECOND, ChronoUnit.SECONDS)
    }

    constructor(startDateTime: LocalDateTime) {
        date = startDateTime.plus(GIGASECOND, ChronoUnit.SECONDS)
    }
}