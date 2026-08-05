package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.ResetRaidStatus.class)
public class ResetRaidStatus1132963965Mixin {
        @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_392827653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(392827653L))
            info.setReturnValue(null);
    }


}
