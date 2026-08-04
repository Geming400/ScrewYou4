package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.npc.CatSpawner.class)
public class CatSpawner_1890092968Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/server/level/ServerLevel;Z)V", cancellable = true)
    private void tick_1667274419(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1667274419L))
            info.cancel();
    }


}
