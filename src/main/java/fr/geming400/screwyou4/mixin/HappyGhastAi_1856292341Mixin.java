package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.happyghast.HappyGhastAi.class)
public class HappyGhastAi_1856292341Mixin {
        @Inject(at = @At("HEAD"), method = "updateActivity(Lnet/minecraft/world/entity/animal/happyghast/HappyGhast;)V", cancellable = true)
    private static void updateActivity__2026268073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2026268073L))
            info.cancel();
    }


}
