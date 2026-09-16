package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.gui.GuiSpriteScaling.NineSlice.class)
public class NineSlice1839483613Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/resources/metadata/gui/GuiSpriteScaling$Type;", cancellable = true)
    private void type_1606718474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1606718474L))
            info.setReturnValue(net.minecraft.client.resources.metadata.gui.GuiSpriteScaling.Type.STRETCH);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_930857345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(930857345L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1685060158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1685060158L))
            info.setReturnValue("\u17C4So_\uD744W^c,R\uCD44\uCB76h&CKylKX&qnjUX*J\u1327li(E35>xQFcB:/[jlO\u0744ol\u1B72\u698A$lBy0}\u0F79*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1898131592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1898131592L))
            info.setReturnValue(1716379678);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_199335613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(199335613L))
            info.setReturnValue(-1167789473);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_754135036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(754135036L))
            info.setReturnValue(389978021);
    }

    @Inject(at = @At("HEAD"), method = "stretchInner()Z", cancellable = true)
    private void stretchInner_788273379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(788273379L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "border()Lnet/minecraft/client/resources/metadata/gui/GuiSpriteScaling$NineSlice$Border;", cancellable = true)
    private void border_555666146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(555666146L))
            info.setReturnValue(null);
    }


}
