package fi.ni.ifc2x3;

/*
 * IFC Java class
The MIT License (MIT)

Copyright (c) 2014 Jyrki Oraskari

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

public class IfcRectangleHollowProfileDef extends IfcRectangleProfileDef 
{
 // The property attributes
 Double wallThickness;
 Double innerFilletRadius;
 Double outerFilletRadius;


 // Getters and setters of properties

 public Double getWallThickness() {
   return wallThickness;
 }
 public void setWallThickness(String txt){
   Double value = i.toDouble(txt);
   this.wallThickness=value;

 }

 public Double getInnerFilletRadius() {
   return innerFilletRadius;
 }
 public void setInnerFilletRadius(String txt){
   Double value = i.toDouble(txt);
   this.innerFilletRadius=value;

 }

 public Double getOuterFilletRadius() {
   return outerFilletRadius;
 }
 public void setOuterFilletRadius(String txt){
   Double value = i.toDouble(txt);
   this.outerFilletRadius=value;

 }

}
