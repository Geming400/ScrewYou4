package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.LevelSettings.class)
public class LevelSettings_257230039Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__651396230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-651396230L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1027653563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1027653563L))
            info.setReturnValue("v\u86D8vq3,WkI)E1@4E+i\uC472,1|eIkWvY&rMJu+k(w");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_814582129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(814582129L))
            info.setReturnValue(-819931649);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/level/LevelSettings;", cancellable = true)
    private void copy_211121722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(211121722L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/serialization/Dynamic;Lnet/minecraft/world/level/WorldDataConfiguration;)Lnet/minecraft/world/level/LevelSettings;", cancellable = true)
    private static void parse__841353109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-841353109L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "levelName()Ljava/lang/String;", cancellable = true)
    private void levelName_1446612814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1446612814L))
            info.setReturnValue(";LW\"\u13BDTZ,\u65E8\uA36Aw`nL\u70F6>4JG#-iI86\u816EEf&\u661DI\uA2D1l-");
    }

    @Inject(at = @At("HEAD"), method = "gameType()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void gameType__2109473528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2109473528L))
            info.setReturnValue(net.minecraft.world.level.GameType.SPECTATOR);
    }

    @Inject(at = @At("HEAD"), method = "difficultySettings()Lnet/minecraft/world/level/LevelSettings$DifficultySettings;", cancellable = true)
    private void difficultySettings__571113589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-571113589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dataConfiguration()Lnet/minecraft/world/level/WorldDataConfiguration;", cancellable = true)
    private void dataConfiguration__752355590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-752355590L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowCommands()Z", cancellable = true)
    private void allowCommands_472207420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(472207420L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "withDataConfiguration(Lnet/minecraft/world/level/WorldDataConfiguration;)Lnet/minecraft/world/level/LevelSettings;", cancellable = true)
    private void withDataConfiguration_1930029826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1930029826L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withDifficultyLock(Z)Lnet/minecraft/world/level/LevelSettings;", cancellable = true)
    private void withDifficultyLock_507851397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(507851397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withAllowCommands(Z)Lnet/minecraft/world/level/LevelSettings;", cancellable = true)
    private void withAllowCommands__1732581340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1732581340L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withGameType(Lnet/minecraft/world/level/GameType;)Lnet/minecraft/world/level/LevelSettings;", cancellable = true)
    private void withGameType_688560388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(688560388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withDifficulty(Lnet/minecraft/world/Difficulty;)Lnet/minecraft/world/level/LevelSettings;", cancellable = true)
    private void withDifficulty_1174987057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174987057L))
            info.setReturnValue(null);
    }


}
