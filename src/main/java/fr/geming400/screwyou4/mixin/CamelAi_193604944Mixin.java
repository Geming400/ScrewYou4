package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.camel.CamelAi.class)
public class CamelAi_193604944Mixin {
        @Inject(at = @At("HEAD"), method = "updateActivity(Lnet/minecraft/world/entity/animal/camel/Camel;)V", cancellable = true)
    private static void updateActivity_2145814596(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2145814596L))
            info.cancel();
    }


}
