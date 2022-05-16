package na.learn.myquizapp

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        //1
        val que1 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armenia", "Austria",
            1
        )
        questionsList.add(que1)

        //2
        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Australia", "Egypt",
            "Kuwait", "Belgium",
            1
        )
        questionsList.add(que2)

        //3
        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Belgium", "Syria",
            "India", "Fiji",
            1
        )
        questionsList.add(que3)

        //4
        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Brazil", "Kuwait",
            "Germany", "New Zealand",
            1
        )
        questionsList.add(que4)

        //5
        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Denmark", "Brazil",
            "Moracco", "Denmark",
            1
        )
        questionsList.add(que5)

        //6
        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Fiji", "Sodan",
            "America", "UK",
            1
        )
        questionsList.add(que6)

        //7
        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "India",
            "New Zealand", "Belgium",
            1
        )
        questionsList.add(que7)

        //8
        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "India", "Kuwait",
            "Egypt", "USA",
            1
        )
        questionsList.add(que8)

        //9
        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Egypt",
            "Palastin", "Iraq",
            1
        )
        questionsList.add(que9)

        return questionsList

    }
}