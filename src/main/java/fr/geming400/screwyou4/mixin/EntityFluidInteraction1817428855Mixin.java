package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EntityFluidInteraction.class)
public class EntityFluidInteraction1817428855Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/world/entity/Entity;Z)V", cancellable = true)
    private void update_273612498(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(273612498L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFluidHeight(Lnet/minecraft/tags/TagKey;)D", cancellable = true)
    private void getFluidHeight_561895203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(561895203L))
            info.setReturnValue(7.577927008722436E8D);
    }

    @Inject(at = @At("HEAD"), method = "isEyeInFluid(Lnet/minecraft/tags/TagKey;)Z", cancellable = true)
    private void isEyeInFluid_1560276060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1560276060L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "applyCurrentTo(Lnet/minecraft/tags/TagKey;Lnet/minecraft/world/entity/Entity;D)V", cancellable = true)
    private void applyCurrentTo_618653083(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(618653083L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInFluid(Lnet/minecraft/tags/TagKey;)Z", cancellable = true)
    private void isInFluid_1761418873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1761418873L))
            info.setReturnValue(false);
    }


}
