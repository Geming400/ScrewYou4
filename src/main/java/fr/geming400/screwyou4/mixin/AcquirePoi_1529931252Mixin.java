package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.AcquirePoi.class)
public class AcquirePoi_1529931252Mixin {
        @Inject(at = @At("HEAD"), method = "create(Ljava/util/function/Predicate;Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;ZLjava/util/Optional;Ljava/util/function/BiPredicate;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_1795907331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1795907331L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/util/function/Predicate;Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;ZLjava/util/Optional;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__873481663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-873481663L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/util/function/Predicate;Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;ZLjava/util/Optional;Ljava/util/function/BiPredicate;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_469698187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(469698187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findPathToPois(Lnet/minecraft/world/entity/Mob;Ljava/util/Set;)Lnet/minecraft/world/level/pathfinder/Path;", cancellable = true)
    private static void findPathToPois__2082280657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2082280657L))
            info.setReturnValue(null);
    }


}
