# The Odd Bookstore
This project is an Android skeleton to build a simple bookstore with some weird functionality.
Your task is to complete the application with the requirements specified below.

## Task 0 - Git Flow Practice
This application should be completed in the following manner:
- Start a Git feature branch for each module below with the provided branch name:
  
  - [Splash](docs/files/splash.md), [Login](docs/files/login.md), [Register](docs/files/register.md)
    - branch name: ``feature/entry``
  - [Main](docs/files/main.md)
    - branch name: ``feature/main``
  - [Authors](docs/files/authors.md)
    - branch name: ``feature/authors``
  - [Books](docs/files/books.md)
    - branch name: ``feature/books``
  - [General](docs/files/general.md)
    - branch name: ``feature/general``
  - Task 3
    - branch name: ``feature/task3``

- Finish one module (``feature`` branch) first before starting the next module, the ``feature`` branch should be merged back to the ``develop`` branch
- Once all tasks are completed, do a ``git release`` process. The ``master`` branch should have the latest codebase along with a ``tag`` labeled as ``v1.0``

## Task 1 - UI imlementation
- Create Activity classes accordingly based on the screen designs provided below:
    - [Splash](docs/files/splash.md)
    - [Login](docs/files/login.md)
    - [Register](docs/files/register.md)
    - [Main](docs/files/main.md)
    - [Authors](docs/files/authors.md)
    - [Books](docs/files/books.md)
    - [General](docs/files/general.md)


## Task 2 - API Integration
Now, you are going to get data to display in your application with the following API.

### Standard Rules
- All responses is in ``JSON`` format
- Use standard HTTP status code to determine if a response is successful, eg ``200`` is successful
- Base URL: ``http://198.211.112.145:8001``
- Example request call: ``http://198.211.112.145:8001/api/books``

### API Endpoints

#### Register a new account
- ``POST /api/register``
- #### Request Payload
```json
{
    "username": "myusername",
    "password": "900150983cd24fb0d6963f7d28e17f72",
    "first_name": "Lucy",
    "last_name": "Chooi"
}
```
- #### Response
```json
{
  "success": true,
  "status": 200,
  "message": "You have successfully registered an account.",
  "data": {
    "user": {
      "id": 3,
      "username": "myusername",
      "password": "900150983cd24fb0d6963f7d28e17f72",
      "created_at": "2017-02-16T17:35:07.702Z",
      "updated_at": "2017-02-16T17:35:07.702Z",
      "first_name": "Lucy",
      "last_name": "Chooi"
    }
  }
}
```

#### Login
- ``POST /api/login``
- #### Request Payload
```json
{
    "username": "myusername",
    "password": "900150983cd24fb0d6963f7d28e17f72"
}
```
- #### Response
```json
{
  "success": true,
  "status": 200,
  "message": "Login successfully, welcome",
  "data": {
    "token": "32dc5a58-6174-4a64-be9c-d4f663fb4d8c"
  }
}
```

#### Get all authors
- ``GET /api/authors``
- #### Response
```json
[
  {
    "id": 2,
    "name": "W. Bruce Cameron",
    "bio": "William Bruce Cameron (born 1960 in Petoskey, Michigan) is an American author, columnist, and humorist. Cameron is most famous for his novel A Dog's Purpose,[1] which spent 52 weeks on the New York Times bestseller list and is the first book in a two book series that concludes with A Dog's Journey.[2] The book is the basis for the movie version[3] starring Dennis Quaid, Britt Robertson, Peggy Lipton, K.J. Apa, Juilet Rylance, Luke Kirby, John Ortiz and Pooch Hall, an Amblin Entertainment/Walden Media release in theaters January 27, 2017.",
    "created_at": "2017-02-16T13:48:13.185Z",
    "updated_at": "2017-02-16T14:15:30.768Z"
  },
  {
    "id": 3,
    "name": "Charles Mackay",
    "bio": "Charles Mackay was born in Perth, Scotland. His father, George Mackay, was a bombardier in the Royal Artillery, and his mother Amelia Cargill died shortly after his birth.[1] His birthdate was 26 March 1812, although he always gave it as 27 March 1814.\r\n\r\nMackay was educated at the Caledonian Asylum, in London. In 1828 he was placed by his father at a school in Brussels, on the Boulevard de Namur, and studied languages. In 1830 he was engaged as a private secretary to William Cockerill, the ironmaster, near Liège, began writing in French in the Courrier Belge, and sent English poems to a local newspaper called The Telegraph. In the summer of 1830 he visited Paris, and he spent 1831 with Cockerill at Aix-la-Chapelle. In May 1832 his father brought him back to London, where he first found employment in teaching Italian to Benjamin Lumley.",
    "created_at": "2017-02-16T13:51:43.281Z",
    "updated_at": "2017-02-16T14:16:05.241Z"
  }
]
```

