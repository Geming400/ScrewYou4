package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.SectionUpdateTracker.SectionDirtyState.class)
public class SectionDirtyState621413222Mixin {
        @Inject(at = @At("HEAD"), method = "isDirty()Z", cancellable = true)
    private void isDirty__292420267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-292420267L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setDirty(Z)V", cancellable = true)
    private void setDirty_1398354611(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1398354611L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSectionNode()J", cancellable = true)
    private void getSectionNode_1069521500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1069521500L))
            info.setReturnValue(-2985907122010344187L);
    }

    @Inject(at = @At("HEAD"), method = "setSectionNode(J)V", cancellable = true)
    private void setSectionNode_1045625624(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1045625624L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setNotDirty()V", cancellable = true)
    private void setNotDirty_2116253560(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2116253560L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDirtyFromPlayer()Z", cancellable = true)
    private void isDirtyFromPlayer__368712982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-368712982L))
            info.setReturnValue(true);
    }


}
