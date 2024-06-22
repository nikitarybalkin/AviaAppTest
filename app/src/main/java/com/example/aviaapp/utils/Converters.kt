package com.example.aviaapp.utils

import android.content.Context
import com.example.aviaapp.R
import java.time.Duration
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Calendar
import kotlin.math.roundToInt

class Converters() {
    fun convertPrice(price: Int): String {
        if (price > 999) {
            var strBuilder = StringBuilder(price.toString())
            var currentPos: Int = 0
            for (i in 1..strBuilder.length/3) {
                currentPos+=3
                strBuilder.insert(strBuilder.length - currentPos, " ")
            }
            return "от ${strBuilder} ₽"
        } else return "от ${price} ₽"
    }

    fun convertTime(list: List<String>): String {
        var sb = StringBuilder()
        for (i in 0..list.size-1) {
            sb.append(list[i])
            sb.append(" ")
        }
        return sb.toString()
    }

    fun getDate(context: Context): String {
        val calendar = Calendar.getInstance()
        var month = when (calendar.get(Calendar.MONTH)) {
            0 -> context.getString(R.string.january)
            1 -> context.getString(R.string.february)
            2 -> context.getString(R.string.march)
            3 -> context.getString(R.string.april)
            4 -> context.getString(R.string.may)
            5 -> context.getString(R.string.june)
            6 -> context.getString(R.string.jule)
            7 -> context.getString(R.string.august)
            8 -> context.getString(R.string.september)
            9 -> context.getString(R.string.october)
            10 -> context.getString(R.string.november)
            11 -> context.getString(R.string.december)
            else -> {""}
        }
        var dayOfWeek = when(calendar.get(Calendar.DAY_OF_WEEK)) {
            1 -> context.getString(R.string.sunday)
            2 -> context.getString(R.string.monday)
            3 -> context.getString(R.string.tuesday)
            4 -> context.getString(R.string.wednesday)
            5 -> context.getString(R.string.thursday)
            6 -> context.getString(R.string.friday)
            7 -> context.getString(R.string.saturday)
            else -> {""}
        }
        return "${calendar.get(Calendar.DAY_OF_MONTH)} $month, $dayOfWeek"
    }

    fun getArrivalTime(time: String): String {
        return time.substring(12,17)
    }
    fun getDepartureTime(time: String): String {
        return time.substring(12,17)
    }
    fun getFullTime(departure: String, arrival: String): String {
        val formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME
        val dateTime1 = LocalDateTime.parse(departure, formatter)
        val dateTime2 = LocalDateTime.parse(arrival, formatter)
        val duration = ((Duration.between(dateTime1, dateTime2).toMinutes() / 60.0) * 2).roundToInt() / 2.0
        if (duration % 1.0 == 0.0) return "${duration.toInt()}ч в пути"
        return "${duration}ч в пути"
    }



}