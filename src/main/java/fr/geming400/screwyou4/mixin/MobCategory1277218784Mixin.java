package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.MobCategory.class)
public class MobCategory1277218784Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_141758313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141758313L))
            info.setReturnValue(":5xR+\uD188");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/MobCategory;", cancellable = true)
    private static void values_988692188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(988692188L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/MobCategory;", cancellable = true)
    private static void valueOf__1782047655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1782047655L))
            info.setReturnValue(net.minecraft.world.entity.MobCategory.MONSTER);
    }

    @Inject(at = @At("HEAD"), method = "isPersistent()Z", cancellable = true)
    private void isPersistent_1315497367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1315497367L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_141758313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141758313L))
            info.setReturnValue(":5xR+\uD188");
    }

    @Inject(at = @At("HEAD"), method = "getNoDespawnDistance()I", cancellable = true)
    private void getNoDespawnDistance_1315481030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1315481030L))
            info.setReturnValue(1094835656);
    }

    @Inject(at = @At("HEAD"), method = "getDespawnDistance()I", cancellable = true)
    private void getDespawnDistance_1315481030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1315481030L))
            info.setReturnValue(1094835656);
    }

    @Inject(at = @At("HEAD"), method = "getMaxInstancesPerChunk()I", cancellable = true)
    private void getMaxInstancesPerChunk_1315481030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1315481030L))
            info.setReturnValue(1094835656);
    }

    @Inject(at = @At("HEAD"), method = "getDebugAbbreviation()Ljava/lang/String;", cancellable = true)
    private void getDebugAbbreviation_141758313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141758313L))
            info.setReturnValue(":5xR+\uD188");
    }

    @Inject(at = @At("HEAD"), method = "isFriendly()Z", cancellable = true)
    private void isFriendly_1315497367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1315497367L))
            info.setReturnValue(true);
    }


}
