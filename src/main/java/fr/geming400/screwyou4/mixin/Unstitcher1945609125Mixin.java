package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.atlas.sources.Unstitcher.class)
public class Unstitcher1945609125Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/client/renderer/texture/atlas/SpriteSource$Output;)V", cancellable = true)
    private void run_1488132482(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1488132482L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1036982857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1036982857L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1578934646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1578934646L))
            info.setReturnValue("wFT/Bim\u6FB96Vli!t\uCADF#7S\u9B4A\u3853eXv\"/<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1792006080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1792006080L))
            info.setReturnValue(-2073360444);
    }

    @Inject(at = @At("HEAD"), method = "resource()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void resource__659323654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-659323654L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "regions()Ljava/util/List;", cancellable = true)
    private void regions_1132418132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1132418132L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1282912917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1282912917L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yDivisor()D", cancellable = true)
    private void yDivisor_362394625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(362394625L))
            info.setReturnValue(8.969426001289165E8D);
    }

    @Inject(at = @At("HEAD"), method = "xDivisor()D", cancellable = true)
    private void xDivisor_655797632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(655797632L))
            info.setReturnValue(8.969426003646367E8D);
    }


}
