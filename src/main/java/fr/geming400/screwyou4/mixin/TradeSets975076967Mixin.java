package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.trading.TradeSets.class)
public class TradeSets975076967Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/data/worldgen/BootstrapContext;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/tags/TagKey;Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void register_1493008286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1493008286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/data/worldgen/BootstrapContext;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/tags/TagKey;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void register__912533557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-912533557L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void bootstrap_1335534363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1335534363L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resourceKey(Ljava/lang/String;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void resourceKey__626319991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-626319991L))
            info.setReturnValue(null);
    }


}
