<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>People List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        body {
            background-image: url('/img/logo.png');
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: 110px 90px;
            background-position: center top;
        }
    </style>

</head>
<body>
<div class="container-fluid">
    <br>
    <h3>Generic List</h3>

<#--

    <div>
        <fieldset>
            <legend>Find  generic</legend>
            <form name="search" action="" method="POST">
                Last name:<@spring.formInput "searchForm.string" "" "text"/>
                <br>
                <input type="submit" value="Search"/>
            </form>
        </fieldset>
    </div>

    <br>
-->

    <a href="http://localhost:8080/" type="button" class="btn btn-light" style="float:left; margin-top:5px;"><i class="fa fa-chevron-circle-left"></i>Back to home page</a>

    <a href="/web/generic/add" type="button" class="btn btn-light" style="float:right; margin-top:5px;"><i class="fa fa-plus-square-o"></i>Add new generic</a>

    <br>

    <div>
        <table class="table table-sm table-striped table-bordered">
            <tr class="thead-dark">
                <th scope="col">ID</th>
                <th scope="col">First Name</th>

                <th scope="col">Delete</th>
                <th scope="col">Edit</th>
            </tr>
            <#list list as generic>
                <tr>
                    <td>${generic.id}</td>
                    <td>${generic.name}</td>

                    <td><a href="/web/generic/delete/${generic.id}" type="button" class="btn btn-outline-danger" onclick="return confirm('Are you sure you want to delete ?');"><i class="fa fa-trash"></i></a></td>
                    <td><a href="/web/generic/edit/${generic.id}" type="button" class="btn btn-light" ><i class="fa fa-edit"></i>Edit</a></td>
                </tr>
            </#list>

        </table>
    </div>

</div>
</body>
</html>
