package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.StartAttacking.class)
public class StartAttacking1896100944Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/ai/behavior/StartAttacking$StartAttackingCondition;Lnet/minecraft/world/entity/ai/behavior/StartAttacking$TargetFinder;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__1877013164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1877013164L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/ai/behavior/StartAttacking$TargetFinder;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__1084013829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1084013829L))
            info.setReturnValue(null);
    }


}
