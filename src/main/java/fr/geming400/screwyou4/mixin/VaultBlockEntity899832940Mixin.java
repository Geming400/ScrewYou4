package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.vault.VaultBlockEntity.class)
public class VaultBlockEntity899832940Mixin {
        @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__1223069889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1223069889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag_321693061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(321693061L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "getServerData()Lnet/minecraft/world/level/block/entity/vault/VaultServerData;", cancellable = true)
    private void getServerData_973106249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(973106249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getClientData()Lnet/minecraft/world/level/block/entity/vault/VaultClientData;", cancellable = true)
    private void getClientData__1771045559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1771045559L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.vault.VaultClientData());
    }

    @Inject(at = @At("HEAD"), method = "getSharedData()Lnet/minecraft/world/level/block/entity/vault/VaultSharedData;", cancellable = true)
    private void getSharedData_1063637129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1063637129L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getConfig()Lnet/minecraft/world/level/block/entity/vault/VaultConfig;", cancellable = true)
    private void getConfig__1934757655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1934757655L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setConfig(Lnet/minecraft/world/level/block/entity/vault/VaultConfig;)V", cancellable = true)
    private void setConfig_400472865(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(400472865L))
            info.cancel();
    }


}
