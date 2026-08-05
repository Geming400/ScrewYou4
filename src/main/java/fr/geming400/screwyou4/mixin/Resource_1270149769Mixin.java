package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.FontDescription.Resource.class)
public class Resource_1270149769Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1639305269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1639305269L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_134689793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(134689793L))
            info.setReturnValue(",'r?5\uA341QKtyAvCK'Y0\u4ABBjG2p\u48FCm\uC0AD==e1Y,N+tb@f^#}_A3\u4F58m&`.8IG'p eiW3kIv3XQ\u8750w=d");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1308412510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1308412510L))
            info.setReturnValue(-1599129040);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1172916785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1172916785L))
            info.setReturnValue(null);
    }


}
