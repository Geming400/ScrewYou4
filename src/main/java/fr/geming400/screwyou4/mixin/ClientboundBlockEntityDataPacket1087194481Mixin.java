package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket.class)
public class ClientboundBlockEntityDataPacket1087194481Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1243062071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1243062071L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/block/entity/BlockEntityType;", cancellable = true)
    private void getType_127350483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(127350483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/block/entity/BlockEntity;Ljava/util/function/BiFunction;)Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private static void create__279204643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-279204643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/block/entity/BlockEntity;)Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private static void create_1653013372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1653013372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__504283113(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-504283113L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_791482618(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(791482618L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTag()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getTag_302589765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(302589765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos_1576760212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1576760212L))
            info.setReturnValue(null);
    }


}
