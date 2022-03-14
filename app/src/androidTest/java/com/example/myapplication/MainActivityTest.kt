package com.example.myapplication

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val rule : ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @get:Rule
    val rule1 : IntentsTestRule<MainActivity2> = IntentsTestRule(MainActivity2::class.java)

    @Before
    fun setUp() {
    }

    @Test
    fun onCreate() {
        onView(withId(R.id.editText))
            .perform(typeText("Vasya"))
        onView(withId(R.id.button))
            .perform(longClick())
        onView(withId(R.id.textView))
            .check(matches(withText("Hello Vasya")))

    }
}