package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.AmbientAdditionsSettings.class)
public class AmbientAdditionsSettings135991908Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__772634360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-772634360L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_906415433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(906415433L))
            info.setReturnValue("\uA09B\u71A65\uA9F7@.`I6\"L34\u8748\u57A7(i5.\uC737e\uB0CD6H6\u4BCFH\u750F13@(=ef\u9FC4%00lru\u50EEg4K*SO]x?kQJ19s9WUv\u4F59B`l\u4EA6t&");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_693343999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(693343999L))
            info.setReturnValue(791280918);
    }

    @Inject(at = @At("HEAD"), method = "soundEvent()Lnet/minecraft/core/Holder;", cancellable = true)
    private void soundEvent_1441097269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1441097269L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tickChance()D", cancellable = true)
    private void tickChance_24429812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(24429812L))
            info.setReturnValue(8.905766000180734E8D);
    }


}
