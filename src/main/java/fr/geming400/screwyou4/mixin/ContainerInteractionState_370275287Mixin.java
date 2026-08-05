package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.TransportItemsBetweenContainers.ContainerInteractionState.class)
public class ContainerInteractionState_370275287Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/ai/behavior/TransportItemsBetweenContainers$ContainerInteractionState;", cancellable = true)
    private static void values__1582587643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1582587643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/ai/behavior/TransportItemsBetweenContainers$ContainerInteractionState;", cancellable = true)
    private static void valueOf_1670353612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1670353612L))
            info.setReturnValue(net.minecraft.world.entity.ai.behavior.TransportItemsBetweenContainers.ContainerInteractionState.PICKUP_NO_ITEM);
    }


}
