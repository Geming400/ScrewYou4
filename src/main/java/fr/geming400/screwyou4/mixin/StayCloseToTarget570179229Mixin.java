package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.StayCloseToTarget.class)
public class StayCloseToTarget570179229Mixin {
        @Inject(at = @At("HEAD"), method = "create(Ljava/util/function/Function;Ljava/util/function/Predicate;IIF)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__1270836118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1270836118L))
            info.setReturnValue(null);
    }


}
