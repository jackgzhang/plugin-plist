# lang-plist
Plist Intellijidea plugin



Plist is a simple configuration language.  Following is a list of all the features:
(1)  starts with '{', end with '}'
(2)  key and value could wrappend inside quote or not.
(3)  each entry must end with ';'
(4)  2 types of comments:  // and /* .. */
(5)  array entry separated by ','

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