#### Get an author with author id
- ``GET /api/authors/:id``
- #### Response
```json
{
  "id": 3,
  "name": "Charles Mackay",
  "bio": "Charles Mackay was born in Perth, Scotland. His father, George Mackay, was a bombardier in the Royal Artillery, and his mother Amelia Cargill died shortly after his birth.[1] His birthdate was 26 March 1812, although he always gave it as 27 March 1814.\r\n\r\nMackay was educated at the Caledonian Asylum, in London. In 1828 he was placed by his father at a school in Brussels, on the Boulevard de Namur, and studied languages. In 1830 he was engaged as a private secretary to William Cockerill, the ironmaster, near Liège, began writing in French in the Courrier Belge, and sent English poems to a local newspaper called The Telegraph. In the summer of 1830 he visited Paris, and he spent 1831 with Cockerill at Aix-la-Chapelle. In May 1832 his father brought him back to London, where he first found employment in teaching Italian to Benjamin Lumley.",
  "created_at": "2017-02-16T13:51:43.281Z",
  "updated_at": "2017-02-16T14:16:05.241Z"
}
```

#### Get all books
- ``GET /api/books``
- #### Response
```json
[
  {
    "id": 3,
    "name": "W. Bruce Cameron",
    "summary": "A Dog’s Purpose―which spent a year on the New York Times Best Seller list―is heading to the big screen! Based on the beloved bestselling novel by W. Bruce Cameron, A Dog’s Purpose, from director Lasse Hallström (The Cider House Rules, Dear John, The 100-Foot Journey), shares the soulful and surprising story of one devoted dog (voiced by Josh Gad) who finds the meaning of his own existence through the lives of the humans he teaches to laugh and love. The family film told from the dog’s perspective also stars Britt Robertson, KJ Apa, John Ortiz, Peggy Lipton, Juliet Rylance, Luke Kirby, Pooch Hall and Dennis Quaid. A Dog’s Purpose is produced by Gavin Polone (Zombieland, TV’s Gilmore Girls). The film from Amblin Entertainment and Walden Media will be distributed by Universal Pictures.",
    "author_id": 2,
    "category_id": 4,
    "created_at": "2017-02-16T13:50:29.519Z",
    "updated_at": "2017-02-16T14:22:25.310Z",
    "price": "67.0",
    "cover_image_url": "http://ecx.images-amazon.com/images/I/51ESO2T4DzL.jpg"
  },
  {
    "id": 4,
    "name": "Extraordinary Popular Delusions and The Madness of Crowds",
    "summary": "A new edition of the timeless classic.",
    "author_id": 3,
    "category_id": 1,
    "created_at": "2017-02-16T13:51:48.524Z",
    "updated_at": "2017-02-16T14:10:31.657Z",
    "price": "99.0",
    "cover_image_url": "http://ecx.images-amazon.com/images/I/51WcufjcOpL.jpg"
  }
]
```

