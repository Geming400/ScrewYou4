package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.StopAttackingIfTargetInvalid.class)
public class StopAttackingIfTargetInvalid1711619497Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/ai/behavior/StopAttackingIfTargetInvalid$StopAttackCondition;Lnet/minecraft/world/entity/ai/behavior/StopAttackingIfTargetInvalid$TargetErasedCallback;Z)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_764287436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(764287436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__1477965515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1477965515L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/ai/behavior/StopAttackingIfTargetInvalid$StopAttackCondition;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__88917299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-88917299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/ai/behavior/StopAttackingIfTargetInvalid$TargetErasedCallback;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__1863376484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1863376484L))
            info.setReturnValue(null);
    }


}
