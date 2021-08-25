package com.lessondsl
//def email = new Email()
//email.setFrom("from@mail.ru")
//email.setTo("to@mail.ru")
//email.setTitle("Title")
//
//def body = new EMailBody()
//body.setText("Text message")
//body.setImages(List.of("image.jpg"))
//email.setBody(body)
//   --------->

//builder
import static com.lessondsl.DSLBuilder.*

mail {
    from "from@mail.ru"
    to "to@mail.ru"
    title "title"
    body {
        text "text our letter"
        images (['image.jpg', 'image2.jpg'])
        image 'image.jpg'
    }
}
