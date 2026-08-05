package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.skeleton.Skeleton.class)
public class Skeleton_1433334657Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1471609395(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1471609395L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isShaking()Z", cancellable = true)
    private void isShaking_1471613239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1471613239L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canFreeze()Z", cancellable = true)
    private void canFreeze_1471613239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1471613239L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isFreezeConverting()Z", cancellable = true)
    private void isFreezeConverting_1471613239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1471613239L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "startFreezeConversion(I)V", cancellable = true)
    private void startFreezeConversion__1647715668(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1647715668L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFreezeConverting(Z)V", cancellable = true)
    private void setFreezeConverting__1632015811(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1632015811L))
            info.cancel();
    }


}
