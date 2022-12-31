package com.handsomemofokeng.noteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.handsomemofokeng.noteapp.ui.theme.BabyBlue
import com.handsomemofokeng.noteapp.ui.theme.RedOrange
import com.handsomemofokeng.noteapp.ui.theme.RedPink
import com.handsomemofokeng.noteapp.ui.theme.Violet
import com.handsomemofokeng.noteapp.ui.theme.LightGreen

@Entity
data class Note (
    val title: String,
    val description: String,
    val timeStamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object{
        val noteColors = listOf(RedOrange, RedPink, BabyBlue, Violet, LightGreen)
    }
}