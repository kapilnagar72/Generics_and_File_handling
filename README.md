# Generics_and_File_handling

         ** Generics_and_File_handling **

1. What are Generics in Java?
 Ans : The Java Generics programming is introduced in J2SE 5 to deal with type-safe objects. It makes the code stable by detecting the bugs at compile time.
     Before generics, we can store any type of objects in the collection, i.e., non-generic. Now generics force the java programmer to store a specific type of objects.

2.What are the benefits of using Generics in Java?
 Ans : Generics in Java provide a powerful tool for creating type-safe, reusable, and flexible code. By enabling compile-time checking, improving performance, and providing greater 
   flexibility, generics can help you create more efficient, reliable, and maintainable code.

3. What is a Generic Class in Java?
 Ans : Java Generics was introduced to deal with type-safe objects. It makes the code stable.Java Generics methods and classes, enables programmer with a single method declaration, a set 
   of related methods, a set of related types. Generics also provide compile-time type safety which allows programmers to catch invalid types at compile time. Generic means parameterized 
   types. Using generics, the idea is to allow any data type to be it Integer, String, or any user-defined Datatype and it is possible to create classes that work with different data types.

4. What is a Type Parameter in Java Generics?
 Ans : The type parameter section, delimited by angle brackets (<>), follows the class name. It specifies the type parameters (also called type variables) T1, T2, ..., and Tn. To update 
     the Box class to use generics, you create a generic type declaration by changing the code "public class Box" to "public class Box<T>".

5.What is a Generic Method in Java?  
 Ans : Generic methods are methods that introduce their own type parameters. This is similar to declaring a generic type, but the type parameter's scope is limited to the method where it is declared. Static and non-static generic methods are allowed, as well as generic class constructors.

6. What is the difference between ArrayList and ArrayList<T>?
 Ans : That's all on the difference between ArrayList and ArrayList in Java. Remember raw type is not type safe but ArrayList with the unbounded wildcard is type safe because you can add any type (String, Integer, Object into ArrayList of raw type, but you cannot add any element on ArrayList of unknown type.


                ** IO Operation **

  1. What is Input and Output Stream in Java?
   Ans : A program uses an input stream to read data from a source, one item at a time: Reading information into a program. A program uses an output stream to write data to a destination, one item at time: Writing information from a program.

2. What are the methods of OutputStream ?
 Ans : write,
       close,
       flush,
       FileOutputStream,
      ByteArrayOutputStream,
      OutputStream,
      Printstream,
      getFD,
      Finalize

3. What is serialization in Java?
 Ans : Serialization in Java is the concept of representing an object's state as a byte stream. The byte stream has all the information about the object. Usually used in Hibernate, JMS, JPA, and EJB, serialization in Java helps transport the code from one JVM to another and then de-serialize it there.

4. What is the Serializable interface in Java?
 Ans : The Serializable interface in Java is used whenever you need to serialize an object, which means converting its state to a byte stream, so that it can be saved to a database, sent over a network, or stored in a file, etc. Conversely, this byte stream can be used to recreate the actual Java object in memory when needed.

5. What is deserialization in Java?
 Ans : Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. This mechanism is used to persist the object.

6. How is serialization achieved in Java?
 Ans : To make a Java object serializable we implement the java.io.Serializable interface. The ObjectOutputStream class contains writeObject() method for serializing an Object. The ObjectInputStream class contains readObject() method for deserializing an object.

7. How is deserialization achieved in Java?
 Ans : So to define deserialization, it is the process of converting a stream of bytes to the original state of the object. To perform deserialization, Java provides the ObjectInputStream class, which is again opposite to the ObjectOutputStream we studied for serialization.

8. How can you avoid certain member variables of class from getting Serialized?
 Ans : Transient variables are not saved during the Serialization process. As the name implies, they do not constitute part of the object's state. We can use this variable to prevent certain fields from being serialized. For instance, a field that is not serializable should be marked transient or static.

9. What classes are available in the Java IO File Classes API?
 Ans : File,
   RandomAccessFile,
   FileInputStream,
   FileReader,
   FileMutputStream,
   FileWriter

10. What is Difference between Externalizable and Serialization interface ?
 Ans : Externalizable interface contains two methods: writeExternal() and readExternal(). Process: Default Serialization process will take place for classes implementing Serializable interface. Programmer defined Serialization process for classes implementing Externalizable interface.

The Serializable interface in Java is used whenever you need to serialize an object, which means converting its state to a byte stream, so that it can be saved to a database, sent over a network, or stored in a file, etc. Conversely, this byte stream can be used to recreate the actual Java object in memory when needed.1
 
   
