package com.raywenderlich.android.lab1.screens

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.raywenderlich.android.lab1.R
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen

private val items = listOf(
    BookCategory(
        R.string.android,
        listOf(
            R.drawable.android_aprentice,
            R.drawable.saving_data_android,
            R.drawable.advanced_architecture_android,
        )
    ),
    BookCategory(
        R.string.kotlin,
        listOf(
            R.drawable.kotlin_coroutines,
            R.drawable.kotlin_aprentice,
        )
    ),
    BookCategory(
        R.string.swift,
        listOf(
            R.drawable.combine,
            R.drawable.rx_swift,
            R.drawable.swift_apprentice,
        )
    ),
    BookCategory(
        R.string.ios,
        listOf(
            R.drawable.core_data,
            R.drawable.ios_apprentice,
        )
    )
)

@Composable
fun ListScreen() {
    MyList()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyList() {}

@Composable
fun ListItem(bookCategory: BookCategory, modifier: Modifier = Modifier) {}

@Composable
fun BookImage(imageResource: Int){
    Image(
        modifier = Modifier.size(170.dp, 200.dp),
        painter = painterResource(id = imageResource),
        contentScale = ContentScale.Fit,
        contentDescription = stringResource(id = R.string.covers)

    )
}

data class BookCategory(
    @StringRes
    val categoryResourceId: Int,
    val bookImageResources: List<Int>
)
