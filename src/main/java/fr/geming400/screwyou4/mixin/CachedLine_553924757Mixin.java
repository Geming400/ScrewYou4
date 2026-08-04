package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Display.TextDisplay.CachedLine.class)
public class CachedLine_553924757Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1939437015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1939437015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__581535219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-581535219L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_592187498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(592187498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_592187002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(592187002L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contents()Lnet/minecraft/util/FormattedCharSequence;", cancellable = true)
    private void contents_1613563784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1613563784L))
            info.setReturnValue(null);
    }


}
