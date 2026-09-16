package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.DebugQueryHandler.class)
public class DebugQueryHandler_1092139385Mixin {
        @Inject(at = @At("HEAD"), method = "queryEntityTag(ILjava/util/function/Consumer;)V", cancellable = true)
    private void queryEntityTag_1307929805(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1307929805L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "queryBlockEntityTag(Lnet/minecraft/core/BlockPos;Ljava/util/function/Consumer;)V", cancellable = true)
    private void queryBlockEntityTag__1033363281(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1033363281L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleResponse(ILnet/minecraft/nbt/CompoundTag;)Z", cancellable = true)
    private void handleResponse_1333015480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1333015480L))
            info.setReturnValue(true);
    }


}
