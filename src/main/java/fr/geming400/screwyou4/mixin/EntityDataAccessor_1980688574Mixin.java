package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.syncher.EntityDataAccessor.class)
public class EntityDataAccessor_1980688574Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__928766960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-928766960L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_845228102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(845228102L))
            info.setReturnValue("8'zAr?f`3_\u4605\uB738_`\u2738\u2C82!IM:g[tzF 6\uAF23KB0@88jTd.Cyt\u2987");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2018950819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2018950819L))
            info.setReturnValue(810473544);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_2018950819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2018950819L))
            info.setReturnValue(810473544);
    }

    @Inject(at = @At("HEAD"), method = "serializer()Lnet/minecraft/network/syncher/EntityDataSerializer;", cancellable = true)
    private void serializer_534270306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(534270306L))
            info.setReturnValue(null);
    }


}
