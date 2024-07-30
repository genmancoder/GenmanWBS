/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.genman.wbs.settings;


/**
 * Holds default settings values which may
 * get overwritten by SettingsLoader.
 */
public class Settings {
    public static boolean connectionTimeOutEnable = false;
    public static int connectionTimeOut = 10000;

    public static boolean connectionReadTimeOutEnable = false;
    public static int connectionReadTimeOut = 30000;

    public static String theme = "genman";
    public static String syntaxTheme = "Moondust";
    public static int showHistoryRange = 7;

    public static boolean editorWrapText = true;

    public static String fetchSource = "SQLite";
}