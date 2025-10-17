# BasicPlugin

A comprehensive Minecraft Spigot plugin built with Gradle, featuring essential server commands and utilities for enhanced gameplay.

## 🚀 Features

- **Essential Commands**: Collection of useful server commands for players and administrators
- **Player Utilities**: Health, hunger, and teleportation management
- **Server Broadcasting**: Send messages to all online players
- **Random Teleportation**: Multiple distance options for player teleportation
- **Spigot 1.19.4 Compatibility**: Built for modern Minecraft servers

## 🎮 Commands

- **/killself**: Instantly kills the player who executes the command
- **/heal**: Fully restores the player's health to maximum
- **/feed**: Replenishes the player's hunger bar completely
- **/broadcast (message)**: Sends a custom message to every player on the server
- **/rtp (near/mid/far)**: Randomly teleport the player to desired destination

## 🛠️ Technologies

- **Framework**: Spigot API 1.19.4
- **Language**: Java 17
- **Build Tool**: Gradle
- **Dependencies**: Lombok, Spigot API
- **IDE**: IntelliJ IDEA / Eclipse

## 📋 Requirements

- Java 17 or later
- Minecraft Server with Spigot 1.19.4
- Gradle 7.0 or later (for development)

## 🚀 Getting Started

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/AdamTroyan/BasicPlugin.git
   ```

2. Navigate to the project directory:
   ```bash
   cd BasicPlugin
   ```

3. Build the plugin:
   ```bash
   ./gradlew build
   ```

4. Find the compiled JAR in `build/libs/`

### Deployment

1. Copy the generated JAR file to your server's `plugins` folder
2. Restart your Minecraft server
3. Check the console for successful plugin loading
4. Commands are now available to players with appropriate permissions

### Development

1. Open the project in your preferred IDE
2. Modify the plugin code in `src/main/java/`
3. Add resources in `src/main/resources/`
4. Build and test on your development server

## 📁 Project Structure

```
BasicPlugin/
├── build.gradle                # Build configuration and dependencies
├── gradle.properties           # Gradle project properties
├── settings.gradle             # Gradle settings
├── gradlew                     # Gradle wrapper (Unix)
├── gradlew.bat                 # Gradle wrapper (Windows)
├── gradle/wrapper/             # Gradle wrapper files
├── src/
│   ├── main/
│   │   ├── java/              # Java source files
│   │   └── resources/         # Plugin resources (plugin.yml, etc.)
│   └── test/                  # Unit tests
└── build/                     # Compiled output
```

## ⚙️ Configuration

Edit `build.gradle` to:
- Update plugin version
- Add new dependencies
- Modify Java version
- Configure build tasks

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Adam Troyan** - [GitHub Profile](https://github.com/AdamTroyan)

---

*Built with ❤️ for the Minecraft community*

This code serves as a solid foundation for building more complex plugins. You can easily expand it by adding permissions, new features, and customizations to suit your server's needs.

Dive into Minecraft plugin development and enjoy creating! 🥰
