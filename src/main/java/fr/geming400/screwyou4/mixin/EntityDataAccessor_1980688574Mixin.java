package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.syncher.EntityDataAccessor.class)
public class EntityDataAccessor_1980688574Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1072061809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1072061809L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1543855694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1543855694L))
            info.setReturnValue("Y_l,A8wb{W#2!");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1756927128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1756927128L))
            info.setReturnValue(1279917281);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id__714495384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-714495384L))
            info.setReturnValue(1471626289);
    }

    @Inject(at = @At("HEAD"), method = "serializer()Lnet/minecraft/network/syncher/EntityDataSerializer;", cancellable = true)
    private void serializer_1170073844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1170073844L))
            info.setReturnValue(null);
    }


}
