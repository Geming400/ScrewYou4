package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.skeleton.Skeleton.class)
public class Skeleton_1433334657Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1303650998(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1303650998L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFreezeConverting(Z)V", cancellable = true)
    private void setFreezeConverting_947466245(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(947466245L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFreezeConverting()Z", cancellable = true)
    private void isFreezeConverting_621864615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(621864615L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "startFreezeConversion(I)V", cancellable = true)
    private void startFreezeConversion_872415995(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(872415995L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canFreeze()Z", cancellable = true)
    private void canFreeze_983300880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(983300880L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isShaking()Z", cancellable = true)
    private void isShaking__1434047714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1434047714L))
            info.setReturnValue(true);
    }


}
