package com.corrinedev.contenttoolsgui;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class AttachmentCreator {

    String directory = JOptionPane.showInputDialog(null,"Input the directory of your content pack, include the id folder");
    String packid = JOptionPane.showInputDialog(null,"Input the packid of your content pack, (example: TestPack would be tp)");

    public void createAttachments () {


        String nameinput = "empty";

        while (!(nameinput == null)) {

            nameinput = JOptionPane.showInputDialog(null, "Put in the name of any attachments you are making and it will generate files for you!");
            if (nameinput == null) {
                System.out.println("Please input an attachment");
            } else {
                try {
                    if (!(nameinput == null)) {

                        String type = JOptionPane.showInputDialog(null,"Input the type of attachment, scope, grip, stock, extended_mag, suppressor or muzzle");

                        switch(type) {
                            case "muzzle":
                                    Files.createFile(Path.of(directory + "/attachments/index/" + nameinput + ".json"));
                                    Files.writeString(Path.of(directory + "/attachments/index/" + nameinput + ".json"), "{\n" +
                                            "  \"name\": \"tacz.attachment."+ nameinput +".name\",\n" +
                                            "  \"display\": \"tacz:"+ nameinput +"_display\",\n" +
                                            "  \"data\": \"" + packid + ":"+ nameinput +"_data\",\n" +
                                            "  \"type\": \"muzzle\"\n" +
                                            "}");

                                Files.createFile(Path.of(directory + "/attachments/display/" + nameinput + "_display.json"));
                                Files.writeString(Path.of(directory + "/attachments/display/" + nameinput + "_display.json"), "{\n" +
                                        "  \"slot\": \"" + packid +":attachment/slot/"+ nameinput +"\",\n" +
                                        "  \"model\": \"" + packid +":attachment/"+ nameinput +"_geo\",\n" +
                                        "  \"texture\": \""+ packid +":attachment/uv/"+ nameinput +"\",\n" +
                                        "  \"sounds\": {\n" +
                                        "    \"install\": \"tacz:attachments/attachment_general_a\",\n" +
                                        "    \"uninstall\": \"tacz:attachments/attachment_general_uninstall\"\n" +
                                        "  }\n" +
                                        "}");

                                Files.createFile(Path.of(directory + "/attachments/data/" + nameinput + "_data.json"));
                                Files.writeString(Path.of(directory + "/attachments/data/" + nameinput + "_data.json"), "{\n" +
                                        "  \"weight\": 0.2,\n" +
                                        "  \"ads_addend\": 0.01,\n" +
                                        "  \"inaccuracy_addend\": -0.35,\n" +
                                        "  \"recoil_modifier\": {\n" +
                                        "    \"pitch\": -0.1,\n" +
                                        "    \"yaw\": -0.1\n" +
                                        "  }\n" +
                                        "}");


                                    break;
                            case "suppressor":
                                Files.createFile(Path.of(directory + "/attachments/index/" + nameinput + ".json"));
                                Files.writeString(Path.of(directory + "/attachments/index/" + nameinput + ".json"), "{\n" +
                                        "  \"name\": \"tacz.attachment."+ nameinput +".name\",\n" +
                                        "  \"display\": \"tacz:"+ nameinput +"_display\",\n" +
                                        "  \"data\": \"" + packid + ":"+ nameinput +"_data\",\n" +
                                        "  \"type\": \"muzzle\"\n" +
                                        "}");

                                Files.createFile(Path.of(directory + "/attachments/display/" + nameinput + "_display.json"));
                                Files.writeString(Path.of(directory + "/attachments/display/" + nameinput + "_display.json"), "{\n" +
                                        "  \"slot\": \"" + packid +":attachment/slot/"+ nameinput +"\",\n" +
                                        "  \"model\": \"" + packid +":attachment/"+ nameinput +"_geo\",\n" +
                                        "  \"texture\": \""+ packid +":attachment/uv/"+ nameinput +"\",\n" +
                                        "  \"sounds\": {\n" +
                                        "    \"install\": \"tacz:attachments/attachment_general_a\",\n" +
                                        "    \"uninstall\": \"tacz:attachments/attachment_general_uninstall\"\n" +
                                        "  }\n" +
                                        "}");

                                Files.createFile(Path.of(directory + "/attachments/data/" + nameinput + "_data.json"));
                                Files.writeString(Path.of(directory + "/attachments/data/" + nameinput + "_data.json"), "{\n" +
                                        "  \"weight\": 0.5,\n" +
                                        "  \"ads_addend\": 0.05,\n" +
                                        "  \"inaccuracy_addend\": 0.1,\n" +
                                        "  \"silence\": {\n" +
                                        "\n" +
                                        "    \"distance_addend\": -24,\n" +
                                        "\n" +
                                        "    \"use_silence_sound\": true\n" +
                                        "  }\n" +
                                        "}");


                                break;
                            case "grip":
                                Files.createFile(Path.of(directory + "/attachments/index/" + nameinput + ".json"));
                                Files.writeString(Path.of(directory + "/attachments/index/" + nameinput + ".json"), "{\n" +
                                        "  \"name\": \"tacz.attachment."+ nameinput +".name\",\n" +
                                        "  \"display\": \"tacz:"+ nameinput +"_display\",\n" +
                                        "  \"data\": \"" + packid + ":"+ nameinput +"_data\",\n" +
                                        "  \"type\": \"grip\"\n" +
                                        "}");

                                Files.createFile(Path.of(directory + "/attachments/display/" + nameinput + "_display.json"));
                                Files.writeString(Path.of(directory + "/attachments/display/" + nameinput + "_display.json"), "{\n" +
                                        "  \"slot\": \"" + packid +":attachment/slot/"+ nameinput +"\",\n" +
                                        "  \"model\": \"" + packid +":attachment/"+ nameinput +"_geo\",\n" +
                                        "  \"texture\": \""+ packid +":attachment/uv/"+ nameinput +"\",\n" +
                                        "  \"sounds\": {\n" +
                                        "    \"install\": \"tacz:attachments/attachment_general_a\",\n" +
                                        "    \"uninstall\": \"tacz:attachments/attachment_general_uninstall\"\n" +
                                        "  }\n" +
                                        "}");

                                Files.createFile(Path.of(directory + "/attachments/data/" + nameinput + "_data.json"));
                                Files.writeString(Path.of(directory + "/attachments/data/" + nameinput + "_data.json"), "{\n" +
                                        "  \"weight\": 0.015,\n" +
                                        "  \"ads_addend\": 0.025,\n" +
                                        "  \"inaccuracy_addend\": -0.55,\n" +
                                        "  \"recoil_modifier\": {\n" +
                                        "    \"pitch\": -0.1,\n" +
                                        "    \"yaw\": -0.35\n" +
                                        "  }\n" +
                                        "}");


                                break;
                            case "stock":
                                Files.createFile(Path.of(directory + "/attachments/index/" + nameinput + ".json"));
                                Files.writeString(Path.of(directory + "/attachments/index/" + nameinput + ".json"), "{\n" +
                                        "  \"name\": \"tacz.attachment."+ nameinput +".name\",\n" +
                                        "  \"display\": \"tacz:"+ nameinput +"_display\",\n" +
                                        "  \"data\": \"" + packid + ":"+ nameinput +"_data\",\n" +
                                        "  \"type\": \"stock\"\n" +
                                        "}");

                                Files.createFile(Path.of(directory + "/attachments/display/" + nameinput + "_display.json"));
                                Files.writeString(Path.of(directory + "/attachments/display/" + nameinput + "_display.json"), "{\n" +
                                        "  \"slot\": \"" + packid +":attachment/slot/"+ nameinput +"\",\n" +
                                        "  \"model\": \"" + packid +":attachment/"+ nameinput +"_geo\",\n" +
                                        "  \"texture\": \""+ packid +":attachment/uv/"+ nameinput +"\",\n" +
                                        "  \"sounds\": {\n" +
                                        "    \"install\": \"tacz:attachments/attachment_general_a\",\n" +
                                        "    \"uninstall\": \"tacz:attachments/attachment_general_uninstall\"\n" +
                                        "  }\n" +
                                        "}");

                                Files.createFile(Path.of(directory + "/attachments/data/" + nameinput + "_data.json"));
                                Files.writeString(Path.of(directory + "/attachments/data/" + nameinput + "_data.json"), "{\n" +
                                        "  \"weight\": 0.15,\n" +
                                        "  \"ads_addend\": 0.02,\n" +
                                        "  \"recoil_modifier\": {\n" +
                                        "    \"pitch\": -0.05,\n" +
                                        "    \"yaw\": -0.07\n" +
                                        "  },\n" +
                                        " //optional, changes stats of melee damage with gun\n" +
                                        "  \"melee\": {\n" +
                                        "\n" +
                                        "    \"distance\": 2,\n" +
                                        "\n" +
                                        "    \"range_angle\": 40,\n" +
                                        "\n" +
                                        "    \"cooldown\": 0.1,\n" +
                                        "\n" +
                                        "    \"damage\": 3,\n" +
                                        "\n" +
                                        "    \"knockback\": 0.4,\n" +
                                        "\n" +
                                        "    \"prep\": 0.1\n" +
                                        "  }\n" +
                                        "}");


                                break;
                            case "scope":
                                Files.createFile(Path.of(directory + "/attachments/index/" + nameinput + ".json"));
                                Files.writeString(Path.of(directory + "/attachments/index/" + nameinput + ".json"), "{\n" +
                                        "  \"name\": \"tacz.attachment."+ nameinput +".name\",\n" +
                                        "  \"display\": \"tacz:"+ nameinput +"_display\",\n" +
                                        "  \"data\": \"" + packid + ":"+ nameinput +"_data\",\n" +
                                        "  \"type\": \"scope\"\n" +
                                        "}");

                                Files.createFile(Path.of(directory + "/attachments/display/" + nameinput + "_display.json"));
                                Files.writeString(Path.of(directory + "/attachments/display/" + nameinput + "_display.json"), "{\n" +
                                        "  \"slot\": \"" + packid +":attachment/slot/"+ nameinput +"\",\n" +
                                        "  \"model\": \""+ packid +":attachment/"+ nameinput +"\",\n" +
                                        "  \"texture\": \""+ packid +":attachment/uv/"+ nameinput +"\",\n" +
                                        "  \"lod\": {\n" +
                                        "    \"model\": \""+ packid +":attachment/lod/"+ nameinput +"_lod\",\n" +
                                        "    \"texture\": \""+ packid +":attachment/lod/"+ nameinput +"_lod\"\n" +
                                        "  },\n" +
                                        "  \"zoom\": [\n" +
                                        "    3\n" +
                                        "  ],\n" +
                                        "  \"scope\": true,\n" +
                                        "  \"fov\": 55.0,\n" +
                                        "  \"sounds\": {\n" +
                                        "    \"install\": \"tacz:attachments/scope_general_d\",\n" +
                                        "    \"uninstall\": \"tacz:attachments/scope_general_d\"\n" +
                                        "  }\n" +
                                        "}");

                                Files.createFile(Path.of(directory + "/attachments/data/" + nameinput + "_data.json"));
                                Files.writeString(Path.of(directory + "/attachments/data/" + nameinput + "_data.json"), "{\n" +
                                        "  \"weight\": 1.6,\n" +
                                        "  \"ads_addend\": 0.05\n" +
                                        "}");


                                break;
                            case "extended_mag":
                                Files.createFile(Path.of(directory + "/attachments/index/" + nameinput + ".json"));
                                Files.writeString(Path.of(directory + "/attachments/index/" + nameinput + ".json"), "{\n" +
                                        "  \"name\": \"tacz.attachment."+ nameinput +".name\",\n" +
                                        "  \"display\": \"tacz:"+ nameinput +"_display\",\n" +
                                        "  \"data\": \"" + packid + ":"+ nameinput +"_data\",\n" +
                                        "  \"type\": \"extended_mag\"\n" +
                                        "}");

                                Files.createFile(Path.of(directory + "/attachments/display/" + nameinput + "_display.json"));
                                Files.writeString(Path.of(directory + "/attachments/display/" + nameinput + "_display.json"), "{\n" +
                                        "  \"slot\": \"" + packid +":attachment/slot/"+ nameinput +"\",\n" +
                                        "  \"model\": \"" + packid +":attachment/"+ nameinput +"_geo\",\n" +
                                        "  \"texture\": \""+ packid +":attachment/uv/"+ nameinput +"\",\n" +
                                        "  \"sounds\": {\n" +
                                        "    \"install\": \"tacz:attachments/attachment_general_a\",\n" +
                                        "    \"uninstall\": \"tacz:attachments/attachment_general_uninstall\"\n" +
                                        "  }\n" +
                                        "}");

                                Files.createFile(Path.of(directory + "/attachments/data/" + nameinput + "_data.json"));
                                Files.writeString(Path.of(directory + "/attachments/data/" + nameinput + "_data.json"), "{\n" +
                                        "  \"weight\": 0.5,\n" +
                                        "  \"ads_addend\": 0.01,\n" +
                                        "\n" +
                                        "  \"extended_mag_level\": 1\n" +
                                        "}");


                                break;
                            default:
                                JOptionPane.showMessageDialog(null,"That is not an attachment type! (yet!)");
                                createAttachments();
                                break;
                        }
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }

}
