package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.cow.Cow.class)
public class Cow_249635363Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_86542957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(86542957L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getVariant_1798511134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1798511134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setVariant(Lnet/minecraft/core/Holder;)V", cancellable = true)
    private void setVariant_1796110500(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1796110500L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__993010682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-993010682L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_2098367300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2098367300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/cow/Cow;", cancellable = true)
    private void getBreedOffspring_860566171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(860566171L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1847423944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1847423944L))
            info.setReturnValue(null);
    }


}
