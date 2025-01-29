package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeepTesting5 {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(550);
        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(60, 60, Math.toRadians(180), Math.toRadians(180), 16.5)
                .setDimensions(18, 17)
                .build();
        myBot.runAction(myBot.getDrive().actionBuilder(new Pose2d(33, 63, Math.toRadians(0)))

                .splineToConstantHeading(new Vector2d(55, 55), Math.toRadians(0))
                        .waitSeconds(0.4)
                .splineToLinearHeading(new Pose2d(35,12,0),Math.toRadians(270))
                                .splineToConstantHeading(new Vector2d(38,12),Math.toRadians(0))
                                .splineToLinearHeading(new Pose2d(55,55,0),Math.toRadians(0))
                                .waitSeconds(.4)
                                .splineToLinearHeading(new Pose2d(48,12,0),Math.toRadians(0))
                                .splineToConstantHeading(new Vector2d(50,12),Math.toRadians(0))
                                .splineToLinearHeading(new Pose2d(57,55,0),Math.toRadians(0))
                                .waitSeconds(.4)
                                .splineToLinearHeading(new Pose2d(34,-5,0),Math.toRadians(0))






                /*.strafeTo(new Vector2d(7, -42))
                .strafeTo(new Vector2d(7, -48))
                .strafeTo(new Vector2d(7, -50))
                .strafeTo(new Vector2d(32, -36))

                .strafeToLinearHeading(new Vector2d(32, -12), Math.toRadians(270))
                .strafeTo(new Vector2d(45, -12))
                .strafeTo(new Vector2d(45, -57))
                .strafeTo(new Vector2d(50, -12))
                .strafeTo(new Vector2d(53, -12))
                .strafeTo(new Vector2d(53, -56))
                .strafeTo(new Vector2d(58, -12))
                .strafeTo(new Vector2d(61.5, -12))
                .strafeTo(new Vector2d(61.5, -56))
                .strafeTo(new Vector2d(61.5, -53))
                .strafeTo(new Vector2d(57, -53))
                .turnTo(Math.toRadians(90))
                .strafeTo(new Vector2d(61, -55))


//                .strafeTo(new Vector2d(-32, -36))
//
//                .strafeToLinearHeading(new Vector2d(-32, -12), Math.toRadians(270))
//                .strafeTo(new Vector2d(-45, -12))
//                .strafeTo(new Vector2d(-45, -60))
//                .strafeTo(new Vector2d(-50, -12))
//                .strafeTo(new Vector2d(-53, -12))
//                .strafeTo(new Vector2d(-53, -60))
//                .strafeTo(new Vector2d(-58, -12))
//                .strafeTo(new Vector2d(-61, -12))
//                .strafeTo(new Vector2d(-61, -60))*/

                .build());

        meepMeep.setBackground(MeepMeep.Background.FIELD_INTO_THE_DEEP_JUICE_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();
    }


    }

