package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.rendertype.RenderSetup.OutlineProperty.class)
public class OutlineProperty476093476Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__659366995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-659366995L))
            info.setReturnValue("'VpM_lE.VF%+nM'bB|x5<%Eꫢmy/,}");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/rendertype/RenderSetup$OutlineProperty;", cancellable = true)
    private static void values_882728428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(882728428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/rendertype/RenderSetup$OutlineProperty;", cancellable = true)
    private static void valueOf__130006359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-130006359L))
            info.setReturnValue(net.minecraft.client.renderer.rendertype.RenderSetup.OutlineProperty.AFFECTS_OUTLINE);
    }


}
