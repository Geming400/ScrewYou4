package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.TransportItemsBetweenContainers.TransportItemState.class)
public class TransportItemState_2068007258Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/ai/behavior/TransportItemsBetweenContainers$TransportItemState;", cancellable = true)
    private static void values_805285429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(805285429L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/ai/behavior/TransportItemsBetweenContainers$TransportItemState;", cancellable = true)
    private static void valueOf__795995752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-795995752L))
            info.setReturnValue(null);
    }


}
