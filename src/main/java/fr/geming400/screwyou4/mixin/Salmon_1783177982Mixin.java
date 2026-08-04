package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.fish.Salmon.class)
public class Salmon_1783177982Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_1620085576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1620085576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/world/entity/animal/fish/Salmon$Variant;", cancellable = true)
    private void getVariant_158320691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(158320691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__866039871(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-866039871L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__663057377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-663057377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSalmonScale()F", cancellable = true)
    private void getSalmonScale_1821437344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1821437344L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxSchoolSize()I", cancellable = true)
    private void getMaxSchoolSize_1821440227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1821440227L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "saveToBucketTag(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void saveToBucketTag__777258027(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-777258027L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBucketItemStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getBucketItemStack__1988370655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1988370655L))
            info.setReturnValue(null);
    }


}
