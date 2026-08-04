package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.features.FeatureUtils.class)
public class FeatureUtils_1641642285Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/data/worldgen/BootstrapContext;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/level/levelgen/feature/Feature;)V", cancellable = true)
    private static void register__1390027066(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1390027066L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/data/worldgen/BootstrapContext;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/level/levelgen/feature/Feature;Lnet/minecraft/world/level/levelgen/feature/configurations/FeatureConfiguration;)V", cancellable = true)
    private static void register__335140509(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-335140509L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap_449123781(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(449123781L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createKey(Ljava/lang/String;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void createKey__161353121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-161353121L))
            info.setReturnValue(null);
    }


}
