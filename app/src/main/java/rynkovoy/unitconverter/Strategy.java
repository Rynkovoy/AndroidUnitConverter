/*
  	Copyright (c) 2012 Somenath Mukhopadhyay.
 	All rights reserved.
 */

package rynkovoy.unitconverter;

public interface Strategy {

	public double Convert(String from, String to, double input);
}
