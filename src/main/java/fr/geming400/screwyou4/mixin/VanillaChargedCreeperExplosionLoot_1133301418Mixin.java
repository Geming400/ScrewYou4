package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.VanillaChargedCreeperExplosionLoot.class)
public class VanillaChargedCreeperExplosionLoot_1133301418Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1776153620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1776153620L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2158558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2158558L))
            info.setReturnValue("l<FOfM5z 7*BVE\uA4E9\"+n\uAA47");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1171564159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1171564159L))
            info.setReturnValue(743877243);
    }

    @Inject(at = @At("HEAD"), method = "generate(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void generate__604849473(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-604849473L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registries()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void registries_820094084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(820094084L))
            info.setReturnValue(null);
    }


}
