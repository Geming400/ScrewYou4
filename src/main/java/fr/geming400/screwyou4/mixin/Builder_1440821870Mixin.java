package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.codec.IdDispatchCodec.Builder.class)
public class Builder_1440821870Mixin {
        @Inject(at = @At("HEAD"), method = "add(Ljava/lang/Object;Lnet/minecraft/network/codec/StreamCodec;)Lnet/minecraft/network/codec/IdDispatchCodec$Builder;", cancellable = true)
    private void add__662375462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-662375462L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/network/codec/IdDispatchCodec;", cancellable = true)
    private void build_301005278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(301005278L))
            info.setReturnValue(null);
    }


}
