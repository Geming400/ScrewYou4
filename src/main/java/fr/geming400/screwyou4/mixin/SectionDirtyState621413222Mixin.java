package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.SectionUpdateTracker.SectionDirtyState.class)
public class SectionDirtyState621413222Mixin {
        @Inject(at = @At("HEAD"), method = "isDirty()Z", cancellable = true)
    private void isDirty_659691805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(659691805L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isDirtyFromPlayer()Z", cancellable = true)
    private void isDirtyFromPlayer_659691805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(659691805L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setNotDirty()V", cancellable = true)
    private void setNotDirty_659687961(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(659687961L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDirty(Z)V", cancellable = true)
    private void setDirty_1851030051(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1851030051L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSectionNode()J", cancellable = true)
    private void getSectionNode_659676429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(659676429L))
            info.setReturnValue(-2469286054397283035L);
    }

    @Inject(at = @At("HEAD"), method = "setSectionNode(J)V", cancellable = true)
    private void setSectionNode_1836253715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1836253715L))
            info.cancel();
    }


}
