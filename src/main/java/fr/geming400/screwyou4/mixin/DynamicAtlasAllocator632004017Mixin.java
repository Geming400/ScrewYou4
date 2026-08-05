package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.render.DynamicAtlasAllocator.class)
public class DynamicAtlasAllocator632004017Mixin {
        @Inject(at = @At("HEAD"), method = "hasSpaceForAll(Ljava/util/Set;)Z", cancellable = true)
    private void hasSpaceForAll_558187809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(558187809L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "reclaimSpaceFor(Ljava/util/Set;)Z", cancellable = true)
    private void reclaimSpaceFor_2007508553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2007508553L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getOrAllocate(Ljava/lang/Object;Z)Lnet/minecraft/client/gui/render/DynamicAtlasAllocator$Slot;", cancellable = true)
    private void getOrAllocate_1033961923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1033961923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "usedSlotKeys()Ljava/util/Set;", cancellable = true)
    private void usedSlotKeys__1565596796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1565596796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "freeSlotCount()I", cancellable = true)
    private void freeSlotCount__1285912046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1285912046L))
            info.setReturnValue(-1804010122);
    }

    @Inject(at = @At("HEAD"), method = "endFrame()V", cancellable = true)
    private void endFrame_445720146(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(445720146L))
            info.cancel();
    }


}
