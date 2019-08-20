# Decorator
It is one of the Behaviour Design Patterns.

Extension at runtime not compile time. It solves a problem with multiple inheritance and ability to concatenate a logic under another types.
Extends object behaviour by composition not extension. Thanks to that we are able to add new responsible to the object by wrapping an instance

##When should we use it
If you want to add new behaviour to the object without changing existing one.
It solves problem with huge amount of inheritance from parent class. We are able to add new requirements without break down current implementation.

##Description
As a example we use a Sensor interface as a main ability of each tool used in Home class.
