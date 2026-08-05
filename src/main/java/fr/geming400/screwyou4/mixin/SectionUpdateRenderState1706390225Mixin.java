package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.level.SectionUpdateRenderState.class)
public class SectionUpdateRenderState1706390225Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1203064812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1203064812L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_570930250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(570930250L))
            info.setReturnValue("cU}T/mxt,{^j렓冇");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1744652967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1744652967L))
            info.setReturnValue(-1910141424);
    }

    @Inject(at = @At("HEAD"), method = "region()Lnet/minecraft/client/renderer/chunk/RenderSectionRegion;", cancellable = true)
    private void region_1875008432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1875008432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sectionNode()J", cancellable = true)
    private void sectionNode_1744653432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1744653432L))
            info.setReturnValue(7414522232359494405L);
    }

    @Inject(at = @At("HEAD"), method = "playerChanged()Z", cancellable = true)
    private void playerChanged_1744668808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1744668808L))
            info.setReturnValue(false);
    }


}
