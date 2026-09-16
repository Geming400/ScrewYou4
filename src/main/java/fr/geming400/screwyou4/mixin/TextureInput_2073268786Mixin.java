package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.PostChainConfig.TextureInput.class)
public class TextureInput_2073268786Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1164642517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1164642517L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1451274986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1451274986L))
            info.setReturnValue("'S u_3p-q8n\u5069^\u094E9V;OH}\u5522Q3u}K9\u72EFe{\"7,D ;$5lX)[}<BHZ|\u6B8Eo_c\"Q+s9m/-(/<XZJ\uCB63.@y+GK0\u9E05c?RvKc");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1664346420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1664346420L))
            info.setReturnValue(377105771);
    }

    @Inject(at = @At("HEAD"), method = "location()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void location__2009572307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2009572307L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_433120785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(433120785L))
            info.setReturnValue(-252595693);
    }

    @Inject(at = @At("HEAD"), method = "bilinear()Z", cancellable = true)
    private void bilinear_1971263804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1971263804L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_987920208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(987920208L))
            info.setReturnValue(172815796);
    }

    @Inject(at = @At("HEAD"), method = "referencedTargets()Ljava/util/Set;", cancellable = true)
    private void referencedTargets__1869368982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1869368982L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "samplerName()Ljava/lang/String;", cancellable = true)
    private void samplerName__1144691667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1144691667L))
            info.setReturnValue("\u0252t52Hc49\u5B2B:Q!GR.!@/oPAbE<}\u066Ed[fp\u29DFO95mbV9V");
    }


}
