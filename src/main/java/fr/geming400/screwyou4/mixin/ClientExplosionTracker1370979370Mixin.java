package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ClientExplosionTracker.class)
public class ClientExplosionTracker1370979370Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/client/multiplayer/ClientLevel;)V", cancellable = true)
    private void tick__1042508581(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1042508581L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "track(Lnet/minecraft/world/phys/Vec3;FILnet/minecraft/util/random/WeightedList;)V", cancellable = true)
    private void track_1359294366(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1359294366L))
            info.cancel();
    }


}
