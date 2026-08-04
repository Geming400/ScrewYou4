package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.SectionCompiler.class)
public class SectionCompiler_181741802Mixin {
        @Inject(at = @At("HEAD"), method = "compile(Lnet/minecraft/core/SectionPos;Lnet/minecraft/client/renderer/chunk/RenderSectionRegion;Lcom/mojang/blaze3d/vertex/VertexSorting;Lnet/minecraft/client/renderer/SectionBufferBuilderPack;)Lnet/minecraft/client/renderer/chunk/SectionCompiler$Results;", cancellable = true)
    private void compile_876581322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(876581322L))
            info.setReturnValue(null);
    }


}
