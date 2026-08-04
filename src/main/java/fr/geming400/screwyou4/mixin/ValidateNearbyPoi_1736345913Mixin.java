package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.ValidateNearbyPoi.class)
public class ValidateNearbyPoi_1736345913Mixin {
        @Inject(at = @At("HEAD"), method = "create(Ljava/util/function/Predicate;Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_2080812101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2080812101L))
            info.setReturnValue(null);
    }


}
