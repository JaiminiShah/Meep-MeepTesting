package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeepTesting6 {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(550);
        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(60, 60, Math.toRadians(180), Math.toRadians(180), 16.5)
                .setDimensions(18, 17)
                .build();
        myBot.runAction(myBot.getDrive().actionBuilder(new Pose2d(42, 61, Math.toRadians(0)))
                .strafeToLinearHeading(new Vector2d(60, 61), Math.toRadians(0))
                       // .setReversed(false)
                        .waitSeconds(1)
                        .splineTo(new Vector2d(38,61),Math.toRadians(0))
                                .splineTo(new Vector2d(38,12),Math.toRadians(0))


                      .splineToLinearHeading(new Pose2d(43, 12, Math.toRadians(0)), Math.toRadians(0))
                        .strafeToLinearHeading(new Vector2d(60,61),Math.toRadians(0))
                        .waitSeconds(1)
                        .splineTo(new Vector2d(48,61),Math.toRadians(0))
                        .splineTo(new Vector2d(48,12),Math.toRadians(0))
                        .splineToLinearHeading(new Pose2d(57, 12, Math.toRadians(0)), Math.toRadians(0))
                        .strafeToLinearHeading(new Vector2d(60,61),Math.toRadians(0))
                        .waitSeconds(1)
                        .splineTo(new Vector2d(58,61),Math.toRadians(0))
                        .splineTo(new Vector2d(65,12),Math.toRadians(0))
                        .strafeToLinearHeading(new Vector2d(63,61),Math.toRadians(0))
                        .waitSeconds(1)
                        .strafeToLinearHeading(new Vector2d(27,4.6),Math.toRadians(0))




                .build());
        meepMeep.setBackground(MeepMeep.Background.FIELD_INTO_THE_DEEP_JUICE_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();


    }
}
