package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket.class)
public class ClientboundBlockEntityDataPacket1087194481Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__591830607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-591830607L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/block/entity/BlockEntityType;", cancellable = true)
    private void getType_2060936995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2060936995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/block/entity/BlockEntity;Ljava/util/function/BiFunction;)Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private static void create_1240505433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1240505433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/block/entity/BlockEntity;)Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private static void create_259066752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(259066752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1284702015(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1284702015L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1765263394(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1765263394L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTag()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getTag__483028439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-483028439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos__806192398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-806192398L))
            info.setReturnValue(null);
    }


}
