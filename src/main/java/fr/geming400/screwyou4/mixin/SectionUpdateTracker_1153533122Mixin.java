package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.SectionUpdateTracker.class)
public class SectionUpdateTracker_1153533122Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1597264710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1597264710L))
            info.setReturnValue(1393895753);
    }

    @Inject(at = @At("HEAD"), method = "setDirty(IIIZ)V", cancellable = true)
    private void setDirty__968118603(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-968118603L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasAllNeighbors(Lnet/minecraft/client/multiplayer/ClientLevel;J)Z", cancellable = true)
    private void hasAllNeighbors__2128766735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2128766735L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "repositionCamera(Lnet/minecraft/core/SectionPos;)V", cancellable = true)
    private void repositionCamera__1549755455(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1549755455L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDirtyState(J)Lnet/minecraft/client/SectionUpdateTracker$SectionDirtyState;", cancellable = true)
    private void getDirtyState_561698042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(561698042L))
            info.setReturnValue(null);
    }


}
