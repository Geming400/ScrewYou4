package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.ChunkSectionLayerGroup.class)
public class ChunkSectionLayerGroup837774366Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/chunk/ChunkSectionLayerGroup;", cancellable = true)
    private static void values__125409033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-125409033L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/chunk/ChunkSectionLayerGroup;", cancellable = true)
    private static void valueOf_1311692798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1311692798L))
            info.setReturnValue(net.minecraft.client.renderer.chunk.ChunkSectionLayerGroup.TRANSLUCENT);
    }

    @Inject(at = @At("HEAD"), method = "layers()[Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;", cancellable = true)
    private void layers__963790544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-963790544L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "label()Ljava/lang/String;", cancellable = true)
    private void label_601144219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(601144219L))
            info.setReturnValue("HUlW2\u33DB/vFNj\u588EVc>-AMo\u8ABET=U2&1L\uBC2D ,Dz,my\u2299\uA2FF>\u9E21j\u93CD/A?G+g(O\u6C73iK9RU^`N*/\uCFA8)5n\u2385\u032FQ\u5997S\u15C3;u+C\"r\u1495dT')");
    }

    @Inject(at = @At("HEAD"), method = "outputTarget()Lcom/mojang/blaze3d/pipeline/RenderTarget;", cancellable = true)
    private void outputTarget_521104981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(521104981L))
            info.setReturnValue(null);
    }


}
