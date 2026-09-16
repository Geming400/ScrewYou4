package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundDebugSamplePacket.class)
public class ClientboundDebugSamplePacket_1855416252Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_2011283841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2011283841L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_946789983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(946789983L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1669127520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1669127520L))
            info.setReturnValue("o");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1882198954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1882198954L))
            info.setReturnValue(1736591800);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_263938657(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(263938657L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1559704388(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1559704388L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "debugSampleType()Lnet/minecraft/util/debugchart/RemoteDebugSampleType;", cancellable = true)
    private void debugSampleType_791154018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(791154018L))
            info.setReturnValue(net.minecraft.util.debugchart.RemoteDebugSampleType.TICK_TIME);
    }

    @Inject(at = @At("HEAD"), method = "sample()[J", cancellable = true)
    private void sample_667220595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(667220595L))
            info.setReturnValue(null);
    }


}
