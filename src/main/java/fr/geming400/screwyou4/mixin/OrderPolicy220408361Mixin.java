package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.GateBehavior.OrderPolicy.class)
public class OrderPolicy220408361Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/ai/behavior/GateBehavior$OrderPolicy;", cancellable = true)
    private static void values_989514978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(989514978L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/ai/behavior/GateBehavior$OrderPolicy;", cancellable = true)
    private static void valueOf_438380037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(438380037L))
            info.setReturnValue(net.minecraft.world.entity.ai.behavior.GateBehavior.OrderPolicy.SHUFFLED);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/entity/ai/behavior/ShufflingList;)V", cancellable = true)
    private void apply__2010996664(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2010996664L))
            info.cancel();
    }


}
