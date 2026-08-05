package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.creaking.CreakingAi.class)
public class CreakingAi_1090010446Mixin {
        @Inject(at = @At("HEAD"), method = "updateActivity(Lnet/minecraft/world/entity/monster/creaking/Creaking;)V", cancellable = true)
    private static void updateActivity__333351120(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-333351120L))
            info.cancel();
    }


}
