package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.Stitcher.Region.class)
public class Region551768724Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1322191753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1322191753L))
            info.setReturnValue("`/Dc+\u5923A^7(3\u60BDRX\u571Fc0Ev\uCA034U8j%\u5209s3_\u4BF2");
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/client/renderer/texture/Stitcher$Holder;)Z", cancellable = true)
    private void add__1151454143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1151454143L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "walk(Lnet/minecraft/client/renderer/texture/Stitcher$SpriteLoader;I)V", cancellable = true)
    private void walk__1196756434(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1196756434L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getY()I", cancellable = true)
    private void getY_1455206039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1455206039L))
            info.setReturnValue(-1012836701);
    }

    @Inject(at = @At("HEAD"), method = "getX()I", cancellable = true)
    private void getX_1426576888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1426576888L))
            info.setReturnValue(103399236);
    }


}
