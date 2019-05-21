<!DOCTYPE HTML>
<html>

<head>
    <title>${nama}</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>

<body>
    <p>
        <form action="${form}" method="POST">
            <input type="text" placeholder="Input Nama" name="nama" id="nama">
            <br>
            <br>
            <textarea name="alamat" id="alamat" cols="30" rows="10"></textarea>
            <input type="submit" value="Submit">
        </form>
    </p>
    <p>Nama : ${formModel.nama}</p>
    <p>Alamat : ${formModel.alamat}</p>
    <a href="/">Back</a>
</body>

</html>