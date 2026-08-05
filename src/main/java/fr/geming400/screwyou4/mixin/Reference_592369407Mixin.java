package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.providers.GlyphProviderDefinition.Reference.class)
public class Reference_592369407Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__316256862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-316256862L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1362792931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1362792931L))
            info.setReturnValue("b]d=iL,ri\u0673gU@+}|\u3196\uCBC2%IL/Sm\"PJ*]0:w#Q\u14F2N0)B2\u37C3Woju7\u9FD7vC6i4\u21A3?Kp<o!RC:\u4141Ih=mkZU\u1F14\uAB2D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1149721497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1149721497L))
            info.setReturnValue(-1223236787);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__2000408480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2000408480L))
            info.setReturnValue(null);
    }


}
