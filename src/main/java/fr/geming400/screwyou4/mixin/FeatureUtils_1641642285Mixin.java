package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.features.FeatureUtils.class)
public class FeatureUtils_1641642285Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/data/worldgen/BootstrapContext;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/level/levelgen/feature/Feature;)V", cancellable = true)
    private static void register__1902837527(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1902837527L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/data/worldgen/BootstrapContext;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/level/levelgen/feature/Feature;Lnet/minecraft/world/level/levelgen/feature/configurations/FeatureConfiguration;)V", cancellable = true)
    private static void register__445117050(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-445117050L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap_1087036567(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1087036567L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createKey(Ljava/lang/String;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void createKey__579606340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-579606340L))
            info.setReturnValue(null);
    }


}
