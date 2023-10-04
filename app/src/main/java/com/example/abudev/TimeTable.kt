package com.example.abudev

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.abudev.ui.theme.ABUDevColor

@Composable
fun TimeTable(){
    val days = listOf(
        "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"
    )
    val courses = listOf(
        "Gens 202", "Course 2", "Course 3", "Course 4"
    )
    val location = listOf(
        "FSLT", "LH1 & LH2", "LH1 & LH2", "LH1 & LH2"
    )

     Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(end = 0.dp, bottom = 20.dp)
            .width(360.dp)
            .height(800.dp)
            .background(
                color = ABUDevColor.secondaryAppColor,
                shape = RoundedCornerShape(size = 16.dp)
            )
    ) {
         TopAppBar()

         LazyRow(
             horizontalArrangement = Arrangement.SpaceBetween,
             modifier = Modifier
                 .fillMaxWidth()
                 .padding(start = 15.dp, bottom = 25.dp, end = 15.dp),
             verticalAlignment = Alignment.CenterVertically
         ) {
             items(days) { day ->
                 Days(day)
             }
         }

         Box(
             modifier = Modifier
                 .fillMaxSize()
                 .padding(0.dp)
                 .height(0.dp)
                 .background(
                     color = ABUDevColor.primaryAppColor,
                     shape = RoundedCornerShape(size = 39.dp)
                 )
         ){
             LazyColumn(
                 horizontalAlignment = Alignment.CenterHorizontally,
                 modifier = Modifier
                     .height(580.dp)
                     .padding(15.dp),
                 verticalArrangement = Arrangement.SpaceBetween
             ) {
                 items(courses) { course ->
                     Column(){
                         Icon(
                             painter = painterResource(id = R.drawable.ellipse_4),
                             contentDescription = null,
                             modifier = Modifier
                                 .padding(start = 5.5.dp)
                                 .size(25.dp)
                                 .clip(CircleShape)
                         )

                         Row(
                             horizontalArrangement = Arrangement.SpaceBetween,
                             modifier = Modifier
                                     .padding(start = 15.dp, bottom = 0.dp, end = 0.dp),

                         ){
                             Box(
                                 modifier = Modifier
                                     .width(4.dp) // Adjust the width as needed
                                     .height(100.dp)
                                     .padding(top = 8.dp)
                                     .background(ABUDevColor.secondaryAppColor) // Change color as needed
                             )

                             Card(
                                 modifier = Modifier
                                     .padding(start = 20.dp, top = 8.dp, bottom = 8.dp, end = 0.dp)
                                     .fillMaxWidth()
                                     .shadow(8.dp, shape = RoundedCornerShape(8.dp))
                                     .background(
                                         color = ABUDevColor.secondaryAppColor
                                     ),
                             ) {
                                 Column(
                                     modifier = Modifier.padding(16.dp),
                                     verticalArrangement = Arrangement.Center,
                                     horizontalAlignment = Alignment.CenterHorizontally
                                 ) {
                                     Text(
                                         text = course,
                                         style = TextStyle(
                                             fontWeight = FontWeight(900),
                                             fontSize = 25.sp,
                                             color = ABUDevColor.primaryAppColor
                                         ),
                                         modifier = Modifier.padding(0.dp)
                                     )
                                     Row(
                                         horizontalArrangement = Arrangement.SpaceBetween,
                                         modifier = Modifier
                                             .padding(0.dp)
                                     ){
                                         Icon(
                                             painter = painterResource(id = R.drawable.ellipse_4),
                                             contentDescription = null,
                                             modifier = Modifier
                                                 .padding(start = 0.dp, top = 6.dp, end = 15.dp)
                                                 .size(15.dp)
                                                 .background(color = ABUDevColor.primaryAppColor)
                                         )
                                         LazyColumn(
                                             horizontalAlignment = Alignment.CenterHorizontally,
                                             modifier = Modifier
                                                 .height(0.dp)
                                                 .padding(0.dp),
                                             verticalArrangement = Arrangement.SpaceBetween
                                         ){
                                             items(location){ locations ->
                                                 Column() {
                                                     Text(
                                                         text = locations,
                                                         style = TextStyle(
                                                             fontWeight = FontWeight(700),
                                                             fontSize = 21.sp,
                                                             color = ABUDevColor.primaryAppColor
                                                         ),
                                                         modifier = Modifier.padding(0.dp)
                                                     )
                                                 }
                                             }
                                         }
                                     }
                                 }
                             }
                         }
                     }
                 }
             }
         }
     }
}

//@Composable
//fun Locate(text: String) {
//    Text(
//        text = text,
//        style = TextStyle(
//            fontWeight = FontWeight(700),
//            fontSize = 21.sp,
//            color = ABUDevColor.primaryAppColor
//        ),
//        modifier = Modifier.padding(0.dp)
//    )
//}
//@Composable
//fun Courses(course: List<Unit>){
//    Row(
//        horizontalArrangement = Arrangement.SpaceBetween,
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(start = 15.dp, top = 30.dp, end = 15.dp),
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        course
//    }
//}

@Composable
fun TopAppBar() {
    Row(horizontalArrangement = Arrangement.SpaceBetween,
           modifier = Modifier
               .padding(start = 15.dp, bottom = 25.dp, end = 0.dp)
               .fillMaxWidth()
               .width(0.dp)
               .height(69.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        IconButton(onClick = { /*TODO*/ }) {
            Image(
                painter = painterResource(id = R.drawable.ellipse2),
                contentDescription = "",
                modifier = Modifier
                    .size(300.dp)
                    .clip(CircleShape)
//                    .border(
//                        width = (5.dp),
//                        shape = CircleShape,
//                        color = ABUDevColor.secondaryAppColor
//                    )
            )
        }

        TimeTableText(name = "Time Table")

        IconButton(onClick = { /*TODO*/ }) {
            Image(
                modifier = Modifier
                    .padding(end = 0.dp)
                    .size(100.dp),
//                    .clip(CircleShape)
//                    .border(
//                        width = 10.dp,
//                        color = Color.Cyan,
//                        shape = CircleShape
//                    ),
                painter = painterResource(id = R.drawable.group4),
                contentDescription = ""
            )
        }
    }
}

@Composable
fun Days(text: String) {
    var isSelected by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .padding(end = 15.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(if (isSelected) Color.Green else Color.LightGray)
            .clickable {
                isSelected = !isSelected
            },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            modifier = Modifier
                .padding(5.dp)
                .padding(end = 0.dp),
            color = if (isSelected) Color.White else Color.Black,
            style = TextStyle(
                fontSize = 15.sp,
                fontWeight = FontWeight(700)
            )
        )
    }
}

@Composable
fun TimeTableText(
    name: String,
    modifier: Modifier = Modifier
        .width(182.dp)
        .height(31.dp)
) {
    Text(text = name,
        style = TextStyle(
            fontSize = 36.sp,
            lineHeight = 20.sp,
//            fontFamily = FontFamily(Font(R.font.roboto)),
            fontWeight = FontWeight(700),
            color = Color(0xFF000000),
            letterSpacing = 0.36.sp,
            textAlign = TextAlign.Center
        )
    )
}

@Preview(showBackground = true)
@Composable
fun TimeTablePreview(){
    TimeTable()
}
