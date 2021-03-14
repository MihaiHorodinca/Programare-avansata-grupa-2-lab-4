# Programare-avansata-grupa-2-lab-4
### Mihai Horodinca

## The Student / High School Admission Problem (SAP)
An instance of SAP involves a set of students and a set of high schools, each student seeking admission to one school, and each school having a number of available places (its capacity). Each student ranks some (acceptable) schools in strict order, and each school ranks its applicants in some order. A matching is a set of pairs (student, school) such that each student is assigned to at most one school and the capacities of the schools are not exceeded. A matching is stable if there is no pair (s, h) such that s is assigned to h' but s prefers h better than h' and h prefers s better than some of its assigned students. We consider the problem of creating a stable matching between students and schools.

Example: 4 students S0,S1,S2,S3, 3 high schools H0,H1,H2, capacity(H0)=1, capacity(H1)=2, capacity(H2)=2.

students preferences
````
S0: (H0, H1, H2)
S1: (H0, H1, H2)
S2: (H0, H1)
S3: (H0, H2)
````
schools preferences
````
H0: (S3, S0, S1, S2)
H1: (S0, S2, S1)
H2: (S0, S1, S3)
````
A solution for this example might be: [(S0:H1),(S1:H2),(S2:H1),(S3:H0)]

The main specifications of the application are:

Compulsory (1p)

Create an object-oriented model of the problem. You should have at least the following classes: Student, School and the main class.
Create all the objects in the example using streams.
Create a list of students, using LinkedList implementation. Sort the students, using a comparator.
Create a set of schools, using a TreeSet implementation. Make sure that School objects are comparable.
Create two maps (having different implementations) describing the students and the school preferences and print them on the screen.

## Usage

The Main class, upon running, will solve the Compulsory part of the laboratory.
