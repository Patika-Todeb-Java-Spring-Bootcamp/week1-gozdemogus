# week1-gozdemogus

Homework includes 3 assignments which you can find in following folders:

<ul>
  <li>PatikaProjectImmutable</li>
  <li>PatikaProject1</li>
  <li>PatikeProject1Thread</li>
</ul>

**Assignment 1 - PatikaProjectImmutable**

Under the file path <em> /PatikaProjectImmutable/src/main/java/immutablePack </em> ,

For car models, the "Model" class has been created as an enum.
<img width="273" alt="image" src="https://user-images.githubusercontent.com/107196935/175486502-c43a7d1a-a391-4d0a-b019-8f3a8eb0b059.png">

You can see the "Car" class as created in accordance with the immutable rules. Which are:
<ul>
<li>The class must be declared as final so that child classes can’t be created.</li>
<li>Data members in the class must be declared private so that direct access is not allowed.</li>
<li>Data members in the class must be declared as final so that we can’t change the value of it after object creation.</li>
<li>A parameterized constructor should initialize all the fields performing a deep copy so that data members can’t be modified with an object reference.</li>
<li>Deep Copy of objects should be performed in the getter methods to return a copy rather than returning the actual object reference)</li>
</ul>

**Assignment 2 - PatikaProject1**

It is basically program that lets user to put input about game scores and read them accordingly. **Maven** design structure must be used.

Under the file <em> PatikaProject1/ </em> you will see two different modules called "consumerSide" and "producerSide". File operations are divided and as you can guess by their names **consumerSide** is responsible of reading the file and **producerSide** is responsible of writing into the file.

For Maven structure, here is the pom.xml file of PatikaProject1.
<img width="557" alt="image" src="https://user-images.githubusercontent.com/107196935/175482393-887f5ff3-d88f-43e5-a44a-37039b1088cb.png">


Validations for entering team names and score are available. Here you see that without entering the name of Team1, user can't go any further.

<img width="360" alt="image" src="https://user-images.githubusercontent.com/107196935/175479915-42900002-23b9-4408-baff-48031432ff5d.png">

Same rule applies to Team2.

<img width="371" alt="image" src="https://user-images.githubusercontent.com/107196935/175478487-1c6c13f5-e8ee-4c05-a53e-13cf831b9baf.png">

Same rule applies to Scores.

<img width="433" alt="image" src="https://user-images.githubusercontent.com/107196935/175481176-c01dd30f-b571-4fa7-b063-1a52c04f8b52.png">

When you successfully enter all the inputs, here is the result. You can continue typing scores.

<img width="492" alt="image" src="https://user-images.githubusercontent.com/107196935/175481512-cb919ba8-5f22-4465-8d37-261eebeaca5b.png">



**Assignment 3 - PatikaProject1Thread**

This project is similar to the second one, but we use Threads in here. 

Under the file <em>PatikeProject1Thread/ </em> **consumerThread** and **producerThread** modules are created.

Runnable interface implemented and run() method is overrided for each threads. Methods are filled with the Assignment 2's consumer & producer methods.

<img width="781" alt="image" src="https://user-images.githubusercontent.com/107196935/175485241-a9581c83-0b83-4872-8a8e-0ab7f80fc385.png">

ArrayBlockingQueue is used in order to run two threads continously.
<img width="749" alt="image" src="https://user-images.githubusercontent.com/107196935/175484857-e7e3ae99-f782-45fe-93cf-e304d96bd5ae.png">

Adjustments done for synchronization.

<img width="305" alt="image" src="https://user-images.githubusercontent.com/107196935/175486101-21845cc5-858f-4a70-846f-5bd274780947.png">

You can see the similar result here:

<img width="357" alt="image" src="https://user-images.githubusercontent.com/107196935/175485836-6e7a0650-5673-4aba-b609-430550c721fd.png">


