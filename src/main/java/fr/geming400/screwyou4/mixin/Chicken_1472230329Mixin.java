package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.chicken.Chicken.class)
public class Chicken_1472230329Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_1309137923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1309137923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getVariant__1273861196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1273861196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setVariant(Lnet/minecraft/core/Holder;)V", cancellable = true)
    private void setVariant__1276261830(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1276261830L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/chicken/Chicken;", cancellable = true)
    private void getBreedOffspring_952073309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(952073309L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__1224948386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1224948386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway__1613433757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1613433757L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_772011883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(772011883L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_1510505067(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1510505067L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_229584284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(229584284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__974005030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-974005030L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood__1088201836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1088201836L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isChickenJockey()Z", cancellable = true)
    private void isChickenJockey_1510508911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1510508911L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setChickenJockey(Z)V", cancellable = true)
    private void setChickenJockey__1593120139(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1593120139L))
            info.cancel();
    }


}
