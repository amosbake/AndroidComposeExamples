package io.yanhao.compose.text

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomTextScreen() {
    val scrollState = rememberScrollState()
    Column(modifier = Modifier.verticalScroll(scrollState),
        ) {
        DefaultStyleText()
        TextWithColor()
        TextWithFontSize()
        BoldText()
        ItalicText()
        TextWithFontFamily()
        TextWithUnderline()
        TextWithLineThrough()
        TextWithSingleLine()
        TextWithShadow()
        TextWithCenterAlign()
        TextWithBackground()
        TextWithClickable()
        MultiStyleText()
    }
}

/**
 * 默认样式的文本展示
 */
@Preview
@Composable
private fun DefaultStyleText() {
    CustomStyledText("这是默认样式的文本")
}

@Preview
@Composable
private fun TextWithColor() {
    CustomStyledText(
        displayText = "这是蓝色的文本", style = TextStyle(
            color = Color.Blue
        )
    )
}

@Preview
@Composable
private fun TextWithFontSize() {
    CustomStyledText(
        displayText = "这是30sp大小的文本", style = TextStyle(
            fontSize = 30.sp
        )
    )
}

@Preview
@Composable
private fun BoldText() {
    CustomStyledText(
        "这是粗体文本", style = TextStyle(
            fontWeight = FontWeight.Bold
        )
    )
}

@Preview
@Composable
private fun ItalicText() {
    CustomStyledText(
        displayText = "这是斜体文本", TextStyle(
            fontStyle = FontStyle.Italic
        )
    )
}

@Preview
@Composable
private fun TextWithFontFamily() {
    CustomStyledText(
        displayText = "这是自定义字体的文本", TextStyle(
            fontFamily = FontFamily.Monospace
        )
    )
}

@Preview
@Composable
private fun TextWithUnderline() {
    CustomStyledText(
        displayText = "带有下划线的文本", style = TextStyle(
            textDecoration = TextDecoration.Underline
        )
    )
}

@Preview
@Composable
private fun TextWithLineThrough() {
    CustomStyledText(
        displayText = "带有划线的文本", style = TextStyle(
            textDecoration = TextDecoration.LineThrough
        )
    )
}

@Preview
@Composable
private fun TextWithSingleLine() {
    CustomStyledText(
        displayText = "单行文本展示,如果超出范围,会在文本的末尾显示省略号,如下展示:abcdefghijklmnopqrstuvwxyz",
        maxLine = 1
    )
}

@Preview
@Composable
private fun TextWithShadow() {
    CustomStyledText(
        displayText = "带阴影的文本", style = TextStyle(
            shadow = Shadow(
                color = Color.Black, blurRadius = 10f, offset = Offset(2f, 2f)
            )
        )
    )
}

@Preview
@Composable
private fun TextWithCenterAlign() {
    Row(modifier = Modifier.fillMaxWidth()) {
        CustomStyledText(
            displayText = "居中的文本", style = TextStyle(
               textAlign = TextAlign.Center
            )
        )
    }
}

@Preview
@Composable
private fun JustifyTextAlign() {
    CustomStyledText(
        "此文本展示了分散对齐" +
                "每一行都会 " +
                "分散对齐,以适应几行中最长的一段",
        style = TextStyle(
            textAlign = TextAlign.Justify
        )
    )
}

@Preview
@Composable
private fun TextWithBackground() {
    Surface(color = Color.Yellow) {
        Text(
            text = "带有背景颜色的文本",
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview
@Composable
private fun TextWithClickable() {
   val count = remember {
       mutableStateOf(0)
   }
    Text(
        text = "可点击的文本",
        modifier = Modifier
            .background(Color.Gray)
            .clickable {
                count.value++
            }
    )
}

@Preview
@Composable
private fun MultiStyleText() {
    Text(
        buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    color = Color.Blue,
                    fontWeight = FontWeight.Bold
                )
            ) {
                append("Jetpack ")
            }
            append("Compose ")
            withStyle(
                style = SpanStyle(
                    color = Color.Red,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp
                )
            ) {
                append("of ")
            }
            append("多文本样式")
        }
    )
}

/**
 * 自定义样式文本,可用来预定义应用的标准样式
 *
 * @param displayText 欲显示的文本
 * @param style 文本样式
 * @param maxLine 文字显示最大行数
 */
@Composable
fun CustomStyledText(
    displayText: String, style: TextStyle = TextStyle.Default, maxLine: Int = Int.MAX_VALUE
) {
    Text(
        text = displayText, style = style, maxLines = maxLine, overflow = TextOverflow.Ellipsis
    )
}

@Preview(showBackground = true)
@Composable
fun CustomStyledTextPreview() {
    CustomStyledText(
        "预览自定义样式文本", style = TextStyle(
            color = Color.Cyan,
            fontSize = 20.sp,
            textAlign = TextAlign.Start,
            fontStyle = FontStyle.Italic
        )
    )
}