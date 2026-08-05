package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EntityFluidInteraction.class)
public class EntityFluidInteraction1817428855Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/world/entity/Entity;Z)V", cancellable = true)
    private void update_741966203(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(741966203L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInFluid(Lnet/minecraft/tags/TagKey;)Z", cancellable = true)
    private void isInFluid__802793634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-802793634L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isEyeInFluid(Lnet/minecraft/tags/TagKey;)Z", cancellable = true)
    private void isEyeInFluid__802793634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-802793634L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "applyCurrentTo(Lnet/minecraft/tags/TagKey;Lnet/minecraft/world/entity/Entity;D)V", cancellable = true)
    private void applyCurrentTo_1495179925(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1495179925L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFluidHeight(Lnet/minecraft/tags/TagKey;)D", cancellable = true)
    private void getFluidHeight__802814776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-802814776L))
            info.setReturnValue(6.230698006545349E8D);
    }


}
