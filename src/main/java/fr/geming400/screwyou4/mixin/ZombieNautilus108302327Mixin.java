package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.nautilus.ZombieNautilus.class)
public class ZombieNautilus108302327Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get__54790078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-54790078L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getVariant_1657178099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1657178099L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setVariant(Lnet/minecraft/core/Holder;)V", cancellable = true)
    private void setVariant_1654777465(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1654777465L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/nautilus/ZombieNautilus;", cancellable = true)
    private void getBreedOffspring_353071266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(353071266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1706090909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1706090909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__591916118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-591916118L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed_146580910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(146580910L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain_1701279185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701279185L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_1957034265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1957034265L))
            info.setReturnValue(null);
    }


}
