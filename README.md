## JSON Plist Language

In the OS X, iOS, NeXTSTEP, and GNUstep programming frameworks, property list files are files that store serialized objects. Property list files use the filename extension .plist, and thus are often referred to as p-list files.
Property list files are often used to store a user's settings. They are also used to store information about bundles and applications, a task served by the resource fork in the old Mac OS.

In summary, JSON Plist is a lightweight configuration language.  Following is a list of all the features:

  - Must starts with '{', end with '}'
  - Key and value could wrapped inside quote or not.
  - Key should not contains whitespace.
  - If value contains whitespace, then it has to be wrapped inside double quote.
  - Each entry (Either an object or key-value pair) must end with ';'
  - Array items separated by comma ','.
  - There are 2 types of comments: // and /* .... */

## Sample Plist File
```java
{
    // A simple key,value pair

    "key" = "value";
    key1 = "value2";
    key3 = "a new value";

    // A object

    "car" = {
        "make" = "toyota";
        "initLevel" = "2";
    };

    // An array
    "fruits" = (
        "apple",
        "orange",
        "peach",
    );

    // An array of object
    "cars" = (
        { "make" = "honda"; "year" = 1990; },
        { "make" = "honda"; "year" = 1990; },
    );

    /*  block comment */

}
```

## References

* [https://en.wikipedia.org/wiki/Property_list] [Property list]
* [https://developer.apple.com/library/mac/documentation/Cocoa/Conceptual/PropertyLists/OldStylePlists/OldStylePLists.html] [Old-Style ASCII Property Lists]

