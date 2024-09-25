package com.corrinedev.contenttoolsgui;

import javafx.stage.DirectoryChooser;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class GunCreator {


    public void createguns () {
        DirectoryChooser directoryChooser = new DirectoryChooser();

        String packid = JOptionPane.showInputDialog(null, "Input the id of the content pack (Example: tp for TestPack");

        String directory = String.valueOf(directoryChooser.showDialog(null));

        String nameinput = "empty";

        while (!(nameinput == null)) {

            nameinput = JOptionPane.showInputDialog(null, "Put in the name of any guns you are making and it will generate folders for you!");
            if (nameinput == null) {
                System.out.println("Please input a gun");
            } else {
                try {
                    if (!(nameinput == null)) {
                        Files.createDirectory(Path.of(directory + "/sounds" + "/" + nameinput));
                        Files.createFile(Path.of(directory + "/guns/data/" + nameinput + "_data.json"));
                        Files.writeString(Path.of(directory + "/guns/data/" + nameinput + "_data.json"), "{\n" +
                                "  \"ammo\": \"" + packid + "9mm\",\n" +
                                "  \"rpm\": 400, //Rate of fire of your gun\n" +
                                "  \"bullet\": {\n" +
                                "    \"life\": 0.8,\n" +
                                "    \"bullet_amount\": 1, //Increase this for shotgun pellets\n" +
                                "    \"damage\": 6,       //Damage that shows up on the gun tooltip\n" +
                                "    \"tracer_count_interval\": 0,\n" +
                                "    \"extra_damage\": {\n" +
                                "      \"armor_ignore\": 0,\n" +
                                "      \"head_shot_multiplier\": 1.5,\n" +
                                "      \"damage_adjust\": [                //Actual damage values\n" +
                                "        {\"distance\": 20, \"damage\": 6},\n" +
                                "        {\"distance\": 45, \"damage\": 5},\n" +
                                "        {\"distance\": \"infinite\", \"damage\": 4}\n" +
                                "      ]\n" +
                                "    },\n" +
                                "    \"speed\": 150,       //Speed of projectile\n" +
                                "    \"gravity\": 0.15,    //Usually dont mess with this\n" +
                                "    \"knockback\": 0,\n" +
                                "    \"friction\": 0.025,  //Usually dont mess with this\n" +
                                "    \"ignite\": false,\n" +
                                "    \"pierce\": 1\n" +
                                "  },\n" +
                                "  \"ammo_amount\": 17,\n" +
                                "  \"extended_mag_ammo_amount\": [\n" +
                                "    20,\n" +
                                "    25,\n" +
                                "    30\n" +
                                "  ],\n" +
                                "  \"bolt\": \"closed_bolt\", //Only change if you know the parameters\n" +
                                "  \"reload\": {\n" +
                                "    \"type\": \"magazine\",\n" +
                                "    \"feed\": {            //Change all of these numbers to the values of the length of your animations\n" +
                                "      \"empty\": 1.63,\n" +
                                "      \"tactical\": 1.05\n" +
                                "    },\n" +
                                "    \"cooldown\": {\n" +
                                "      \"empty\": 1.88,\n" +
                                "      \"tactical\": 1.5\n" +
                                "    }\n" +
                                "  },\n" +
                                "  \"draw_time\": 0.32,\n" +
                                "  \"put_away_time\": 0.35,\n" +
                                "  \"aim_time\": 0.17,\n" +
                                "  \"sprint_time\": 0.05,\n" +
                                "  \"weight\": 1,\n" +
                                "  \"movement_speed\": {\n" +
                                "    \"base\": 0.0,\n" +
                                "    \"aim\": 0,\n" +
                                "    \"reload\": 0.1\n" +
                                "  },\n" +
                                "  \"crawl_recoil_multiplier\": 0.75,\n" +
                                "  \"fire_mode\": [    //Firemodes, semi, auto [burst is done differently]\n" +
                                "    \"semi\"\n" +
                                "  ],\n" +
                                "  \"allow_attachment_types\": [ //Allowed attachments\n" +
                                "    \"scope\",\n" +
                                "    \"muzzle\",\n" +
                                "    \"extended_mag\"\n" +
                                "  ],\n" +
                                "  \"recoil\": {                //Recoil values\n" +
                                "    \"pitch\": [\n" +
                                "      {\"time\": 0, \"value\": [0.55, 0.55]},\n" +
                                "      {\"time\": 0.35, \"value\": [0.55, 0.55]},\n" +
                                "      {\"time\": 0.6, \"value\": [-0.175, -0.175]},\n" +
                                "      {\"time\": 0.8, \"value\": [0.05, 0.05]},\n" +
                                "      {\"time\": 1.0, \"value\": [0, 0]}\n" +
                                "    ],\n" +
                                "    \"yaw\": [\n" +
                                "      {\"time\": 0, \"value\": [-0.2, 0.2]},\n" +
                                "      {\"time\": 0.45, \"value\": [0, 0]}\n" +
                                "    ]\n" +
                                "  },\n" +
                                "  \"inaccuracy\": {         //Increase innaccuracy for shotguns to have proper spread, decrease for snipers\n" +
                                "    \"stand\": 2,\n" +
                                "    \"move\": 2.5,\n" +
                                "    \"sneak\": 1.5,\n" +
                                "    \"lie\": 0.7,\n" +
                                "    \"aim\": 0.2\n" +
                                "  }\n" +
                                "}");
                        Files.createFile(Path.of(directory + "/guns/display/" + nameinput + "_display.json"));
                        Files.createFile(Path.of(directory + "/guns/index/" + nameinput + ".json"));

                        Files.writeString(Path.of(directory + "/guns/index/" + nameinput + ".json"), "{\n" +
                                "  \"name\": \"" + packid + ".gun." + nameinput + ".name\",\n" +
                                "  \"display\": \"" + packid + ":" + nameinput + "_display\",\n" +
                                "  \"data\": \"" + packid + ":" + nameinput + "_data\",\n" +
                                "  \"tooltip\": \"" + packid + ".gun." + nameinput + ".desc\",\n" +
                                "  \"type\": \"place the type of gun here(pistol, rifle, sniper, shotgun, etc)\"\n" +
                                "}");

                        Files.writeString(Path.of(directory + "/guns/display/" + nameinput + "_display.json"), "{\n" +
                                "  \"model\": \"" + packid + ":gun/" + nameinput + "_geo\",\n" +
                                "  \"texture\": \"" + packid + ":gun/uv/" + nameinput + "\",\n" +
                                "  \"lod\": {\n" +
                                "    \"model\": \"" + packid + ":gun/lod/" + nameinput + "\",\n" +
                                "    \"texture\": \"" + packid + ":gun/lod/" + nameinput + "\"\n" +
                                "  },\n" +
                                "  \"hud\": \"" + packid + ":gun/hud/" + nameinput + "\",\n" +
                                "  \"slot\": \"" + packid + ":gun/slot/" + nameinput + "\",\n" +
                                "  \"animation\": \"" + packid + "" + nameinput + "\",\n" +
                                "  \"use_default_animation\": \"rifle\",\n" +
                                "  \"transform\": {\n" +
                                "    \"scale\": {\n" +
                                "      \"thirdperson\": [0.6, 0.6, 0.6],\n" +
                                "      \"ground\": [0.6, 0.6, 0.6],\n" +
                                "      \"fixed\": [1.2, 1.2, 1.2]\n" +
                                "    }\n" +
                                "  },\n" +
                                "  \"muzzle_flash\": {\n" +
                                "    \"texture\": \"tacz:flash/common_muzzle_flash\",\n" +
                                "    \"scale\": 1\n" +
                                "  },\n" +
                                "  \"sounds\": {\n" +
                                "    \"reload_empty\": \"" + packid + ":" + nameinput + "/" + nameinput + "_reload_empty\",\n" +
                                "    \"reload_tactical\": \"" + packid + ":" + nameinput + "/" + nameinput + "_reload_tactical\",\n" +
                                "    \"inspect\": \"" + packid + ":" + nameinput + "/" + nameinput + "_inspect\",\n" +
                                "    \"inspect_empty\": \"" + packid + ":" + nameinput + "/" + nameinput + "_inspect_empty\",\n" +
                                "    \"draw\": \"" + packid + ":" + nameinput + "/" + nameinput + "_draw\",\n" +
                                "    \"shoot\": \"" + packid + ":" + nameinput + "/" + nameinput + "shoot\",\n" +
                                "    \"shoot_3p\": \"" + packid + ":" + nameinput + "/" + nameinput + "_shoot_3p\",\n" +
                                "    \"silence\": \"" + packid + ":" + nameinput + "/" + nameinput + "_silence\",\n" +
                                "    \"silence_3p\": \"" + packid + ":" + nameinput + "/" + nameinput + "_silence_3p\",\n" +
                                "    \"put_away\": \"" + packid + ":" + nameinput + "/" + nameinput + "_put_away\",\n" +
                                "    \"melee_push\": \"" + packid + "melee_stock/melee_stock_02\",\n" +
                                "    \"melee_stock\": \"" + packid + "melee_stock/melee_stock_03\"\n" +
                                "  },\n" +
                                "  \"offhand_show\": {\n" +
                                "    \"pos\": [-2, 20, 4],\n" +
                                "    \"rotate\": [0, 0, 45],\n" +
                                "    \"scale\": [0.5, 0.5, 0.5]\n" +
                                "  },\n" +
                                "  \"hotbar_show\": {\n" +
                                "    \"0\": {\n" +
                                "      \"pos\": [-4, 26, 3],\n" +
                                "      \"rotate\": [-90, -5, -90],\n" +
                                "      \"scale\": [0.5, 0.5, 0.5]\n" +
                                "    }\n" +
                                "  }\n" +
                                "}");
                        Files.createFile(Path.of(directory + "/recipes/gun/" + nameinput + ".json"));
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }

}
