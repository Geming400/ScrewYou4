package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.shapes.SubShape.class)
public class SubShape1417745407Mixin {
        @Inject(at = @At("HEAD"), method = "fill(III)V", cancellable = true)
    private void fill_637653003(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(637653003L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFull(III)Z", cancellable = true)
    private void isFull_637656847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(637656847L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "lastFull(Lnet/minecraft/core/Direction$Axis;)I", cancellable = true)
    private void lastFull__1710610982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1710610982L))
            info.setReturnValue(1413403655);
    }

    @Inject(at = @At("HEAD"), method = "firstFull(Lnet/minecraft/core/Direction$Axis;)I", cancellable = true)
    private void firstFull__1710610982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1710610982L))
            info.setReturnValue(1413403655);
    }


}
