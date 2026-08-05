package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.rendertype.RenderSetup.OutlineProperty.class)
public class OutlineProperty476093476Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1246516505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1246516505L))
            info.setReturnValue("[\uA51F$^0`ynIrYAzq_9oz\u2262>P@,kK;oH<#JS\u262AWuPtJn\uFAD4b\u85705\u4264?ujO\u55ECT'}@c#vvy!/o");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/rendertype/RenderSetup$OutlineProperty;", cancellable = true)
    private static void values_981444490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(981444490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/rendertype/RenderSetup$OutlineProperty;", cancellable = true)
    private static void valueOf__638961199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-638961199L))
            info.setReturnValue(net.minecraft.client.renderer.rendertype.RenderSetup.OutlineProperty.IS_OUTLINE);
    }


}
