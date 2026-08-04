package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.CacheSlot.class)
public class CacheSlot1345883026Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1384157765(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1384157765L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "compute(Lnet/minecraft/client/multiplayer/CacheSlot$Cleaner;)Ljava/lang/Object;", cancellable = true)
    private void compute__170310165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-170310165L))
            info.setReturnValue(null);
    }


}
