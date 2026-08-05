package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.PacketType.class)
public class PacketType2048881100Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__860573937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-860573937L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_913420629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(913420629L))
            info.setReturnValue("\u5DCD<=Xh'\u51C2M\u21E1");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2087143842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2087143842L))
            info.setReturnValue(-1812716951);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__394185453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-394185453L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flow()Lnet/minecraft/network/protocol/PacketFlow;", cancellable = true)
    private void flow_457140120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(457140120L))
            info.setReturnValue(net.minecraft.network.protocol.PacketFlow.CLIENTBOUND);
    }


}
