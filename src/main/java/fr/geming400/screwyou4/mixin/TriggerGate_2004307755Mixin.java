package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.TriggerGate.class)
public class TriggerGate_2004307755Mixin {
        @Inject(at = @At("HEAD"), method = "triggerGate(Ljava/util/List;Lnet/minecraft/world/entity/ai/behavior/GateBehavior$OrderPolicy;Lnet/minecraft/world/entity/ai/behavior/GateBehavior$RunningPolicy;)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void triggerGate_1612852033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1612852033L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerOneShuffled(Ljava/util/List;)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void triggerOneShuffled__1250834960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1250834960L))
            info.setReturnValue(null);
    }


}
