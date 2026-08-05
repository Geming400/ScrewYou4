package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.TransportItemsBetweenContainers.ContainerInteractionState.class)
public class ContainerInteractionState_370275287Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/ai/behavior/TransportItemsBetweenContainers$ContainerInteractionState;", cancellable = true)
    private static void values_458346599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(458346599L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/ai/behavior/TransportItemsBetweenContainers$ContainerInteractionState;", cancellable = true)
    private static void valueOf__1619892316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1619892316L))
            info.setReturnValue(net.minecraft.world.entity.ai.behavior.TransportItemsBetweenContainers.ContainerInteractionState.PICKUP_NO_ITEM);
    }


}
