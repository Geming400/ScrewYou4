package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.gui.GuiMetadataSection.class)
public class GuiMetadataSection221534157Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__687092111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-687092111L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_991957682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(991957682L))
            info.setReturnValue("p>Bu\uFC6C=TIz8<U\u76CE<t_'b\u55B5.]\u99FEn;QWcp&FE6TX?G/%Ud512Vi0B\u8EEE4T\u7F2F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_778886248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(778886248L))
            info.setReturnValue(-1957994371);
    }

    @Inject(at = @At("HEAD"), method = "scaling()Lnet/minecraft/client/resources/metadata/gui/GuiSpriteScaling;", cancellable = true)
    private void scaling__1167127007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1167127007L))
            info.setReturnValue(null);
    }


}
