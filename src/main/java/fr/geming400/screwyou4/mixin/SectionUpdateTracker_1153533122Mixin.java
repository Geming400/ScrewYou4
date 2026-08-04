package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.SectionUpdateTracker.class)
public class SectionUpdateTracker_1153533122Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1191795367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1191795367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasAllNeighbors(Lnet/minecraft/client/multiplayer/ClientLevel;J)Z", cancellable = true)
    private void hasAllNeighbors_982586135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(982586135L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "repositionCamera(Lnet/minecraft/core/SectionPos;)V", cancellable = true)
    private void repositionCamera_64739744(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(64739744L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDirtyState(J)Lnet/minecraft/client/SectionUpdateTracker$SectionDirtyState;", cancellable = true)
    private void getDirtyState_1164714597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1164714597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDirty(IIIZ)V", cancellable = true)
    private void setDirty__1511395003(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1511395003L))
            info.cancel();
    }


}
