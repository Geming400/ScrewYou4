package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.AcquirePoi.class)
public class AcquirePoi_1529931252Mixin {
        @Inject(at = @At("HEAD"), method = "create(Ljava/util/function/Predicate;Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;ZLjava/util/Optional;Ljava/util/function/BiPredicate;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__68583809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-68583809L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/util/function/Predicate;Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;ZLjava/util/Optional;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__66423227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-66423227L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/util/function/Predicate;Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;ZLjava/util/Optional;Ljava/util/function/BiPredicate;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__913788273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-913788273L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findPathToPois(Lnet/minecraft/world/entity/Mob;Ljava/util/Set;)Lnet/minecraft/world/level/pathfinder/Path;", cancellable = true)
    private static void findPathToPois__866418931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-866418931L))
            info.setReturnValue(null);
    }


}
