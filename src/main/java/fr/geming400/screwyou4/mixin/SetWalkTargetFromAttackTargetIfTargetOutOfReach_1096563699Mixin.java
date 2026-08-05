package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.SetWalkTargetFromAttackTargetIfTargetOutOfReach.class)
public class SetWalkTargetFromAttackTargetIfTargetOutOfReach_1096563699Mixin {
        @Inject(at = @At("HEAD"), method = "create(Ljava/util/function/Function;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__1004589574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1004589574L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(F)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_134623564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(134623564L))
            info.setReturnValue(null);
    }


}
