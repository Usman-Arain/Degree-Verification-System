# Degree Verification System

Overview:
The Degree Verification System is a Python program that simulates the processing of degree verification applications with required documents. The core feature of this system is its use of a double-ended queue (deque) to efficiently manage the applications, allowing for insertion at one end and removal from both ends of the deque.

Key Features:
1. Application Queue: Applications are added to a queue, representing new degree verification applications with required documents.

2. Deque for Processing: An empty deque is used to process the applications. Deque allows for efficient insertion at the rear and removal from both the front and rear, making it ideal for this application.

3. Document Verification: The system checks if all the required documents are available for each application in the deque.

4. Degree Verification: Applications with all required documents undergo a degree verification process. If the degree is verified, a degree certificate is generated.

5. Record Queue: Verified applications and their degree certificates are placed in a separate queue (RecordQueue) for record-keeping.

Algorithm Steps
1. Initialize a queue (Queue) for new degree verification applications.
2. Initialize an empty deque (Deque) for processing applications.
3. While there are applications in Queue:
- a. Move the current application from Queue to the rear of Deque.
- b. Verify if all required documents are available in Deque.
- c. If documents are missing, remove the application from Deque.
4. Repeat until Deque is empty:
- a. Perform degree verification on the current application in Deque.
- b. If verified, generate a degree certificate and move it to RecordQueue.
RecordQueue contains all verified degree applications along with their degree certificates.

Usage:
- Modify the code to handle your specific document and degree verification logic.
- Execute the Python script.
- The RecordQueue will contain all verified degree applications and certificates.

Benefits:
- Efficient processing with a double-ended queue (deque).
- Maintain records of verified degree applications and certificates.
- Customizable for different document and degree verification requirements.
