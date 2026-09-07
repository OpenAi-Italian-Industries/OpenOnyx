# OpenOnyx but... Open Source

<p align="center">
  <img src="./img/onyx-banner.png" alt="OpenOnyx reversed by the community" width="25%">
</p>

<p align="center">
  <img src="./img/deobf.jpg" alt="Deobfuscation" width="42%">
  <img src="./img/onyxclient.png" alt="OpenOnyx logo" width="31%">
</p>

## requirements

- JDK 21 or newer
- Java decompiler / bytecode tooling for regeneration
- highiq

## what is included

This repository contains the recovered OpenOnyx source tree from the supplied
JAR. The source is organized by responsibility instead of the original
obfuscated package layout:

- `openonyx.features.combat`
- `openonyx.features.movement`
- `openonyx.features.player`
- `openonyx.features.render`
- `openonyx.features.hud`
- `openonyx.history`
- `openonyx.configuration`
- `openonyx.events`
- `openonyx.utilities`

Feature and support classes have purpose-based names, including:

```text
KillAura, AntiBot, Velocity, BedBreaker, BedDefender
Scaffold, ChestStealer, InventoryManager, NameChanger
ESP, BedESP, Fullbright, NoRender, Chams, Camera
Module, ModuleManager, ModuleCategory
PacketEvent, TickEvent, WorldChangeEvent
RotationManager, Rotation, AimController, CombatController
BooleanSetting, NumberSetting, EnumSetting, MultiSelectSetting
```

The recovered `KillAura` implementation now exposes readable members such as
`combatController`, `aimController`, `targetFilters`, `autoBlockMode`,
`targetDistance`, `findTarget`, `shouldAttack`, `attackIfReady`, and
`onPacket`.

## recovery notes

- 630 original JVM classes were parsed.
- Source recovery produced 432 Java files.
- The supplied ZKM tool found no ZKM DES or long-key protection in the archive.
- Local XOR string decoder calls were resolved where their inputs and runtime
  dependencies allowed static recovery.
- The no-op obfuscation marker and its bytecode call sites were removed from the
  renamed output.

This is decompiled source, not a clean-room rewrite. Compiler metadata,
original comments, exact local names, and some control-flow structure were not
present in the input. Review the recovered code before using it as a build.

## decompilation

The original archive is kept separately from the recovered source. The source
recovery process uses CFR 0.152 with the libraries shipped under `rt/libs/`.
`tools/RenameClasses.java` performs the offline ASM class/package remap and
writes the original-to-recovered map to `mappings/classes.tsv`.

## contributing

Contributions, cleanup patches, semantic renames, and bug reports are welcome.
Open an issue or submit a pull request on Codeberg.

## legal

OpenOnyx is an independent community project and is not an official Minecraft
product. Minecraft is a trademark of Mojang Studios and Microsoft Corporation.
Third-party files and libraries retain their respective licenses.
