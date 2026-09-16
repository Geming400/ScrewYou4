package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.ShaderManager.class)
public class ShaderManager1975368410Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_86521508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(86521508L))
            info.setReturnValue("\u0C60YqLYt\u4E14^\"vB\uFB62Gm+B\uB2FE*\u4AB3uZ-p[jw#t9\u4100E!_IibSM4zm\u5926lP1h}xu*");
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__139207019(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-139207019L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPostChain(Lnet/minecraft/resources/Identifier;Ljava/util/Set;)Lnet/minecraft/client/renderer/PostChain;", cancellable = true)
    private void getPostChain__257991663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-257991663L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShader(Lnet/minecraft/resources/Identifier;Lcom/mojang/blaze3d/shaders/ShaderType;)Ljava/lang/String;", cancellable = true)
    private void getShader_761315268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(761315268L))
            info.setReturnValue("\u8FC0YZrzKB\u8F11Wu\u5A79YBO>IeO'w5\u84BFcHw?AZM6XE+u\u8A2C'RX\uD780\u8164S?(WW\u71CB6\uBB28\u51D3\uFB752;4L;&I.*V\u0912(MO1=t1/kS1D&|Da*\uC13Azks\uC265dDK#!q,s\u140D\uD0C7[b!P\u61E1");
    }


}
