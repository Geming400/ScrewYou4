package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.ChunkSectionLayerGroup.class)
public class ChunkSectionLayerGroup837774366Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/chunk/ChunkSectionLayerGroup;", cancellable = true)
    private static void values_33575385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(33575385L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/chunk/ChunkSectionLayerGroup;", cancellable = true)
    private static void valueOf__1460039978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1460039978L))
            info.setReturnValue(net.minecraft.client.renderer.chunk.ChunkSectionLayerGroup.OPAQUE);
    }

    @Inject(at = @At("HEAD"), method = "layers()[Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;", cancellable = true)
    private void layers__355138834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-355138834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "label()Ljava/lang/String;", cancellable = true)
    private void label__297686105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-297686105L))
            info.setReturnValue("r,_^Cnf_2Vc-od뫹k?༤e:kSkboL' #5t#iJ⼝W6#vFqꅆx>en!g:S﷽q(0qle");
    }

    @Inject(at = @At("HEAD"), method = "outputTarget()Lcom/mojang/blaze3d/pipeline/RenderTarget;", cancellable = true)
    private void outputTarget_804328419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(804328419L))
            info.setReturnValue(null);
    }


}
