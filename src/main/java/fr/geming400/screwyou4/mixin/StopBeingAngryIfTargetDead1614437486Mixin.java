package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.StopBeingAngryIfTargetDead.class)
public class StopBeingAngryIfTargetDead1614437486Mixin {
        @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__1575147526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1575147526L))
            info.setReturnValue(null);
    }


}
