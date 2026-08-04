package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.attributes.AttributeInstance.Packed.class)
public class Packed911277777Mixin {
        @Inject(at = @At("HEAD"), method = "modifiers()Ljava/util/List;", cancellable = true)
    private void modifiers__1757352703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1757352703L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1998177260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1998177260L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__224182198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-224182198L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_949540519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949540519L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseValue()D", cancellable = true)
    private void baseValue_949535218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949535218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attribute()Lnet/minecraft/core/Holder;", cancellable = true)
    private void attribute__1834813747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1834813747L))
            info.setReturnValue(null);
    }


}
