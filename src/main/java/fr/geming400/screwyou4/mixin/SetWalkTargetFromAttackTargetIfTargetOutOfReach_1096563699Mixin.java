package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.SetWalkTargetFromAttackTargetIfTargetOutOfReach.class)
public class SetWalkTargetFromAttackTargetIfTargetOutOfReach_1096563699Mixin {
        @Inject(at = @At("HEAD"), method = "create(Ljava/util/function/Function;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__2049369226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2049369226L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(F)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_1511125192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1511125192L))
            info.setReturnValue(null);
    }


}
