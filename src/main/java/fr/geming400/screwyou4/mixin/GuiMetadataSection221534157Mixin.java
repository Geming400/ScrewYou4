package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.gui.GuiMetadataSection.class)
public class GuiMetadataSection221534157Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1607046416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1607046416L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__913925818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-913925818L))
            info.setReturnValue("40%YtW\u62E9Qe\u773BH}\u60EAt4-\u28ADoC\u321BMnZd+c\u2A18Pcg6pI{\uB279\uD090Gny&5T\uCE8A,+n_q'#0}2;G^\u57D8\"76NQBIP8\"qXNB;PAisHHEuAU");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_259796899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(259796899L))
            info.setReturnValue(426136077);
    }

    @Inject(at = @At("HEAD"), method = "scaling()Lnet/minecraft/client/resources/metadata/gui/GuiSpriteScaling;", cancellable = true)
    private void scaling_1047236698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1047236698L))
            info.setReturnValue(null);
    }


}
