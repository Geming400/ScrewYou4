package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.GoToWantedItem.class)
public class GoToWantedItem2010352381Mixin {
        @Inject(at = @At("HEAD"), method = "create(Ljava/util/function/Predicate;FZI)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__1502707177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1502707177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(FZI)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__1494001080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1494001080L))
            info.setReturnValue(null);
    }


}
