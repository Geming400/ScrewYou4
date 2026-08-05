package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundUpdateAttributesPacket.AttributeSnapshot.class)
public class AttributeSnapshot_1326050943Mixin {
        @Inject(at = @At("HEAD"), method = "modifiers()Ljava/util/Collection;", cancellable = true)
    private void modifiers_379998314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(379998314L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "base()D", cancellable = true)
    private void base__543406738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-543406738L))
            info.setReturnValue(2.2694460079296398E8D);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_417424674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(417424674L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2096474467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2096474467L))
            info.setReturnValue("\u0D06$z6a\u0A48");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1883403033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1883403033L))
            info.setReturnValue(-2068611101);
    }

    @Inject(at = @At("HEAD"), method = "attribute()Lnet/minecraft/core/Holder;", cancellable = true)
    private void attribute_1501947998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1501947998L))
            info.setReturnValue(null);
    }


}
