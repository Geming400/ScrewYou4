package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundCommandsPacket.class)
public class ClientboundCommandsPacket_552428299Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1126596790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1126596790L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRoot(Lnet/minecraft/commands/CommandBuildContext;Lnet/minecraft/network/protocol/game/ClientboundCommandsPacket$NodeBuilder;)Lcom/mojang/brigadier/tree/RootCommandNode;", cancellable = true)
    private void getRoot__1926571329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1926571329L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_749935832(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(749935832L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1230497211(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1230497211L))
            info.cancel();
    }


}
