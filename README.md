# AdvancedProgrammingQuiz

A single-class JavaFX demonstration that draws a traffic light and lets you switch the active light with buttons.

## Features

- Draws red, yellow, and green circles inside a black rectangle.
- Buttons switch the active light and update a status label ("Stop", "Wait", "GO").
- Non-resizable window sized for the drawing.

## Requirements

- Java 24
- Maven (wrapper included: `./mvnw`)
- JavaFX 21 (pulled in as a Maven dependency)

## Build & Run

```bash
./mvnw clean package
```

Run the application from an IDE using one of the entry points:

- `Launcher` (calls `TrafficLight`)
- `TrafficLight`

## Project structure

- `src/main/java/TrafficLight.java` — the JavaFX application.
- `src/main/java/Launcher.java` — simple launcher wrapper.

## Notes

Coursework-style JavaFX exercise (traffic light widget).
