package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.vault.VaultBlockEntity.class)
public class VaultBlockEntity899832940Mixin {
        @Inject(at = @At("HEAD"), method = "setConfig(Lnet/minecraft/world/level/block/entity/vault/VaultConfig;)V", cancellable = true)
    private void setConfig__1246179867(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1246179867L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getConfig()Lnet/minecraft/world/level/block/entity/vault/VaultConfig;", cancellable = true)
    private void getConfig__1280254799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1280254799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag__266788608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-266788608L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__114849082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-114849082L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSharedData()Lnet/minecraft/world/level/block/entity/vault/VaultSharedData;", cancellable = true)
    private void getSharedData_944324644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(944324644L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.vault.VaultSharedData());
    }

    @Inject(at = @At("HEAD"), method = "getClientData()Lnet/minecraft/world/level/block/entity/vault/VaultClientData;", cancellable = true)
    private void getClientData_1657076222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1657076222L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getServerData()Lnet/minecraft/world/level/block/entity/vault/VaultServerData;", cancellable = true)
    private void getServerData__2082838650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2082838650L))
            info.setReturnValue(new net.minecraft.world.level.block.entity.vault.VaultServerData());
    }


}
