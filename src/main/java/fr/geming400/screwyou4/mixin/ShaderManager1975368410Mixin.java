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
            info.setReturnValue("'9dI&@=sbh8jrIm:ic*ᕈ萳d7੮H驈Fo價II");
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
            info.setReturnValue("IxYvgm0t2Rf=7P藉Q^ibOiTKn';G뤐聆?佚P8⬩{I9pk{Tobb諮_vw3k{'yꔶ/($V#TiLx\"z(v蠴⌯B<ae릌.pᓘ4`rj66t");
    }


}
