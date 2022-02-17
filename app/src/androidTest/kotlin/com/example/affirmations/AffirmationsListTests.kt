package com.example.affirmations

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class AcivityScenarioRule(java: Class<MainActivity>) {

    @get:Rule
    val activity = AcivityScenarioRule(MainActivity::class.java)

    @Test
    fun scroll_to_item(){

    }
}

