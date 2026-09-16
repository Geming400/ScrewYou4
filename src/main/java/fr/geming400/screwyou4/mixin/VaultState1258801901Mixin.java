package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.vault.VaultState.class)
public class VaultState1258801901Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/entity/vault/VaultState;", cancellable = true)
    private static void values_1042356392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042356392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/entity/vault/VaultState;", cancellable = true)
    private static void valueOf__1758241023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1758241023L))
            info.setReturnValue(net.minecraft.world.level.block.entity.vault.VaultState.UNLOCKING);
    }

    @Inject(at = @At("HEAD"), method = "onTransition(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/entity/vault/VaultState;Lnet/minecraft/world/level/block/entity/vault/VaultConfig;Lnet/minecraft/world/level/block/entity/vault/VaultSharedData;Z)V", cancellable = true)
    private void onTransition_1702595989(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1702595989L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "lightLevel()I", cancellable = true)
    private void lightLevel__434846331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-434846331L))
            info.setReturnValue(1019081253);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1347010523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1347010523L))
            info.setReturnValue("Mpw{");
    }

    @Inject(at = @At("HEAD"), method = "tickAndGetNext(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/entity/vault/VaultConfig;Lnet/minecraft/world/level/block/entity/vault/VaultServerData;Lnet/minecraft/world/level/block/entity/vault/VaultSharedData;)Lnet/minecraft/world/level/block/entity/vault/VaultState;", cancellable = true)
    private void tickAndGetNext_1240018931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1240018931L))
            info.setReturnValue(net.minecraft.world.level.block.entity.vault.VaultState.INACTIVE);
    }


}
