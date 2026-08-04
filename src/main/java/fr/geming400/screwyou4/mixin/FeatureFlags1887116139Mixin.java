package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.flag.FeatureFlags.class)
public class FeatureFlags1887116139Mixin {
        @Inject(at = @At("HEAD"), method = "isExperimental(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private static void isExperimental_457347007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(457347007L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "printMissingFlags(Lnet/minecraft/world/flag/FeatureFlagRegistry;Lnet/minecraft/world/flag/FeatureFlagSet;Lnet/minecraft/world/flag/FeatureFlagSet;)Ljava/lang/String;", cancellable = true)
    private static void printMissingFlags__391087030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-391087030L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "printMissingFlags(Lnet/minecraft/world/flag/FeatureFlagSet;Lnet/minecraft/world/flag/FeatureFlagSet;)Ljava/lang/String;", cancellable = true)
    private static void printMissingFlags_1873310284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1873310284L))
            info.setReturnValue(null);
    }


}
