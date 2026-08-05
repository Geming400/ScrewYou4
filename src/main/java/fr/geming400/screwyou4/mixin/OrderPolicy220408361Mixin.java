package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.GateBehavior.OrderPolicy.class)
public class OrderPolicy220408361Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/ai/behavior/GateBehavior$OrderPolicy;", cancellable = true)
    private static void values__623085436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-623085436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/ai/behavior/GateBehavior$OrderPolicy;", cancellable = true)
    private static void valueOf_1142117853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1142117853L))
            info.setReturnValue(net.minecraft.world.entity.ai.behavior.GateBehavior.OrderPolicy.ORDERED);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/entity/ai/behavior/ShufflingList;)V", cancellable = true)
    private void apply_1449828378(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1449828378L))
            info.cancel();
    }


}
