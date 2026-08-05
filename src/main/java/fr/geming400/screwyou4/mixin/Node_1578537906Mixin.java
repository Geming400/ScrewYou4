package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.SectionOcclusionGraph.Node.class)
public class Node_1578537906Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1330917628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1330917628L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1616800151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1616800151L))
            info.setReturnValue(-1058397279);
    }

    @Inject(at = @At("HEAD"), method = "hasSourceDirection(I)Z", cancellable = true)
    private void hasSourceDirection__1502508575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1502508575L))
            info.setReturnValue(true);
    }


}
