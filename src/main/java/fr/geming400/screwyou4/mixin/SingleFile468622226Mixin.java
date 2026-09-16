package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.atlas.sources.SingleFile.class)
public class SingleFile468622226Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/client/renderer/texture/atlas/SpriteSource$Output;)V", cancellable = true)
    private void run_11145583(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(11145583L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__440004042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-440004042L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1239045751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1239045751L))
            info.setReturnValue(":CH+{q\"R5WH^Z>vd]\u93C11KHCON,Yr> \u0FCC[F7e%\uBA72");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1025974317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1025974317L))
            info.setReturnValue(232644012);
    }

    @Inject(at = @At("HEAD"), method = "resourceId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void resourceId_1560814498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1560814498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1535067480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1535067480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spriteId()Ljava/util/Optional;", cancellable = true)
    private void spriteId__1572389888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1572389888L))
            info.setReturnValue(null);
    }


}
