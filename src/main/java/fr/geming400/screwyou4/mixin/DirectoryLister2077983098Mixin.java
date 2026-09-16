package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.atlas.sources.DirectoryLister.class)
public class DirectoryLister2077983098Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/client/renderer/texture/atlas/SpriteSource$Output;)V", cancellable = true)
    private void run_1620506455(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1620506455L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1169356830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1169356830L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1446560673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1446560673L))
            info.setReturnValue("LoM.\uB477\"\uA8A5$k\u29AC[nxh!qz5kuwhW!Daoad\u2BF6kzR5}=B&(3ORr=>\u06EBNec[,Rrcn##l:'\u1DFF`j_>YTwf;NT\u72A1]8 l_");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1659632107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1659632107L))
            info.setReturnValue(-1217726621);
    }

    @Inject(at = @At("HEAD"), method = "sourcePath()Ljava/lang/String;", cancellable = true)
    private void sourcePath__399830045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-399830045L))
            info.setReturnValue("7A\"\uB4DB9kuf\uB960Dz6m\uA149=y_mxp==?cW\uBA56Gt(t\u5535}%U6(|!O&acS!9B\u73C9\u8B57#n*NfDR^D\uBC7B \u7CDFkk");
    }

    @Inject(at = @At("HEAD"), method = "idPrefix()Ljava/lang/String;", cancellable = true)
    private void idPrefix__209644336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-209644336L))
            info.setReturnValue("\"sI`K+@{+*]':ylfP<]r\u5E05\u57DEBz|1f\uB4A3\u51B9s|z8Rf=H]A-cvF$K\u6560?\uC56AQlXLc{7G}iy*70%MB\u9C22@4ufj.0oz");
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1150538944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1150538944L))
            info.setReturnValue(null);
    }


}
