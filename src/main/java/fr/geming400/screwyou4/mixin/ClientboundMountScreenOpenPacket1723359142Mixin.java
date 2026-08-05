package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundMountScreenOpenPacket.class)
public class ClientboundMountScreenOpenPacket1723359142Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1879226732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1879226732L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_131881548(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(131881548L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1427647279(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1427647279L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntityId()I", cancellable = true)
    private void getEntityId_1088617528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1088617528L))
            info.setReturnValue(-1557946091);
    }

    @Inject(at = @At("HEAD"), method = "getContainerId()I", cancellable = true)
    private void getContainerId__666046202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-666046202L))
            info.setReturnValue(631485672);
    }

    @Inject(at = @At("HEAD"), method = "getInventoryColumns()I", cancellable = true)
    private void getInventoryColumns__974514795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-974514795L))
            info.setReturnValue(-1999149354);
    }


}
