package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.cow.Cow.class)
public class Cow_249635363Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_1916342595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1916342595L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getVariant_2078475247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2078475247L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setVariant(Lnet/minecraft/core/Holder;)V", cancellable = true)
    private void setVariant__921024921(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-921024921L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_1244846654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1244846654L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_389519462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(389519462L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/cow/Cow;", cancellable = true)
    private void getBreedOffspring__1016735687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1016735687L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_999733671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(999733671L))
            info.setReturnValue(null);
    }


}
