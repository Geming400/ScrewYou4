package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.fish.Salmon.class)
public class Salmon_1783177982Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get__845082082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-845082082L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/world/entity/animal/fish/Salmon$Variant;", cancellable = true)
    private void getVariant__1093550460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1093550460L))
            info.setReturnValue(net.minecraft.world.entity.animal.fish.Salmon.Variant.MEDIUM);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__1805054967(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1805054967L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1761691006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1761691006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "saveToBucketTag(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void saveToBucketTag__1335611523(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1335611523L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBucketItemStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getBucketItemStack_1987526742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1987526742L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSalmonScale()F", cancellable = true)
    private void getSalmonScale__2134070502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2134070502L))
            info.setReturnValue(1.2812E7F);
    }

    @Inject(at = @At("HEAD"), method = "getMaxSchoolSize()I", cancellable = true)
    private void getMaxSchoolSize_1655953504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1655953504L))
            info.setReturnValue(-1605386455);
    }


}
