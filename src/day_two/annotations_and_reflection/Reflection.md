Reflection
-
Reflection is a computer science term that denotes the process by which a computer program can be
modified at runtime in a manner dependent on its own code and behavior at runtime.

Reflection allows you to easily manage code as if it were data. It is most often used to change the standard behavior
of already defined methods or functions, and to create your own semantic constructs that modify the language.
On the other hand, code that uses reflection is less readable and does not allow for syntactic and semantic 
validation during compilation, so error tracking can be cumbersome. This mechanism is more common in high-level
languages, usually based on a virtual machine.

In Java, the reflection mechanism is implemented with the help of objects available in the java.lang.reflect package.

Reflection API allows you to share and manipulate:
- classes
- constructors
- methods
- class fields.