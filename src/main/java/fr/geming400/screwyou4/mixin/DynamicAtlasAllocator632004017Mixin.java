package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.render.DynamicAtlasAllocator.class)
public class DynamicAtlasAllocator632004017Mixin {
        @Inject(at = @At("HEAD"), method = "endFrame()V", cancellable = true)
    private void endFrame_670278756(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(670278756L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "freeSlotCount()I", cancellable = true)
    private void freeSlotCount_670266263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(670266263L))
            info.setReturnValue(1976153837);
    }

    @Inject(at = @At("HEAD"), method = "getOrAllocate(Ljava/lang/Object;Z)Lnet/minecraft/client/gui/render/DynamicAtlasAllocator$Slot;", cancellable = true)
    private void getOrAllocate__1524203591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1524203591L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "usedSlotKeys()Ljava/util/Set;", cancellable = true)
    private void usedSlotKeys__1197031469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1197031469L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reclaimSpaceFor(Ljava/util/Set;)Z", cancellable = true)
    private void reclaimSpaceFor_87927133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(87927133L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasSpaceForAll(Ljava/util/Set;)Z", cancellable = true)
    private void hasSpaceForAll_87927133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(87927133L))
            info.setReturnValue(true);
    }


}
