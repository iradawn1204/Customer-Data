<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
  

<title>Customer Data</title>
</head>
<body>

<table class="table">

<h3>Customer Data</h3>
<br>


<thead>

    <tr>
      <th scope="col">Id</th>
      <th scope="col">First Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">E-mail</th>
      <th scope="col">Contact Number</th>
      <th scope="col">Address</th>
     
    </tr>
  </thead>
  <tbody>

  @foreach($customers as $customer)
    <tr>
      <th scope="Customer Data">{{$customer->id}}</th>
      
      <td>{{$customer->firstName}}</td>
      <td>{{$customer->lastName}}</td>
      <td>{{$customer->email}}</td>
      <td>{{$customer->contactNumber}}</td>
      <td>{{$customer->address}}</td>
      <td><button type="button" class="btn btn-primary">Edit</edit></td>
      <td><button type="button" class="btn btn-danger">Delete</button></td>
      
     
     
  
    </tr>

    @endforeach
  
    


  </tbody>
</table>

    
C:\Users\IRA\Documents\CIT18\Demo


</body>
</html>
