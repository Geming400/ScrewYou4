package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.InteractWith.class)
public class InteractWith_697707052Mixin {
        @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/entity/EntityType;ILjava/util/function/Predicate;Ljava/util/function/Predicate;Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;FI)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void of_2106163518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2106163518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/entity/EntityType;ILnet/minecraft/world/entity/ai/memory/MemoryModuleType;FI)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void of__2034389664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2034389664L))
            info.setReturnValue(null);
    }


}
