package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.attributes.AttributeInstance.Packed.class)
public class Packed911277777Mixin {
        @Inject(at = @At("HEAD"), method = "modifiers()Ljava/util/List;", cancellable = true)
    private void modifiers__1670631555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1670631555L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2651509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2651509L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1681701302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1681701302L))
            info.setReturnValue("s?NEhr*GS5!*;}[\u20ED>J/\uC3DEL\uAC5D#\u2644B#4uq3([Xg>OM\"r=0Sq\u1528*w\u5645,URD\u93F9]\u3F1Ai>MeNVu!Mu\uAC4F89\"pI\u859A&akivGaMh\u25A6\uB64C5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1468629868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1468629868L))
            info.setReturnValue(-1182386526);
    }

    @Inject(at = @At("HEAD"), method = "baseValue()D", cancellable = true)
    private void baseValue_760791250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(760791250L))
            info.setReturnValue(7.657643000034938E8D);
    }

    @Inject(at = @At("HEAD"), method = "attribute()Lnet/minecraft/core/Holder;", cancellable = true)
    private void attribute_1087174833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1087174833L))
            info.setReturnValue(null);
    }


}
