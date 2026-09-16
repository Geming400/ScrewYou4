package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.shapes.SubShape.class)
public class SubShape1417745407Mixin {
        @Inject(at = @At("HEAD"), method = "fill(III)V", cancellable = true)
    private void fill__462318962(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-462318962L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFull(III)Z", cancellable = true)
    private void isFull__1312230168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1312230168L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "lastFull(Lnet/minecraft/core/Direction$Axis;)I", cancellable = true)
    private void lastFull_1714203423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1714203423L))
            info.setReturnValue(-478103167);
    }

    @Inject(at = @At("HEAD"), method = "firstFull(Lnet/minecraft/core/Direction$Axis;)I", cancellable = true)
    private void firstFull_1455205433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1455205433L))
            info.setReturnValue(-564489381);
    }


}
