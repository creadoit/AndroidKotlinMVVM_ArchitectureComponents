package com.company.project.database.converter

import android.arch.persistence.room.TypeConverter
import java.util.*

/**
 * Created by tim.wienrich on 27.03.18.
 */

object DateConverter {
    @TypeConverter
    fun toDate(timestamp: Long?): Date? {
        return if (timestamp == null) null else Date(timestamp)
    }

    @TypeConverter
    fun toTimestamp(date: Date?): Long? {
        return date?.time
    }
}