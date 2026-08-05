package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.LoadingChunkTracker.class)
public class LoadingChunkTracker467752345Mixin {
        @Inject(at = @At("HEAD"), method = "runDistanceUpdates(I)I", cancellable = true)
    private void runDistanceUpdates__1295822462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1295822462L))
            info.setReturnValue(-935050086);
    }


}