#### Get a book with book id
- ``GET /api/books/:id``
- #### Response
```json
{
  "id": 3,
  "name": "W. Bruce Cameron",
  "summary": "A Dog’s Purpose―which spent a year on the New York Times Best Seller list―is heading to the big screen! Based on the beloved bestselling novel by W. Bruce Cameron, A Dog’s Purpose, from director Lasse Hallström (The Cider House Rules, Dear John, The 100-Foot Journey), shares the soulful and surprising story of one devoted dog (voiced by Josh Gad) who finds the meaning of his own existence through the lives of the humans he teaches to laugh and love. The family film told from the dog’s perspective also stars Britt Robertson, KJ Apa, John Ortiz, Peggy Lipton, Juliet Rylance, Luke Kirby, Pooch Hall and Dennis Quaid. A Dog’s Purpose is produced by Gavin Polone (Zombieland, TV’s Gilmore Girls). The film from Amblin Entertainment and Walden Media will be distributed by Universal Pictures.",
  "author_id": 2,
  "category_id": 4,
  "created_at": "2017-02-16T13:50:29.519Z",
  "updated_at": "2017-02-16T14:22:25.310Z",
  "price": "67.0",
  "cover_image_url": "http://ecx.images-amazon.com/images/I/51ESO2T4DzL.jpg"
}
```

#### Get all of an author's books
- ``GET /api/authors/:author_id/books``
- #### Response
```json
[
  {
    "id": 8,
    "name": "Large Print Word Fill-in Puzzle book (Volume 1)",
    "summary": "Welcome to these new large print Word Fill-in Puzzle book, this is to provide endless entertainment to every puzzle fun of all ages. These puzzles have been designed to suit any one inclusive of visually impaired, due to its large print lay-out and the high resolution of the interior set-up. ******** Happy Solving ********",
    "author_id": 7,
    "category_id": 1,
    "created_at": "2017-02-16T13:54:11.744Z",
    "updated_at": "2017-02-16T14:11:25.077Z",
    "price": "43.0",
    "cover_image_url": "https://images-na.ssl-images-amazon.com/images/I/5110-ZR0RrL.jpg"
  }
]
```

#### Get author's book with book id
- ``GET /api/authors/:author_id/books/:id``
- #### Response
```json
{
  "id": 3,
  "name": "W. Bruce Cameron",
  "summary": "A Dog’s Purpose―which spent a year on the New York Times Best Seller list―is heading to the big screen! Based on the beloved bestselling novel by W. Bruce Cameron, A Dog’s Purpose, from director Lasse Hallström (The Cider House Rules, Dear John, The 100-Foot Journey), shares the soulful and surprising story of one devoted dog (voiced by Josh Gad) who finds the meaning of his own existence through the lives of the humans he teaches to laugh and love. The family film told from the dog’s perspective also stars Britt Robertson, KJ Apa, John Ortiz, Peggy Lipton, Juliet Rylance, Luke Kirby, Pooch Hall and Dennis Quaid. A Dog’s Purpose is produced by Gavin Polone (Zombieland, TV’s Gilmore Girls). The film from Amblin Entertainment and Walden Media will be distributed by Universal Pictures.",
  "author_id": 2,
  "category_id": 4,
  "created_at": "2017-02-16T13:50:29.519Z",
  "updated_at": "2017-02-16T14:22:25.310Z",
  "price": "67.0",
  "cover_image_url": "http://ecx.images-amazon.com/images/I/51ESO2T4DzL.jpg"
}
```

#### Location Heartbeat
- ``POST /api/heartbeat``
- #### Response
```json
{
    "lat": 763.656677037990,
    "lng": 7.67555576262133
}
```



## Task 3 - Implement weird features

### 1. Location change detection
The app must be able to detect the device's GPS location change.
When location changes, get the current location coordinates (lat, long) and show in a toast.

### 2. Heartbeat in foreground
- When the app is in the foreground, do the following:
    - Start a Timer or Scheduler and use it to send the current location coordinates to the server every 10 seconds.
    - Stop any background service (Refer to the task below)

### 3. Heartbeat in background
- When app is in background, do the following:
    - Start an Android Service to send current location coordinates to the server every 10 seconds.
    - Stop any Timer or Scheduler that was previously created (Refer to the task above).

## (Optional) Task 4 - Automated functional/UI Testing
- Writing automated testing for the application. You are free to use any 3rd-party libraries such as ``UI Automator``, ``Espresso``, etc.