
package com.example.android.quizapp1;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.android.quizapp1.R;

public class MainActivity extends AppCompatActivity {

    RadioGroup rgOne, rgTwo, rgThree, rgFour, rgFive, rgSix ;
    RadioButton qnOneYes, qnOneS, qnOneNo, qnTwoYes, qnTwoS, qnTwoNo, qnThreeYes, qnThreeS, qnThreeNo, qnFourYes, qnFourS, qnFourNo, qnFiveYes, qnFiveS, qnFiveNo, qnSixYes, qnSixS, qnSixNo;
    Button viewAnswersAndEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Getting IDs of the RadioGroups
        rgOne = findViewById(R.id.rgOne);
        rgTwo = findViewById(R.id.rgTwo);
        rgThree = findViewById(R.id.rgThree);
        rgFour = findViewById(R.id.rgFour);
        rgFive = findViewById(R.id.rgFive);
        rgSix = findViewById(R.id.rgSix);

        // Getting IDs of the RadioButtons
        qnOneYes = findViewById(R.id.radio_yes1);
        qnOneS = findViewById(R.id.radio_sometimes1);
        qnOneNo = findViewById(R.id.radio_no1);
        qnTwoYes = findViewById(R.id.radio_yes2);
        qnTwoS = findViewById(R.id.radio_sometimes2);
        qnTwoNo = findViewById(R.id.radio_no2);
        qnThreeYes = findViewById(R.id.radio_yes3);
        qnThreeS = findViewById(R.id.radio_sometimes3);
        qnThreeNo = findViewById(R.id.radio_no3);
        qnFourYes = findViewById(R.id.radio_yes4);
        qnFourS = findViewById(R.id.radio_sometimes4);
        qnFourNo = findViewById(R.id.radio_no4);
        qnFiveYes = findViewById(R.id.radio_yes5);
        qnFiveS = findViewById(R.id.radio_sometimes5);
        qnFiveNo = findViewById(R.id.radio_no5);
        qnSixYes = findViewById(R.id.radio_yes6);
        qnSixS = findViewById(R.id.radio_sometimes6);
        qnSixNo = findViewById(R.id.radio_no6);

