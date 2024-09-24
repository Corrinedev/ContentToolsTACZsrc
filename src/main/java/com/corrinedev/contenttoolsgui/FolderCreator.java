package com.corrinedev.contenttoolsgui;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FolderCreator {

    String directory = JOptionPane.showInputDialog(null,"Input the directory of the content pack folder (Example: C:/Users/-----/Syncable");
    String packid = JOptionPane.showInputDialog(null,"Input the id of the content pack (Example: tp for TestPack");

    public void createfolders() {

        try {
            Files.createDirectory(Path.of(directory + "/animations"));
            Files.createDirectory(Path.of(directory + "/attachments"));
            Files.createDirectory(Path.of(directory + "/attachments/data"));
            Files.createDirectory(Path.of(directory + "/attachments/display"));
            Files.createDirectory(Path.of(directory + "/attachments/index"));
            Files.createDirectory(Path.of(directory + "/guns"));
            Files.createDirectory(Path.of(directory + "/guns/data"));
            Files.createDirectory(Path.of(directory + "/guns/display"));
            Files.createDirectory(Path.of(directory + "/guns/index"));
            Files.createDirectory(Path.of(directory + "/lang"));
            Files.createDirectory(Path.of(directory + "/models"));
            Files.createDirectory(Path.of(directory + "/models/ammo"));
            Files.createDirectory(Path.of(directory + "/models/ammo_entity"));
            Files.createDirectory(Path.of(directory + "/models/attachment"));
            Files.createDirectory(Path.of(directory + "/models/attachment/lod"));
            Files.createDirectory(Path.of(directory + "/models/gun"));
            Files.createDirectory(Path.of(directory + "/models/gun/lod"));
            Files.createDirectory(Path.of(directory + "/models/shell"));
            Files.createDirectory(Path.of(directory + "/recipes"));
            Files.createDirectory(Path.of(directory + "/recipes/ammo"));
            Files.createDirectory(Path.of(directory + "/recipes/attachments"));
            Files.createDirectory(Path.of(directory + "/recipes/gun"));
            Files.createDirectory(Path.of(directory + "/sounds"));
            Files.createDirectory(Path.of(directory + "/textures"));
            Files.createDirectory(Path.of(directory + "/tags"));
            Files.createDirectory(Path.of(directory + "/tags/attachments"));
            Files.createDirectory(Path.of(directory + "/tags/attachments/allow_attachments"));
            Files.createDirectory(Path.of(directory + "/textures/ammo"));
            Files.createDirectory(Path.of(directory + "/textures/ammo/slot"));
            Files.createDirectory(Path.of(directory + "/textures/ammo/uv"));
            Files.createDirectory(Path.of(directory + "/textures/ammo_entity"));
            Files.createDirectory(Path.of(directory + "/textures/attachment"));
            Files.createDirectory(Path.of(directory + "/textures/attachment/lod"));
            Files.createDirectory(Path.of(directory + "/textures/attachment/slot"));
            Files.createDirectory(Path.of(directory + "/textures/attachment/uv"));
            Files.createDirectory(Path.of(directory + "/textures/gun"));
            Files.createDirectory(Path.of(directory + "/textures/gun/hud"));
            Files.createDirectory(Path.of(directory + "/textures/gun/lod"));
            Files.createDirectory(Path.of(directory + "/textures/gun/slot"));
            Files.createDirectory(Path.of(directory + "/textures/gun/uv"));
            Files.createDirectory(Path.of(directory + "/textures/shell"));
            Files.createDirectory(Path.of(directory + "/textures/flash"));
            Files.createFile(Path.of(directory + "/pack.json"));
            Files.createFile(Path.of(directory + "/lang/en_us.json"));
            Files.writeString(Path.of(directory + "/lang/en_us.json"), "{\n" +
                    "  \"pack." + packid + "." + packid + ".name\": \"Example Name\",\n" +
                    "  \"pack." + packid + "." + packid + ".desc\": \"Pack Description\",\n" +
                    "\n" +
                    "  \"" + packid + ".gun.example.name\": \"Example Gun Name\",\n" +
                    "\n" +
                    "  \"" + packid + ".gun.example.desc\": \"Example gun description\",\n" +
                    "\n" +
                    "  \"" + packid + ".ammo.example.name\": \"§aExample Ammo\",\n" +
                    "    \n" +
                    "  \"" + packid + ".attachment.example.name\": \"Example Attachment Name\",\n" +
                    "\n" +
                    "  \"" + packid + ".attachment.example.desc\": \"Example Attachment Description\"    //ALWAYS make sure the last line does not have a \",\"\n" +
                    "}");
            Files.writeString(Path.of(directory + "/pack.json"), "{\n" +
                    "  \"version\": \"1.0.0\", //pack version number\n" +
                    "  \"name\": \"pack." + packid + "." + packid + ".name\", //refrence this in your lang file\n" +
                    "  \"desc\": \"pack." + packid + "." + packid + ".desc\", //refrence this in your lang file\n" +
                    "  \"license\": \"CC BY-NC-ND 4.0\", //license, dont bother changing unless you know what it means\n" +
                    "  \"authors\": [\n" +
                    "    \"TACZ Dev Team\" //your name or partners names or team name\n" +
                    "  ],\n" +
                    "  \"date\": \"2024-06-01\", //date of pack creation\n" +
                    "  \"url\": \"https://tacwiki.mcma.club/zh/\",\n" +
                    "  \"dependencies\": {\n" +
                    "    // 模组 ID 和版本号\n" +
                    "    // \"tacz\": \"[1.0.3,)\"\n" +
                    "  }\n" +
                    "}");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}

