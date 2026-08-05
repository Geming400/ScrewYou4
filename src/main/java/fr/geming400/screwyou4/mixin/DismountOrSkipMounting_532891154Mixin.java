package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.DismountOrSkipMounting.class)
public class DismountOrSkipMounting_532891154Mixin {
        @Inject(at = @At("HEAD"), method = "create(ILjava/util/function/BiPredicate;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_2101937618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2101937618L))
            info.setReturnValue(null);
    }


}
