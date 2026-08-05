package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.SectionRenderDispatcher.RenderSection.SectionTask.SectionTaskResult.class)
public class SectionTaskResult_312684384Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/chunk/SectionRenderDispatcher$RenderSection$SectionTask$SectionTaskResult;", cancellable = true)
    private static void values__1193184500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1193184500L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/chunk/SectionRenderDispatcher$RenderSection$SectionTask$SectionTaskResult;", cancellable = true)
    private static void valueOf_1558594405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558594405L))
            info.setReturnValue(net.minecraft.client.renderer.chunk.SectionRenderDispatcher.RenderSection.SectionTask.SectionTaskResult.SUCCESSFUL);
    }


}
