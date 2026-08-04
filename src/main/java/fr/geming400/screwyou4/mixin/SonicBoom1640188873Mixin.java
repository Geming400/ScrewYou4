package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.warden.SonicBoom.class)
public class SonicBoom1640188873Mixin {
        @Inject(at = @At("HEAD"), method = "setCooldown(Lnet/minecraft/world/entity/LivingEntity;I)V", cancellable = true)
    private static void setCooldown__1245749443(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1245749443L))
            info.cancel();
    }


}
