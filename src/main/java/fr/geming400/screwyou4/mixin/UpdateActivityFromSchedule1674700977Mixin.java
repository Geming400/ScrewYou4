package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.UpdateActivityFromSchedule.class)
public class UpdateActivityFromSchedule1674700977Mixin {
        @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_934564665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(934564665L))
            info.setReturnValue(null);
    }


}
