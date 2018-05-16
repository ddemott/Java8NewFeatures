/**
 * This package represents examples of how to use method references. Method
 * references are in short a shortcut way of returning an instance of a
 * functional method. You can assign the method reference to an instance of the
 * functional method or you can use it when a method requires some type of
 * consumer of the output. An example of this is when you use the .foreach
 * method that is new in Java 8. When you loop through each of the objects, each
 * object has a type. The consumer of each instance being looped through is
 * expected to be able to handle the output coming from the .foreach loop.
 * 
 * E.g.
 * 
 * myList.foreach(System.out::println);
 * 
 * Notice there is no parameter being directly shown however it is assumed that 
 * each item that the loop is going through is being passed into the println method.
 * If you were to try to use System.out::println on its own, it would expect you to be
 * assigning the instance being returned from the method reference.
 * 
 * 
 * 
 * 
 */

package com.demott.methodreference;