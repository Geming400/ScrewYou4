package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.alias.PoolAliasBindings.class)
public class PoolAliasBindings279910292Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void bootstrap_874499462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(874499462L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerTargetsAsPools(Lnet/minecraft/data/worldgen/BootstrapContext;Lnet/minecraft/core/Holder;Ljava/util/List;)V", cancellable = true)
    private static void registerTargetsAsPools__47129071(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-47129071L))
            info.cancel();
    }


}
