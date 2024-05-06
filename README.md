# Graphics and Painting

Sometimes, we want to draw on a `Component`. You will have to do this whenever you want to display something that is not included among the standard, predefined `Component` classes. When you want to do this, you have to define your own component class and provide a method in that class for drawing the component. We will always use a subclass of `JPanel` when we need a drawing surface of this kind, as we did for the `HelloWorldDisplay` class in the example [HelloWorldGUI2Demo]((https://github.com/pt-ipv-estgl-lab/HhelloWorldGUI2Demo)). 

A `JPanel`, like any `JComponent`, draws its content in the method
    `public void paintComponent(Graphics g)`
To create a drawing surface, you should define a subclass of `JPanel` and provide a custom `paintComponent()` method.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
