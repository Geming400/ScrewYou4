package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.hoglin.HoglinAi.class)
public class HoglinAi_465364733Mixin {
        @Inject(at = @At("HEAD"), method = "getSoundForCurrentActivity(Lnet/minecraft/world/entity/monster/hoglin/Hoglin;)Ljava/util/Optional;", cancellable = true)
    private static void getSoundForCurrentActivity_1789398482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1789398482L))
            info.setReturnValue(null);
    }


}
