package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.armadillo.ArmadilloAi.class)
public class ArmadilloAi1400019583Mixin {
        @Inject(at = @At("HEAD"), method = "updateActivity(Lnet/minecraft/world/entity/animal/armadillo/Armadillo;)V", cancellable = true)
    private static void updateActivity__1031156714(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1031156714L))
            info.cancel();
    }


}
