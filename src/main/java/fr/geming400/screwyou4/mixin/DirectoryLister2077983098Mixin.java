package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.atlas.sources.DirectoryLister.class)
public class DirectoryLister2077983098Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/client/renderer/texture/atlas/SpriteSource$Output;)V", cancellable = true)
    private void run_190836556(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(190836556L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__831471939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-831471939L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_942523123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(942523123L))
            info.setReturnValue("/'fᔒ@N$LqD4R븁8a&c1SNfgU予rXXl6鋞b@oZ} j\":tlg䄺fx[碵ypMr#nn䓸ID{`6CR$K6*:eNXw7<=WRcf'|0WU09榼K>gh霊(ṾX6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2116245840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116245840L))
            info.setReturnValue(1219979329);
    }

    @Inject(at = @At("HEAD"), method = "sourcePath()Ljava/lang/String;", cancellable = true)
    private void sourcePath_942522627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(942522627L))
            info.setReturnValue("郴");
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__481130474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-481130474L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "idPrefix()Ljava/lang/String;", cancellable = true)
    private void idPrefix_942522627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(942522627L))
            info.setReturnValue("郴");
    }


}
