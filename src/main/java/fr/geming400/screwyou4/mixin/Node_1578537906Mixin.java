package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.SectionOcclusionGraph.Node.class)
public class Node_1578537906Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_669911141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(669911141L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2135889500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2135889500L))
            info.setReturnValue(667640733);
    }

    @Inject(at = @At("HEAD"), method = "hasSourceDirection(I)Z", cancellable = true)
    private void hasSourceDirection_1808838155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1808838155L))
            info.setReturnValue(true);
    }


}
