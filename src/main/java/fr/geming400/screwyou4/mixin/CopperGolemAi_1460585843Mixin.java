package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.golem.CopperGolemAi.class)
public class CopperGolemAi_1460585843Mixin {
        @Inject(at = @At("HEAD"), method = "updateActivity(Lnet/minecraft/world/entity/animal/golem/CopperGolem;)V", cancellable = true)
    private static void updateActivity__725978572(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-725978572L))
            info.cancel();
    }


}
