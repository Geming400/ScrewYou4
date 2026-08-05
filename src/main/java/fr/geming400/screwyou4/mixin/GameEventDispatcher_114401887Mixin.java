package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.GameEventDispatcher.class)
public class GameEventDispatcher_114401887Mixin {
        @Inject(at = @At("HEAD"), method = "post(Lnet/minecraft/core/Holder;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/level/gameevent/GameEvent$Context;)V", cancellable = true)
    private void post_1542268123(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1542268123L))
            info.cancel();
    }


}
