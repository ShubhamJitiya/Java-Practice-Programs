//10 List, Stacks, Queues and Priority Queues:

package Generics;

public class CollectionGenerics {
    public static void main(String[] args) {

    }
}
/*
Collection API Basics
-----------------------

c - collection - concept
C - Collection - Interface
s - Collection s - class

- List = In array we have fixed size
C (Interface) -> List (Interface) - ArrayList (Class)
ArrayList implements List extends Collection
    - Collection value = new Arraylist(); (1.2)
by default data type is object
    - Specific - Generics (1.5)
    - Collection <Integer> value = new Arraylist <Integer> ();
    - () Methods
    - {} BLocks
    - <> Angular braces
    - Collection <Integer> value = new Arraylist <> (); (1.7 +) = Won't work with index number
    - List <Integer> value = new Arraylist <> (); - Works with index (duplicate values, Traverse in sequence, Unique index number)
                                                - Collection doesn't have index number
    - Set <Integer> value = new HashSet <> (); - (unique values, Traverse in Random)
    - Set <Integer> value = new TreeSet <> (); - (Traverse in Order)
    - Map <Integer, String> value = new HashMap <> (); - (Key - number, string...) Synchronized - Thread safe
    - Map <Integer, String> value = new HashTable <> (); - (Key - number, string...)  non Synchronized - non Thread safe
 */

