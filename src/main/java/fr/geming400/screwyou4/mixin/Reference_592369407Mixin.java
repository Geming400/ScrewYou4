package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.providers.GlyphProviderDefinition.Reference.class)
public class Reference_592369407Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1977881665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1977881665L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__543090569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-543090569L))
            info.setReturnValue("OM");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_630632148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(630632148L))
            info.setReturnValue(-1254160353);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1850697147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1850697147L))
            info.setReturnValue(null);
    }


}