        // Setting OnCheckedChangeListener on radio groups
        rgOne.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                String answerOne = questionOne(group);
                Toast.makeText(getApplicationContext(),"well done on taking the first step", Toast.LENGTH_SHORT).show();

            }
        });


        rgThree.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String answerTree = questionFour(group);
                Toast.makeText(getApplicationContext(),"Keep it up You almost there", Toast.LENGTH_SHORT).show();
            }
        });

        rgSix.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String answerSix = questionFour(group);
                Toast.makeText(getApplicationContext(),"Well done you have made it !!! ", Toast.LENGTH_SHORT).show();
            }
        });


    }

    // Method to get the value of Question One
    public String questionOne(View view) {

        String result;

        // get selected radio button from radioGroup
        int selectedId = rgOne.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        RadioButton rbOne = findViewById(selectedId);

        if (selectedId == -1) {
            result = "";
        } else if (rbOne == qnOneYes) {
            result ="1: Do you think your colleagues and supervisors are overestimating you? \" YES. \n\n ANSWER - Academics keep a curriculum vitae, roughly translated as “life’s work.”\n" +
                    "More than a resume, it lists everything they have accomplished." +
                    "Do the same and read it over from time to time.\n" +
                    "Read your old letters of recommendation.If you’ve been given an award, read the inscription.\n" +
                    "You don’t just look good on paper; these are actual accomplishments you earned.\n\n";
        } else if (rbOne == qnOneS) {
            result ="1: Do you think your colleagues and supervisors are overestimating you? \" SOMETIMES. \n ANSWER - Academics keep a curriculum vitae, roughly translated as “life’s work.”\n" +
                    "More than a resume, it lists everything they have accomplished." +
                    "Do the same and read it over from time to time." +
                    "Read your old letters of recommendation.If you’ve been given an award, read the inscription.\n" +
                    "You don’t just look good on paper; these are actual accomplishments you earned.\n\n";
        } else if (rbOne == qnOneNo) {
            result ="1: Do you think your colleagues and supervisors are overestimating you? \" NO. \n\n ANSWER - Studies consistently show people with impostor syndrome worry they won’t be able to meet other people’s expectations.\n" +
                    "People who feel like impostors likely exaggerate how much is expected from them and underestimate their ability to perform.\n" +
                    "They think things like, “My boss has no idea I’m not qualified to do that project.”\n\n";
        } else {
            result = "";
        }


        return result;

    }

    // Method to get the value of Question two
    public String questionTwo(View view) {

        String result;

        // get selected radio button from radioGroup
        int selectedId = rgTwo.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        RadioButton rbTwo = findViewById(selectedId);

        if (selectedId == -1) {
            result ="";
        } else if (rbTwo == qnTwoYes) {
            result =" 2: Do you believe “If I can do it, anybody can” ?\" YES.\n\n ANSWER - Know that the feeling is normal.\n" +
                    " Impostor Syndrome is more common than you think. It infects everyone from high school honor students to Nobel Prize winners.\n" +
                    " It is rarely discussed because each person feels they are keeping a secret." +
                    " However, whenever someone speaks up about, hundreds more breathe a sigh of relief. “Whew, it’s not just me.”\n\n";
        } else if (rbTwo == qnTwoS) {
            result =" 2: Do you believe “If I can do it, anybody can” ?\" SOMETIMES. \n\n ANSWER - Know that the feeling is normal.\n" +
                    " Impostor Syndrome is more common than you think. It infects everyone from high school honor students to Nobel Prize winners.\n" +
                    " It is rarely discussed because each person feels they are keeping a secret." +
                    " However, whenever someone speaks up about, hundreds more breathe a sigh of relief. “Whew, it’s not just me.”\n\n";
        } else if (rbTwo == qnTwoNo) {
            result =" 2: Do you believe “If I can do it, anybody can” ?\" NO .\n\n ANSWER - Although achievement helps most people feel better about themselves, success leads to increased self-doubt in people with impostor syndrome.\n" +
                    " With each new accomplishment, their fear of being ‘found out’ actually increases." +
                    " New levels of achievement cause them to feel as though they're going to have put in more effort to keep up the \"charade.\n\n";
        } else {
            result = "";
        }


        return result;

    }

    // Method to get the value of Question Tree
    public String questionThree(View view) {

        String result;

        // get selected radio button from radioGroup
        int selectedId = rgThree.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        RadioButton rbThree = findViewById(selectedId);

        if (selectedId == -1) {
            result = "";
        } else if (rbThree == qnThreeYes) {
            result =" 3: Do you agonize over even the smallest flaws in your work,are you in a perpetuating cycle of self-doubt? \" YES. \n\n ANSWER - Tell a fan.\n" +
                    " Disclose your feelings to a trusted friend, your favorite teacher, or close colleague. Hopefully, you’ll come away with boosted spirits.\n" +
                    " Warning: change the subject if your friend simply tells you to stop feeling insecure.  If you could stop, you would have already!\n\n";
        } else if (rbThree == qnThreeS) {
            result =" 3: Do you agonize over even the smallest flaws in your work,are you in a perpetuating cycle of self-doubt? \" SOMETIMES. \n\n ANSWER - Tell a fan.\n" +
                    " Disclose your feelings to a trusted friend, your favorite teacher, or close colleague. Hopefully, you’ll come away with boosted spirits.\n" +
                    " Warning: change the subject if your friend simply tells you to stop feeling insecure.  If you could stop, you would have already!\n\n";
        } else if (rbThree == qnThreeNo) {
            result =" 3: Do you agonize over even the smallest flaws in your work,are you in a perpetuating cycle of self-doubt? \" NO. \n\n ANSWER - People with impostor syndrome have an immense fear of failure. But, at the same time, they’re terrified of success.\n" +
                    " They want to prove their worth but they worry they don’t deserve high levels of success. Studies have found this constant internal struggle leads to self-handicapping,\n" +
                    " which prevents them from reaching their full potential.\n\n";
        } else {
            result = "";
        }

        return result;

    }

    // Method to get the value of Question Four
    public String questionFour(View view) {

        String result;

        // get selected radio button from radioGroup
        int selectedId = rgFour.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        RadioButton rbFour = findViewById(selectedId);

        if (selectedId == -1) {
            result = "";
        } else if (rbFour == qnFourYes) {
            result =" 4: Are you crushed by even constructive criticism, seeing it as evidence of your “ineptness?” \" YES. \n\n ANSWER- Seek out a mentor.\n" +
                    " Ask a senior colleague, teacher, or coach for guidance navigating intimidating environments." +
                    " If possible, seek out a mentor who matches your gender, sexual orientation, or ethnicity.\n\n";
        } else if (rbFour == qnFourS) {
            result =" 4: Are you crushed by even constructive criticism, seeing it as evidence of your “ineptness?” \" SOMETIMES. \n\n ANSWER - Seek out a mentor.\n" +
                    " Ask a senior colleague, teacher, or coach for guidance navigating intimidating environments." +
                    " If possible, seek out a mentor who matches your gender, sexual orientation, or ethnicity.\n\n";
        } else if (rbFour == qnFourNo) {
            result =" Are you crushed by even constructive criticism, seeing it as evidence of your “ineptness?” \" NO. \n\n ANSWER - People with impostor syndrome don’t gain satisfaction from their work. Yet, they aren’t likely to strive for upward mobility.\n" +
                    " Instead, researchers have found they remain where they are because they don’t believe they can do any better.\n\n";
        } else {
            result = "";
        }


        return result;

    }

    // Method to get the value of Question Five
    public String questionFive(View view) {

        String result;

        // get selected radio button from radioGroup
        int selectedId = rgFive.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        RadioButton rgFive = findViewById(selectedId);

        if (selectedId == -1) {
            result = "";
        } else if (rgFive == qnFiveYes) {
            result =" 5: When you do succeed, do you secretly feel like you fooled them again?\" YES . \n\n ANSWER-  Teach.\n" +
                    " On the other hand, become a mentor.  You’ll be surprised how much you know.\n" +
                    " As we become experts in a field or rise to the top of the class, we are conscious enough to realize how much we have yet to learn, which amplifies the sense of fraudulence.\n" +
                    " It is only when we contrast ourselves with true newbies that we gain perspective on our success." +
                    " Remind yourself how far you’ve come by helping to nurture the next generation.\n\n";
        } else if (rgFive == qnFiveS) {
            result =" 5: When you do succeed, do you secretly feel like you fooled them again?\" SOMETIMES. \n\n ANSWER -  Teach.\n" +
                    " On the other hand, become a mentor.  You’ll be surprised how much you know.\n" +
                    " As we become experts in a field or rise to the top of the class, we are conscious enough to realize how much we have yet to learn, which amplifies the sense of fraudulence.\n" +
                    " It is only when we contrast ourselves with true newbies that we gain perspective on our success." +
                    " Remind yourself how far you’ve come by helping to nurture the next generation.\n\n";
        } else if (rgFive == qnFiveNo) {
            result ="  5: When you do succeed, do you secretly feel like you fooled them again?\" NO. \n\n ANSWER - In an effort to relieve their anxiety over their inadequacies, people with impostor syndrome tend to work really hard.\n" +
                    "  They set high standards for themselves and try their best to reach them." +
                    "  But, no matter how much validation they receive for their performance, they never feel competent.\n\n";
        } else {
            result = "";
    }


        return result;

    }
    // Method to get the value of Question Six

    public String questionSix(View view) {

        String result;

        // get selected radio button from radioGroup
        int selectedId = rgSix.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        RadioButton rgSix = findViewById(selectedId);

        if (selectedId == -1) {
            result = "";
        } else if (rgSix == qnSixYes) {
            result =" 6: Do you worry that it’s just a matter of time before you’re “found out?\" YES. \n\n ANSWER - Remember it’s OK not to know what you’re doing.\n" +
                    " After any big life event, like going back to school or earning a promotion, there is a steep learning curve of adjustment.\n" +
                    " Rather than hiding, think of yourself as a “public amateur” or a “boss-in-training”—someone who is learning and gaining expertise in the public eye.\n" +
                    " As long as you’re enthusiastic about learning, people will cut you appropriate slack. \n\n Keep a little Impostor Syndrome in your pocket.A balancing point exists between Impostor Syndrome and slick, grinning egomania.  Authentic modesty keeps you real.";
        } else if (rgSix == qnSixS) {
            result =" 6: Do you worry that it’s just a matter of time before you’re “found out?\" SOMETIMES. \n\n ANSWER- Remember it’s OK not to know what you’re doing.\n" +
                    " After any big life event, like going back to school or earning a promotion, there is a steep learning curve of adjustment.\n" +
                    " Rather than hiding, think of yourself as a “public amateur” or a “boss-in-training”—someone who is learning and gaining expertise in the public eye.\n" +
                    " As long as you’re enthusiastic about learning, people will cut you appropriate slack. \n\n Keep a little Impostor Syndrome in your pocket.A balancing point exists between Impostor Syndrome and slick, grinning egomania.  Authentic modesty keeps you real.";
        } else if (rgSix == qnSixNo) {
            result =" 6: Do you worry that it’s just a matter of time before you’re “found out?\". \n\n ANSWER NO - People with impostor syndrome aren’t likely to ask for a raise.\n" +
                    " Since they don’t see themselves as competent, they don’t think they’re worth more money.\n\n" +
                    " They continuously minimize their contributions.\n\n Keep a little Impostor Syndrome in your pocket.A balancing point exists between Impostor Syndrome and slick, grinning egomania.  Authentic modesty keeps you real.";
        } else {
            result = "";
        }


        return result;


        // Method to get the value of Question Seven

    }
    public void answers(View view) {

        String one, two, three, four, five, six;


        // Calling methods with answers.

        one = questionOne(view);
        two = questionTwo(view);
        three = questionThree(view);
        four = questionFour(view);
        five = questionFive(view);
        six = questionSix(view);


        EditText text = (EditText)findViewById(R.id.enter_name);
        String name = text.getText().toString();


        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT,"Do you suffer from Impostor syndrome\n" );
        intent.putExtra(Intent.EXTRA_TEXT,one + two + three + four + five + six);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }



        if (one.equals("") || two.equals("") || three.equals("") || four.equals("")) {
            Toast.makeText(getApplicationContext(), "Please select the answer", Toast.LENGTH_SHORT).show();
        } else ;

    }

    public void submit(View view) {
        String one = "", two = "", three = "", four ="", five="", six="";

        double total = 0, score1 = 0, score2 = 0, score3 = 0, score4 = 0, score5 = 0, score6 = 0;
        boolean yesCheckBox;
        boolean noCheckBox;

        // Calling methods with submit.
        //one = questionOne(view);
        //two = questionTwo(view);
        //three = questionThree(view);
        //four = questionFour(view);
        //five = questionFive(view);
        //six = questionSix(view);


        // Compare the answer from question one, and assign score
        switch (questionOne(view)) {
            case "yes":
                one = "1:Do you think your colleagues and supervisors are overestimating you? \" YES \n ";
                score1 = 1;
                break;
            case "sometimes":
                one = "1: Do you think your colleagues and supervisors are overestimating you? \" SOMETIMES \n";
                score1 = 0.5;
                break;
            case "no":
                one = "1: Do you think your colleagues and supervisors are overestimating you? \" NO \n";

                score1 = 0;
                break;
            default:
                Toast.makeText(getApplicationContext(), "Please select the answer", Toast.LENGTH_SHORT).show();
                break;
        }

        // Compare the answer from question two, and assign score
        switch (questionTwo(view)) {
            case "yes":
                two = " 2: YES \n";

                score2 = 1;
                break;
            case "sometimes":
                two = "2: SOMETIMES \n";

                score2 = 0.5;
                break;
            case "no":
                two =   " 2:  NO \n";

                score2 = 0;
                break;
            default:
                Toast.makeText(getApplicationContext(), "Please select the answer", Toast.LENGTH_SHORT).show();
                break;
        }

        // Compare the answer from question tree, and assign score

        switch (questionThree(view)) {
            case "yes":
                three = " 3: YES \n";

                score3 = 1;
                break;
            case "sometimes":
                three =  "3: SOMETIMES \n";
                score3 = 0.5;
                break;
            case "no":
                three = " 3: NO \n";
                score3 = 0;
                break;
            default:
                Toast.makeText(getApplicationContext(), "Please select the answer", Toast.LENGTH_SHORT).show();
                break;
        }

            // Compare the answer from question Four, and assign score

            switch (questionFour(view)) {
                case "yes":
                    four =   " 4: YES \n";

                    score4 = 1;
                    break;
                case "sometimes":
                    four =   " 4: SOMETIMES \n";
                    score4 = 0.5;
                    break;
                case "no":
                    four =   " 4: NO \n";
                    score4 = 0;
                    break;

                default:
                    Toast.makeText(getApplicationContext(), "Please select the answer", Toast.LENGTH_SHORT).show();
                    break;


        }
        // Compare the answer from question Five, and assign score
        switch (questionFive(view)) {
            case "yes":
                five =  " 5: YES   \n";
                score5 = 1;
                break;
            case "sometimes":
                five =  " 5: SOMETIMES \n";
                score5 = 0.5;
                break;
            case "no":
                five =  " 5: NO ";
                score5 = 0;
                break;

            default:
                Toast.makeText(getApplicationContext(), "Please select the answer", Toast.LENGTH_SHORT).show();
                break;

        }

        // Compare the answer from question Six, and assign score
        switch (questionSix(view)) {
            case "yes":
                six =  " 6: YES \n";
                score6 = 1;
                break;
            case "sometimes":
                six =  " 6: SOMETIMES \n";
                score6 = 0.5;
                break;
            case "no":
                six =   " 6: NO \n";
                score6 = 0;
                break;

            default:
                Toast.makeText(getApplicationContext(), "Please select the answer", Toast.LENGTH_SHORT).show();
                break;

        }
        total = score1 + score2 + score3 + score4 + score3 + score4 + score5 + score6 ;


        EditText text = (EditText) findViewById(R.id.enter_name);
        String name = text.getText().toString();

        CheckBox yesFeelingsCheckBox = (CheckBox) findViewById(R.id.yes_feelings_checkBox);
        boolean yesFeelings = yesFeelingsCheckBox.isChecked();

        CheckBox noFeelingsCheckBox = (CheckBox) findViewById(R.id.no_feelings_checkBox);
        boolean noFeelings = noFeelingsCheckBox.isChecked();

        if (one.equals("") || two.equals("") || three.equals("") || four.equals("")) {
            Toast.makeText(getApplicationContext(),name +"\nThank you for participating in taking your first step in understanding what you feeling by submitting, there is no real rite or wrong answers.\n"+ yesFeelings  +  noFeelings + "\nScore: " + String.valueOf(total) + "\n\n\n" + one + two + three + four + five + six, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "Please select the answer", Toast.LENGTH_SHORT).show();
        }}
        }

