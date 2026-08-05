package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.vault.VaultState.class)
public class VaultState1258801901Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/entity/vault/VaultState;", cancellable = true)
    private static void values_1154525958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1154525958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/entity/vault/VaultState;", cancellable = true)
    private static void valueOf__1031284951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1031284951L))
            info.setReturnValue(net.minecraft.world.level.block.entity.vault.VaultState.EJECTING);
    }

    @Inject(at = @At("HEAD"), method = "onTransition(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/entity/vault/VaultState;Lnet/minecraft/world/level/block/entity/vault/VaultConfig;Lnet/minecraft/world/level/block/entity/vault/VaultSharedData;Z)V", cancellable = true)
    private void onTransition__2127046911(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2127046911L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_123341430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(123341430L))
            info.setReturnValue(",e嬟鬟oaS2J5<I訁$틶TK˪m`_:isM|}Qnb`-V<f&wOhS+e}=vDX=N4#⪎O뿍vi縓");
    }

    @Inject(at = @At("HEAD"), method = "lightLevel()I", cancellable = true)
    private void lightLevel_1297064147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1297064147L))
            info.setReturnValue(926914987);
    }

    @Inject(at = @At("HEAD"), method = "tickAndGetNext(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/entity/vault/VaultConfig;Lnet/minecraft/world/level/block/entity/vault/VaultServerData;Lnet/minecraft/world/level/block/entity/vault/VaultSharedData;)Lnet/minecraft/world/level/block/entity/vault/VaultState;", cancellable = true)
    private void tickAndGetNext_1320180196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1320180196L))
            info.setReturnValue(net.minecraft.world.level.block.entity.vault.VaultState.ACTIVE);
    }


}
