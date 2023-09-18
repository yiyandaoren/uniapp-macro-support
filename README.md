# uniapp-macro-support

![Build](https://github.com/xiaomiwujiecao/uniapp-macro-support/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/com.github.xiaomiwujiecao.uniappmacrosupport.svg)](https://plugins.jetbrains.com/plugin/com.github.xiaomiwujiecao.uniappmacrosupport)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/com.github.xiaomiwujiecao.uniappmacrosupport.svg)](https://plugins.jetbrains.com/plugin/com.github.xiaomiwujiecao.uniappmacrosupport)

## Template ToDo list
- [x] Create a new [IntelliJ Platform Plugin Template][template] project.
- [x] Get familiar with the [template documentation][template].
- [x] Adjust the [pluginGroup](./gradle.properties), [plugin ID](./src/main/resources/META-INF/plugin.xml) and [sources package](./src/main/kotlin).
- [x] Adjust the plugin description in `README` (see [Tips][docs:plugin-description])
- [x] Review the [Legal Agreements](https://plugins.jetbrains.com/docs/marketplace/legal-agreements.html?from=IJPluginTemplate).
- [x] [Publish a plugin manually](https://plugins.jetbrains.com/docs/intellij/publishing-plugin.html?from=IJPluginTemplate) for the first time.
- [x] Set the `PLUGIN_ID` in the above README badges.
- [x] Set the [Plugin Signing](https://plugins.jetbrains.com/docs/intellij/plugin-signing.html?from=IJPluginTemplate) related [secrets](https://github.com/JetBrains/intellij-platform-plugin-template#environment-variables).
- [x] Set the [Deployment Token](https://plugins.jetbrains.com/docs/marketplace/plugin-upload.html?from=IJPluginTemplate).
- [x] Click the <kbd>Watch</kbd> button on the top of the [IntelliJ Platform Plugin Template][template] to be notified about releases containing new features and fixes.

<!-- Plugin description -->

Highlighting support plugin for uni app macro definitions. if your comment line contains #ifdef , #ifndef , endif keyword etc. keyword line would be highlighted.

### changelog 

-- v0.0.7

important update!!!

> if you have already installed  `Git Commit Template` plugin , you should uninstall it and follow below steps.

my plugin support git commit for CN language, yes, this feature is translate from [Git Commit Template](https://plugins.jetbrains.com/plugin/index?xmlId=commit-template-idea-plugin&utm_source=product&utm_medium=link&utm_campaign=WS&utm_content=2023.2) 

my plugin is mainly designed for CN developer. so , simple usage is very important .



## Usage

just click the red tiny icon .

![Commit-step1](static/step1.png)

select the option and input your change text ,and click confirm button.

![Commit-step2](static/step2.png)


<!-- Plugin description end -->

## Installation

- Using IDE built-in plugin system:
  
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "uniapp-macro-support"</kbd> >
  <kbd>Install Plugin</kbd>
  
- Manually:

  Download the [latest release](https://github.com/xiaomiwujiecao/uniapp-macro-support/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>


---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
[docs:plugin-description]: https://plugins.jetbrains.com/docs/intellij/plugin-user-experience.html#plugin-description-and-presentation
