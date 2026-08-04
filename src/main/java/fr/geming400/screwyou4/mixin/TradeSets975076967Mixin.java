package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.trading.TradeSets.class)
public class TradeSets975076967Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/data/worldgen/BootstrapContext;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/tags/TagKey;Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void register_744094369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(744094369L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/data/worldgen/BootstrapContext;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/tags/TagKey;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private static void register__248865330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-248865330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void bootstrap__1637835063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1637835063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resourceKey(Ljava/lang/String;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void resourceKey__827918438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-827918438L))
            info.setReturnValue(null);
    }


}
