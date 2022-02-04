<?php
    include 'CRUD/includes/dbconnect.php';

    if (isset($_GET['userID'])) {
        $userID = $_GET['userID'];
    }

     //fshirja e userit ne baze te id
     $query = "DELETE FROM users WHERE userID= :userID";
     $query = $pdo->prepare($query);
 
     $query->execute(['userID' => $userID]);
 
 
     header("Location: users.php");
     ?>