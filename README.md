# Java_II_Group_Project
Source control for our group project.

Members:Joshua Lipham, Teah Wilson, Jose Mendez 

Notes for project:

Perfect Match

        Start program by running group project and click on “start server” status will show not connected at the time. 
	The login box will populate as well and ask the client to either choose to register or log in.
        If the client has credentials they will login and can click on the “connect to server” button to start the client-server connection then the server status will change to connected.
	

	Server asks sequence of 5 multiple choice questions after greeting the client
	
		"do you prefer being outdoors or indoors?"
		A: outdoors  B: indoors
		
		"do you prefer eating at restaurants  or cooking for yourself?"
		A: restaurants  B: cooking
		
		"would you like to travel frequently?"
		A: yes  B: no
		
		"do you enjoy being physically active?"
		A: yes  B: no
		
		"would you put pineapple on your pizza?"
		A: yes  B: no

	User responds with a letter choice
		
		Responses will be added to a set/list/array/etc
		
	Server fortune will evaluate for majority A or B responses 
		
		Depending on majority, server response will randomly select features from a subset of available options 
		
	Response
	
		Hair color: black, brown, blonde, grey, red, orange, green, blue, purple
		
			A: red, orange, green, blue, purple
			B: black, brown, blonde, grey
		
		Eye color: brown, blue, green, hazel,
			
			A: brown, hazel
			B: blue, green
		
		Height: < 5ft, 5-5.5, 5.5-6, > 6ft
		
			Random for either
		
		Body type: thin, average, athletic, plus sized
		
			A: average, plus
			B: thin, athletic
		
		Salary: <50k, 50k-100k, 100-200, 200+
		
			Random for either
       
       Server output:

	     Gives you result for future lover by:

                       Hair Color:

                       Eye Color:

                       Height:

                       Body Type:

                       Salary:

                       Good Bye Greeting


       Threads: 
            
            Used in two Locations, Server, and Client-side. The server thread will run when there is a connection and will ask the client A or B questions. The Server thread will also count the number of answers that the client gives to 	    then separate them based on the user input, will send a response to the client. The client thread will run when there is a connection and will take all input from the server as well as output.



         
       Client/Server:

	    We used client and server for the main part of the program which was to find a person's love interest based on the answers to the questions that were asked.



       Database:

           The database was used for multiple functions. During the register, we get the client’s name and ask them to enter their password twice. Once this information is given it will be sent to a database for storage until the client             decides to access the program again. They will be asked to log in with their new credentials, if this process is done correctly the client will be sent to a new screen. If the username or password is not found in the 		           database an incorrect username or password message will appear. The database is also used for the storage of the server responses, there are five tables for the five responses some tables will have two columns others will 		   have one. When the client has answered all questions, the server will start to retrieve responses from the database

