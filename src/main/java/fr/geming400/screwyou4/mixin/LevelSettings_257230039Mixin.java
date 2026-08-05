package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.LevelSettings.class)
public class LevelSettings_257230039Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1642742297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1642742297L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__878229937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-878229937L))
            info.setReturnValue("<F0JVc4cMY]xr3\u2F98\uC60A4\uCBEBCj`X>_[J`@p\u22530I;\u09F1dA[Q8\u1F01y8\uBAD109f?Cbr-F''S7TMRKrPF)8T,G*Uo!J");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_295492780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(295492780L))
            info.setReturnValue(-46905930);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/level/LevelSettings;", cancellable = true)
    private void copy_479202191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(479202191L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/serialization/Dynamic;Lnet/minecraft/world/level/WorldDataConfiguration;)Lnet/minecraft/world/level/LevelSettings;", cancellable = true)
    private static void parse__808022850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-808022850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "levelName()Ljava/lang/String;", cancellable = true)
    private void levelName__878230433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-878230433L))
            info.setReturnValue("U-_Y^\uA061ey@I%\u9B90*%iE*D-x<4 \uA584s\u4710XN n\u1213^v2wDG2hN\uC4890KpD\u0817K?\u027F*\u1BC6J$F42-y*i4yP5Q[O)}t.#eYVx8^`wPW!opf");
    }

    @Inject(at = @At("HEAD"), method = "gameType()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void gameType__1138216260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1138216260L))
            info.setReturnValue(net.minecraft.world.level.GameType.SPECTATOR);
    }

    @Inject(at = @At("HEAD"), method = "withDifficultyLock(Z)Lnet/minecraft/world/level/LevelSettings;", cancellable = true)
    private void withDifficultyLock_1252272537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1252272537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withAllowCommands(Z)Lnet/minecraft/world/level/LevelSettings;", cancellable = true)
    private void withAllowCommands_1252272537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1252272537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withGameType(Lnet/minecraft/world/level/GameType;)Lnet/minecraft/world/level/LevelSettings;", cancellable = true)
    private void withGameType__1188023306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1188023306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withDifficulty(Lnet/minecraft/world/Difficulty;)Lnet/minecraft/world/level/LevelSettings;", cancellable = true)
    private void withDifficulty__1136066382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1136066382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withDataConfiguration(Lnet/minecraft/world/level/WorldDataConfiguration;)Lnet/minecraft/world/level/LevelSettings;", cancellable = true)
    private void withDataConfiguration_116543752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(116543752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowCommands()Z", cancellable = true)
    private void allowCommands_295508621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(295508621L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "difficultySettings()Lnet/minecraft/world/level/LevelSettings$DifficultySettings;", cancellable = true)
    private void difficultySettings_1759330957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1759330957L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dataConfiguration()Lnet/minecraft/world/level/WorldDataConfiguration;", cancellable = true)
    private void dataConfiguration_1174455950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174455950L))
            info.setReturnValue(null);
    }


}
