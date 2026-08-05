package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.ShaderManager.class)
public class ShaderManager1975368410Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_839907939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(839907939L))
            info.setReturnValue("'9dI&@=sbh8jrIm:ic*\u1548\u8433d7\u0A6EH\u9A48Fo\u50F9II");
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_2013643149(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2013643149L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPostChain(Lnet/minecraft/resources/Identifier;Ljava/util/Set;)Lnet/minecraft/client/renderer/PostChain;", cancellable = true)
    private void getPostChain_1956052166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1956052166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShader(Lnet/minecraft/resources/Identifier;Lcom/mojang/blaze3d/shaders/ShaderType;)Ljava/lang/String;", cancellable = true)
    private void getShader_402324287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(402324287L))
            info.setReturnValue("IxYvgm0t2Rf=7P\u85C9Q^ibOiTKn';G\uB910\uF9B0?\u4F5AP8\u2B29{I9pk{Tobb\u8AEE_vw3k{'y\uA536/($V#TiLx\"z(v\u8834\u232FB<ae\uB98C.p\u14D84`rj66t");
    }


}
