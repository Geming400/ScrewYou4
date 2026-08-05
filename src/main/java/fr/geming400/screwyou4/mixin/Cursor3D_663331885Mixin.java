package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.Cursor3D.class)
public class Cursor3D_663331885Mixin {
        @Inject(at = @At("HEAD"), method = "advance()Z", cancellable = true)
    private void advance_701610467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(701610467L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getNextType()I", cancellable = true)
    private void getNextType_701594130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(701594130L))
            info.setReturnValue(-417439559);
    }

    @Inject(at = @At("HEAD"), method = "nextX()I", cancellable = true)
    private void nextX_701594130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(701594130L))
            info.setReturnValue(-417439559);
    }

    @Inject(at = @At("HEAD"), method = "nextY()I", cancellable = true)
    private void nextY_701594130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(701594130L))
            info.setReturnValue(-417439559);
    }

    @Inject(at = @At("HEAD"), method = "nextZ()I", cancellable = true)
    private void nextZ_701594130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(701594130L))
            info.setReturnValue(-417439559);
    }


}
