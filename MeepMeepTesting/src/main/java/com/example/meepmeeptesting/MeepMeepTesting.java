package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.core.colorscheme.scheme.ColorSchemeBlueDark;
import com.noahbres.meepmeep.core.colorscheme.scheme.ColorSchemeRedDark;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeepTesting {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(560);
        Pose2d INITIAL_POSE = new Pose2d(36, 63,  Math.toRadians(270));

        // Declare our first bot
      /*  RoadRunnerBotEntity myFirstBot = new DefaultBotBuilder(meepMeep)
                // We set this bot to be blue
                .setColorScheme(new ColorSchemeBlueDark())
                .setConstraints(60, 60, Math.toRadians(180), Math.toRadians(180), 15)
                .build();*/

       /* myFirstBot.runAction(myFirstBot.getDrive().actionBuilder(new Pose2d(0, 0, 0))
                .lineToX(30)
                .turn(Math.toRadians(90))
                .lineToY(30)
                .turn(Math.toRadians(90))
                .lineToX(0)
                .turn(Math.toRadians(90))
                .lineToY(0)
                .turn(Math.toRadians(90))
                .build());*/
        RoadRunnerBotEntity bot = new DefaultBotBuilder(meepMeep)
                .setConstraints(50, 50, Math.PI, Math.PI, 12)
                .setStartPose(INITIAL_POSE)
                .build();

        bot.runAction(bot.getDrive().actionBuilder(INITIAL_POSE)
                // Move to basket and deposit the preload sample
                .splineTo(new Vector2d(45, 63),Math.toRadians(0))
                .splineToConstantHeading(new Vector2d(59, 59), Math.PI / 4)
                // Move to first sample while resetting output box and retracting slides
                .setTangent(Math.toRadians(224.65))
                .splineToSplineHeading(new Pose2d(36, 25, 0), Math.toRadians(270))
                // Move to basket the second time and deposit
                .setTangent(Math.PI / 2)
                .splineToSplineHeading(new Pose2d(59, 59, 5 * Math.PI / 4), Math.PI / 4)
                // Move to second sample while resetting output box and retracting slides
                .setTangent(5 * Math.PI / 4)
                .splineToSplineHeading(new Pose2d(46, 25, 0), 3 * Math.PI / 2)
                // Move to basket the third time and deposit
                .setTangent(Math.PI / 2)
                .splineToSplineHeading(new Pose2d(59, 59, 5 * Math.PI / 4), Math.PI / 4)
                // Move to third sample while resetting output box and retracting slides
                .setTangent(5 * Math.PI / 4)
                .splineToSplineHeading(new Pose2d(56, 25, 0), 3 * Math.PI / 2)
                // Move to basket the fourth time and deposit
                .setTangent(Math.PI / 2)
                .splineToSplineHeading(new Pose2d(59, 59, 5 * Math.PI / 4), Math.PI / 4)
                .build()
        );


        // Declare out second bot
     /*   RoadRunnerBotEntity mySecondBot = new DefaultBotBuilder(meepMeep)
                // We set this bot to be red
                .setColorScheme(new ColorSchemeRedDark())
                .setConstraints(60, 60, Math.toRadians(180), Math.toRadians(180), 15)
                .build();

        mySecondBot.runAction(mySecondBot.getDrive().actionBuilder(new Pose2d(-33, -63, Math.toRadians(90)))
                //.lineToX(0)
                .lineToY(-45)


                //.strafeTo(new Vector2d(-48,-56))

                .splineTo(new Vector2d(-48,-56),Math.toRadians(-90))
                // .strafeTo(new Vector2d(40,40))
                // .turn(Math.toRadians(90))
                //  .waitSeconds(1)
                // .strafeTo(new Vector2d(56,0))
                /*.strafeTo(new Vector2d(37,-35))
                .strafeTo(new Vector2d(37,-10))*/
                //   .splineTo(new Vector2d(47,-10),Math.toRadians(270))
                /* .strafeTo(new Vector2d(47,-51))
                 .strafeTo(new Vector2d(47,-59))*/

                // .lineToX(28)
                //   .setTangent(7*Math.PI/4)
                // .splineToSplineHeading(new Pose2d(0,-36,Math.PI/2),Math.PI/4)

                /*   .lineToYSplineHeading(47, Math.toRadians(0))
                   .waitSeconds(2)
                   .setTangent(Math.toRadians(0))
                          // .turn(Math.toRadians(90))
                   .lineToXSplineHeading(45,Math.toRadians(0))
                  // .setTangent(Math.toRadians(0))
                  // .lineToX(32)
                   .strafeTo(new Vector2d(44.5, 30))
                 /*  .turn(Math.toRadians(180))
                   .lineToX(47.5)
                   .waitSeconds(3)*/
                /*  .strafeTo(new Vector2d(28,0))
                  .waitSeconds(1)
                  .strafeTo(new Vector2d(0,34))
                  .strafeTo(new Vector2d(37, 35))
                  .strafeTo(new Vector2d(37, 10))
                  .splineTo(new Vector2d(47, 10), Math.toRadians(270))
                  .strafeTo(new Vector2d(47, 51))
                  .strafeTo(new Vector2d(47, 59))
                  .strafeTo(new Vector2d(47, 45))
                  .waitSeconds(3)
                  .strafeTo(new Vector2d(47, 61.5))
                  .waitSeconds(0.5)
                  .strafeTo(new Vector2d(47, 45))
                  .splineTo(new Vector2d(4, 52), Math.toRadians(270))
                  .strafeTo(new Vector2d(4, 27))
                  .waitSeconds(1)
                  .splineTo(new Vector2d(47, 47), Math.toRadians(90))
                  .strafeTo(new Vector2d(47,61))*/

                /*  .turn(Math.toRadians(90))
                  .lineToY(0)
                  .turn(Math.toRadians(90))
                  .lineToX(30)
                  .turn(Math.toRadians(90))
                  .lineToY(30)
                  .turn(Math.toRadians(90))*/

                // .splineTo(new Vector2d(-24,-48),Math.toRadians(45))
                // .lineToYSplineHeading(47, Math.toRadians())

                //.strafeTo(new Vector2d(8.5,-42))*/


        meepMeep.setBackground(MeepMeep.Background.FIELD_INTO_THE_DEEP_JUICE_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                // Add both of our declared bot entities
                // .addEntity(myFirstBot)
                .addEntity(bot)
                .start();
    }
}