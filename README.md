# Android Canvas Drawing

An Android application demonstrating the basics of drawing shapes and paths on a custom Canvas view using Kotlin.

## Overview

This educational project shows how to create custom graphics in Android using the Canvas API. The app renders a red triangular shape using the Path class, demonstrating fundamental drawing operations.

## Technologies

- **Language**: Kotlin
- **Framework**: Android SDK, AndroidX
- **Key Classes**: Canvas, Paint, Path, View
- **Build System**: Gradle
- **Minimum SDK**: 27 (Android 8.1)
- **Target SDK**: 31 (Android 12)

## Features

- Custom View extending Android's View class
- Path-based shape drawing
- Paint configuration for fill color
- ConstraintLayout with FrameLayout container
- Responsive UI design

## Implementation

### Custom Drawing View
```kotlin
class DrawView(context: Context) : View(context) {
    private val paint = Paint().apply {
        color = Color.RED
        style = Paint.Style.FILL
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val path = Path().apply {
            moveTo(20f, 20f)
            lineTo(200f, 200f)
            lineTo(200f, 300f)
            close()
        }
        canvas.drawPath(path, paint)
    }
}
```

### Adding View Programmatically
```kotlin
val frameLayout = findViewById<FrameLayout>(R.id.frame)
frameLayout.addView(DrawView(this))
```

## Project Structure

```
Simple_canvas_Android/
├── app/src/main/
│   ├── java/.../MainActivity.kt    # Activity with DrawView class
│   └── res/layout/activity_main.xml
├── build.gradle
└── README.md
```

## Requirements

- Android Studio
- Android 8.1+ device or emulator

## License

MIT License

![Canvas Drawing](https://github.com/The-Odd-Institute/Simple_canvas_Android/blob/main/Simple%20Drawing.png)
