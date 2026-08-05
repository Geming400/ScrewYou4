package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundCommandsPacket.class)
public class ClientboundCommandsPacket_552428299Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_708295888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(708295888L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRoot(Lnet/minecraft/commands/CommandBuildContext;Lnet/minecraft/network/protocol/game/ClientboundCommandsPacket$NodeBuilder;)Lcom/mojang/brigadier/tree/RootCommandNode;", cancellable = true)
    private void getRoot__280985065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-280985065L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1039049296(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1039049296L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_256716435(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(256716435L))
            info.cancel();
    }


}
