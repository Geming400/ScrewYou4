package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.status.ServerStatus.class)
public class ServerStatus327039527Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__581586741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-581586741L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1097463052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1097463052L))
            info.setReturnValue("\uD53B4o+Hj\u3D01Qgws\u1167`\u93AEr\uD32E]F(N2O\u49B87i=\uBD02[@P[\u44867Wu\u9BBC>\u4AA7QZB`pK \u8837X}\uAFE1Z\"Jw=\u48B6-,{0znk*BXTn;u");
    }

    @Inject(at = @At("HEAD"), method = "version()Ljava/util/Optional;", cancellable = true)
    private void version__1186873171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1186873171L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_884391618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(884391618L))
            info.setReturnValue(-1627233724);
    }

    @Inject(at = @At("HEAD"), method = "description()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void description_13108150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(13108150L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enforcesSecureChat()Z", cancellable = true)
    private void enforcesSecureChat__542888770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-542888770L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "players()Ljava/util/Optional;", cancellable = true)
    private void players__598280313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-598280313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "favicon()Ljava/util/Optional;", cancellable = true)
    private void favicon_1295086057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1295086057L))
            info.setReturnValue(null);
    }


}
