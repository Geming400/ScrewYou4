package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.ProtocolCodecBuilder.class)
public class ProtocolCodecBuilder_1497733257Mixin {
        @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/network/protocol/PacketType;Lnet/minecraft/network/codec/StreamCodec;)Lnet/minecraft/network/protocol/ProtocolCodecBuilder;", cancellable = true)
    private void add__162219447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-162219447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private void build__1536233916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1536233916L))
            info.setReturnValue(null);
    }


}
