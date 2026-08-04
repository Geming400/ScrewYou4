package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.piglin.RememberIfHoglinWasKilled.class)
public class RememberIfHoglinWasKilled1363134621Mixin {
        @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__1826450391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1826450391L))
            info.setReturnValue(null);
    }


}
