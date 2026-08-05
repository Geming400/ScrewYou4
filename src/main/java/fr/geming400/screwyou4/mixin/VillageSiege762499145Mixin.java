package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.village.VillageSiege.class)
public class VillageSiege762499145Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/server/level/ServerLevel;Z)V", cancellable = true)
    private void tick__471538126(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-471538126L))
            info.cancel();
    }


}
