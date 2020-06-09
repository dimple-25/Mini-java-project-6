Problem Statement:

For this assignment, you are to pretend that you are creating a drawing program. Such a program, in reality, must be quite complicated. However in this assignment we will implement or rather mimic one important part of it. What is required in such a program is to maintain information about all objects that are currently drawn on the screen. So we design a container for this purpose.
Drawing objects can be any of the following:
1*	Point
2*	Line
3*	Rectangle
4*	Square
5*	Circle

Also, Rectangle, Square, and Circle must have filled versions that are filled with a certain color.
This is a description of all the objects in the program:
6*	All objects will have a certain color.
7*	The filled objects will have a color and a fill color, which is not necessarily the same.
8*	A Point will simply be an x and y coordinate that represents the location of the point.
9*	A Line will be represented by two sets of x and y coordinates, which are the endpoints.
10*	A Rectangle has a top left, and a bottom right coordinate.
11*	A Square is a rectangle that must have all the sides the same size.
12*	A Circle has a center coordinate, and a radius.

The list of Objects will be a heterogeneous container, which means that it is a list that can store more than one type. The only restriction is that the types must all be related. What we can do here is that an abstract class Object can be used and all the objects in the drawing program will be subtypes of Object class.
There are two "good" options as to how to get the information from the user. Obviously, if this was a real drawing program, the user input would be retrieved via the mouse, and clicking around on the screen. Since we don't want to do that, we are going to get the information about the objects from the keyboard. You can do this either by putting the requests to the user in the constructors for the different objects, or by creating a function like get_info_from_user() that asks for the appropriate data. This would need to be a pure virtual function in the Object class and that would be redefined for the different subclasses. The advantage of using a constructor is that it is called automatically. Thus, when you create a triangle, for example, the constructor for any parent classes of triangle will get called, and then the constructor for triangle will get called. This will automatically retrieve all the info that is necessary for the triangle object.
You will need to provide two functions for the list of objects. You need to be able to add an object and draw all the objects. Drawing the objects just means saying something like
 
 Drawing Rectangle: Color 5  Top Left (3,5) Bottom Right (6,7)
 Drawing Point: Color 9  (6,7)


