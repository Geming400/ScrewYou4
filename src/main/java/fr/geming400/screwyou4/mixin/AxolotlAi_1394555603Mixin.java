package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.axolotl.AxolotlAi.class)
public class AxolotlAi_1394555603Mixin {
        @Inject(at = @At("HEAD"), method = "updateActivity(Lnet/minecraft/world/entity/animal/axolotl/Axolotl;)V", cancellable = true)
    private static void updateActivity__282310771(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-282310771L))
            info.cancel();
    }


}
