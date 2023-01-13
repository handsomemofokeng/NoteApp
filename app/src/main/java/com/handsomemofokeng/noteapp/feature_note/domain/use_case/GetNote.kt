package com.handsomemofokeng.noteapp.feature_note.domain.use_case

import com.handsomemofokeng.noteapp.feature_note.data.repository.NoteRepository
import com.handsomemofokeng.noteapp.feature_note.domain.model.Note

class GetNote(private val repository: NoteRepository) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}