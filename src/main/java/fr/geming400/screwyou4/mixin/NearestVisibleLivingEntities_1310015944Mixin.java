package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.memory.NearestVisibleLivingEntities.class)
public class NearestVisibleLivingEntities_1310015944Mixin {
        @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void contains_1631683118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1631683118L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "contains(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void contains_1380376333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1380376333L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "empty()Lnet/minecraft/world/entity/ai/memory/NearestVisibleLivingEntities;", cancellable = true)
    private static void empty__1635566045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1635566045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "find(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;", cancellable = true)
    private void find__1476023093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1476023093L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findAll(Ljava/util/function/Predicate;)Ljava/lang/Iterable;", cancellable = true)
    private void findAll_221561120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(221561120L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findClosest(Ljava/util/function/Predicate;)Ljava/util/Optional;", cancellable = true)
    private void findClosest__1818195066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1818195066L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nearbyEntities()Ljava/util/List;", cancellable = true)
    private void nearbyEntities__1358614537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1358614537L))
            info.setReturnValue(null);
    }


}
