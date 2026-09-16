package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.VanillaShearingLoot.class)
public class VanillaShearingLoot379708646Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__528917622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-528917622L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1150132171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1150132171L))
            info.setReturnValue(" J?\u728A[gc^dDixb\uFD13dD\u9C1A\"jRX&%#-A\uFAB3u$1b&^2xF\u72D4|z0v1/?J`\u7CF0\u214Cng9D\uD0673\u50C7\u8C5A8]\uBBDBr");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_937060737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(937060737L))
            info.setReturnValue(1936066053);
    }

    @Inject(at = @At("HEAD"), method = "generate(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void generate_117247985(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(117247985L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registries()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void registries_2108950812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2108950812L))
            info.setReturnValue(null);
    }


}
