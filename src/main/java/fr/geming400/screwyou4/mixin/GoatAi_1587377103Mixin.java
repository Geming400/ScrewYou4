package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.goat.GoatAi.class)
public class GoatAi_1587377103Mixin {
        @Inject(at = @At("HEAD"), method = "updateActivity(Lnet/minecraft/world/entity/animal/goat/Goat;)V", cancellable = true)
    private static void updateActivity__916161959(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-916161959L))
            info.cancel();
    }


}
