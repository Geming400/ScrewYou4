package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.breeze.BreezeAi.class)
public class BreezeAi_87094983Mixin {
        @Inject(at = @At("HEAD"), method = "updateActivity(Lnet/minecraft/world/entity/monster/breeze/Breeze;)V", cancellable = true)
    private static void updateActivity_252828041(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(252828041L))
            info.cancel();
    }


}
