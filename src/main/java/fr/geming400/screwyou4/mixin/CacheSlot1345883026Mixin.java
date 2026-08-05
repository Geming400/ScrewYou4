package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.CacheSlot.class)
public class CacheSlot1345883026Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_560055320(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(560055320L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "compute(Lnet/minecraft/client/multiplayer/CacheSlot$Cleaner;)Ljava/lang/Object;", cancellable = true)
    private void compute__1293812382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1293812382L))
            info.setReturnValue(new java.lang.Object());
    }


}
