package com.example.abudev

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.abudev.ui.theme.ABUDevColor

@Composable
fun HomePage(){
    TopBar()
}

@Composable
fun TopBar() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(end = 0.dp, bottom = 20.dp)
            .width(360.dp)
            .height(800.dp)
            .background(
                color = ABUDevColor.secondaryAppColor,
            )
    ) {
        Row(
            modifier = Modifier
                .padding(start = 15.dp, top = 10.dp, bottom = 25.dp, end = 0.dp)
                .fillMaxWidth()
                .width(0.dp)
                .height(69.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Image(
                    painter = painterResource(id = R.drawable.ellipse2),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(end = 0.dp)
                        .size(100.dp)
                )
            }

            Spacer(modifier = Modifier.width(20.dp))

            Column {
                Text(
                    text = "Blessing",
                    style = TextStyle(
                        fontWeight = FontWeight(700),
                        fontSize = 15.sp,
                        color = Color(0xFF000000),
                        letterSpacing = 0.36.sp,
                        textAlign = TextAlign.Center
                    )
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "U19EX1015",
                    style = TextStyle(
                        fontWeight = FontWeight(500),
                        fontSize = 12.sp,
                        color = Color(0xFF000000),
                        letterSpacing = 0.36.sp,
                        textAlign = TextAlign.Center
                    )
                )
            }

            Spacer(modifier = Modifier.width(208.dp))

            IconButton(onClick = { /*TODO*/ }) {
                Image(
                    painter = painterResource(id = R.drawable.group4),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(end = 0.dp)
                        .size(100.dp)
                )
            }
        }

        Box(
          modifier = Modifier
              .fillMaxSize()
              .padding(top = 20.dp)
              .height(0.dp)
              .background(
                  color = ABUDevColor.primaryAppColor,
                  shape = RoundedCornerShape(size = 39.dp)
              )
        ){
            Row(
                modifier = Modifier
                    .padding(start = 20.dp, top = 40.dp, end = 20.dp)
            ) {
                Box(
                    modifier = Modifier
                        .width(150.dp)
                        .height(220.dp)
                        .padding(0.dp)
                        .shadow(
                            elevation = 4.dp,
                            spotColor = Color(0x40000000),
                            ambientColor = Color(0x40000000)
                        )
                        .border(
                            width = 2.dp,
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 16.dp)
                        )
                        .background(
                            color = ABUDevColor.secondaryAppColor,
                            shape = RoundedCornerShape(size = 16.dp)
                        )
                ){
//                    Icon(imageVector = Icons.Rounded.Books, contentDescription = )

                    Text(
                        text = "Attendance",
                        style = TextStyle(
                            fontWeight = FontWeight(700),
                            fontSize = 18.sp,
                            color = ABUDevColor.primaryLightAppColor,
                            lineHeight = 20.sp,
//                            fontFamily = FontFamily(Font(R.font.rhodium libre)),
                            textAlign = TextAlign.Center,
                            letterSpacing = 0.40.sp
                        )
                    )
                }

                Spacer(modifier = Modifier.width(40.dp))

                Box(
                    modifier = Modifier
                        .width(150.dp)
                        .height(220.dp)
                        .padding(0.dp)
                        .shadow(
                            elevation = 4.dp,
                            spotColor = Color(0x40000000),
                            ambientColor = Color(0x40000000)
                        )
                        .border(
                            width = 2.dp,
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 16.dp)
                        )
                        .background(
                            color = ABUDevColor.secondaryAppColor,
                            shape = RoundedCornerShape(size = 16.dp)
                        )
                ){


                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePagePreview() {
    HomePage()
}