package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.StopAttackingIfTargetInvalid.class)
public class StopAttackingIfTargetInvalid1711619497Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/ai/behavior/StopAttackingIfTargetInvalid$StopAttackCondition;Lnet/minecraft/world/entity/ai/behavior/StopAttackingIfTargetInvalid$TargetErasedCallback;Z)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__271207736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-271207736L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_971483185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(971483185L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/ai/behavior/StopAttackingIfTargetInvalid$StopAttackCondition;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__2048323759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2048323759L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/ai/behavior/StopAttackingIfTargetInvalid$TargetErasedCallback;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_1819532696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1819532696L))
            info.setReturnValue(null);
    }


}
