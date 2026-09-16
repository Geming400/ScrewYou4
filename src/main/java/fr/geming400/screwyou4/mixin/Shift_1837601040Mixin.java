package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.providers.TrueTypeGlyphProviderDefinition.Shift.class)
public class Shift_1837601040Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_928974771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(928974771L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1686942732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1686942732L))
            info.setReturnValue("]Nd\u481Foz_g[\uB8BD\u859E}d>rvC1elG(]\u00FE7>\uCB56&4h`0pM;K\u9D77Q}@z8]\uA69AF:^Q5N%Gar;Xz-=ZL\u5862\":z\u9695z#e\u8F31o\u39AE z8Fs|bC}Ud");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1900014166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1900014166L))
            info.setReturnValue(-1766440336);
    }

    @Inject(at = @At("HEAD"), method = "x()F", cancellable = true)
    private void x_1016391226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1016391226L))
            info.setReturnValue(2.243581E8F);
    }

    @Inject(at = @At("HEAD"), method = "y()F", cancellable = true)
    private void y_1045020377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1045020377L))
            info.setReturnValue(2.243581E8F);
    }


}
