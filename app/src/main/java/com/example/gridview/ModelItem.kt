package com.example.gridview

data class Model (
    var id : Int,
    var name : String,
    var image : Int,
    var info : String,
    var rate : Int
)

object Supplier {
    var data = arrayListOf<Model>(
        Model(
            1,
            "Lionel Messi",
            R.drawable.messi,
            "Lionel Andrés Leo Messi Cuccittini, thường biết tới với tên gọi Lionel Messi là một cầu thủ bóng đá người Argentina hiện đang chơi ở vị trí tiền đạo cho câu lạc bộ Barcelona.",
            5
        ), Model(
            2,
            "Virgil van Dijk",
            R.drawable.virgil,
            "Virgil van Dijk là một cầu thủ bóng đá chuyên nghiệp người Hà Lan chơi ở vị trí hậu vệ cho Liverpool và là đội trưởng đội tuyển bóng đá quốc gia Hà Lan",
            5
        ), Model(
            3,
            "Sadio Mane",
            R.drawable.sadio,
            "Sadio Mané là cầu thủ bóng đá người Sénégal thi đấu ở vị trí tiền đạo cánh phải cho câu lạc bộ Liverpool tại Premier League và Đội tuyển bóng đá quốc gia Senegal",
            5
        ), Model(
            4,
            "Cristiano Ronaldo",
            R.drawable.ronaldo,
            "Cristiano Ronaldo dos Santos Aveiro, có biệt danh là CR7, là một cầu thủ bóng đá người Bồ Đào Nha hiện đang thi đấu ở giải vô địch Ý cho câu lạc bộ Juventus",
            5
        ),Model(
            5,
            "Mohamed Salah",
            R.drawable.salah,
            "Mohamed Salah Ghaly là một cầu thủ bóng đá người Ai Cập hiện đang chơi ở vị trí tiền đạo cánh cho câu lạc bộ Liverpool",
            5
        ),  Model(
            6,
            "Kylian Mbappe",
            R.drawable.manee,
            "Kylian Mbappé là một cầu thủ bóng đá người Pháp gốc Cameroon-Algérie thi đấu ở vị trí tiền đạo cho câu lạc bộ Paris Saint-Germain tại Ligue 1.",
            5
        ),
        Model(
            7,
            "Robert Lewandowski",
            R.drawable.robert,
            "Robert Lewandowski là một cầu thủ bóng đá người Ba Lan hiện đang thi đấu cho câu lạc bộ Bayern Munich của Đức tại giải Bundesliga",
            5
        ),Model(
            8,
            "Raheem Sterlin",
            R.drawable.rahe,
            "Raheem Shaquille Sterling là một cầu thủ bóng đá chuyên nghiệp người Anh gốc Jamaica và đang chơi cho câu lạc bộ Manchester City",
            5
        )
    )
}