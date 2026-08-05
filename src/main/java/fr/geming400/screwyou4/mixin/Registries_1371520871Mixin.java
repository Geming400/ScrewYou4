package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.registries.Registries.class)
public class Registries_1371520871Mixin {
        @Inject(at = @At("HEAD"), method = "componentsDirPath(Lnet/minecraft/resources/ResourceKey;)Ljava/lang/String;", cancellable = true)
    private static void componentsDirPath__1040350237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1040350237L))
            info.setReturnValue("'Ihk᪨|Rw]RL쏸4m");
    }

    @Inject(at = @At("HEAD"), method = "levelToLevelStem(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void levelToLevelStem__1943602157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1943602157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "levelStemToLevel(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void levelStemToLevel__1943602157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1943602157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "elementsDirPath(Lnet/minecraft/resources/ResourceKey;)Ljava/lang/String;", cancellable = true)
    private static void elementsDirPath__1040350237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1040350237L))
            info.setReturnValue("'Ihk᪨|Rw]RL쏸4m");
    }

    @Inject(at = @At("HEAD"), method = "tagsDirPath(Lnet/minecraft/resources/ResourceKey;)Ljava/lang/String;", cancellable = true)
    private static void tagsDirPath__1040350237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1040350237L))
            info.setReturnValue("'Ihk᪨|Rw]RL쏸4m");
    }


}
