package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.sensing.TemptingSensor.class)
public class TemptingSensor916258438Mixin {
        @Inject(at = @At("HEAD"), method = "requires()Ljava/util/Set;", cancellable = true)
    private void requires__912777048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-912777048L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forAnimal()Lnet/minecraft/world/entity/ai/sensing/TemptingSensor;", cancellable = true)
    private static void forAnimal_1123351296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1123351296L))
            info.setReturnValue(null);
    }


}
