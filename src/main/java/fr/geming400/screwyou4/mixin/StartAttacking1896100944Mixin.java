package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.StartAttacking.class)
public class StartAttacking1896100944Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/ai/behavior/StartAttacking$StartAttackingCondition;Lnet/minecraft/world/entity/ai/behavior/StartAttacking$TargetFinder;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_903652816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(903652816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/ai/behavior/StartAttacking$TargetFinder;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__636919297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-636919297L))
            info.setReturnValue(null);
    }


}
