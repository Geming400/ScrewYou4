package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.SectionRenderDispatcher.RenderSection.SectionTask.SectionTaskResult.class)
public class SectionTaskResult_312684384Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/chunk/SectionRenderDispatcher$RenderSection$SectionTask$SectionTaskResult;", cancellable = true)
    private static void values_1407947114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1407947114L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/chunk/SectionRenderDispatcher$RenderSection$SectionTask$SectionTaskResult;", cancellable = true)
    private static void valueOf_2112539533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2112539533L))
            info.setReturnValue(null);
    }


}
