package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.InteractionResult.TryEmptyHandInteraction.class)
public class TryEmptyHandInteraction_1847044378Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_938418109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(938418109L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1677499394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1677499394L))
            info.setReturnValue("M,+x@\uC1D3r\u95BFJ\uB972Y\u6FB1\u57F1\uB3ABA-\uD457\u6D28-:4R&p*SK)5b3F\u5891\u5F353j% q!");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1890570828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1890570828L))
            info.setReturnValue(-158489005);
    }


}
