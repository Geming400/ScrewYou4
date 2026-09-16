package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.DamageResistant.class)
public class DamageResistant754650992Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__153975276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-153975276L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1525074517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1525074517L))
            info.setReturnValue("]k_I{6^X\u65B8m,`%otKuAbjQt\u5730H0MYSeH\u719A\u74BAO(C1Whi$\u6059fI2s\u2725\u5489Y+");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1312003083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1312003083L))
            info.setReturnValue(-1362278661);
    }

    @Inject(at = @At("HEAD"), method = "types()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void types_1270976317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1270976317L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isResistantTo(Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void isResistantTo_613068174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(613068174L))
            info.setReturnValue(false);
    }


}
