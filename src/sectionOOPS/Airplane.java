/**
 * Poly = "many" & morph == "forms". PolyMorphism is implemented in two forms - method
 * overloading (constructor overloading & copy constructors) and method overriding
 * (inheritance & interfaces).
 * 
 * We've seen bits of polymorphism already, but this section is going to be limited to 
 * (non abstract) classes as parents, just to illustrate a practical aspects of storing 
 * objects in arrays.
 * 
 * Parent Class = Vehicle, subclasses => [Bus, Ship, Airplane]
 */
package sectionOOPS;

public class Airplane extends Vehicles {
	@Override
	public void go() {
		System.out.println("Airplanes transport people and freights to and fro over the skies");
	}
}
