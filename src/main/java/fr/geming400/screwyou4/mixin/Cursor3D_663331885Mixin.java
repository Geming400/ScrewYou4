package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.Cursor3D.class)
public class Cursor3D_663331885Mixin {
        @Inject(at = @At("HEAD"), method = "advance()Z", cancellable = true)
    private void advance__916254047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-916254047L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "nextY()I", cancellable = true)
    private void nextY__501280244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-501280244L))
            info.setReturnValue(2047566374);
    }

    @Inject(at = @At("HEAD"), method = "nextX()I", cancellable = true)
    private void nextX__529909395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-529909395L))
            info.setReturnValue(-344508142);
    }

    @Inject(at = @At("HEAD"), method = "nextZ()I", cancellable = true)
    private void nextZ__472651093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-472651093L))
            info.setReturnValue(1487539494);
    }

    @Inject(at = @At("HEAD"), method = "getNextType()I", cancellable = true)
    private void getNextType_2047168943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2047168943L))
            info.setReturnValue(-2060407105);
    }


}
