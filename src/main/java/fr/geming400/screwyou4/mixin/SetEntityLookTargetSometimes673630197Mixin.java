package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.SetEntityLookTargetSometimes.class)
public class SetEntityLookTargetSometimes673630197Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/EntityType;FLnet/minecraft/util/valueproviders/UniformInt;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_1424586811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1424586811L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(FLnet/minecraft/util/valueproviders/UniformInt;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__11595332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-11595332L))
            info.setReturnValue(null);
    }


}
